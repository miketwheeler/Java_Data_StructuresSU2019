// 19SS_INFO_2530_WA - Online - Data Structures Using Java
// Summer 2019
//
// Michael Wheeler
// MCCID: 0891925

/**
 * Builds a Doubly Linked List
 * @author mtwheeler
 */
public class DoublyLinkedList 
{
    Link first;
    Link last;
    
    /**
     * Constructor fro the Doubly Linked List
     */
    public DoublyLinkedList()
    {
        first = null;
        last = null;
    }
    
    /**
     * Determines empty status
     * @return true or false if the list is empty
     */
    public boolean isEmpty() 
    {
        return first == null;
    }

    /**
     * Inserts a new link with given data at the front of the Doubly Linked List
     * @param dd the data to include in this new link
     */
    public void insertFirst(long dd) 
    {
        Link nLink = new Link(dd);
        if(!isEmpty()) 
        {
            first.previous = nLink;
            nLink.next = first;
            first = nLink;
        }
        else
        {
            first = nLink;
            last = nLink;
        }
        
    }
    
    /**
     * Inserts a new link with given data at the back of the Doubly Linked List
     * @param dd the data to include in this new link
     */
    public void insertLast(long dd) 
    {
        Link nLink = new Link(dd);
        if(!isEmpty()) 
        {
            last.next = nLink;
            nLink.previous = last;
            last = nLink;
        }
        else 
        {
            first = nLink;
            last = first;
        }
        
    }
    
    /**
     * Deletes the first link in the list
     * @return the deleted link and data
     */
    public Link deleteFirst() 
    {
        Link temp = first;
        if(!isEmpty())
        {
            if(first.next == null)
                last = null;
            else 
                first.next.previous = null;

            first = first.next;    
        
        }
        else
            System.out.print("Cannot delete from an empty list.");
        
        return temp;
    }

    /**
     * Deletes the last link in the list
     * @return the deleted link and data
     */
    public Link deleteLast() 
    {
        Link temp = last;
        if(!isEmpty())
        {
            if(first.next == null) 
                first = null;
            else
                last.previous.next = null;

            last = last.previous;

        }
        else
            System.out.print("Cannot delete from an empty list.");
        
        return temp;
    }
    
    /**
     * Inserts a new link and data after a given link position
     * @param key the position to insert after
     * @param dd the data this new link gets
     * @return true or false on successful insertion
     */
    public boolean insertAfter(long key, long dd) 
    {
        Link current = first;
        boolean returnValue = false;
        if(!isEmpty())
        {
            while(current.dData != key) 
            {
                current = current.next;
                if(current == null) 
                    return returnValue;
            }
            Link nLink = new Link(dd);
            if(current == last) 
            {
                nLink.next = null;
                last = nLink;
            } 
            else 
            {
                nLink.next = current.next;
                current.next.previous = nLink; 
            }
            nLink.previous = current;
            current.next = nLink;

            returnValue = true;

        }
        else
            System.out.print("Cannot add value after no value.");
        
        return returnValue;     
    }
    
    /**
     * Deletes a link based on given link-data
     * @param linkData the data in which the link is to locate
     * @return the link that was deleted
     */
    public Link deleteLink(long linkData) 
    {
        Link current = first;
        Link toReturn = null;
        if(!isEmpty())
        {
            while(current.dData != linkData) 
            {
                current = current.next;
                if(current == null) 
                    return toReturn;
            }
            if(current == first) 
                first = current.next;
            else 
                current.previous.next = current.next;

            if(current == last) 
                last = current.previous;
            else 
                current.next.previous = current.previous;

            toReturn = current;
        }
        else
            System.out.print("Cannot delete from an empty list.");
        
        return toReturn;
    }
    
    /**
     * Displays the contents of the Doubly Linked List forward
     */
    public void displayForward() 
    {
        System.out.print("List (first-->last): ");
        Link current = first;
        while(current != null)
        {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
    
    /**
     * Displays the contents of the Doubly Linked List backward
     */
    public void displayBackward() 
    {
        System.out.print("List (last-->first): ");
        Link current = last;
        while(current != null)
        {
            current.displayLink();
            current = current.previous;
        }
        System.out.println("");
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