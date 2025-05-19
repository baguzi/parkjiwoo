import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0 ;
        int num ;
        int count = 0 ;

        while (true) {
            System.out.print("정수를 입력하세요. (종료하려면 음수 입력) ");
            num = sc.nextInt();
            sum += num;
            count += 1 ;

            if (num < 0 )
                break;



        }
    if (count == 1) {
        System.out.println("입력된 정수가 없습니다 ");
    }else {
        System.out.println("점수의 총합은: " + sum);
        }

    }
}