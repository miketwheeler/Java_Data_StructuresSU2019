// 19SS_INFO_2530_WA - Online - Data Structures Using Java
// Summer 2019
//
// Michael Wheeler
// MCCID: 0891925
// Resources: Based on code example 8.1 from Data Structures & Algorithms in Java

import java.util.*;

/**
 * This class manages the Tree structure of Nodes
 * @author mtwheeler
 */
public class Tree 
{
    private Node root;
    
    /**
     * Constructor for this Tree
     * @param stringIn The passed string to produce nodes in the tree
     */
    public Tree(String stringIn)
    {
        root = null;
        Node[] alphaArr = new Node[stringIn.length()];
        
        // Parses and allows for easy implementation of the passed string
        for(int i = 0; i < stringIn.length(); i++)
        {
            alphaArr[i] = new Node();
            alphaArr[i].stringData = String.valueOf(stringIn.charAt(i));
        }
        
        Node addaNode = new Node();
        addaNode.stringData = "+";
        addaNode.lChild = alphaArr[0];
        addaNode.rChild = alphaArr[1];
        
        for(int i = 2; i < alphaArr.length; ++i)
        {
            Node alphaNode = new Node();
            alphaNode.stringData = "+";
            alphaNode.lChild = addaNode;
            alphaNode.rChild = alphaArr[i];
            addaNode = alphaNode;
        }
        root = addaNode;
    }
    
    //Traverse the Tree
    public void traverse(int travType)
    {
        switch(travType)
        {
            case 1: System.out.print("\nPreorder traversal: ");
                    preOrder(root);
                    break;
            case 2: System.out.print("\nInorder traversal: ");
                    inOrder(root);
                    break;
            case 3: System.out.print("\nPostorder traversal: ");
                    postOrder(root);
                    break;
        }
        System.out.println("");
    }
    
    private void preOrder(Node localRoot)
    {
        if(localRoot != null)
        {
            System.out.print(localRoot.stringData + " ");
            preOrder(localRoot.lChild);
            preOrder(localRoot.rChild);
        }
    }
    
    private void inOrder(Node localRoot)
    {
        if(localRoot != null)
        {
            inOrder(localRoot.lChild);
            System.out.print(localRoot.stringData + " ");
            inOrder(localRoot.rChild);
        }
    }
    
    private void postOrder(Node localRoot)
    {
        if(localRoot != null)
        {
            postOrder(localRoot.lChild);
            postOrder(localRoot.rChild);
            System.out.print(localRoot.stringData + " ");
        }
    }
    
    //Format display and print Tree nodes and contents
    public void displayTree()
    {
        Stack<Node> globalStack = new Stack<>();
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
        
        System.out.println(
            "--------------------------------------------------------------");
        
        while(isRowEmpty == false)
        {
            Stack<Node> localStack = new Stack<>();
            isRowEmpty = true;
            
            for(int j = 0; j < nBlanks; j++)
                System.out.print(" ");
            
            while(globalStack.isEmpty() == false)
            {
                Node temp = globalStack.pop();
                if(temp != null)
                {
                    System.out.print(temp.stringData);
                    localStack.push(temp.lChild);
                    localStack.push(temp.rChild);
                    if(temp.lChild != null || temp.rChild != null)
                        isRowEmpty = false;
                }
                else
                {
                    System.out.print(" .");
                    localStack.push(null);
                    localStack.push(null);
                }
                
                for(int j = 0; j < nBlanks*2-2; j++)
                    System.out.print(" ");
            }
            
            System.out.println();
            nBlanks /= 2;
            
            while(localStack.isEmpty() == false)
                globalStack.push(localStack.pop());      
        }
        System.out.println(
            "--------------------------------------------------------------");
    }   
}
