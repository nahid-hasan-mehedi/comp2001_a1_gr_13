/**
 * A class that maintains information about a binocular.
 * This might form part of a larger application such
 * as a optical shop, for instance.
 *
 * @author (Raihan Sikdar Ridom 1)
 * @author (Mehedi Hasan Nahid 2)
 * @author (Rahul Sarker  3)
 * 
 * @version (Insert today's date here.)
 */
public class Binocular
{
    // The fields.
    private String model;
    private int price;
    private int closeFocusDistance;
    private int magnification;
    private int diameter;
    private boolean imageStabilization;
    private String owner;  
    
    

    /**
     * Set the model, price and focus fields when this object
     * is constructed.
     */
    public Binocular(String binocularModel, int binocularPrice,int binocularFocus, boolean imageStabilizationValue,String binocularOwner)
    {
        this.model = binocularModel;
        this.price = binocularPrice;
        this.closeFocusDistance = binocularFocus;
        this.imageStabilization = imageStabilizationValue; 
        this.owner = binocularOwner;
        
    }

    // Add the methodds here ...
    
    //adding accesor methood for model 
    public String getModel()
    {  return this.model;
    
    
    }
    // accesor method for price 
    public int getPrice()
    {  return this.price;
    
    
    }
    // accesor method for focusDistance 
    public int getCloseFocusDistance()
    {  return this.closeFocusDistance;
    
    
    }
    
    
    

}
