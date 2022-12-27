package DataTypes2;

public class MyFirstPractise1 {
    public static void main(String [] args){
        int a = 25; // tam eded deyisheni
        System.out.println("int a="+a);

        long l = 25; // int dəyərini mənimsəyə bilir, çünki həcmi daha çoxdur
        System.out.println("long l="+l);

        double b = 25.5; // kəsr ədəd dəyişəni
        System.out.println("double b="+b);

        float f1 = (float) 25.5; // bu cür yazılış daha məqsədə uyğundur
        System.out.println("float f1="+f1);
        float f2 = 25.5f;
        System.out.println("float f2="+f2);

        char c = 'c'; // 1 simvol dəyişəni
        System.out.println("char c="+c);

        String d = "hello wold"; // simvollar toplusu
        System.out.println("String d="+d);

        boolean e = true; // özündə 2 cavab saxlıyır
        System.out.println("boolean e="+e);
    }
}
