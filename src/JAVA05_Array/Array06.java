package JAVA05_Array;

/**
 * 2차원 배열 실습
 *  중첩 반복문을 통해 2차원 배열의 모든 요소에 접근하기
 */
public class Array06 {
    public static void main(String[] args) {
        int[][] intArr = new int[5][5];     // 5행 5열 2차원 배열 intArr 생성
        int num = 1;    // 1씩 증가하는 값을 넣은 변수 num 선언

        for (int i = 0; i < intArr.length; i++) {   // intArr.length 즉 5만큼 반복
            for (int j = 0; j < intArr[i].length; j++) {    // intArr[i].length 즉 5만큼 반복
                intArr[i][j] = num;         // 각 요소에 num 값 저장
                System.out.print(intArr[i][j]);
                System.out.print("\t");
                num++;      // num 값을 1씩 증가
            }
            System.out.println();
        }

    }
}
