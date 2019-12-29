// 19SS_INFO_2530_WA - Online - Data Structures Using Java
// Summer 2019
//
// Michael Wheeler
// MCCID: 0891925

package Lab4Classes;
import java.util.*;
/**
 * This class creates a new Manufactured Product
 * @author mtwheeler
 */
public class ManufacturedProduct 
{
    private int productId;
    private int inspect;
    private boolean passedInspection;
    Random rand = new Random();
    
    /**
     * Constructor to create a new item
     * @param productIdIn the random assigned ID number
     */
    public ManufacturedProduct(int productIdIn)
    {
        productId = productIdIn;
        passedInspection = true;//default
    }
    
    public int getProductId()
    {
        return productId;
    }
    
    public String inspection()
    {
        inspect = rand.nextInt(19);//random QC number 0-19
        if(inspect == 0)
        {
            passedInspection = false;//when zero 
        }
        else
            passedInspection = true;
        
        return String.valueOf(passedInspection);
    }
    
    @Override
    public String toString()
    {
        return String.format("[Trinket ID: %d; Passed QC: %s]", getProductId(),
                inspection());
    }
}
