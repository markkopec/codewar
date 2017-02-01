import static java.lang.Math.pow;

public class Kata
{
    public static String expandedForm(int num)
    { 
      String b = Integer.toString(num);
      int a = b.length();
      int[] liczba = new int [a];
      int c = a-1;
      String result = "";
      
      for (int i = 0; a > 0; i++) {
        liczba[i] = (int) (num % pow(10, i + 1));
        num -= liczba [i];
 //       result += liczba [i] + " " + "+" + " ";
        a--;
      }      
      for (; c >= 0; c--) {
        if (liczba [c] != 0) {    
            result += " " + "+" + " " + liczba [c];
        }
      }
      
      return result.substring(3);
    }
}
