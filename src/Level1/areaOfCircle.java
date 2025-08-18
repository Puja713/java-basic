package Level1;

import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int radius=sc.nextInt();
        double pie=3.14;
        double Area_of_circle=pie* radius*radius;
        System.out.println(Area_of_circle);
    }
}
