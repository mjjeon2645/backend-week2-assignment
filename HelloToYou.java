import java.util.Scanner;

public class HelloToYou {
    public static void main(String[] args) {

        // 입력받을 준비
        Scanner scanner = new Scanner(System.in);

        // 이름 물어봐서 입력받기
        System.out.print("What's your name? ");
        String name = scanner.nextLine();

        // 받은 이름 합쳐 출력하기
        System.out.println("Hello, " + name + "!");

    }
}
