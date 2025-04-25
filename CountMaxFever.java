import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class CountMaxFever here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CountMaxFever
{
    // instance variables - replace the example below with your own
    private String fever; 
    private ArrayList<Double> temperatures;
    
     /**
     * Constructor for objects of class CountMaxFever
     */
    public CountMaxFever()
    {
        ArrayList<Double>temperatures = new ArrayList<>();
        
        temperatures.add(37.2);
        temperatures.add(40.2);
        temperatures.add(39.2);
        temperatures.add(22.2);
        
        fever(temperatures);
    }
    //Q25
    public static void fever(ArrayList<Double>temperatures) {
        int count =0;
        double max = 0.0;
       for(Double temp: temperatures){
         if(temp>37.2){
          count++;
         }
         if(temp>max){
           max=temp; 
         }
         System.out.println("count" + count);
         System.out.println("maximum temp"+ max);
         //26
         System.out.println("maximum element" + Collections.max(temperatures));
         //27
         Collections.sort(temperatures);
         System.out.println("sorted list" + temperatures.getLast());
       }
    }
    
    
}
    

    
    

    


