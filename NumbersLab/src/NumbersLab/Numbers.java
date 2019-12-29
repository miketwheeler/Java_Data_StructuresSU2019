// 19SS_INFO_2530_WA - Online - Data Structures Using Java
// Summer 2019
//
// Michael Wheeler
// MCCID: 0891925

package NumbersLab;

import java.util.Arrays;
import java.util.Random;

/**
 * This class manages the numbers array.
 * @author mtwheeler
 */
public class Numbers 
{
    /**
     * Initiates the numbers array.
     */
    private static int[] nums;
    private Random rand;
    private static final int MAX = 100;
    
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
     * Modifies the contents of the numbers array with a random variable
     * between 0 and 100.
     */
    public int[] randomize()
    {
    	rand = new Random();
    	for (int i = 0; i < nums.length; i++)
		{
			nums[i] = rand.nextInt(MAX);
		}
    	return nums;
    }
    
    /**
     * Bubble sorts the array in ascending order.
     * @param nums The instance of the numbers array to sort.
     */
    public void bubbleSort()
    {
    	for (int numPasses = 0; numPasses < nums.length - 1; numPasses++)
    	{
    		for (int temp = 0; temp < nums.length - 1; temp++)
    		{
    			if (nums[temp] > nums[temp + 1])
    			{
    				int swap = nums[temp];
    				nums[temp] = nums[temp + 1];
    				nums[temp + 1] = swap;
    			}
    		}
    	}
    }
    
    /**
     * Selection sort for the numbers array.
     * @param nums The array to sort.
     */
    public void selectionSort()
    {
    	for (int i = 0; i < nums.length - 1; i ++)
    	{
    		//initial index of the unsorted
    		int smallestPos = i;
    		//perform linear search for smallest element
    		for (int smallestInt = i + 1; smallestInt < nums.length; smallestInt++)
    		{
    			if (nums[smallestInt] < nums[smallestPos])
    			{
    				//set smallest index
    				smallestPos = smallestInt;
    			}
    		}
    		//swap into place
    		int temp = nums[i];
    		nums[i] = nums[smallestPos];
    		nums[smallestPos] = temp;
    	}
    }
    
    /**
     * Insertion sort for the array.
     * @param nums The array to sort.
     */
	public void insertionSort() 
	{
		for (int next = 1; next < nums.length; next++) 
		{ 
			//store value in current element
			int insert = nums[next];
			// initialize location to place element
			int moveItem = next;
			//shift items in the sorted part of the array to make room for next element
			while (moveItem > 0 && nums[moveItem - 1] > insert) 
			{           
				//int temp = nums[moveItem];
				nums[moveItem] = nums[moveItem - 1];
				//nums[moveItem - 1] = temp;							
				moveItem--;
			} 
			//place inserted element
			nums[moveItem] = insert;
		}
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
