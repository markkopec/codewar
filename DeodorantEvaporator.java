public class Evaporator { 
	
	public static int evaporator(double content, double evap_per_day, double threshold) {
    double result = content * threshold/100;
    double wynik = content;
    int i = 0;
    for (; wynik > result;){
        wynik = wynik * (1-(evap_per_day/100));
        i++;
    }
    
		return i;
	}
}
