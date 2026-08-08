// parametrized constructor

// class BankAccount{
//     double balance;
//     String accountType;
//     public BankAccount(double _balance){
//         balance=_balance;
//         accountType="Savings";
//     }
//     public BankAccount(double _balance,String _acc_type){
//         balance=_balance;
//         accountType=_acc_type;
//     }
//     public void printBal(){
//         System.out.println(balance);
//     }
//     public void accountType(){
//         System.out.println(accountType);
//     }
// }
// class constructor {
//     public static void main(String[] args){
//     BankAccount customer1=new BankAccount(200.0,"saving");
//     customer1.printBal();
// }
// }


//non parametrized constructor
class BankAccount{
    double balance;
    public BankAccount(){
        balance=100.0;
    }
    public void printBal(){
        System.out.println(balance);
    }
}
class constructor{
    public static void main(String[] args){
        BankAccount test=new BankAccount();
        test.printBal();
    }
}