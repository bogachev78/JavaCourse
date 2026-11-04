package syntax.lesson8.operators;

public class Operators {
    static void main(String[] args) {
        int a = 4, b = 8;
        //оператор присваивания
        b = a;

        //арифметические операторы
        int sum = a + b;
        int difference = b - a;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;
        //a = a + 1;
        a++;
        // a = a - 1;
        a--;

        a += 4;
        b -= 2;
        a *= 4;
        b /= 3;

        //операции сравнения
        boolean isEqual = a == b;
        boolean isNotEqual = a != b;
        boolean isGreater = a > b;
        boolean isGreaterOrEqual = a >= b;
        boolean isLess = a < b;
        boolean isLessOrEqual = a <= b;

        //and{&&}, or(||)

        boolean aIsGreatThanB = a > b;
        boolean aIsEqualB = a == b;

        boolean logicalAnd = aIsGreatThanB && aIsEqualB;
        boolean logicalOr = aIsGreatThanB || aIsEqualB;

        System.out.println("The result a > b and a == b: " + logicalAnd);
        System.out.println("The result a > b or a == b: " + logicalOr);
    }
}
