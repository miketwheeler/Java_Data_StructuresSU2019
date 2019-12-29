// 19SS_INFO_2530_WA - Online - Data Structures Using Java
// Summer 2019
//
// Michael Wheeler
// MCCID: 0891925

/**
 * Builds a Double Ended Linked List
 * @author mtwheeler
 */
public class DoubleEndedLinkedList
{
    /**
     * The initial Links
     */
    Link first;
    Link last;
    
    /**
     * Constructor sets first and last links to null
     */
    public DoubleEndedLinkedList()
    {
       first = null;
       last = null;
    }
    
    /**
     * Determines if the LinkedList is empty
     * @return true or false 
     */
    public boolean isEmpty()
    {
        return (first == null);
    }
    
    /**
     * Inserts a passed value and establish a new first link
     * @param dataIn the data to assign
     */
    public void insertFirst(long dataIn)
    {
        Link nLink = new Link(dataIn);
        if(isEmpty())
            last = nLink;
        nLink.next = first;
        first = nLink;
    }
    
    /**
     * Inserts a passed value and establish a new last link
     * @param dataIn the data to assign
     */
    public void insertLast(long dataIn)
    {
        Link nLink = new Link(dataIn);
        if(isEmpty())
            first = nLink;
        else
            last.next = nLink;
        
        last = nLink;
    }
    
    /**
     * Deletes the first Link in the list
     * @return the link that was deleted
     */
    public long deleteFirst()
    {
        long temp = first.dData;
        if(first.next == null)
            last = null;
        first = first.next;
        return temp;
    }
    
    /**
     * Searches for a given value and returns true or false
     * @param isThere the value to search
     * @return true or false
     */
    public boolean search(long isThere)
    {
        boolean returnValue = false;
        Link toSearch = first;
        if(!isEmpty())
        {
            while(toSearch != null)
            {
                if(toSearch.dData == isThere)
                {
                    returnValue = true;
                    break;
                }
                toSearch = toSearch.next;
            }
        }
        else
            System.out.println("Cannot find value from empty List!");
        
        return returnValue;
    }
    
    /**
     * Counts the occurrences of a given value  
     * @param findValue the value to tally
     * @return the number of times the value is present
     */
    public int numberOfValues(long findValue)
    {
        int count = 0;
        Link toCount = first;
        if(!isEmpty())
        {
            while(toCount != null)
            {
                if(toCount.dData == findValue)
                {
                    count++;
                }
                toCount = toCount.next;
            }
        }
        else
            System.out.println("Cannot find value from empty List!");
        
        return count;
    }
    
    /**
     * Finds given value, then replaces it with a different given value
     * @param find the value to find
     * @param replace the value to replace
     */
    public void replace(long find, long replace)
    {
        Link toReplace = first;
        if(!isEmpty())
        {
            while(toReplace != null)
            {
                if(toReplace.dData == find)
                    toReplace.dData = replace;
                toReplace = toReplace.next;
            }
        }
        else
            System.out.println("Cannot find value from empty List!");
    }
    
    /**
     * Zeros out all the data items in the linkedList
     */
    public void zero()
    {
        Link setToZero = first;
        if(!isEmpty())
        {
            while(setToZero != null)
            {
                setToZero.dData = 0;
                setToZero = setToZero.next;
            }
        }
        else
            System.out.println("Cannot change value from empty List!");
    }
    
    /**
     * Transfers the values within the LinkedList into a new array
     * @return the new array with the values
     */
    public long[] getArray()
    {
        int i = size();
        long[] returnArray = new long[i];
        Link transfer = first;
        if(!isEmpty())
        {
            while(transfer != null)
            {
                returnArray[i - 1] = transfer.dData;
                i--;
                transfer = transfer.next;
            }
        }
        else
            System.out.println("Cannot find value from empty List!");
        
        return returnArray;
    }
    
    /**
     * Deletes a link based on the given links data
     * @param findLink the data to use to locate a link
     */
    public void deleteLink(long findLink)
    {
        Link toFind = first;
        Link prev = null;
        if(!isEmpty())
        {    
            if(toFind != null && toFind.dData == findLink)
                first = toFind.next;
            else
            {
                while(toFind != null && toFind.dData != findLink)
                {
                    prev = toFind;
                    toFind = toFind.next;
                }
                if(toFind != null)
                {
                    prev.next = toFind.next;
                    if(toFind == last)
                        last = prev;
                }
                else
                    System.out.print("Cannot delete value that does not exist!");
            }
        }
        else
            System.out.print("Cannot delete from an empty list!");
    }
    
    /**
     * Displays the contents of all Links in the LinkedList
     */
    public void displayList()
    {
        System.out.print("List (first-->last): ");
        Link current = first;
        while (current != null)
        {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
    
   /**
    * Finds the current size of the DoublyLinkedList
    * @return the size
    */
    public int size()
    {
        int tally = 0;
        Link start = first;
        while(start != null)
        {
            tally++;
            start = start.next;
        }
        return tally;
    }
    
}
