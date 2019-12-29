// 19SS_INFO_2530_WA - Online - Data Structures Using Java
// Summer 2019
//
// Michael Wheeler
// MCCID: 0891925

/**
 * Builds an individual LinkedList Link 
 * ((**Cross-functional for Doubly and Double-Ended lists**))
 * @author mtwheeler
 */

public class Link 
{
    // The data of this link
    public long dData;
    // The next link 
    public Link next;
    // The previous link (Doubly Linked List)
    public Link previous;
    
    /**
     * Constructor for a new Link
     * @param d the data that this link includes
     */
    public Link(long d)
    {
      dData = d;
    }
    
    /**
     * Displays the current links data
     */
    public void displayLink()
    {
      System.out.print(dData + " ");
    }
    
 }