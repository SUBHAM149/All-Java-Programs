//Write a Java program that defines method overloading to calculate the area of geometric shapes. 
Implement the following methods:

public class AreaCalculator {
    public int calculateArea(int side) {
        return side * side;
    }
    public int calculateArea(int length, int width) {
        return length * width;
    }
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        AreaCalculator obj = new AreaCalculator();

        int squareArea = obj.calculateArea(9); // 9*9 = 81
        int rectangleArea = obj.calculateArea(12, 10); // 12*10 = 120
        double circleArea = obj.calculateArea(3.2); // p * 3.2^2 ˜ 32.15

        System.out.println("Area of the Square : " + squareArea);
        System.out.println("Area of the Rectangle : " + rectangleArea);
        System.out.printf("Area of the Circle is %.2f\n", circleArea);
    }
}
