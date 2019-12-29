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
//        System.out.println("This is the Numbers Array and It's Contents "
//                + "before and After Modification\n");
//        
//        //Create new numbers array of length 10
//        Numbers nums = new Numbers(10);
//        System.out.println("The current numbers that exist in the array: " 
//                +nums.display());
//        
//        //rolls through the length of the array and inserts 10 through 1
//        int count = 10;
//        for (int i = 0; i < nums.getLength(); i++)
//        {
//          nums.setValue(i, count);
//          count--;
//        }
//        
//        //exhibits the first index of the array
//        System.out.println("The frist element in the array: " 
//                +nums.getValue(0));
//        
//        //exhibits the last index of the array
//        System.out.println("The last element in the array: "
//                +nums.getValue(nums.getLength() - 1));
//        
//        //shows the length of the array
//        System.out.println("The length of the array is: " 
//                +nums.getLength());
//        
//        //finally displays all of the numbers in the array
//        System.out.println("The entire array now consists of the digits: " 
//                +nums.display() + "\n");
        
        System.out.println("This is the Numbers Array and It's Contents "
                + "before and After Modification\n");
        
        Numbers numsRand = new Numbers(10);
        
        numsRand.randomize();
        System.out.println("\nThe current random numbers that exist in the array: " 
                +numsRand.display());
        
        long startBubble = System.nanoTime();
        numsRand.bubbleSort();
 		long endBubble = System.nanoTime();
        System.out.println("The random numbers in the BUBBLE-sorted array: " 
                +numsRand.display());
 		System.out.println("\tThe BUBBLE-sort took: " + (endBubble - startBubble) 
 				+ " nanoseconds.");

        
        numsRand.randomize();
        System.out.println("\nThe new random numbers that exist in the array: " 
                +numsRand.display());
        long startSelect = System.nanoTime();
        numsRand.selectionSort();
		long endSelect = System.nanoTime();
        System.out.println("The random numbers in the SELECTION-sorted array: " 
                +numsRand.display());
		System.out.println("\tThe SELECTION-sort took: " + (endSelect - startSelect) 
				+ " nanoseconds.");

        
        numsRand.randomize();
        System.out.println("\nThe new random numbers that exist in the array: " 
                +numsRand.display());
    	long startInsert = System.nanoTime();
    	numsRand.insertionSort();
		long endInsert = System.nanoTime();
        System.out.println("The random numbers in the INSERTION-sorted array: " 
                +numsRand.display());
		System.out.println("\tThe INSERTION-sort took: " + (endInsert - startInsert) 
				+ " nanoseconds.");

    } 
}
