public class Kata {
  public static String findNeedle(Object[] haystack) {
    String doT = "needle";
    int wynik = 0;
    for(int i = 0; i < haystack.length; i++) {
      if(haystack[i] == doT) {
        wynik = i;
      }
    }
    
    return("found the needle at position " + wynik);
    
    }

}
