
import java.util.Scanner;

public class MegaboardFee {
    public static void main(String[] args) {
        // 입력 준비
        Scanner scanner = new Scanner(System.in);

        // 정보 입력
        System.out.print("이용시간(분): ");
        int minute = scanner.nextInt();

        System.out.print("파킹존 주차여부: ");
        String parking = scanner.next();

        // 계산과 출력(금액 내 소수점 제거)
        int fee = 1000 + minute * 150;

        if ("O".equals(parking)) {
            fee -= fee / 10;
        }

        if ("X".equals(parking)) {
            fee += 3000;
        }

        System.out.println("요금: " + fee + "원");
    }
}
