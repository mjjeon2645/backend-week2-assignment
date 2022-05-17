import java.text.DecimalFormat;
import java.util.Scanner;

public class ElectricBill {
    public static void main(String[] args) {

        // 입력 준비
        Scanner scanner = new Scanner(System.in);

        // 전기 사용량 입력
        System.out.print("전기 사용량(kWh): ");
        int amount = scanner.nextInt();

        // 계산하여 금액 출력

        double under300 = amount * 88.3;
        double over300 = (300 * 88.3) + (amount - 300) * 182.9;
        double over450 = (300 * 88.3) + (450 - 300) * 182.9 + (amount - 450) * 275.6;
        double over1000 = (300 * 88.3) + (450 - 300) * 182.9 + (1000 - 450) * 275.6 + (amount - 1000) * 704.5;

        DecimalFormat result1 = new DecimalFormat("0");
        DecimalFormat result2 = new DecimalFormat("0");
        DecimalFormat result3 = new DecimalFormat("0");
        DecimalFormat result4 = new DecimalFormat("0");

        if(amount <= 300)
            System.out.println("사용금액: " + result1.format(under300));

        if(amount > 300 && amount <= 450)
            System.out.println("사용금액: " + result2.format(over300));

        if(amount > 450 && amount <= 1000)
            System.out.println("사용금액: " + result3.format(over450));

        if(amount > 1000)
            System.out.println("사용금액: " + result4.format(over1000));
    }
}
