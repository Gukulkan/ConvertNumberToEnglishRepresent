/**
 * Created by gukulkan on 05/25/2017.
 */
public class Converter {

    private static final String[] bigNumbers = {
            "",
            " thousand",
            " million",
            " billion",
            " trillion",
            " quadrillion",
            " quintillion"
    };

    private static final String[] tens = {
            "",
            " ten",
            " twenty",
            " thirty",
            " forty",
            " fifty",
            " sixty",
            " seventy",
            " eighty",
            " ninety"
    };

    private static final String[] simpleAndTeens = {
            "",
            " one",
            " two",
            " three",
            " four",
            " five",
            " six",
            " seven",
            " eight",
            " nine",
            " ten",
            " eleven",
            " twelve",
            " thirteen",
            " fourteen",
            " fifteen",
            " sixteen",
            " seventeen",
            " eighteen",
            " nineteen"
    };


    private String convertTillThousand(int in) {
        String out;

        if (in % 100 < 20) {
            out = simpleAndTeens[in % 100];
            in /= 100;
        } else {
            out = tens[in/10 % 10] + simpleAndTeens[in % 10];
            in /= 100;
        }

        if (in == 0) return out;

        return simpleAndTeens[in] + " hundred" + out;
    }

    public String convertWholeNumber(int in) {
        String out = "";

        if (in == 0) return "zero";

        if (in < 0) throw new RuntimeException("Cannot be negative");

        int bigNumberCounter = 0;
        while (in > 0) {

            int tmp = in % 1000;

            if (tmp != 0) {
                out = convertTillThousand(tmp) + bigNumbers[bigNumberCounter] + out;
            }

            in /= 1000;
            bigNumberCounter++;
        }

        return out.trim();

    }
}
