package ch05.sec10;

public class Advan {
    public static void main(String[] args) {
        int[] sc = {95, 71, 84, 93, 87};

        int sum = 0;
        for (int score : sc) {
            sum += score;
        }
        System.out.println("총합 : " + sum);
        double avg = (double) sum / sc.length;
        System.out.println("평균 : " + avg);
    }
}
