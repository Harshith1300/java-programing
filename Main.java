import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = 0, b = 0, c = 0, d = 0, f = 0;
        int total = 0;

        System.out.print("Grades: ");

        for (int i = 0; i < n; i++) {
            int marks = sc.nextInt();
            total += marks;

            if (marks >= 90) {
                System.out.print("A ");
                a++;
            } else if (marks >= 80) {
                System.out.print("B ");
                b++;
            } else if (marks >= 70) {
                System.out.print("C ");
                c++;
            } else if (marks >= 60) {
                System.out.print("D ");
                d++;
            } else {
                System.out.print("F ");
                f++;
            }
        }

        double average = (double) total / n;

        System.out.println();
        System.out.println("A=" + a + ", B=" + b + ", C=" + c
                + ", D=" + d + ", F=" + f);
        System.out.printf("Average = %.1f%n", average);

        sc.close();
    }
}