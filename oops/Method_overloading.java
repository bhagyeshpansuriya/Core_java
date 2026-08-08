public class Method_overloading{
    public static void main(String[] args){
        Addition obj=new Addition();
        int r1=obj.add(12, 12,12);
        System.out.print(r1);
    }
}
class Addition {
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public int add(int n1,int n2){
        return n1+n2;
    }
    public double add(double n1,int n2){
        return n1+n2;
    }

}
