package DataTypes2;

public class MyPractise3 {
    public static void main(String [] args){
        byte b = 6; // tam say --> 1 byte -2^8 vs 2^8-1
        b= 127;
        b= -128;

        short sh = 7; // tam say --> 2 byte -2^16 vs 2^16-1
        sh = 32767;
        sh = - 32768;

        int i = 5; // tam say -->  4 byte -2^32 vs 2^32-1

        long l = 10; // tam say --> 8 byte -2^64 vs 2^64-1

        float f1 = 6.5f; // kəsr say --> 4 byte
        float f2 = (float) 5.7;

        double d = 6.5; // kəsr say --> 8 byte

        char ch = 'c'; // tək simvol --> 2 byte. "c" , 'ch' error verir

        boolean response = false; // true or false --> 1 byte
    }
}
