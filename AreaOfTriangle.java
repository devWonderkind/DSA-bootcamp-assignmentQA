import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        float h, b, area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height:");
        h = input.nextFloat();
        System.out.print("Enter the base:");
        b = input.nextFloat();
        area = (h*b)/2;
        System.out.println("The area of triangle is" + area);
    }
}
