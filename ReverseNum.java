import java.util.Scanner;

public class ReverseNum {

    public static void reverseNum(int number) {
        if (number < 10) {
         System.out.println(number);
         return;
        }
        else {
         System.out.print(number % 10);
         reverseNum(number/10);
        }
       }
   
    public static void main(String args[]) {
      System.out.print("Enter the number to reverse:");
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      System.out.print("The reverse of the number is:");
      reverseNum(num);
   }
}