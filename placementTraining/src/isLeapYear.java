import java.util.Scanner;
public class isLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year= sc.nextInt();
        if(year%4==0){
            System.out.println("It is Leap year");
        }
        else{
            System.out.println("It is not Leap year");
        }
    }
}
