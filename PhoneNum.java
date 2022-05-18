
import java.util.Scanner;

public class PhoneNum {
    public static void main(String[] args) {

        // 입력 준비
        Scanner scanner = new Scanner(System.in);

        // 폰 넘버 입력받기
        System.out.print("핸드폰 번호: ");
        String phone = scanner.nextLine();

        // 번호 뒷 네자리가 *로 표시되도록 하기

        String modifiedNum = phone.substring(0,7);       // 입력받은 전화번호 앞에서 7자리 까지 추출
        System.out.println(modifiedNum + "****");        // 추출한 7자리 번호 + 별 붙이기
    }
}
