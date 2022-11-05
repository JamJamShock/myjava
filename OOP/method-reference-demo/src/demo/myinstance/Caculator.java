package demo.myinstance;

public class Caculator {
    private int num1;
    private int num2;

    public Caculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add() {
        return num1 + num2;
    }

    public int minus() {
        return num1 - num2;
    }

    public int multiply() {
        return num1 * num2;
    }

    public int divide() {
        return num1 / num2;
    }

    public static void main(String[] args) {
        Caculator calculator = new Caculator(7, 5);

        System.out.println("Add : " + calculator.add());
        System.out.println("Minus : " + calculator.minus());
        System.out.println("Divide : " + calculator.divide());
        System.out.println("Multiply : " + calculator.multiply());

        System.out.println("");
        System.out.println("Lambda + Method reference");
        System.out.println("");

        ICalculator iCalculator = calculator::add;
        iCalculator = () -> calculator.add();
        System.out.println("Add : " + iCalculator.calculate());

        iCalculator = calculator::minus;
        iCalculator = () -> calculator.minus();
        System.out.println("Minus : " + iCalculator.calculate());

        iCalculator = calculator::divide;
        iCalculator = () -> calculator.divide();
        System.out.println("Divide : " + iCalculator.calculate());

        iCalculator = calculator::multiply;
        iCalculator = () -> calculator.multiply();
        System.out.println("Multiply : " + iCalculator.calculate());
    }
}
