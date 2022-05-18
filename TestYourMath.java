import java.util.Scanner;

public class TestYourMath {
    public static void main(String[] args) {

        // 입력 준비
        Scanner scanner = new Scanner(System.in);

        // 숫자 두개 입력
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
        boolean answer1 = a + b == sum;
        boolean answer2 = a * b == multiple;

        if (answer1 && answer2)
            System.out.println("Genius!");

        if (answer1 && !answer2 || !answer1 && answer2)
            System.out.println("Muggle!");

        if (!answer1 && !answer2)
            System.out.println("Stupid!");

    }
}
