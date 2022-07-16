package JAVA05_Array;

/**
 * 명령형 매개변수
 *  main() 메소드의 String[] args
 */
public class Array09 {
    public static void main(String[] args) {
        System.out.println(args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]);
            System.out.print("\t");
        }
    }
}
