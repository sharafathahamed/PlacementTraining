import java.util.Scanner;

class PalindromeCheck {
    public static boolean isPalindrome(int num) {
        if (num < 0 || (num != 0 && num % 10 == 0))
            return false;

        int check = 0;
        while (num > check) {
            check = check * 10 + num % 10;
            num /= 10;
        }

        return (num == check || num == check / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}
