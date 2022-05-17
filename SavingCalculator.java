import java.util.Scanner;

public class SavingCalculator {
    public static void main(String[] args) {

        // 입력 준비
        Scanner scanner = new Scanner(System.in);

        // 월 적립액 / 적금기간 / 연 이자율 입력
        System.out.print("적금 이자 계산기");

        System.out.println("월 적립액을 입력해주세요(원): ");
        int won = scanner.nextInt();

        System.out.println("적금 기간을 입력해주세요(년): ");
        int year = scanner.nextInt();

        System.out.println("연이자율을 입력해주세요(%): ");
        double interest = scanner.nextDouble();

        // 원금합계 / 세후이자 / 세후 총 수령액 출력

        int wontotal = won * year;
        int alpha = ;
        int realtotal = wontotal + alpha;

        System.out.println("원금합계: " + wontotal + "원");
        System.out.println("세후이자: " + alpha + "원");
        System.out.println("세후 총 수령액: " + realtotal + "원");
    }
}
