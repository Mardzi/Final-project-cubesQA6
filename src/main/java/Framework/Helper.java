
package Framework;

public class Helper {
     public static int getRandomInteger(){
        return (int) (Math.random()* 1000);
    }
    
    public static String generateTitle(){
        return ("Test-" + getRandomInteger());
    }
}
