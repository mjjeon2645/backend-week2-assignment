import java.util.Scanner;

public class HelloToYou {
    public static void main(String[] args) {
        // 이름 입력받기
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your name? ");
        String name = scanner.nextLine();

        // 출력하기
        System.out.println("Hello, " + name + "!");
    }
}
