package JAVA05_Array;

/**
 * 2차원 배열
 *  1차원 배열이 행과 열의 형태로 메모리에 연속해서 저장된 구조
 *   데이터타입 변수명[][] = new 데이터타입[행][열];
 *  new 연산자로 배열 선언 시 1차원 배열과 같이
 *   기본 데이터 타입은 모든 요소가 0으로 초기화되고 (boolean = false)
 *   참조 데이터 타입은 모든 요소가 null 초기화 된다.
 */

public class Array05 {
    public static void main(String[] args) {
        // int 타입의 값을 5행 2열로 저장할 수 있는 2차원 배열 생성
        int[][] intArr = new int[5][2];
        intArr[0][0] = 10;
        intArr[0][1] = 20;
        intArr[1][0] = 30;
        intArr[1][1] = 40;
        intArr[2][0] = 50;
        intArr[2][1] = 60;
        intArr[3][0] = 70;
        intArr[3][1] = 80;
        intArr[4][0] = 90;
        intArr[4][1] = 100;

        System.out.println(intArr[0][0]);
        System.out.println(intArr[0][1]);
        System.out.println(intArr[1][0]);
        System.out.println(intArr[1][1]);
        System.out.println(intArr[2][0]);
        System.out.println(intArr[2][1]);
        System.out.println(intArr[3][0]);
        System.out.println(intArr[3][1]);
        System.out.println(intArr[4][0]);
        System.out.println(intArr[4][1]);
        System.out.println("intArr length : " + intArr.length);

        System.out.println("=====================================");

        int[][] intArr2 = {{0, 1}, {10, 11, 12, 13}, {20, 21, 22}, {30, 31, 32, 33}, {40, 41}};
        System.out.println(intArr2[0][0]);
        System.out.println(intArr2[0][1]);
        System.out.println(intArr2[1][0]);
        System.out.println(intArr2[1][1]);
        System.out.println(intArr2[1][2]);
        System.out.println(intArr2[1][3]);
        System.out.println(intArr2[2][0]);
        System.out.println(intArr2[2][1]);
        System.out.println(intArr2[2][2]);
        System.out.println(intArr2[3][0]);
        System.out.println(intArr2[3][1]);
        System.out.println(intArr2[3][2]);
        System.out.println(intArr2[3][3]);
        System.out.println(intArr2[4][0]);
        System.out.println(intArr2[4][1]);
        System.out.println("intArr2 length : " + intArr2.length);
    }
}
