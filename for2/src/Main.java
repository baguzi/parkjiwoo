import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int num ;
        int sum = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요: ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                sum += i ;
            }
        }

        System.out.println("1부터"+ num + "까지의 홀수의 합은"+ sum);

    }
}