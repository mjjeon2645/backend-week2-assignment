
import java.util.Scanner;

public class SavingCalculator {
    public static void main(String[] args) {

        // 입력 준비
        Scanner scanner = new Scanner(System.in);

        // 제목 출력& 월 적립액, 적금기간, 연 이자율 입력받기
        System.out.println("적금 이자 계산기");

        System.out.println("월 적립액을 입력해주세요(원): ");
        int won = scanner.nextInt();

        System.out.println("적금 기간을 입력해주세요(년): ");
        int year = scanner.nextInt();

        System.out.println("연 이자율을 입력해주세요(%): ");
        double rate = scanner.nextInt();

        // 처리 후 출력
        int count = 0;
        int total_won = won * year * 12;
        int interest = 0;

        while (count < year * 12) {
            count += 1;

            interest += won * (rate / 12);
            won += won;



        System.out.println("원금합계: " + total_won + "원");

        System.out.println("세후이자: " + "원");

        System.out.println("세후 총 수령액: " + (total_won) + "원");

    }
}
