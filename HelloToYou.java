import java.util.Scanner;

public class HelloToYou {
    public static void main(String[] args) {

        // 입력 준비
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        System.out.print("What's your name? ");
        String name = scanner.nextLine();

        // 출력하기
        System.out.println("Hello, " + name + "!");
    }
}
