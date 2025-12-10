import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] score = new int[n];

        for (int i = 0; i < n; i++) {
            score[i] += sc.nextInt();
        }

        int max = 0;
        int sum = 0;

        // 세준이 공식으로 새로운 평균 점수 구하기
        for (int i = 0; i < n; i++) {
            if (score[i] > max) {
                max = score[i];
            }
            sum += score[i];
        }
        System.out.println(sum * 100.0 / max / n);
    }
}
