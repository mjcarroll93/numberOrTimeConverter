import java.sql.Time;
import java.util.Scanner;
public class UserInputHandler {
    Scanner scanner = new Scanner(System.in);

    PhoneNumberConvert phoneNumberConvert = new PhoneNumberConvert();
    TimeConverter timeConverter = new TimeConverter();

    public String getUserInput(){
        System.out.println("Enter a phone number or Time: ");
        return scanner.next();
    }

public String userInputHandler(String input){
    String time = "";
    if(ConverterUtil.isMilitaryTime(input)){
        time = timeConverter.militaryTimeToString(input);

    }
    else if(ConverterUtil.isNonMilitaryTime(input)){
       time = timeConverter.timeConvertToString(input);
    }
    else if(ConverterUtil.isPhoneNumber(input)){
       time =phoneNumberConvert.phoneNumberConversion(input);
    }else{
       time ="Sorry your input is not a phone number or time format recognized by us";
    }
    return time;
}
}
