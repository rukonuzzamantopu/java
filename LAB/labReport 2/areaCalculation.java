import java.util.Scanner;

class areaCalculation {
    double area;
    
    areaCalculation(double base, double height) {
        area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
    
    areaCalculation(double length, double breadth, boolean isRectangle) {
        area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
    
    areaCalculation(double radius) {
        area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Select shape to calculate area: ");
        System.out.println("1. Triangle \n2. Rectangle\n3. Circle");

        int choice = s.nextInt();

        switch (choice) {
            case 1:
                
                System.out.print("Base: ");
                double base = s.nextDouble();
                System.out.print("Height: ");
                double height = s.nextDouble();
                new areaCalculation(base, height);
                break;

            case 2:
                
                System.out.print("Length: ");
                double length = s.nextDouble();
                System.out.print("Breadth: ");
                double breadth = s.nextDouble();
                new areaCalculation(length, breadth);
                break;

            case 3:
                
                System.out.print("Radius: ");
                double radius = s.nextDouble();
                new areaCalculation(radius);
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }

        s.close();
    }
}

