import java.util.Scanner;

public class ElectricBill {
    public static void main(String[] args) {

        // 입력
        Scanner scanner = new Scanner(System.in);

        System.out.print("전기 사용량(kWh): ");
        double monthlyConsumption = scanner.nextInt();

        // 처리
        double total = 0;
        double consumption300 = 300 * 88.3;
        double consumption450 = consumption300 + 150 * 182.9;
        double consumption1000 = consumption450 + 550 * 275.6;

        if (monthlyConsumption <= 300) {
            total = monthlyConsumption * 88.3;
        }

        if (monthlyConsumption > 300 && monthlyConsumption <= 450) {
            total = consumption300 + (monthlyConsumption - 300) * 182.9;
        }

        if (monthlyConsumption > 450 && monthlyConsumption <= 1000) {
            total = consumption450 + (monthlyConsumption - 450) * 275.6;
        }

        if (monthlyConsumption > 1000) {
            total = consumption1000 + (monthlyConsumption - 1000) * 704.5;
        }

        // 출력
        System.out.println("사용 금액: " + (int) total);
    }
}
