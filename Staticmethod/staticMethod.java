package Staticmethod;

public class staticMethod {
    private int rollno;
    private String name;
    private static String college ="BBDIT";
    staticMethod(int r, String n){
        rollno=r;
        name=n;
    }
    static void change(){
        college="CODEGYM";
    }
    void display(){
        System.out.println(rollno+""+name+""+college);
    }
}
