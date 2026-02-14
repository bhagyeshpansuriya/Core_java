

class Student{
    String name;
    int age;
    
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}
public class class_ob {
    public static void main(String[] args){
        Student s1 =new Student();
        Student s2=new Student();
        s1.name="amit";
        s1.age=21;

        s2.name="Bhagyesh";
        s2.age=22;

        s1.display();
        s2.display();

    }
}
