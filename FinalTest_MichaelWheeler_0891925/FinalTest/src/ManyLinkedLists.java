// 19SS_INFO_2530_WA - Online - Data Structures Using Java
// Summer 2019
//
// Michael Wheeler
// MCCID: 0891925

/**
 * Instantiates Doubly Linked Lists and Double Ended Linked Lists
 * @author mtwheeler
 */
public class ManyLinkedLists 
{
    // Creates a constant and identifier for creating a new Double Ended List
    static final String DOUBLEENDEDLIST = "DoubleEndedList";
    // Creates a constant and identifier for creating a new Doubly Linked List
    static final String DOUBLYLINKEDLIST = "DoublyLinkedList";
    
    /**
     * Creates a new List of a given type
     * @param whichList determines which kind of list to create
     * @return a newly created list
     */
    public static Object createLinkedList(String whichList)
    {
        // New Double ended list
        if(whichList.equals(DOUBLEENDEDLIST))
        {
            DoubleEndedLinkedList DELL = new DoubleEndedLinkedList();
            return DELL;
        }
        
        // New Doubly linked list
        else
        {
            DoublyLinkedList DLL = new DoublyLinkedList();
            return DLL;
        }
            
    }
}
