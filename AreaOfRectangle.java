import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float height, width, area;
        System.out.print("Enter the height of rectangle: ");
        height = in.nextFloat();
        System.out.print("Enter the width of rectangle: ");
        width = in.nextFloat();
        area = height*width;
        System.out.println("Area of rectangle is " + area);
    }
}
