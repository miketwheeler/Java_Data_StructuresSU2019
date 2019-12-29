// 19SS_INFO_2530_WA - Online - Data Structures Using Java
// Summer 2019
//
// Michael Wheeler
// MCCID: 0891925

package NumbersLab;

import java.util.Arrays;

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
        Numbers numsTest = new Numbers(10);
        
        System.out.println("Testing::");
        int[] testInts = {-10, -1, 0, 30, 45, 50, 90, 100, 101, 200}; 
        System.out.println("These are the numbers we will attempt to insert: " 
                + Arrays.toString(testInts));
        for (int i = 0; i < numsTest.getLength(); i++)
        {
            numsTest.setValue(i, testInts[i]);
        }
        System.out.println("The entire array now consists of the digits: " 
                +numsTest.display() + "\n");
        
        //Tests the bounds.
        System.out.println("This next test should fail. "
                + "Inserting less numbers than length of the array.");
        Numbers numsTest2 = new Numbers(8);

        int[] testInts2 = {30, 45, 50, 90, 100};
        for (int i = 0; i < numsTest2.getLength(); i++)
        {
            numsTest2.setValue(i, testInts2[i]);
        }
        System.out.println("The entire array now consists of the digits: " 
                +numsTest2.display() + "\n");

    }
}