public class Accumul {
    
    public static String accum(String s) {
    
    String result = "";
    int z = 0;
    

  	for (int i = 1; i < s.length() + 1; i++){      
  		for (int y = 0; y < i; y++){
  				if (y==0){
  					result += s.substring(z, i).toUpperCase();
  				} else {
  					result += s.substring(z, i).toLowerCase();
  				}
  		}	
  		result +=	"-";
  		z++;
  	}


	  result = result.substring(0, result.length() - 1);
    return result;
}
}
