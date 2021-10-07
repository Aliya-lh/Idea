package Test;
import java.util.*;
public class Test {
    public static void main5(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            if (num % 5 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }


    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println((a + b + -c) * d);
    }


    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x < 0) {
            System.out.print("1");
        } else if (x == 0) {
            System.out.print("0");
        } else {
            System.out.print("-1");
        }
    }


    public static void main4(String[] args) {
        int tmp = 0;
        int count = 0;
        for (int i = 0; i < 2020; i++) {
            tmp = i;
            while (tmp > 0) {
                if (tmp % 10 == 9) {
                    count++;
                    break;
                }
                tmp = tmp / 10;
            }
        }
        System.out.println(count);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                a++;
            } else {
                b++;
            }
        }
        System.out.println(a + " " + b);
    }
}





