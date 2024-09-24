package com.ye.niveau2;

import java.util.Scanner;

public class Exo1Pluspetiterectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // take the number of line with scanner for rectangles
        int p = scanner.nextInt();

        int xmin = Integer.MAX_VALUE;
        int ymin = Integer.MAX_VALUE;
        int xmax = Integer.MIN_VALUE;
        int ymax = Integer.MIN_VALUE;

        for (int i = 0; i < p; i++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();

            // find the mini and max
            xmin = Math.min(xmin, Math.min(x1, x2));
            ymin = Math.min(ymin, Math.min(y1, y2));
            xmax = Math.max(xmax, Math.max(x1, x2));
            ymax = Math.max(ymax, Math.max(y1, y2));
        }

        // show the rectangle form mini to max
        System.out.println(xmin + " " + ymin + " " + xmin + " " + ymax + " " + xmax + " " + ymin + " " + xmax + " " + ymax);

        scanner.close();
    }
}
