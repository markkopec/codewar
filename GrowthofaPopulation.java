
class Arge {
    
    public static int nbYear(int p0, double percent, int aug, int p) {
        int i=0;
        double c = p0;
        
        for(; c<p ; i++){
          c = c*(1 + percent / 100)+aug;
        }
      return i;
    }
}
