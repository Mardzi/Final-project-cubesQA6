/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

/**
 *
 * @author kromp
 */
public class Helper {
     public static int getRandomInteger(){
        return (int) (Math.random()* 1000);
    }
    
    public static String generateTitle(){
        return ("Test-" + getRandomInteger());
    }
}
