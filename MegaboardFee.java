import java.util.Scanner;

public class MegaboardFee {
    public static void main(String[] args) {

        // 입력준비
        Scanner scanner = new Scanner(System.in);

        // 이용시간 입력
        System.out.print("이용시간(분): ");
        int time = scanner.nextInt();

        // 파킹존 주차여부 입력
        System.out.print("파킹존 주차여부: ");
        String parkingzone = scanner.next();                 // 공부할 것: 스캐너넥스트의 필요성, 이유

        // 요금 출력
        int good = (1000 + time * 150) * 9 / 10;
        int bad = 1000 + time * 150 + 3000;

        if("O".equals(parkingzone)) {                       // == 와 .equals() 메소드의 차이와 여기서 이것이 사용된 이유
            System.out.println("요금: " + good + " 원");
        }

        if("X".equals(parkingzone)) {
            System.out.println("요금: " + bad + " 원");
        }
    }
}
