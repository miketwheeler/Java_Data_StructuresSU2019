// 19SS_INFO_2530_WA - Online - Data Structures Using Java
// Summer 2019
//
// Michael Wheeler
// MCCID: 0891925


import java.util.Arrays;

/**
 * Demonstrates the many methods of the Double Ended Linked List as well as the 
 * doubly linked list. Makes insertions to the lists from an array of longs.
 * @author mtwheeler
 */
public class ManyLinkedListsDriver 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // The array for use in this driver class 
        long[] insertArr = new long[]{1,2,3,2,0,5,0,5,0,6};
        
        // Call to create a new DoubleEndedLinkedList
        DoubleEndedLinkedList dell = (DoubleEndedLinkedList) ManyLinkedLists.createLinkedList(ManyLinkedLists.DOUBLEENDEDLIST);
        
        // Heading and intro Empty check
        System.out.println("\n\nHERE IS THE DOUBLE-ENDED LINKED LIST:\n");
        System.out.println("Is Empty: " + dell.isEmpty());
        
        // Uses long array as values to insert into the list using list methods
        // into the FRONT of the list.
        System.out.println("\nInsert a list of longs into the front of the "
                + "double ended linked list: ");
        for (long frontItem : insertArr) 
        {
            dell.insertFirst(frontItem);
            dell.displayList();
        }
        // Show current size
        System.out.println("Current size: " + dell.size());
        
        // Uses long array as values to insert into the list using list methods
        // into the END of the list.
        System.out.println("\nInsert same list of longs into the end of the "
                + "double ended linked list(should be symmetric): ");
        for (long endItem : insertArr) 
        {
            dell.insertLast(endItem);
            dell.displayList();
        }
        // Show current size
        System.out.println("Current size: " + dell.size());
        
        // Demonstrate the methods of this Double ended linked list
        System.out.println("\nIs Empty: " + dell.isEmpty());

        // T or F for searched value
        System.out.println("\nSearch if '2' exists: " + dell.search(2));
        
        // Searching for frequency of a value
        System.out.println("\nSearch for number of '0s'(zeros): " + dell.numberOfValues(0));
        
        // Swap value with located values
        System.out.println("\nReplace '2s' with '0s': ");
        dell.replace(2, 4);
        dell.displayList();
        // Show current size
        System.out.println("\nCurrent size: " + dell.size());
        
        // Delete a found link from the list
        System.out.println("\nDelete first long '1'(one) found in list: ");
        dell.deleteLink(1);
        dell.displayList();
        // Show current size
        System.out.println("Current size: " + dell.size());
        
        // Delete the first link from the list
        System.out.println("\nDelete first link in list: ");
        dell.deleteFirst();
        dell.displayList();
        // Show current size
        System.out.println("Current size: " + dell.size());
        
        // Show list as array representation
        System.out.println("\nThe list as an array"
                + "(reversed as unload from list): " 
                + Arrays.toString(dell.getArray()));
        
        // Set all long values to zero
        System.out.println("\nSet all Link's data to '0'(zero): ");
        dell.zero();
        dell.displayList();
        
        System.out.println("\n-----------------------------------------------"
                + "---------------------------------------------------------");
        
        // Call to create a new DoublyLinkedList
        DoublyLinkedList dll = (DoublyLinkedList) ManyLinkedLists.createLinkedList(ManyLinkedLists.DOUBLYLINKEDLIST);
        
        // Heading and intro Empty check
        System.out.println("\n\nHERE IS THE DOUBLY LINKED LIST:\n");
        System.out.println("\nIs Empty: " + dll.isEmpty());
        
        // Uses long array as values to insert into the list using list methods
        // into the FRONT of the list.
        System.out.println("\nInsert a list of longs into the front of the "
                + "double ended linked list: ");
        for (long frontItem : insertArr) 
        {
            dll.insertFirst(frontItem);
            dll.displayForward();
        }
        // Show current size
        System.out.println("Current size: " + dll.size());
        
        // Uses long array as values to insert into the list using list methods
        // into the END of the list.
        System.out.println("\nInsert same list of longs into the end of the "
                + "double ended linked list(should be symmetric): ");
        for (long endItem : insertArr) 
        {
            dll.insertLast(endItem);
            dll.displayForward();
        }
        // Show current size
        System.out.println("\nCurrent size: " + dll.size());
        
        // Searching for frequency of a value
        System.out.println("\nSearch if there is a long '0'(zero) in the list: " 
                + dll.search(0));
        
        // Insert into front
        System.out.println("\nInsert a new long '7' to the FRONT of the list: "); 
        dll.insertFirst(7);
        dll.displayForward();
        // Show current size
        System.out.println("Current size: " + dll.size());
        
        // Insert into end
        System.out.println("\nInsert a new long '9' to the END of the list: "); 
        dll.insertLast(9);
        dll.displayForward();
        // Show current size
        System.out.println("Current size: " + dll.size());
        
        // Insert into middle
        System.out.println("\nInsert a new long '8' to the MIDDLE of the list: "); 
        System.out.println("Insertion success: " + dll.insertAfter(1, 8));
        dll.displayForward();
        // Show current size
        System.out.println("Current size: " + dll.size());
        
        // Display list backwards (good time to show this while numbers are asymmetric)
        System.out.println("\nDisplay this Doubly Linked List backward: ");
        dll.displayBackward();
        
        // Delete in middle
        System.out.println("\nDelete the long '8' that was added earlier: ");
        System.out.println("The deleted link's contents: " 
                + dll.deleteLink(8).dData);
        dll.displayForward();
        // Show current size
        System.out.println("Current size: " + dll.size());
        
        // Delete front link
        System.out.println("\nDelete the long '7' that was added earlier to"
                + " the front of the list: ");
        System.out.println("The deleted link's contents: " 
                + dll.deleteLink(7).dData);
        dll.displayForward();
        // Show current size
        System.out.println("Current size: " + dll.size());
        
        // Delete end link
        System.out.println("\nDelete the long '9' that was added earlier to"
                + " the rear of the list: ");
        System.out.println("The deleted link's contents: " 
                + dll.deleteLink(9).dData);
        dll.displayForward();
        // Show current size
        System.out.println("Current size: " + dll.size());
        
    }
    
}
  