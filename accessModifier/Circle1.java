package accessModifier;


import java.util.Scanner;

public class Circle1 {
    public static double getArea(double darius) {
        return darius * darius * 3.14;

    }

    public static void main(String[] args) {
        double darius;
        Scanner scanner=new Scanner(System.in);
        darius=scanner.nextDouble();
        System.out.println("area là: "+getArea(darius));
    }
}
