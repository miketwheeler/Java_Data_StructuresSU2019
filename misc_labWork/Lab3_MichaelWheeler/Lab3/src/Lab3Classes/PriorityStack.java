// 19SS_INFO_2530_WA - Online - Data Structures Using Java
// Summer 2019
//
// Michael Wheeler
// MCCID: 0891925

package Lab3Classes;
/**
 * This class creates a stack of orders.
 * @author mtwheeler
 */
public class PriorityStack
{
    /**
     * The size of the stack.
     */
    private int size;
    /**
     * The stack.
     */
    private Order[] stackArray;
    /**
     * The index of the top of the stack.
     */
    private int top;
    
    /**
     * Constructor for the Priority Stack class.
     * @param x The size of the stack
     */
    public PriorityStack(int x)
    {
        size = x;
        stackArray = new Order[size];
        top = -1;  
    }
    
    /**
     * Adds an order to the top of the stack.
     * @param j The order to add.
     */
    public void push(Order j)
    {
        stackArray[++top] = j;
    }
    
    /**
     * Removes an order from the top of the stack.
     * @return The removed order.
     */
    public Order pop()
    {
        return stackArray[top--];
    }
    
    /**
     * Displays the contents of the order on the top of the stack.
     * @return Data of the top order.
     */
    public Order peek()
    {
        return stackArray[top];
    }
    
    /**
     * Checks for an empty stack.
     * @return True or false whether the stack is empty.
     */
    public boolean isEmpty()
    {
        return (top == -1);
    }
    
    /**
     * Checks for a full stack.
     * @return True or false whether the stack is full.
     */
    public boolean isFull()
    {
        return (top == (size - 1));
    }
    
    /**
     * Counts the number of orders, minus null values.
     * @return Total number of orders in the stack.
     */
    public int numberOfOrders()
    {
        int returnValue = 0;
        for (Order item : stackArray) 
        {
            if(item != null)
            {
              returnValue++;  
            }
        }
        return returnValue;
    }
    
    /**
     * Sorts this stack by ascending priority value of each order.
     */
    public void prioritySort()
    {    
        for (int next = 1; next < stackArray.length; next++) 
        { 
            Order insert = stackArray[next];
            //int nextItemIndex = next;
            int priority1 = stackArray[next - 1].getPriorityNum();
            int priority2 = stackArray[next].getPriorityNum();

            while (next> 0 && priority2 > priority1)
            {     
                Order temp = stackArray[next];
                stackArray[next] = stackArray[next- 1];
                stackArray[next - 1] = temp;
                next--;
            } 
            stackArray[next] = insert;
        }
    } 
}



