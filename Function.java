import java.util.Scanner;

public class Function {
    static int Triang(int number){
        if (number == 0) return number;
        number += Triang(number - 1);
        return number;
    }
    static int Factor(int number){
        if (number == 0) return 0;
        if (number == 1) return 1;
        number *= Factor(number - 1);
        return number;
    }
    static int userNumber(){
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число >> ");
        int number = iScanner.nextInt();
        iScanner.close();
        return number;
    }
}
