package JAVA05_Array;

/**
 * 배열
 *  같은 타입의 데이터가 메모리에 연속해서 저장된 구조
 *   데이터타입[] 변수명 또는 데이터타입 변수명[];
 *  new 연산자로 배열 선언 시
 *   기본 데이터 타입은 모든 요소가 0으로 초기화되고 (boolean = false)
 *   참조 데이터 타입은 모든 요소가 null 초기화 된다.
 *  배열을 생성할 때 초기값을 지정해서 배열 생성과 초기화를 동시에 진행할 수 있다.
 *   데이터타입[] 변수명 = {요소1, 요소2, ...};
 *  배열의 길이를 구하는 내장 변수 length 존재한다.
 *   배열명.length
 *
 *  ArrayIndexOutOfBoundsException
 *   인덱스가 배열의 크기보다 크거나 음수 인덱스에 대한 요청이 발생할 때
 */
public class Array01 {
    public static void main(String[] args) {
        // int 타입의 값을 5개 저장할 수 있는 배열 arr 생성
        int[] arr = new int[5];
        arr[0] = 10;    // arr 0번에 10 저장
        arr[1] = 20;    // arr 1번에 20 저장
        arr[2] = 30;    // arr 2번에 30 저장
        arr[3] = 40;    // arr 3번에 40 저장
        arr[4] = 50;    // arr 4번에 50 저장

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println("arr length : "  +arr.length);

        System.out.println("=======================");

        int[] score = {60, 70, 80, 90, 200, 100};
        System.out.println(score[0]);
        System.out.println(score[1]);
        System.out.println(score[2]);
        System.out.println(score[3]);
        System.out.println(score[4]);
        System.out.println(score[5]);
        System.out.println("score length : " + score.length);

        System.out.println("=======================");

        int[] arr2 = new int[] {10, 20, 30};
        for (int i = 0; i < 5; i++) {
            System.out.println(arr2[i]);
        }
    }
}
