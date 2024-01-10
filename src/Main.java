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
}