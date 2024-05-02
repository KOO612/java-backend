package ch05.sec07;

public class MulArrEx {
    public static void main(String[] args) {
        int[][] mathSc = new int[2][3];

        for (int i = 0; i < mathSc.length; i++) {
            for (int j = 0; j < mathSc[i].length; j++) {
                System.out.println("mathSc[" + i + "][" + j + "] = " + mathSc[i][j]);
            }
        }
        System.out.println();
        mathSc[0][0] = 80;
        mathSc[0][1] = 83;
        mathSc[0][2] = 85;
        mathSc[1][0] = 86;
        mathSc[1][1] = 90;
        mathSc[1][2] = 92;

        int totalStudent = 0;
        int totalMathSum = 0;
        for (int i = 0; i < mathSc.length; i++) {
            totalStudent += mathSc[i].length;
            for (int j = 0; j < mathSc[i].length; j++) {
                totalMathSum += mathSc[i][j];
            }
        }
        double totalAvg = (double) totalMathSum / totalStudent;
        System.out.println("전체 학생의 수학 평균 점수: " + totalAvg);
        System.out.println();
    }
}
