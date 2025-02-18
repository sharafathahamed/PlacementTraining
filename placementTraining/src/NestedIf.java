import java.util.Scanner;
public class NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to JM Loans!!");
        System.out.println("Enter your Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your credit score: ");
        double salary = sc.nextDouble();
        System.out.println("Enter your salary: ");
        int creditScore= sc.nextInt();
        if(age>=22){
            if(creditScore>700&& salary>2500){
                System.out.println("Youre elibible!");
            }
            else{
                System.out.println("youre not eligible due to age or salary");
            }
        }
        else{
            System.out.println("Not eligible");
        }
        }
    }