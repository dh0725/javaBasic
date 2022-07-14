package JAVA05_Array;

/**
 * 배열을 이용한 확장 for문
 *  콜론 (:)을 기준으로 처음에 변수 선언이 있고 그다음 배열 변수가 있다.
 *  변수 선언 자리에 선언된 변수는 배열의 각 요소가 저장될 변수를 의미하고
 *  배열명에 지정된 배열은 반복 실행의 대상이 되는 배열이다.
 *  증감식 및 조건식이 없다. 즉, 자동으로 배열의 길이만큼 반복한다.
 *  for (변수선언 : 배열명) {
 *      실행문;
 *  }
 *
 */
public class Array02 {
    public static void main(String[] args) {
        int[] intArr = {10, 20, 30, 40, 50};
        for (int num : intArr) {
            System.out.println(num);
        }
    }
}
