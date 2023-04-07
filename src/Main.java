import javax.imageio.stream.ImageInputStream;

import java.util.Scanner;

public class Main {
    static void desen(int n) {
        int firstnumber = n;
        System.out.print(n + " ");
        for (int i = n; i > 0; i -= 5) {
            firstnumber -= 5;
            System.out.print(firstnumber + " ");
        }
        int temp = firstnumber;
        for (int i = temp; i < n; i += 5) {
            temp += 5;
            System.out.print(temp + " ");
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number :");
        int a = inp.nextInt();
        desen(a);
    }
}