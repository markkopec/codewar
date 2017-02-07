import java.util.regex.Pattern;

public class StringUtils {
  
  public static boolean isLetter(String s) {

   boolean matches = Pattern.matches("[a-zA-Z]", s);
   return matches;
    
    
  }
}
