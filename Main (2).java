import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int i = sc.nextInt();
        System.out.println(i);
        System.out.println("It’s OK if you don’t like me. Not everyone has good taste.");
        sc.close();
    }
}
