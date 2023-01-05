package Variables;

public class LocalVariable {
    public static void main (String [] args){
        String localVariable = "Local Variable";
        System.out.println(localVariable);


        for(int i=5; i>0; i--){
            int a =0; // local variable
            a++;
            System.out.println(a);
        }
    }
    public LocalVariable() {
        String localVariable2 = "Local Variable2";
        System.out.println(localVariable2);
    }

}
