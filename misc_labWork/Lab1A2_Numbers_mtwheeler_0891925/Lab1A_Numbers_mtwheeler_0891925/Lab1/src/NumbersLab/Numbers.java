// 19SS_INFO_2530_WA - Online - Data Structures Using Java
// Summer 2019
//
// Michael Wheeler
// MCCID: 0891925

package NumbersLab;

import java.util.Arrays;

/**
 * This class manages the numbers array.
 * @author mtwheeler
 */
public class Numbers 
{
    /**
     * Initiates the numbers array.
     */
    private int[] nums;
    
    /**
     * Constructor for the Numbers class, sets up the nums array.
     * @param numElements The set length of the array.
     */
    public Numbers(int numElements)
    {
        nums = new int[numElements];
    }
    
    /**
     * Display-ready format of all the integers in the array.
     * @return All of the numbers in the nums array. 
     */
    public String display()
    {
        String allNums = Arrays.toString(nums);
        return String.join(" ", allNums);
    }
    
    /**
     * Modifies the contents of the numbers array.
     * @param index The indicated index to insert value.
     * @param addValue The indicated value to insert.
     */
    public void setValue(int index, int addValue)
    {
        int temp;
        try
        {
            if (addValue < 0)
            {
                temp = 0;
            }
            else if (addValue > 100)
            {
                temp = 100;
            }
            else
            {
                temp = addValue;
            }
            
            nums[index] = temp;
            
        }
        catch (IndexOutOfBoundsException iobe)
        {
            System.out.println("The index is out of range!");
        }
        
    }
    
    /**
     * Retrieves the element at the given index if available.
     * @param retrieveIndex The indexed element to get.
     * @return The element at the index.
     */
    public int getValue(int retrieveIndex)
    {
        int returnValue = 0;
        try
        {
           returnValue = nums[retrieveIndex]; 
        }
         catch (IndexOutOfBoundsException iobe)
        {
            System.out.println("The index is out of range!");
        }
        
        return returnValue;
    }
    
    /**
     * The current length of the Numbers array.
     * @return The length.
     */
    public int getLength()
    {
        return nums.length;
    }
    
}
