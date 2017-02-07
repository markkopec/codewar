import static java.lang.Math.pow;
import java.math.*;
public class ASum {
	
	public static long findNb(long m) {
		
    long wynik =0L;
    long count = 1;
    while (wynik < m) { 
      wynik += (long)pow(count, 3)  ;
      if (wynik < m){
        count++;
      } //else {
      //  wynik -= pow(count, 3)  ;
      //}	  
    }
    
    
    
    if (wynik <= m ) {
      return count;
    } else {
      return -1;
    }

	}	
}
