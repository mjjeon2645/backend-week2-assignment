import java.util.Scanner;

public class SpecialHBD {
    public static void main(String[] args) {
        // 입력 준비
        Scanner scanner = new Scanner(System.in);

        // 연도 입력
        System.out.print("연도: ");
        int year = scanner.nextInt();

        // 계산하여 출력
        if (year % 4 == 0) {
            if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)
                System.out.println(true);
            else
                System.out.println(false);
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}


/*
 if (ordinaryyear) {
         if (specialyear2)
         System.out.println(specialyear2);

         System.out.println(!specialyear2);
         }
         }
         System.out.println(specialyear1);

 */