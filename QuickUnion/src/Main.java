import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuickUnion quickUnion = new QuickUnion(10);
        Scanner scanner = new Scanner(System.in);
        int t = 0;
        while (true) {
            quickUnion.union(scanner.nextInt(), scanner.nextInt());
            if (t == 6) break;
            t++;
        }
        while (true) {
            System.out.println(quickUnion.connected(scanner.nextInt(), scanner.nextInt()));
        }
    }
}








