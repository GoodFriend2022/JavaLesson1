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
                    if (item) index = j;
                    item = false;
                    count++;
                } 
                else if (index > 0) numbers[index++] = numbers[j];
            }
        }
        ArrayList<Integer> prime = new ArrayList<Integer>();
        for (int i = 0; i < maxNumber; i++) {
            prime.add(numbers[i]);
        }
        return prime;
    }
}
