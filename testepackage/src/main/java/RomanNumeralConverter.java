public class RomanNumeralConverter {
    public static String arabicToRoman(int number) {
        if (number < 1 || number > 3999) {
            throw new IllegalArgumentException("O número deve estar entre 1 e 3999.");
        }

        StringBuilder roman = new StringBuilder();

        int[] arabicValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < arabicValues.length; i++) {
            while (number >= arabicValues[i]) {
                roman.append(romanSymbols[i]);
                number -= arabicValues[i];
            }
        }

        return roman.toString();
    }

    public static int romanToArabic(String roman) {
        if (roman == null || roman.isEmpty()) {
            throw new IllegalArgumentException("O número romano não pode ser vazio.");
        }

        char[] romanSymbols = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] arabicValues = {1, 5, 10, 50, 100, 500, 1000};

        int length = roman.length();
        int result = 0;
        int lastValue = 0;

        for (int i = length - 1; i >= 0; i--) {
            char symbol = roman.charAt(i);
            int value = 0;

            for (int j = 0; j < romanSymbols.length; j++) {
                if (romanSymbols[j] == symbol) {
                    value = arabicValues[j];
                    break;
                }
            }

            if (value < lastValue) {
                result -= value;
            } else {
                result += value;
            }

            lastValue = value;
        }

        return result;
    }
}
