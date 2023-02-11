// Вычислить n-ое треугольное число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

public class Task1 {
    public static void main(String[] args) {
        int n = Function.userNumber();
        System.out.printf("Треугольное число от %d = %d\n", n, Function.Triang(n));
        System.err.printf("Факториал от %d = %d\n", n, Function.Factor((n)));
    }
}
