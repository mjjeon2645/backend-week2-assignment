import java.util.Scanner;

public class MegaboardRates {
    public static void main(String[] args) {
        // 입력받기
        Scanner scanner = new Scanner(System.in);

        System.out.print("이용시간(분): ");
        int time = scanner.nextInt();

        System.out.print("파킹존 주차여부: ");
        String parkedInZone = scanner.next();

        // 계산 및 출력
        int rate = 1000 + 150 * time;

        if (parkedInZone.equals("O")) {
            rate -= rate / 10;
        }

        if (parkedInZone.equals("X")) {
            rate += 3000;
        }

        System.out.println("요금: " + rate + "원");
    }
}
