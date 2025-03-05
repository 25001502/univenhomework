import java.util.Scanner;

public class Dollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount in dollars: ");
        int dollars = scanner.nextInt();

        int twns = dollars / 20;
        dollars %= 20;

        int tns = dollars / 10;
        dollars %= 10;

        int fvs = dollars / 5;
        dollars %= 5;

        int ns = dollars;

        System.out.println("20s: " + twns);
        System.out.println("10s: " + tns);
        System.out.println("5s: " + fvs);
        System.out.println("1s: " + ns);

        scanner.close();
    }
}