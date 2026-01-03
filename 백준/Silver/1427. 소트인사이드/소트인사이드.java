import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // String 변수로 정렬할 데이터를 받아서
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] A = new int[str.length()];

        // SubString() 으로 str 길이만큼 배열에 저장하기
        for (int i = 0; i < str.length(); i++) {
            A[i] = Integer.parseInt(str.substring(i, i + 1));
        }

        // 선택정렬 알고리즘을 이용해 내림찬순 정렬
        for (int i = 0; i < str.length(); i++) {
            // 현재 범위에서 Max 값 찾기
            int Max = i;

            for (int j = i + 1; j < str.length(); j++) {
                if (A[j] > A[Max]) {
                    Max = j;
                }
            }

            // 현재 i의 값과 Max 값 중 Max 값이 더 크면 swap 수행하기
            if (A[i] < A[Max]) {
                int temp = A[i];
                A[i] = A[Max];
                A[Max] = temp;
            }
        }
        // 배열 출력
        for (int i = 0; i < str.length(); i++) {
            System.out.print(A[i]);
        }
    }
}
