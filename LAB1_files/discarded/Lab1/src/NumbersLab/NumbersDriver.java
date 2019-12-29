// 19SS_INFO_2530_WA - Online - Data Structures Using Java
// Summer 2019
//
// Michael Wheeler
// MCCID: 0891925

package NumbersLab;

/**
 * The main driver for populating and displaying the Numbers array.
 * @author mtwheeler
 */
public class NumbersDriver 
{
    public static void main(String[] args)
    {
        //Friendly intro 
        System.out.println("This is the Numbers Array and It's Contents "
                + "before and After Modification\n");
        
        //Create new numbers array of length 10
        Numbers nums = new Numbers(10);
        System.out.println("The current numbers that exist in the array: " 
                +Numbers.display());
        
        //rolls thorugh the length of the array and inserts 10 through 1
        int count = 10;
        for (int i = 0; i < Numbers.getLength(); i++)
        {
          Numbers.setValue(i, count);
          count--;
        }
        
        //exhibits the first index of the array
        System.out.println("The frist element in the array: " 
                +Numbers.getValue(0));
        
        //exhibits the last index of the array
        System.out.println("The last element in the array: "
                +Numbers.getValue(Numbers.getLength() - 1));
        
        //shows the length of the array
        System.out.println("The length of the array is: " 
                +Numbers.getLength());
        
        //finally displays all of the numbers in the array
        System.out.println("The entire array now consists of the digits: " 
                +Numbers.display() + "\n");

    } 
}
