public class Main {

    public static void main(String[] args) {
        RomanNumeralConverter Romano = new RomanNumeralConverter();

        int arabicNumber = 1987;
        String romanNumber = Romano.arabicToRoman(arabicNumber);
        System.out.println("Árabe para Romano: " + arabicNumber + " = " + romanNumber);

        String romanStr = "MCMLXXXVII";
        int arabicResult = Romano.romanToArabic(romanStr);
        System.out.println("Romano para Árabe: " + romanStr + " = " + arabicResult);
    }
}

