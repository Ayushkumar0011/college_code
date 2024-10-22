import java.util.Scanner;

public class automorphicnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=count(n);
        int sq_num=n*n;
        int l=sq_num%((int)(Math.pow(10,d)));
        System.out.println(l==n);


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

    
}
