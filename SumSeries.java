import java.text.DecimalFormat;
public class NthSeries {
	
	public static String seriesSum(int n) {	
      int o = 0;
      double p = 0;
      for (double j = 1; o < n; o++){
        System.out.println(j); 
        p += (double)(1/j);
         j++;
         j++;
         j++;
      }
        p *= 100;
        p = Math.round(p);
        p /= 100;
    
        String result = String.format("%.2f", p);
    return result;	
	}
}
