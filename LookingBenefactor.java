import java.io.*;

public class NewAverage
{
    public static long newAvg(double[] arr, double navg)
    {
    double wynik = 0;
        for (int i = 0; i<arr.length;i++){
          wynik +=(arr[i]);
        }
    double x = 0;
    double y = arr.length + 1;
    x = ((navg * y) - wynik);
    
    if (wynik/arr.length > navg){
      throw new IllegalArgumentException("Input parameter out of range");
    }

    return Math.round(Math.ceil(x));

   } 
}
