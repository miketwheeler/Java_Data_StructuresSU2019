// 19SS_INFO_2530_WA - Online - Data Structures Using Java
// Summer 2019
//
// Michael Wheeler
// MCCID: 0891925

package Lab4Classes;
import java.util.*;
/**
 * This class enqueues items into the Assembly Line and dequeues items 
 * at the end of the Assembly Line for inspection.
 * @author mtwheeler
 */
public class AssemblyLineTest 
{
   public static void main(String[] args)
   {
       Random rand = new Random();//generates a number 0-20 for the productID
       AssemblyLine test = new AssemblyLine();
       int numOfOrders = 20;//Quantity of items to process
     
       while(numOfOrders != 0)
       {
           //New item to assemble with ID
           ManufacturedProduct oneTrinket = new ManufacturedProduct(rand.nextInt(20));
           
           test.insert(oneTrinket);
           
           System.out.println("Number of Products in Assembly Line:  " 
               + test.getNumberOfTrinkets());
           System.out.println("Inserting:  " + oneTrinket);
           System.out.println("Total Processed:  " + test.totalCount + "\n"); 
           
           numOfOrders--;
       }
       
       //Part 4B - empties and prints out the remaining items
       System.out.println("--------------------------------------------------");
       
       System.out.println("\nNumber of Remaining Products in Assembly Line:  " 
               + test.getNumberOfTrinkets() + "\n\nHere are the Last Items:");
       
       while(test.getNumberOfTrinkets() > 0)
       {
           System.out.println("Number of Items:  " + test.getNumberOfTrinkets());
           System.out.println(test.emptyRemaining() + "\n");
       }
   }
}
