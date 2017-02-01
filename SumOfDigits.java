public class DRoot {
  public static int digital_root(int n) {
    int wynik = 0;    
    while (n > 0) {
      wynik += n%10;
      n = n/10;
    }
    if (wynik > 10) {
      return digital_root(wynik);
    } else {
      return wynik;
    }
  }
}
