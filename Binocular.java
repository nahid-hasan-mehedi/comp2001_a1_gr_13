/**
 * A class that maintains information about a binocular.
 * This might form part of a larger application such
 * as a optical shop, for instance.
 *
 * @author (Raihan Sikdar Ridom 1)
 * @author (Mehedi Hasan Nahid 2)
 * @author (Rahul Sarker  3)
 * 
 * @version (27th January, 2022)
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
    //accessor method for imagestabilization
    public boolean getImageStabilization()
    {  return imageStabilization;
        
        
    }
    //accessor metod for magnification
    public int getMagnification()
    {  return this.magnification;
        
        
    }
    //accessor method for diameter
    public int getDiameter()
    {  return this.diameter;
        
        
    }
    //accessor method for binocuar owner
    public String getowner()
    {  return owner;
        
        
    }
    
    /**
     * Setter methods for
     * magification
     * diameter
     */
    public void setMagnification(int magnification)
    {
      this.magnification= magnification;
    }
    
    public void setDiameter(int diameter)
    {
      this.diameter= diameter;
    }
    
    /**
     * Mutator method for changing the owner
     */
    public void changeOwner(String newOwner)
    
    {
       this.owner = newOwner;
    }
    
    
    /**
     * Printing method for printing the binocular info
     */
    public void printBinocularInfo()
    
    {
      System.out.println("Binocular model: " + this.model +"\n");
      System.out.println("Binocular price: " + this.price +"\n");
      System.out.println("Binocular Magnification: " + this.magnification +"\n");
      System.out.println("Binocular Diameter: " + this.diameter +"\n");
      System.out.println("Binocular Image Stabilization: " + this.imageStabilization +"\n");
      System.out.println("Binocular Owner: " + this.owner);
    }
    
    /**
     * Printing Author info
     */
    public void authorInfo()
    { 
      System.out.println("Mehedi Hasan Nahid :");
      System.out.println("getModel()");
      System.out.println("getPrice()");
      System.out.println("getCloseFocusDistance()");  
      System.out.println("Raihan Sikder Ridom : ");
      System.out.println("setMagnification(int magnification)");
      System.out.println("setDiameter(int diameter)");
      System.out.println("changeOwner(String newOwner)");
      System.out.println("printBinocularInfo()");
      System.out.println("Rahul Sarker : ");
      System.out.println("getImageStabilization()");
      System.out.println("getMagnification()");
      System.out.println("getDiameter()");
      System.out.println("getOwner()");
      
      
      
    
    
    
    }
    
    
    

}
