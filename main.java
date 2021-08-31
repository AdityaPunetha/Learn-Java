import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // primitive
        // -----------------------------------------------------------------------------
        int hello_world = 5;
        double num2 = 5.0;
        boolean b1 = true;
        char c = 't';
        String str = "wdjhwqdkhw";
        int tim = hello_world;
        // -----------------------------------------------------------------------------
        int x;
        x = 6;
        int y = 5;
        // double d = Math.pow(x, y);
        double u = x / (double) y;
        System.out.println(u);
        // input-----------------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);
        String scanned = sc.next();
        System.out.println(scanned);
        // integer
        // input-----------------------------------------------------------------------------
        Scanner sc2 = new Scanner(System.in);
        int scanned2 = sc2.nextInt();
        // boolean-----------------------------------------------------------------------------
        Scanner sc3 = new Scanner(System.in);
        boolean scanned3 = sc3.nextBoolean();
        // similarly double, what we should do
        // (typecasting)------------------------------------
        Scanner sc4 = new Scanner(System.in);
        String scanned4 = sc4.next();
        int k = Integer.parseInt(scanned4);
        // conditions and booleans-------------------------------------------------
        x = 6;
        y = 7;
        int z = 10;
        boolean compare = x < y;
        System.out.println(compare);
        // compare
        // strings-----------------------------------------------------------------------------
        String a = "hello";
        String b = "h1";
        System.out.println(a.equals(b));
        compare = a == b;
        // and-----------------------------------------------------------------------------
        y = 23;
        compare = x > y && z < y;
        System.out.println(compare);
        // or-----------------------------------------------------------------------------
        compare = false || true;
        System.out.println(compare);
        compare = !(false || true);
        System.out.println(compare);
        // if-else-----------------------------------------------------------------------------
        a = "hello";
        b = "tim";
        if (a.equals(b)) {
            System.out.println("type tim");
        } else if (a.equals("hello")) {
            System.out.println("hi!");
        } else {
            System.out.println("print");
        }
        // arrays-----------------------------------------------------------------------------
        int[] newArr = new int[5];
        String[] stringArr = new String[5];
        stringArr[0] = "hello";
        stringArr[1] = "hello";
        stringArr[2] = "hello";
        int[] nums = { 2, 3, 56, 6, 6 };
        // for
        // loops-----------------------------------------------------------------------------
        x = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

    }
}
