package NumbersLab;

import java.util.Arrays;

// 19SS_INFO_2530_WA - Online - Data Structures Using Java
// Summer 2019
//
// Michael Wheeler
// MCCID: 0891925

/**
* Tests the upper and lower bounds as well as the size of the 
* arrays constraints.
* @author mtwheeler
*/
public class NumbersTest
{
   public static void main(String[] args)
   {
       //Tests the upper and lower range.
       Numbers nums2 = new Numbers(10);
       
       System.out.println("Testing::");
       int[] testInts = {-10, -1, 0, 30, 45, 50, 90, 100, 101, 200}; 
       System.out.println("These are the intial numbers, incl out of range: " 
    		   + String.join(", ", Arrays.toString(testInts)));
       for (int i = 0; i < nums2.getLength(); i++)
       {
           nums2.setValue(i, testInts[i]);
       }
       System.out.println("The entire array now consists of the digits: " 
               +nums2.display() + "\n");
       
       //Tests the bounds.
       Numbers nums3 = new Numbers(8);

       System.out.println("This test should fail, "
       		+ "the numbers given are less than the length of the array to throw exception. \n"
    		   +"The length of the array: " + nums3.getLength());
       int[] testInts2 = {30, 45, 50, 90, 100};
       System.out.println("The numbers attempted to be inserted: " + Arrays.toString(testInts2));
       for (int i = 0; i < nums3.getLength(); i++)
       {
           nums3.setValue(i, testInts2[i]);
       }
       

   }
}