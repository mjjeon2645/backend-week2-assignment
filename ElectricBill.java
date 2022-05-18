import java.util.Scanner;

public class ElectricBill {
    public static void main(String[] args) {
        // 준비
        Scanner scanner = new Scanner(System.in);

        // 입력
        System.out.print("전기 사용량(kWh): ");
        int amount = scanner.nextInt();

        // 계산 및 출력
        double under300 = amount * 88.3;
        double over300 = 300 * 88.3 + (amount - 300) * 182.9;
        double over450 = 300 * 88.3 + 150 * 182.9 + (amount - 450) * 275.6;
        double over1000 = 300 * 88.3 + 150 * 182.9 + 550 * 275.6 + (amount - 1000) * 704.5;

        if (amount <= 300) {
            System.out.println("사용 금액: " + (int)under300);
        }

        if (amount > 300 && amount <= 450) {
            System.out.println("사용 금액: " + (int)over300);
        }

        if (amount > 450 && amount <= 1000) {
            System.out.println("사용 금액: " + (int)over450);
        }

        if (amount > 1000) {
            System.out.println("사용 금액: " + (int)over1000);
        }
    }
}
