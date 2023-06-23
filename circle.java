import java.util.Scanner;

public class circle {
    public static void main(String args[]){
        System.out.println("The radius of circle is ");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double Area = 3.14 * radius * radius;
        System.out.println("Area is:"+Area);
        double perimeter = 2 * 3.14 * radius;
        System.out.println("Perimeter is:"+perimeter);


    }
}
