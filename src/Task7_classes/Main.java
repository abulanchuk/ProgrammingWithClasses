package Task7_classes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the coordinates of 3 dots of triangle");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double x3 = in.nextDouble();
        double y3 = in.nextDouble();
        Triangle tr1 = new Triangle(x1, x2, x3, y1, y2, y3);
        double per = tr1.perimeter();
        double area = tr1.area();
        Points centre = tr1.theCenterOfTriangle();
        System.out.println(" area: " + area);
        System.out.println("perimeter: "+per);
        System.out.println("Center Of Triangle: "+centre);
    }
}
