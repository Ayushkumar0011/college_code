import java.util.Scanner;

public class rotate_pallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int digit=count(n);
        int d=digit;
        boolean res=false;
        while(digit>0)
        {
            if(pallindrome(n))
            {
                res=true;
                System.out.println(n);
                break;
            }       
            n=rotate(n,d);
            
                digit--;
        }
        System.out.println(res);
        
    }
    public static int count(int n)
    {
        int d=0;
        while(n>0)
        {
            n/=10;
            d++;
        }
        return d;
    }
    public static int rotate(int n,int d)
    {
        return (n%10)* (int)(Math.pow(10,(d-1)))+(n/10);
    }
    public static boolean pallindrome(int n)
    {
        int num=n;
        int sum=0;
        while(n>0)
        {
            sum=(sum*10)+(n%10);
            n/=10;
        }
        return sum==num;
    }
    
}
