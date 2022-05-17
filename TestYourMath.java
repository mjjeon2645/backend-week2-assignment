import java.util.Scanner;

public class TestYourMath {
    public static void main(String[] args) {

        // 입력 준비
        Scanner scanner = new Scanner(System.in);

        // 숫자 두개 입력받음
        System.out.print("Input 2 numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // 두개 합 입력받음
        System.out.println(a + " + " + b + " = ?");
        int sum = scanner.nextInt();

        // 두개 곱 입력받음
        System.out.println(a + " * " + b + " = ?");
        int multiple = scanner.nextInt();

        // 맞춘 개수에 따라 다른 출력
        boolean result1 = sum == a + b;
        boolean result2 = multiple == a * b;

        if(result1 && result2) {
            System.out.println("Genius!");
        }

        if(result1 && !result2 || !result1 && result2) {
            System.out.println("Muggle!");
        }

        if(!result1 && !result2) {
            System.out.println("Stupid!");
        }

    }
}
