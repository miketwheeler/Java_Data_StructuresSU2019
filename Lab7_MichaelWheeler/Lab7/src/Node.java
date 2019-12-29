// 19SS_INFO_2530_WA - Online - Data Structures Using Java
// Summer 2019
//
// Michael Wheeler
// MCCID: 0891925
// Resources: Based on code example 8.1 from Data Structures & Algorithms in Java

/**
 * This class manages a single node in the Tree
 * @author mtwheeler
 */
public class Node 
{
    public String stringData;
    public Node lChild;
    public Node rChild;
    
    public void displayNode()
    {
        System.out.print("{"+ stringData + "}");
    }
}
