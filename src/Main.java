public class Main {
    public static void main(String[] args) {
        System.out.println("1-finding palindrome");
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println("2-isPerfectNumber");
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println("3-numberToWords");
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
    }

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        String num = String.valueOf(number);
        StringBuilder reversed = new StringBuilder();
        for (int i = num.length() - 1; i >= 0; i--) {
            reversed.append(num.charAt(i));
        }
        return num.equals(String.valueOf(reversed));
    }

    public static boolean isPerfectNumber(int number) {

        if (number < 0) {
            return false;
        } else{
            int sum = 0;
            for (int i = 1; i <= number/2; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            return sum == number;
        }
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        } else {
            String numStr = String.valueOf(number);
            String[] numArray = numStr.split("");
            StringBuilder words = new StringBuilder();

            for (String n : numArray) {
                switch (n) {
                    case "0":
                        words.append("Zero ");
                        break;
                    case "1":
                        words.append("One ");
                        break;
                    case "2":
                        words.append("Two ");
                        break;
                    case "3":
                        words.append("Three ");
                        break;
                    case "4":
                        words.append("Four ");
                        break;
                    case "5":
                        words.append("Five ");
                        break;
                    case "6":
                        words.append("Six ");
                        break;
                    case "7":
                        words.append("Seven ");
                        break;
                    case "8":
                        words.append("Eight ");
                        break;
                    case "9":
                        words.append("Nine ");
                        break;
                }
            }
            return words.toString().trim();
        }
    }
}