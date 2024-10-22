import java.util.*;
public class rotate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Enter the rotating number");
        int n=sc.nextInt();
        int d=count(num);
        System.out.println(rotate(num, d, n));



    }
    static int count(int n){
        int d=0;
        while(n>0)
        {
            n/=10;
            d++;
        }
        return d;
        
    }
    static int rotate(int num,int d,int r)
    {
        if(r>0)
        return (int)Math.pow(10, d) *(num%10)+rotate(num/10, d-1, r-1);
            return num;
    }
    }