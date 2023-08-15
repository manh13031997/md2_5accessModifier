package xayDungLopChiGhiJV;

public class Student {
    private String name;
    private String classes;
    Student(String n, String c){
        name=n;
        classes=c;
    }
static void setClasses(String classes){
    classes="c0623k1";
}
void setName(String name){
        name="manh";
}
void display(){
    System.out.println(name+""+classes);
}
}
