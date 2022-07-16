package JAVA05_Array;

/**
 * 2차원 배열 실습
 *  대각선 요소들의 합을 구하기
 */
public class Array07 {
    public static void main(String[] args) {
        int[][] intArr = new int[5][5];
        int num = 1;
        int sum = 0;        // 대각선 요소들의 합을 저장할 변수 sum

        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[i].length; j++) {
                intArr[i][j] = num;
                // 대각선 요소들은 i j 의 값이 같을 때 이므로
                if (i == j) {
                    // 같으면 변수에 저장
                    sum += intArr[i][j];
                }
                num++;
                System.out.print(intArr[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
        System.out.println("대각선 요소들의 합 : " + sum);
    }
}
