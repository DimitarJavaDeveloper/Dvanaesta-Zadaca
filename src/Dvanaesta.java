
import java.util.Scanner;
public class DvanaestaZadaca {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vnesi n: ");
        int n = scanner.nextInt();

        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;

            if (factorial < 0) {
                System.out.println("Factorial od " + n + " predizvikuva prelevanje.");
                return;
            }
        }

        System.out.println(n + "! = " + factorial);
    }

}
