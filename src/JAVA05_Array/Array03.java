package JAVA05_Array;

/**
 * 배열 실습
 *  반복문을 통해 알파벳 A부터 Z까지 처리하기
 */
public class Array03 {
    public static void main(String[] args) {
        // 변수 alphabet에 문자 'A'로 초기화
        // char 타입은 문자의 유니코드 값을 저장하는 데이터 타입으로
        // 문자 'A'는 65로 저장된다.
        char alphabet = 'A';
        char[] alphabetArr = new char[26];  // 배열 alphabetArr 선언

        // alphabetArr의 길이 (26)만큼 반복하면서
        // alphabet에 1씩 더하기
        for (int i = 0; i < alphabetArr.length; i++) {
            alphabetArr[i] += alphabet + i;
            System.out.println(alphabetArr[i]);
        }
    }
}
