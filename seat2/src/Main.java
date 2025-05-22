import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row ;
        int col;


        System.out.println("좌석의 행을 입력하세요");
        row = sc.nextInt();
        System.out.println("좌석의 열을 입력하세요");
        col = sc.nextInt();

        int[][] matrix = new int[row][col];

        while (true) {
            System.out.print("예약할 좌석의 행 번호 (1~" + row + ", 종료: 0): ");
            int rerow = sc.nextInt();

            System.out.print("예약할 좌석의 열 번호 (1~" + col + ", 종료: 0): ");
            int recol = sc.nextInt();


            if (rerow == 0 && recol == 0) {
                System.out.println("예약을 종료합니다.");
                break;
            }



            int rowIndex = rerow - 1;
            int colIndex = recol - 1;

            if (matrix[rowIndex][colIndex] == 0) {
                matrix[rowIndex][colIndex] = 1;
                System.out.println("예약되셨습니다.");


                System.out.println("\n--- 현재 좌석 배치도 (0:비어있음, 1:예약됨) ---");
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }

            } else {
                System.out.println("이미 예약된 좌석입니다.");
            }
        }


    }
}
