import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        int radius;
        double pi = 3.14, area;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        radius = in.nextInt();
        area = pi * radius * radius;
        System.out.println("Area of circle: "+area);
    }
}
