package JavaBasics.Level1;

public class GetMax4 {
    public static void main(String[] args) {
        System.out.println(compare(10, 20));
        System.out.println(compare((byte) 10, (byte) 20));//byte要强制类型转换
        System.out.println(compare((short) 10, (short) 20));
        System.out.println(compare( 10L, 20L));//long要加后缀L,另float要加后缀F
    }

    public static boolean compare(int a, int b) {
        System.out.println("int");
        return a == b;  //输出的是true或者false
    }
    public static boolean compare(byte a, byte b) {
        System.out.println("byte");
        return a == b;  //输出的是true或者false
    }
    public static boolean compare(short a, short b) {
        System.out.println("short");
        return a == b;  //输出的是true或者false
    }
    public static boolean compare(long a, long b) {
        System.out.println("long");
        return a == b;  //输出的是true或者false
    }
}
