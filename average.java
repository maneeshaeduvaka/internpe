import java.util.Scanner;

public class average {
    public static void main(String args[]){
        System.out.println("The three numbers are ");
        Scanner sa = new Scanner(System.in);
        int a = sa.nextInt();
        Scanner sb = new Scanner(System.in);
        int b = sb.nextInt();
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        double avg = (a+b+c)/3;
        System.out.println("Average is:"+avg);


    }
}
