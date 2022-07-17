package JAVA06_OOP;

public class OOP04VariableArgument2 {

    static void test(String name, int... v) {
        System.out.print(name + " : " );
        for (int x : v) System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        test("피스비", 98, 85, 55);
        test("임동혁", 89, 100, 98);
        test("가나다", 55, 99, 88);
    }
}
