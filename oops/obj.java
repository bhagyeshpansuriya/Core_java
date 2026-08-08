package oops;

class Test{
    int age;
    public void assign(int num){
        age=num;
    }
}
class obj {
    public static void main(String[] args){
        Test test1=new Test();
        test1.assign(10);

        Test test2=new Test();
        test2.assign(20);

        System.out.println(test1.age);
        System.out.print(test2.age);
    }
}
