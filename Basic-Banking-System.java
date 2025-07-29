import java.util.Scanner;
class Account{
    private
    String name;
    String accountNo;
    double amount;
    public
    Account(){
        name=" ";
        accountNo= "111";
        amount=0;
    }
    Account(String n,String Acc, double a){
        name = n;
        accountNo = Acc;
        amount = a;
    }
void insert(String Acc, double a){
    accountNo = Acc;
    amount = a; 
}
void deposit ( double a){
    amount = amount + a;
}
void withdraw ( double w){
    if(w<=amount){
        amount = amount - w;
    }
}
void checkBalance(){
    System.out.println("Current Balance = "+amount);
}
void display(){
    System.out.println("Account Name = "+ name);
    System.out.println("Account Number = "+ accountNo);
    System.out.println("Account Balance = "+ amount);
}
}
class BasicBankingSystem{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("\n==== Basic Banking System ====\n");
        System.out.print("Enter our Name = ");
        String n = s.nextLine();
        System.out.print("Enter Account number = ");
        String Acc = s.nextLine();
        System.out.print("Enter Your Inital Balance = ");
        double b = s.nextDouble(); 
        Account user1 = new Account();
        Account user2 = new Account(n,Acc,b);
        System.out.print("Enter the amount to Deposit = ");
        double d = s.nextDouble();
        user2.deposit(d);
        user2.display();
    }
}
