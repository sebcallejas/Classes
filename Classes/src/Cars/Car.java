package Cars;
/*
* Sebastian Callejas
* Period 2
* Project: Car
*/

/**
 *
 * @author 18051
 */
public class Car {
//Lets get it done
    private int startMiles;
    private int endMiles;
    private double gallons;
    
    public Car(int pStartMiles, int pEndMiles, double pGallons){
        startMiles = pStartMiles;
        endMiles = pEndMiles;
        gallons = pGallons;
    }
    
    public void setGallons(double gallons){
        this.gallons = gallons;
    }
    
    public double getGallons(){
        return this.gallons;
    }
    
    public double getMPG (){
        return (endMiles - startMiles)/gallons;
    }
    public String toString(){
        return "Start millage; "+startMiles
                +"\nEnd Mileage: "+endMiles
                +"\nGallons Used: "+gallons
                +"\nYour MPG is: "+getMPG();
    }
}
