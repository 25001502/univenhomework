public class RectangleArea {
    public static void main(String[] args) {

        // these are the properties of my rectangle
        double length = 12.6;
        double width = 4.5;

        // this is the formula to calculate the area of a rectangle
        double area = length * width;

        // this is the formula to calculate the perimeter of a rectangle
        double perimeter = 2 * (length + width);

        // this is the output of the perimeter of the rectangle
        System.out.println("The perimeter of the rectangle is " + perimeter);

        // this is the output of the area of the rectangle
        System.out.println("The area of the rectangle is " + area);
    }
}