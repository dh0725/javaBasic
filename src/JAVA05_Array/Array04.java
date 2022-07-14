package JAVA05_Array;

/**
 * 배열 실습
 *  배열에 저장된 점수들의 총합, 평균, 최솟값, 최댓값 구하기
 */
public class Array04 {
    public static void main(String[] args) {
        int[] score = {90, 76, 36, 100, 22};
        int sum = 0;        // 합계
        double avg = 0.0;   // 평균
        int max = 0;        // 최댓값
        int min = 999;      // 최소값

        // score의 길이(5) 만큼 반복하면서
        for (int i = 0; i < score.length; i++) {
            sum += score[i]; // 합계

            if (score[i] > max) {
                max = score[i];     // 최댓값
            } else {
                min = score[i];     // 최소값
            }
        }
        avg = sum / score.length;   // 합계 / 길이 = 평균

        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + avg);
        System.out.println("최댓값 : " + max);
        System.out.println("최소값 : " + min);
    }
}
