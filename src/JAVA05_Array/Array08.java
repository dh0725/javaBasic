package JAVA05_Array;

/**
 * 2차원 배열 실습
 *  왼쪽 삼각형 요소들의 합 구하기
 */
public class Array08 {
    public static void main(String[] args) {
        int[][] intArr = new int[5][5];
        int num = 1;
        int leftSum = 0;        // 왼쪽 대각선 요소들의 합을 저장할 변수

        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[i].length; j++) {
                intArr[i][j] = num;
                // 왼쪽 대각선 요소들은 i가 j보다 크지 않을 떄 이므로
                if (i >= j) {
                    // i가 j보다 크지 않을 때만 변수에 저장
                    leftSum += intArr[i][j];
                }
                num++;
                System.out.print(intArr[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
        System.out.println("왼쪽 삼각형 요소들의 합 : " + leftSum);
    }
}
