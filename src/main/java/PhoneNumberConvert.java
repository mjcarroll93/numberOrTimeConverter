import java.util.HashMap;


public class PhoneNumberConvert {

    public String phoneNumberConversion(String number) {
        HashMap<Character, String> numberToString = new HashMap<>();

        numberToString.put('0', "zero");
        numberToString.put('1', "one");
        numberToString.put('2', "two");
        numberToString.put('3', "three");
        numberToString.put('4', "four");
        numberToString.put('5', "five");
        numberToString.put('6', "six");
        numberToString.put('7', "seven");
        numberToString.put('8', "eight");
        numberToString.put('9', "nine");
int counter =0;
        String convertedString = "";
        for (int i = 0; i < number.length(); i++) {
            String conversion = numberToString.get(number.charAt(i));
            if (counter == 3 | counter == 7) {
                convertedString += " ";
                counter++;
            }
            if (conversion != null) {
                convertedString += conversion;
                counter++;
            }
        }
        return convertedString;
    }

    public static void main(String[] args) {


        String time = "3:35pm";

        for (int i = 0; i <time.length() ; i++) {
            System.out.println(time.charAt(i));
        }

    }
}
