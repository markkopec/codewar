public class Kata
{
  public static int sum(int[] numbers)
  {
    if (numbers == null || numbers.length == 0 || numbers.length == 1) return 0;
    int wynikMax = numbers[0];
    int wynikMin = numbers[0];
    int suma = 0;
    
    for (int i = 0; i < numbers.length; i++)   { 
      if (wynikMin > numbers[i]){
          wynikMin = numbers[i];
      }
    }
    for (int i = 0; i < numbers.length; i++)   { 
      if (wynikMax < numbers[i]){
          wynikMax = numbers[i];
      }
    }
    for (int i = 0; i < numbers.length; i++)    {
      suma += numbers[i];
    }
    suma = suma - wynikMax - wynikMin;

    return suma;
    
  }
}
