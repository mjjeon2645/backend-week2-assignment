import java.util.Scanner;

public class EscapeRoom {
    public static void main(String[] args) {

        // 입력받을 준비
        Scanner scanner = new Scanner(System.in);

        // 조건부 루프 만들기
        int count = 0;

        while (count < 3) {

            // 2개의 숫자 입력받기
            System.out.print("Input 2 numbers: ");

            int a = scanner.nextInt();
            int b = scanner.nextInt();

            // 두 수를 더한 결과 입력받기
            System.out.println(a + " + " + b + " = ?");

            int answer = scanner.nextInt();

            // 입력받은 결과에 따른 메시지 출력
            boolean correct = answer == a + b;

            if (correct) {
                count += 1;
                System.out.println("Your're right! (" + count + ")");
            }

            if (!correct) {
                System.out.println("What?");
            }
        }
        System.out.println("Escape!");
    }
}
