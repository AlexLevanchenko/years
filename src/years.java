import java.util.Scanner;

public class years {

    public static void main(String[] args) {
        System.out.print("Я помогу вам определить введеный год, высокосный он или нет.\n Введите пожалуста год в формате YYYY: ");
        Scanner scan = new Scanner(System.in);
        int years = scan.nextInt();
        if (years <= 0) {
            System.out.println("Год не может быть меньше или равен 0");
        } else if (years % 4 == 0 && years % 100 != 0 || years % 400 == 0) {
            System.out.println("Год представляет собой високосный год (в нем 366 дней): " + years);
        } else System.out.println("Год не является високосным (365 дней): " + years);
    }
}
