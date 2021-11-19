package com.company;

public class Main {

    public void eights() {
        for (int i = 8; i > 0; i -= 2) {
            for (int j = 0; j < 8 - i; j += 2) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public void alternate(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                for (int j = i; j > 0; j--) {
                    System.out.print(j);
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    public void isosceles(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < 2 * n; j++) {
                int abs = Math.abs(n-j);
                if (abs < i) {
                    System.out.print(abs + 1);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void upSideDown(int a, int b) {
        int n = a-b;
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j <= 2 * n; j++) {
                int abs = Math.abs(n-j);
                if (abs <= i) {
                    System.out.print(b + abs);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
	// write your code here
        Main m = new Main();
        m.eights();
        System.out.println();
        m.alternate(6);
        m.alternate(5);
        System.out.println();
        m.isosceles(5);
        System.out.println();
        m.upSideDown(9,5);
        m.upSideDown(8,6);
    }
}

// output
//        88888888
//         666666
//          4444
//           22
//
//        1
//        21
//        123
//        4321
//        12345
//        654321
//        1
//        21
//        123
//        4321
//        12345
//
//        1
//        212
//        32123
//        4321234
//        543212345
//
//        987656789
//         8765678
//          76567
//           656
//            5
//          87678
//           767
//            6
