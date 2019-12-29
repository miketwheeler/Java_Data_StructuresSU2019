// 19SS_INFO_2530_WA - Online - Data Structures Using Java
// Summer 2019
//
// Michael Wheeler
// MCCID: 0891925

package Lab3Classes;
import java.util.*;
/**
 * The main driver class for the Priority Stack.
 * @author mtwheeler
 */
public class PriorityStackDriver
{
     public static void main(String[] args)
    {
        int numElements = 30;//The size of the stack.
        int dividend = 3;//Number of every xth item to display for more concise output.
        PriorityStack temp = new PriorityStack(numElements);//Instanciates new stack.
        Random rand = new Random();//Random priority number (1-3).
        Random nameRand = new Random();//Random order id (from name array)
        String[] nameList = new String[]{"Bob", "Rick", "Morty", "Pickle", "Blimblam"};
       
        //Rolls through the stack, adding randomized orders and prints info of 
        //every [given dividend] order.
        for(int i = 0; i < numElements; i++)
        {
            //Fabricates a new random order
            Order insert = new Order(nameList[nameRand.nextInt(nameList.length)], 
                    rand.nextInt(3)+1);
            
            //Attempts to add this order to the stack.
            if (!temp.isFull())
            {
                temp.push(insert);
            }
            else
                System.out.println("Attempt made at adding elements to full stack!");
            
            //Orchestrates a display of the order contents.
            if(((i + 1) % dividend) == 0)
            {   
                System.out.format("These are the contents of the Stack (%d of %d)"
                        + " loaded: ",temp.numberOfOrders(),numElements);
                System.out.println("\nThe top item: " + temp.peek() 
                        + "\nIs empty: " + temp.isEmpty()
                        + "\nIs full: " + temp.isFull());
                System.out.format("Total number of orders so far: %d\n\n",
                        temp.numberOfOrders());
    
            } 
        }
        
        //Sorts the current stack into ascending order after stack is full.
        temp.prioritySort();
        
        //Pops and displays the orders in the stack after sorting.
        System.out.println("Here are the elements in the Stack: ");
        do
        {
            System.out.println(temp.pop());
        }
        while(temp.isEmpty() == false);
    }
  
}
