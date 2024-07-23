package inclass;

public class CalculatorDemo {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int result = calc.sum(5, 5);

        int result2 = calc.sum(5, result);

        int sum = calc.sum(10, 10);

        System.out.println(result);
        System.out.println(result2);
        System.out.println(sum);


    }

}
