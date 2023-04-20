// Вывести все простые числа от 1 до 1000 
// (числа, которые делятся только на 1 и на себя без остатка)

public class task3 {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            boolean simpleNumber = false;

            for (int j = 2; j * j <= i; j++) {
                simpleNumber = (i % j == 0);
                if (simpleNumber) {
                    break;
                }
            }
            if (!simpleNumber) {
                System.out.print(i + " ");
            }
        }
    }
}
