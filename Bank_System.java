import java.util.*;

class Bank{
    private double balance;
    String name="";
    String address="";
    String phn_no="";
    String email="";
    Bank(double balance,String name,String add,String phn_no,String email)
    {
        this.balance=balance;
        this.name=this.name+name;
        this.address=this.address+add;
        this.phn_no=this.phn_no+phn_no;
        this.email=this.email+email;
        System.out.println("SuccessFully Created the account");

    }
    public void deposit(int amount)
    {
        this.balance=this.balance+amount;
        System.out.println("SuccessFully deposit the money");
    }
    public void withdraw(int amount)
    {
        if(amount< balance && balance-amount>0)
        {
        this.balance=this.balance-amount;
        System.out.println("SuccessFully Withdrawed the money");
        System.out.println("Current balance = "+this.balance);
        }
    }
    public double getBalance()
    {
        return this.balance;
    }
    public void details()
    {
        System.out.println("Account Holder Name -> "+this.name);
        System.out.println("Address -> "+this.address);
        System.out.println("Phone_no -> "+this.phn_no);
        System.out.println("Email id ->"+this.email);
        System.out.println();


        }

}
public class Bank_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Bank> acc_list=new ArrayList<>();
        boolean res=true;
        while(res)
        {
            System.out.println("Enter 1 for New account Creation");
            System.out.println("Enter 2 for Deposit Money");
            System.out.println("Enter 3 for WithDrawing money");
            System.out.println("Enter 4 for GetBalance");
            System.out.println("Enter 5 for Get details of the User");
            System.out.println("Enter 6 for Exit");
            int n=sc.nextInt();
            sc.nextLine();
            switch(n)
            {
                case 1:
                System.out.println("Enter the Name of the User");
                String name=sc.nextLine();
                System.out.println("Enter the Address of the User");
                String add=sc.nextLine();
                System.out.println("Enter the Phone Number of the User");
                String phone=sc.nextLine();
                System.out.println("Enter the Email of the User");
                String email=sc.nextLine();
                System.out.println("Enter the Balance of the User Account");
                Double balance=sc.nextDouble();
                sc.nextLine();
                acc_list.add(new Bank(balance,name,add,phone,email));
                break;
                case 2:
                System.out.println("Enter the Username");
                String s_name=sc.nextLine();
                for(Bank b:acc_list)
                {
                    if(b.name.equals(s_name))
                    {
                        System.out.println("Enter the amount to Deposit");
                        int dep=sc.nextInt();
                        sc.nextLine();
                        b.deposit(dep);
                        break;


                    }
                }
                break;
                case 3:
                System.out.println("Enter the Username");
                String s_n=sc.nextLine();
                for(Bank b:acc_list)
                {
                    if(b.name.equals(s_n))
                    {
                        System.out.println("Enter the amount to Withdraw");
                        int withdraw_amount=sc.nextInt();
                        sc.nextLine();
                        b.withdraw(withdraw_amount);
                        break;
                    }
                }
                break;
                case 4:
                System.out.println("Enter the Username");
                String sn=sc.nextLine();
                for(Bank b:acc_list)
                {
                    if(b.name.equals(sn)){
                    System.out.println(b.getBalance());
                    break;
                    }
                }
                break;
                case 5:
                System.out.println("Enter the Username");
                String sname=sc.nextLine();
                for(Bank b:acc_list)
                {
                    if(b.name.equals(sname))
                    {
                        b.details();
                        break;
                    }
                }
                break;
                case 6:
                res=false;
                break;
                default:
                System.out.println("YOU ENTERED A WRONG COMMAND");
                
        }

        }

    }

    
}
