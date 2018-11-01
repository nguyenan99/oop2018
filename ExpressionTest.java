package week7.task1;

public class ExpressionTest {
    public static void main(String[] args) {
        Numeral so1 = new Numeral(1);
        Numeral so2 = new Numeral(2);
        Numeral so3 = new Numeral(3);
        Numeral so4 = new Numeral(10);
        Expression square1 = new Square(so4);
        Expression multiplication = new Multiplication(so3,so2);
        Expression subtraction = new Subtraction(square1,so1);
        Expression addition = new Addition(multiplication,subtraction);
        Expression square = new Square(addition);
        System.out.println(square.toString());

        Numeral b = new Numeral(0);
        Division division = new Division(so1,b);
        try {
            division.evaluate();
        }
        catch (ArithmeticException e)
        {
            System.out.println("con gà chia cho 0 à");
        }


    }
}
