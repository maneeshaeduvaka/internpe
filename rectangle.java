import java.util.Scanner;

public class rectangle {
    public static void main(String args[]){
        System.out.println("The height is ");
        Scanner sa = new Scanner(System.in);
        double h = sa.nextDouble();
        System.out.println("The width is ");
        Scanner sb = new Scanner(System.in);
        double w = sb.nextDouble();
        double area = h*w;
        double perimeter = 2*(h+w);
        System.out.println("Area is:"+area);
        System.out.println("Perimeter is:"+perimeter);


    }
}
