class Shape{
    int length;
    int breadth;

    Shape(int i){
        this.length = i;
    }

    Shape(int j, int k){
        this.length = j;
        this.breadth = k;
    }

    public int CalculateArea(int i){
        return (i*i);
    }

    public int CalculateArea(int j, int k){
        return (j*k);
    }

    public int CalculatePerimeter(int i){
        return (4*i);

    }

    public int CalculatePerimeter(int j, int k){
        return 2*(j+k);
        
    }
}
public class lb4 {
    public static void main(String[] args) {
        Shape Square = new Shape(5);
        Shape Rectangle = new Shape(6,13);

        int SA = Square.CalculateArea(Square.length);
        int SP = Square.CalculatePerimeter(Square.length);

        int RA = Rectangle.CalculateArea(Rectangle.length, Rectangle.breadth);
        int RP = Rectangle.CalculatePerimeter(Rectangle.length, Rectangle.breadth);

        System.out.println("Area of Square: "+SA+"\n"+"Perimeter of Square: "+SP);
        System.out.println("Area of Rectangle: "+RA+"\n"+"Perimeter of Rectangle: "+RP);
    }
}
