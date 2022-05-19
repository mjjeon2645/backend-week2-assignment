import java.util.Scanner;

public class TestYourMath {
    public static void main(String[] args) {
        // 숫자 두 개 입력
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input 2 numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // 합 입력
        System.out.println(a + " + " + b + " = ?");
        int sum = scanner.nextInt();

        // 곱 입력
        System.out.println(a + " * " + b + " = ?");
        int multiple = scanner.nextInt();

        // 답안에 따른 문구 출력
        boolean correctAnswer1 = sum == a + b;
        boolean correctAnswer2 = multiple == a * b;

        if (correctAnswer1 && correctAnswer2) {
            System.out.println("Genius!");
        }

        if (correctAnswer1 && !correctAnswer2 || !correctAnswer1 && correctAnswer2) {
            System.out.println("Muggle!");
        }

        if (!correctAnswer1 && !correctAnswer2) {
            System.out.println("Stupid!");
        }
    }
}
