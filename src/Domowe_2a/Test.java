package Domowe_2a;

public class Test {
//
//    /*
//     * helping method use for revert input string
//     * strigToRever: String
//     * */
//    private String revert(@NotNull String stringToRevert) {
//
//        StringBuilder revertedString = new StringBuilder();
//        int increments = stringToRevert.length();
//
//        while (increments > 0) {
//            revertedString.append(stringToRevert.charAt(increments - 1));
//            increments -= 1;
//        }
//        return revertedString.toString();
//    }
//
//
//    /* in hexadecyma system
//     * make substitue letters in division
//     * */
//    private String divChecker(String div) {
//        String A = "A";
//        String B = "B";
//        String C = "C";
//        String D = "D";
//        String E = "E";
//        String F = "F";
//
//        switch (div) {
//            case "10":
//                return A;
//            case "11":
//                return B;
//            case "12":
//                return C;
//            case "13":
//                return D;
//            case "14":
//                return E;
//            case "15":
//                return F;
//            default:
//                return div;
//        }
//    }
//
//
//    /*
//     * method for make digit conversion from metric system into binary system
//     * with numericSystemBase=2
//     * or octal with numericSystemBase=8
//     * for hexal with numericSystemBase=16
//     * */
//    String numericSystemConversion(int digit, int numericSystemBase) {
//        String result = "";
//        String finalResult;
//
//        while (digit > 0) {
//            var div = digit % numericSystemBase;
//            result += divChecker(Integer.toString(div));
//            digit = digit / numericSystemBase;
//        }
//
//        finalResult = revert(result);
//        return finalResult;
//    }
}
