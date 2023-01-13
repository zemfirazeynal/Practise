package DataTypes3;

public class MyPractise1 {
    public static void main(String[] args) {
        long i1 = 1_000_000_000; // int kimi görür, int-in max dəyərini aşsaydı compile xətası verərdi, ona görə də sonunana L yazılmalı

        float f1 = 10;
        float f2 = 1_000_000_000_000_000f; // double kimi görür, ona görə də sonunana f yazılmalı

        int a = new Integer(5);

        System.out.println(a);

        char c1 = 0;
        char c2 = 65535;
        char c3 = -0; // mənfi ədəd olsa xəta verir

        System.out.println((int) 'b'); // 98




    }
}
