import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuickFindUF quickFindUF = new QuickFindUF(10);
        while (true) {
            int p = scanner.nextInt(), q = scanner.nextInt();
            System.out.println(quickFindUF.connected(p, q));
            quickFindUF.union(p, q);
            System.out.println(quickFindUF.connected(p, q));

        }
    }
}