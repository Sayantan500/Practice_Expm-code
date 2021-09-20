//Lambda Demo code
import java.util.Scanner;

public class LambdaDemo
{
    public LambdaDemo(String msg)
    {
        System.out.println("[From Constructor] Message : " + msg);
    }
    public static void main(String[] args)
    {
        A interface_Ref_To_A = () -> System.out.println("This is implemented with lambda expr...!");
        interface_Ref_To_A.show();

        B interface_Ref_To_B = (x,y) -> {
            int sum = x+y;
            System.out.printf("[From lambda expr] The sum of %d & %d is %d\n",x,y,sum);
            return sum;
        };
        System.out.println("[From main] Sum : "+interface_Ref_To_B.addInt(10,20));
        System.out.println("Returned by the static func of interface B : " + interface_Ref_To_B.someFunc());

        C interface_Ref_To_C = LambdaDemo::new; //Method ref to constructor
        interface_Ref_To_C.showMsg("Using Lambda Expr calling constructor...!!");

        Division interface_Ref_To_Divison = LambdaDemo::divide; // Method ref to static method
        double div = interface_Ref_To_Divison.divide(24,6);
        System.out.println("[From Main] Result of division is : " + div);

        stringConcat interface_Ref_To_stringConcat = new LambdaDemo("[For Below statement] method ref to instance method")::concatStr; // Method ref to instance method
        interface_Ref_To_stringConcat.concatString("ABc45^$^%#",15373l);

        Scanner scanner = new Scanner(System.in);
        System.out.println("[From Main] Enter Sum to withdraw : ");
        float sumWithdraw = scanner.nextFloat();
        Banking interface_Ref_To_Banking = sum -> {
            float rem = 1000-sum;
            System.out.println("Withdrawn...Remaining balance : " + rem);
            return rem;
        };
        if(sumWithdraw<1000)
            interface_Ref_To_Banking.withdraw(sumWithdraw);
        else
            interface_Ref_To_Banking.errorMsg();

    }//END MAIN METHOD

    static double divide(int num,int deno)
    {
        if(deno == 0)
            deno = 1;
        return num/deno;
    }

    void concatStr(String a,long l)
    {
        if(a.compareToIgnoreCase("")==0)
            a = "demo...";
        System.out.println("Result of concat : " + (a+l));
    }
}//END CLASS LambdaDemo

@FunctionalInterface
interface A
{
    public void show();
}

@FunctionalInterface
interface B
{
    int addInt(int x,int y);
    default int someFunc()
    {
        System.out.println("This is the static function inside Functional Interface B...!!");
        return -707;
    }
}
@FunctionalInterface
interface C
{
    void showMsg(String s);
}

//@FunctionalInterface can be written
interface Division
{
    double divide(int num,int deno);
}

//@FunctionalInterface can be written
interface stringConcat
{
    void concatString(String a, long l);
}

@FunctionalInterface
interface Banking
{
    float withdraw(float sum);

    default void errorMsg()
    {
        System.out.println("Sufficient balance not present...!!!!");
    }
}
