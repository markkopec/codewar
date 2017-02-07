import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int result = 0;
        int mnoznik = binary.size();
        int z = 0;
        for (int i = binary.size() - 1; i >= 0; i--){
          if (binary.get(z) > 0) {
            result = (int) ( result + Math.pow(2, i) );
          }  
          z++;
        }
      
        return result;
    }
}
