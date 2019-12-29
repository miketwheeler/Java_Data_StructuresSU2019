// 19SS_INFO_2530_WA - Online - Data Structures Using Java
// Summer 2019
//
// Michael Wheeler
// MCCID: 0891925

package Lab3Classes;
/**
 * This class denotes a single Order object.
 * @author mtwheeler
 */
public class Order 
{
    /**
     * The order code for the order.
     */
    String orderCode;
    /**
     * The priority number for the order.
     */
    int priorityNum;
    
    /**
     * Constructor for this order.
     * @param orderCodeIn The order code.
     * @param priorityNumIn The priority number.
     */
    public Order(String orderCodeIn, int priorityNumIn)
    {
        orderCode = orderCodeIn;
        priorityNum = priorityNumIn;
    }
    
    /**
     * Retrieves the order code.
     * @return the order code.
     */
    public String getOrderCode()
    {
       return orderCode; 
    }
    
    /**
     * Retrieves the priority number for the order.
     * @return the priority number.
     */
    public int getPriorityNum()
    {
        return priorityNum;
    }
    /**
     * String formatter for this order.
     * @return The orders contents.
     */
    @Override
    public String toString()
    {
        return String.format("[Order ID: %s ; Priority Number: %d]", 
                orderCode, priorityNum);
    }
}
