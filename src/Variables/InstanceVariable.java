package Variables;

public class InstanceVariable {

    public String instanceVariable;

    public InstanceVariable (){
        this.instanceVariable ="Instance Variable";
    }
    public static void main(String [] args){
        InstanceVariable data = new InstanceVariable();
        System.out.println("This is "+data.instanceVariable);

    }
}
