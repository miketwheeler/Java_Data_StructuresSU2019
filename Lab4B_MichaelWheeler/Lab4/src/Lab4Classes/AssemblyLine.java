// 19SS_INFO_2530_WA - Online - Data Structures Using Java
// Summer 2019
//
// Michael Wheeler
// MCCID: 0891925

package Lab4Classes;

/**
 * This class creates a new Assembly Line queue.
 * @author mtwheeler
 */
public class AssemblyLine 
{
    private ManufacturedProduct[] temp;
    private int numberOfTrinkets;
    int totalCount;
 
    //New assembly line
    public AssemblyLine()
    {
        temp = new ManufacturedProduct[5];
    }
    
    public boolean isFull()
    {
        return numberOfTrinkets == temp.length;
    }
    
    public boolean isEmpty()
    {
        return numberOfTrinkets == 0;
    }
    
    public ManufacturedProduct peek()
    {
        return temp[0];
    }
    
    public int getNumberOfTrinkets()
    {
        return numberOfTrinkets;
    }
 
 ///----  4 B  ----/////////////////////////////////////////////////////////////
    public ManufacturedProduct emptyRemaining()
    {
        int i = numberOfTrinkets - 1;
        if(isEmpty())
        {
            throw new IllegalStateException("Cannot Dequeue further!");
        }
        ManufacturedProduct remainder = temp[i];
        if(numberOfTrinkets != 1)
        {
            i++;
            if(i == temp.length)
            {
                i = 0;
            }
        }
        
        numberOfTrinkets--;
        return remainder; 
    }
 ///////////////////////////////////////////////////////////////////////////////   
    /**
     * Inserts new items into the assembly line; after the line is full, when 
     * adding new items it removes and returns the last item.
     * 
     * @param trinketToAdd - the new item
     * @return the last item in the assembly line 
     */
    public ManufacturedProduct insert(ManufacturedProduct trinketToAdd)
    {
        ManufacturedProduct deploy = null;
        boolean go = true;

        //loops and explicitly performs where needed
        while(go)
        {
            if(isEmpty())                        //FIRST TEIR -insert when empty
            {
                temp[0] = trinketToAdd;
                numberOfTrinkets++;               //only increment when NOT full
                go = false;                                         //break loop
            }//-----------------------------------------------------------------
            
            if (!isFull() && go)                    //SECOND TEIR -when NOT full 
            {
                for (int i = numberOfTrinkets; i > 0; i--)       //move items up
                {
                    ManufacturedProduct toMove = temp[i - 1];    //previous item
                    temp[i] = toMove;                    //move to current index
                    if(i == 1)                              //when one item left
                    {
                        temp[0] = trinketToAdd;             //add to first index
                    }
                }
                numberOfTrinkets++;               //only increment when NOT full
                go = false;                                         //break loop
            }//-----------------------------------------------------------------
            
            if(isFull() && go)     //THIRD TEIR -when full, load and return last
            {
                deploy = temp[4];                          //save object at tail
                for (int j = numberOfTrinkets - 1; j > 0; j--)      //move items
                {
                    ManufacturedProduct toMoveAfter = temp[j - 1];
                    temp[j] = toMoveAfter;
                    if(j == 1)
                    {
                        temp[0] = trinketToAdd;
                    }
                } 
                totalCount++;           //increment out-bound (used for display)
                go = false;                                         //break loop
            }//-----------------------------------------------------------------
        }
        
        return deploy;                                 //Return non-null element
    }
}
