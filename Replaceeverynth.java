public class Kata
{
  public static String replaceNth(String text, int n, char oldValue, char newValue)
  {  
  
  
    if (n <=0){
      return text;
    }
    
    char [] str = text.toCharArray();
    int x = 0;
        
    for (int i = 0; i <  str.length; i++){
      if (str[i] == oldValue){
        x++;
      }
      if ((x != 0) && (x%n == 0) &&  str[i] == oldValue){
        str[i] = newValue;
      }
    }
    text = new String(str);
    return text;
  }
}
