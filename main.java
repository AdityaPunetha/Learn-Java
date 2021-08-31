import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // primitive
        int hello_world = 5;
        double num2 = 5.0;
        boolean b = true;
        char c = 't';
        String str = "wdjhwqdkhw";
        int tim = hello_world;
        //
        int x;
        x = 6;
        // int y = 5;
        // double d = Math.pow(x, y);
        double u = x / (double) y;
        System.out.println(u);
        // input
        Scanner sc = new Scanner(System.in);
        String scanned = sc.next();
        System.out.println(scanned);
        // integer input
        Scanner sc2 = new Scanner(System.in);
        int scanned2 = sc2.nextInt();
        // boolean
        Scanner sc3 = new Scanner(System.in);
        boolean scanned3 = sc3.nextBoolean();
        // similarly double, what we should do (typecasting)
        Scanner sc4 = new Scanner(System.in);
        String scanned4 = sc4.next();
        int k = Integer.parseInt(scanned4);

    }
}
