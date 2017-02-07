class LongestConsec {
    
    public static String longestConsec(String[] strarr, int k) {
    
if (strarr.length == 0 || k > strarr.length || k<=0){
        return "";
} else {
    String[] result = new String[strarr.length - k+1];
	  String wynik = "";

    int i = 0;
    for (int z = 0; z < strarr.length-k+1; z++) {           
        for (int j = 0; j<k; j++){
          if (j == 0){  
              result[z] = strarr[i];
          } else {
              result[z] += strarr[i+j];
          }
        }
		    if (result[z].length() > wynik.length()){
            wynik = result[z];
        } 
        i++;
    }

    return wynik;
}
}
}
