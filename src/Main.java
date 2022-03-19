import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        RunningNumbers runningNumbers = new  RunningNumbers();
        runningNumbers.start();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Игра - поймай цифру.\nВведите цивру от 0 до 10, которую хотите поймать." + "\nДля выхода из игры введите 999");
        int check = 0;
        while (true) {
            int enter = scanner.nextInt();
            int a = runningNumbers.i;

            if (enter == 999) {
                System.out.println("Игра завершена!\nВсего поймано " + check + " цифры.");
                break;
            }

            if (enter == runningNumbers.i) {
                System.out.println("Вы поймали число " + a);
                check++;
            } else {
                System.err.println("Вы не поймали число " + a);
            }
        }
    }
}