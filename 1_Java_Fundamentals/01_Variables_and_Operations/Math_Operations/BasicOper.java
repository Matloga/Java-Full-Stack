// Here is a simple Java program that demonstrates basic arithmetic and other operations
public class BasicOper {
    public static void main(String[] args) {
        // Declare two integer variables
        int a = 10;
        int b = 5;

        // Perform addition
        int sum = a + b;
        System.out.println("Addition (a + b): " + sum);

        // Perform subtraction
        int difference = a - b;
        System.out.println("Subtraction (a - b): " + difference);

        // Perform multiplication
        int product = a * b;
        System.out.println("Multiplication (a * b): " + product);

        // Perform division
        int quotient = a / b;
        System.out.println("Division (a / b): " + quotient);

        // Perform modulus (remainder)
        int remainder = a % b;
        System.out.println("Modulus (a % b): " + remainder);

        // Increment and Decrement
        a++; // a = a + 1
        b--; // b = b - 1
        System.out.println("Incremented a: " + a);
        System.out.println("Decremented b: " + b);

        // Relational operators (true/false)
        System.out.println("Is a > b? " + (a > b));
        System.out.println("Is a < b? " + (a < b));
        System.out.println("Is a == b? " + (a == b));
        System.out.println("Is a != b? " + (a != b));

        // Logical operators
        boolean x = true;
        boolean y = false;
        System.out.println("x AND y: " + (x && y));
        System.out.println("x OR y: " + (x || y));
        System.out.println("NOT x: " + (!x));

        // Bitwise operators
        int bitwiseAnd = a & b;
        int bitwiseOr = a | b;
        int bitwiseXor = a ^ b;
        System.out.println("Bitwise AND (a & b): " + bitwiseAnd);
        System.out.println("Bitwise OR (a | b): " + bitwiseOr);
        System.out.println("Bitwise XOR (a ^ b): " + bitwiseXor);
    }
}
