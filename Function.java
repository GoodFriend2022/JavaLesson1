import java.util.ArrayList;
import java.util.Scanner;

public class Function {
    static int Triang(int number) {
        if (number == 0)
            return number;
        number += Triang(number - 1);
        return number;
    }

    static int Factor(int number) {
        if (number == 0)
            return 0;
        if (number == 1)
            return 1;
        number *= Factor(number - 1);
        return number;
    }

    static int userNumber() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число >> ");
        int number = iScanner.nextInt();
        iScanner.close();
        return number;
    }

    static ArrayList<Integer> primeNumbers(int maxNumber) {
        int[] numbers = new int[maxNumber];
        for (int i = 0; i < maxNumber; i++) {
            numbers[i] = i + 1;
        }
        int count = 0;
        for (int i = 2; i < numbers.length / 2; i++) {
            maxNumber -= count;
            count = 0;
            int index = 0;
            boolean item = true;
            for (int j = i; j < maxNumber; j++) {
                if (numbers[j] % i == 0) {
                    if (item)
                        index = j;
                    item = false;
                    count++;
                } else if (index > 0)
                    numbers[index++] = numbers[j];
            }
        }
        ArrayList<Integer> prime = new ArrayList<Integer>();
        for (int i = 0; i < maxNumber; i++) {
            prime.add(numbers[i]);
        }
        return prime;
    }

    static double sum(double x, double y) {
        return x + y;
    }

    static double diff(double x, double y) {
        return x - y;
    }

    static double mult(double x, double y) {
        return x * y;
    }

    static double div(double x, double y) {
        return x / y;
    }

    static String userExp() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите простое выражение для подсчета >> ");
        String exp = iScanner.nextLine();
        iScanner.close();
        return exp;
    }

    static double Calc(){
        String expUser = userExp();
        double res = 0;
        for (int i = 0; i < expUser.length(); i++) {
            if (expUser.charAt(i) == '+') {
                String expString = expUser.replace("+", " ");
                String[] exp = expString.split(" ");
                res = sum(Double.parseDouble(exp[0]), Double.parseDouble(exp[1]));
            } else if (expUser.charAt(i) == '-') {
                String[] exp = expUser.split("-");
                res = diff(Double.parseDouble(exp[0]), Double.parseDouble(exp[1]));
            } else if (expUser.charAt(i) == '*') {
                String expString = expUser.replace("*", " ");
                String[] exp = expString.split(" ");
                res = mult(Double.parseDouble(exp[0]), Double.parseDouble(exp[1]));
            } else if (expUser.charAt(i) == '/') {
                String[] exp = expUser.split("/");
                if (Double.parseDouble(exp[1]) != 0) {
                    res = div(Double.parseDouble(exp[0]), Double.parseDouble(exp[1]));
                } else System.out.println("Деление на ноль!!!");
            }
        }
        return res;
    }

    static void EquationSum(String eqUser){
        String eqString = eqUser.replace(" ", "");
        eqString = eqString.replace("+", " ");
        eqString = eqString.replace("=", " ");
        String[] equation = eqString.split(" ");
        int result = Integer.parseInt(equation[2]);
        for (int i = 0; i < 10; i++) {
            String firstNumberStr = equation[0].replace("?", "" + i);
            int firstNumber = Integer.parseInt(firstNumberStr);
            for (int j = 0; j < 10; j++) {
                String secondNumberStr = equation[1].replace("?", "" + j);
                int secondNumber = Integer.parseInt(secondNumberStr);
                if (firstNumber + secondNumber == result){
                    System.out.printf("Вариант решения Вашего уравнения: %d + %d = %d", 
                    firstNumber, secondNumber, result);
                    return;
                }
            }
        }
        System.out.println("Мы перебрали все значения, но решения не нашли");
    }
}
