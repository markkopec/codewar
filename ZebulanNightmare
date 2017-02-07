public class ZebulansNightmare{
  public static String zebulansNightmare(final String functionName) {
    String result = "";
    int z = 0;
    
	
	  for (int i = 1; i < functionName.length() + 1; i++){      

            if (functionName.substring(z, i).contains("_")){
                i++;
              	z++;
                result += functionName.substring(z, i).toUpperCase();		
            } else {
                result += functionName.substring(z, i);
            }

		  z++;
	  }
    
    
    return result;
  }
}
