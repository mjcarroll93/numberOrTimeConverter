import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by michaelcarroll on 6/7/16.
 */
public class PhoneNumberConvertTest {

    @Test
    public void phoneNumberConversionNoSpaces() throws Exception {
        PhoneNumberConvert phoneNumberConvert = new PhoneNumberConvert();
        String expectedValue = "twoonefive twothreethree fourfourfivefive";
        String actualValue = phoneNumberConvert.phoneNumberConversion("2152334455");
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void phoneNumberConversionWithCharacters() throws Exception {
        PhoneNumberConvert phoneNumberConvert = new PhoneNumberConvert();
        String expectedValue = "twoonefive twothreethree fourfourfivefive";
        String actualValue = phoneNumberConvert.phoneNumberConversion("(215)-233-4455");
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void timeConversion() throws Exception {
        TimeConverter timeConverter = new TimeConverter();
        String expectedValue = "three thirty-five PM";
        String actualValue = timeConverter.timeConvertToString("3:35pm");
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void timeConversion2() throws Exception {
        TimeConverter timeConverter = new TimeConverter();
        String expectedValue = "eleven forty-five AM";
        String actualValue = timeConverter.timeConvertToString("11:45am");
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void militaryTimeimeConversion() throws Exception {
        TimeConverter timeConverter = new TimeConverter();
        String expectedValue = "twenty-two forty-five";
        String actualValue = timeConverter. militaryTimeToString("22:45");
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void militaryTimeimeConversionHundreds() throws Exception {
        TimeConverter timeConverter = new TimeConverter();
        String expectedValue = "twenty-two hundred";
        String actualValue = timeConverter. militaryTimeToString("22:00");
        assertEquals(expectedValue, actualValue);
    }
}