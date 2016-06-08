
public class TimeConverter {
    private String convertedString = "";

    public String timeConvertToString(String time) {

        String trimmedTime = time.trim();

        String meridian = trimmedTime.substring(trimmedTime.length() - 2);
        String timeWithNoMeridian = trimmedTime.replaceAll("[pa]m", "");

        String[] converterArray = timeWithNoMeridian.split(":");
        int leftSide = Integer.parseInt(converterArray[0]);
        int rightSide = Integer.parseInt(converterArray[1]);

        convertLeftSide(leftSide);
        convertRightSideNonMilitary(rightSide);
        return convertedString + " " + meridian.toUpperCase();
    }


    public String militaryTimeToString(String time) {
        String[] converterArray = time.split(":");
        int leftSide = Integer.parseInt(converterArray[0]);
        int rightSide = Integer.parseInt(converterArray[1]);

        convertRightSideNonMilitary(leftSide);
        convertedString += " ";

        if (rightSide == 0) {
            convertedString += "hundred";
        } else {
            convertRightSideNonMilitary(rightSide);
        }
        return convertedString;
    }

    public void convertLeftSide(int leftSide) {

        if (ConverterUtil.numberRangeBelowTen(leftSide)) {
            convertedString += ConverterUtil.getOnes(leftSide);
            convertedString += " ";
        }

        if (ConverterUtil.numberRangeBetweenTenAndTwenty(leftSide)) {
            convertedString += ConverterUtil.getTeens(leftSide);
            convertedString += " ";
        }
        if (ConverterUtil.numberRangeTens(leftSide)) {
            int ones = leftSide % 10;
            int tensConverted = leftSide-ones;
            convertedString += ConverterUtil.getTens((tensConverted));
            convertedString += "-";
            convertedString += ConverterUtil.getOnes(ones);
            convertedString += " ";
        }
    }

    public void convertRightSideNonMilitary(int rightSide) {
        if (ConverterUtil.numberRangeBelowTen(rightSide)) {
            convertedString += ConverterUtil.getOnes(rightSide);
        }

        if (ConverterUtil.numberRangeBetweenTenAndTwenty(rightSide)) {
            convertedString += ConverterUtil.getTeens(rightSide);
        }
        if (ConverterUtil.numberRangeTens(rightSide)) {
            int ones = rightSide % 10;
           int tensConverted = rightSide -ones;
            convertedString += ConverterUtil.getTens(tensConverted);
            convertedString += "-";
            convertedString += ConverterUtil.getOnes(ones);
        }
    }
}
