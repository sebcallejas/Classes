/*
* Sebastian Callejas
* Period 2
* Project: NewMain
*/

package Circles;

/**
 *
 * @author 18051
 */
public class NewMain {

    
    public static void main(String[] args) {
        // And so it begins....
        Circles circle1 = new Circles(15.0);
        System.out.println(circle1);
        circle1.setRadius(25.0);
        System.out.println(circle1);
        System.out.println(circle1.getCircumference());
    }

}
