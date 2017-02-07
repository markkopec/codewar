import java.util.Arrays;
public class Solution {

    public static int solveSuperMarketQueue(int[] customers, int n) {
    
    if (customers == null || customers.length == 0) return 0;
    if (customers.length == 1) return customers[0];

	  int[] tablica = new int[n];
	  int x = 0;
	  for ( int i =0; customers.length > x; x++){
		    tablica[0] += customers[x];
        Arrays.sort(tablica);	 
	  }  
      return tablica[n-1];
    }
    
}
