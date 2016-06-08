import java.util.HashMap;

/**
 * Created by michaelcarroll on 6/7/16.
 */
public class ConverterUtil {

    public static String getTens(int key){
        HashMap<Integer, String> tens = new HashMap<>();
        tens.put(10, "ten");
        tens.put(20, "twenty");
        tens.put(30, "thirty");
        tens.put(40, "forty");
        tens.put(50, "fifty");


        String res = tens.get(key);
        if(res !=null)
            return res;
        else
            return "";
    }

    public static String getTeens(int key){
        HashMap<Integer, String> teens = new HashMap<>();
        teens.put(11, "eleven");
        teens.put(12, "twelve");
        teens.put(13, "thirteen");
        teens.put(14, "fourteen");
        teens.put(15, "fifteen");
        teens.put(16, "sixteen");
        teens.put(16, "seventeen");
        teens.put(18, "eighteen");
        teens.put(19, "nineteen");

       String res = teens.get(key);
        if(res !=null)
            return res;
        else
            return "";
    }

    public static String getOnes(int key){
        HashMap<Integer, String> ones = new HashMap<>();
        ones.put(0, "zero");
        ones.put(1, "one");
        ones.put(2, "two");
        ones.put(3, "three");
        ones.put(4, "four");
        ones.put(5, "five");
        ones.put(6, "six");
        ones.put(7, "seven");
        ones.put(8, "eight");
        ones.put(9, "nine");

        String res = ones.get(key);
        if(res !=null)
            return res;
        else
            return "";
    }

    public static boolean numberRangeBelowTen(int number){

        if(number <10)
           return true;
        else
            return false;

    }

    public static boolean numberRangeTens(int number) {
        if (number == 10 || number >19)
            return true;
        else
            return false;
    }

    public static boolean numberRangeBetweenTenAndTwenty(int number){
        if(number >10 && number <20 )
            return true;
        else
            return false;
    }

    public static boolean isMilitaryTime(String input){
        return input.matches("^([0-2][0-9]):[0-5][0-9]$");
    }

    public static boolean isNonMilitaryTime(String input){
        return input.matches("^[01]?[0-9]:[0-5][0-9](\\\\s)*(?i)(a[\\.]?m|p[\\.]?m)$");
    }

    public static boolean isPhoneNumber(String input){
        return input.matches("^\\(?\\d{3}\\)?[\\s.-]?\\d{3}[\\s.-]?\\d{4}$");
    }
}
