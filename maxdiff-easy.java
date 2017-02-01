public class Kata {

  public static int maxDiff(int[] lst) {
    if (lst == null || lst.length == 0 || lst.length == 1) return 0;
    
    int wynikMax = lst[0];
    int wynikMin = lst[0];

    
    for (int i = 0; i < lst.length; i++){
      if (wynikMax < lst[i] ){
        wynikMax = lst[i];
      }
      if (wynikMin > lst[i] ){
        wynikMin = lst[i];
      }
    }
     
    return wynikMax - wynikMin;
  }
}
