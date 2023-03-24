/*
Question : Given the dimensions of a cuboid, find out its surface area and volume.
________________________________________________________________________________________
Problem Solution
The surface area and volume of a cuboid can be calculated using the formulas:
Surface Area = 2*(length*breadth + breadth*height + height*length).
Volume = length * breadth * height.
____________________________________________________________________________________________
Case 1 (Simple Test Case):
Enter the length, breadth and height of the cuboid
12
9.76
5.68
Volume = 665.2416
Surface area = 481.4336
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length,breadth,height,SurfaceArea,Volume;
        System.out.println("Enter the length of cuboid :");
        length = sc.nextDouble();
        System.out.println("Enter the height of cuboid :");
        height = sc.nextDouble();
        System.out.println("Enter the breadth of cuboid :");
        breadth = sc.nextDouble();
        System.out.println("Printing the result :");
        SurfaceArea = 2 * (length * breadth + breadth * height + height * length);
        System.out.println("Surface Area : " + SurfaceArea);
        Volume = length * breadth * height;
        System.out.println("Volume area : " + Volume);
    }
}