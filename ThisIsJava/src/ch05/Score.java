package ch05;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        boolean run = true;

        int stdNm = 0;
        int[] scores = null;
        Scanner sc = new Scanner(System.in);

        while (run){
            System.out.println("------------------------------------------------------");
            System.out.println("1 학생수 | 2 점수입력 | 3 점수리스트 | 4 분석 | 5 종료");
            System.out.println("------------------------------------------------------");
            System.out.print("선택 > ");

            int selNo = sc.nextInt();

            if (selNo == 1){
                System.out.print("학생수 :");
                stdNm = sc.nextInt();
                scores = new int[stdNm];
            } else if (selNo == 2){
                for (int i = 0; i < stdNm; i++){
                    System.out.print(i + "번 학생 점수 입력 :");
                    scores[i] = sc.nextInt();
                }
            } else if (selNo == 3){
                for (int i = 0; i < stdNm; i++){
                    System.out.println(i + "번 학생 점수 : " + scores[i]);
                }
            } else if (selNo == 4){

            }

        }
    }
}
