import static java.lang.Math.*;

public class VolTank {
    public static int tankVol(int h, int d, int vt) {
    
    double h1 = h;
    double d1 = d;
    double vt1 = vt;
    double przeciwprostokatna = 0;
    double przyprostokatna = 0;
    double poleBenzyny = 0;
    if ((d1/2) == h) {
      return vt/2;
    }
    
    if ((d1/2) > h) {
           przeciwprostokatna = d1/2;
           przyprostokatna = (d1/2)-h1;
    } else {
      		 przeciwprostokatna = d1/2;
           przyprostokatna = h1 - (d1/2);
    }
    
          double cosinusTrojkata = (przyprostokatna) / (przeciwprostokatna);    
          double katAlfa = acos(cosinusTrojkata)*2; 
          katAlfa = (katAlfa*360)/(2*Math.PI);
          double dlugoscPodstawy = Math.sqrt((double)Math.pow(przeciwprostokatna, 2) - (double)Math.pow(przyprostokatna, 2)) * 2;
          double poleTrojkata = (dlugoscPodstawy * przyprostokatna) / 2;
          double poleKola = (Math.PI * Math.pow(przeciwprostokatna, 2));
          double poleKawalkaKola = poleKola * katAlfa/360;
    
          
    
        if (d1/2 > h) {
            poleBenzyny = poleKawalkaKola - poleTrojkata;
   		   } else {
      		 poleBenzyny = poleKola - (poleKawalkaKola - poleTrojkata);
    	  }
    
    
          double wspolczynnikUzupelnienia = poleBenzyny/poleKola;
          int iloscBenzyny = (int) (wspolczynnikUzupelnienia*vt1);
    
    
    
    return iloscBenzyny;

    }
}
