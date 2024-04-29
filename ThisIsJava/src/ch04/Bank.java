package ch04;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        boolean run = true;

        int bal = 0;

        Scanner sc = new Scanner(System.in);

        while (run) {
            System.out.println("---------------------------------");
            System.out.println("1 예금 | 2 출금 | 3 잔고 | 4 종료");
            System.out.println("---------------------------------");
            System.out.print("선택 > ");

            int menuNum = sc.nextInt();

            switch (menuNum) {
                case 1:
                    System.out.print("예금액 > ");
                    bal += sc.nextInt();
                    System.out.println("잔액 : " + bal);
                    break;
                case 2:
                    System.out.print("출금액 > ");
                    bal -= sc.nextInt();
                    System.out.println("잔액 : " + bal);
                    break;
                case 3:
                    System.out.print("잔고 > ");
                    System.out.println(bal);
                    break;
                case 4:
                    run = false;
                    break;
            }
            System.out.println();
        }
        System.out.println("종료");
    }
}
