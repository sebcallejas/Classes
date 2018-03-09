package Circles;
/*
* Sebastian Callejas
* Period 2
* Project: Circles
*/

/**
 *
 * @author 18051
 */
public class Circles {
//Lets get it done
    private double radius;
    private static final double PI= 3.14159;
    
    //Constructor
    public Circles(double pRadius){
        radius = pRadius;
    }
    
    //Setter Method
    public void setRadius(double pRadius){
        radius = pRadius;
    }
    
    //Getter Method
    public double getRadius(){
        return radius;
    }
    
    //GET AREA- returns area of circle 
    public double getArea(){
        return PI*(Math.pow(radius,2));
    }
    
    //GET DIAMETER- returns diameter of circle 
    public double getDiameter(){
        return 2*radius;
    }
    
    //GET CIURUMFERENCE- returns circumference 
    public double getCircumference(){
        return 2*PI*radius;
    }
    
    //TO STRING- String rep of object
   public String toString(){
       return "The radius of your circle is "+radius;
   }
    
}
