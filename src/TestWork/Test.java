package TestWork;

import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите строку для вычисления: ");
        String input = console.nextLine();

        try {
            System.out.println(calc(input));
        }catch (IOException e){
            System.out.print("Не верные исходные данные!! ");
        }
    }

    enum RomeNumber{
        I(1), II(2), III(3), IV(4), V(5), VI(6), VII(7), VIII(8), IX(9), X(10);
        private final int arabicNumber;
        private RomeNumber(int arabicNumber) {
            this.arabicNumber = arabicNumber;
        }
    }
    enum ArabicToRomeNumber{
        I,II, III, IV, V, VI, VII, VIII, IX, X,
        XI, XII, XIII, XIV, XV, XVI, XVII, XVIII, XIX, XX,
        XXI, XXII, XXIII, XXIV, XXV, XXVI, XXVII, XXVIII, XXIX, XXX,
        XXXI, XXXII, XXXIII, XXXIV, XXXV, XXXVI, XXXVII, XXXVIII, XXXIX, XL,
        XLI, XLII, XLIII, XLIV, XLV, XLVI, XLVII, XLVIII, XLIX, L,
        LI, LII, LIII, LIV, LV, LVI, LVII, LVIII, LIX, LX,
        LXI, LXII, LXIII, LXIV, LXV, LXVI, LXVII, LXVIII, LXIX, LXX,
        LXXI, LXXII, LXXIII, LXXIV, LXXV, LXXVI, LXXVII, LXXVIII, LXXIX, LXXX,
        LXXXI, LXXXII, LXXXIII, LXXXIV, LXXXV, LXXXVI, LXXXVII, LXXXVIII, LXXXIX, XC,
        XCI, XCII, XCIII, XCIV, XCV, XCVI, XCVII, XCVIII, XCIX, C;
    }
    public static <length> String calc(String input) throws IOException {
        String[] parts = input.split("\\+|-|\\*|/");
        String returnStr = new String();
        if (parts.length!=2) throw new IOException();

        if (!((isRomeNumber(parts[0]) && isRomeNumber(parts[1])) | (isNumeric(parts[0])&&isNumeric(parts[0]))))
        {throw new IOException();}

        if(isNumeric(parts[0])) {
            try {
                    Integer partsOne = Integer.parseInt(parts[0]);
                    Integer partsTwo = Integer.parseInt(parts[1]);

                    if (partsOne<=0 | partsOne>10 | partsTwo<=0 | partsTwo>10) throw new IOException();

                    switch (input.charAt(parts[0].length())){
                        case ('+'):
                                    returnStr += partsOne + partsTwo;
                        break;
                        case ('-'):
                                    returnStr += partsOne - partsTwo;
                        break;
                        case ('*'):
                                    returnStr += partsOne * partsTwo;
                        break;
                        case ('/'):
                                    returnStr += (int) partsOne / partsTwo;
                        break;

                        default: throw new IOException();
                      }
                    } catch (IndexOutOfBoundsException e){ throw new IOException();}
            }

        if(isRomeNumber(parts[0])) {
            try {
                Integer partsOne = RomeNumber.valueOf(parts[0]).arabicNumber;
                Integer partsTwo = RomeNumber.valueOf(parts[1]).arabicNumber;

                switch (input.charAt(parts[0].length())){
                    case ('+'):
                                returnStr += ArabicToRomeNumber.values()[partsOne + partsTwo-1];
                    break;
                    case ('-'):
                                if(partsOne<=partsTwo) throw new IOException();
                                returnStr += ArabicToRomeNumber.values()[partsOne - partsTwo - 1];
                    break;

                    case ('*'):
                        returnStr += ArabicToRomeNumber.values()[partsOne * partsTwo - 1];
                    break;

                    case ('/'):
                            if ((int) partsOne/ partsTwo == 0) throw new IOException();
                            returnStr += ArabicToRomeNumber.values()[((int) partsOne / partsTwo) - 1];
                    break;
                    default: throw new IOException();
                }
            } catch (IndexOutOfBoundsException e){ throw new IOException();}
        }
        return returnStr;
    }

    private static boolean isNumeric(String str) {
        return str.matches("-?\\d?")|str.matches("-?\\d\\d?");
    }


    private static boolean isRomeNumber(String str) {
        try {
            Enum.valueOf(RomeNumber.class, str);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}
