// Вычислить n-ое треугольного число (сумма чисел от 1 до n)

public class task1 {
    public static void main(String[] args) {
        System.out.println(showTotalAmount(10));
    }

    public static String showTotalAmount(int value) {
        return (value * (value + 1) / 2) + "";
    }
}