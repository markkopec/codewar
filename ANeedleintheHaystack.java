public class Kata {
  public static String findNeedle(Object[] haystack) {

    int result = 0;
    for(int i = 0; i < haystack.length; i++) {
      if(haystack[i] == "needle") {
        wynik = i;
      }
    }
    
    return("found the needle at position " + wynik);
    
    }

}
