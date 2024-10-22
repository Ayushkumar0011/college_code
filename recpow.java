import java.util.Scanner;

public class recpow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(pow(n));

    }
    static boolean pow(int n)
    {

        if(n%2!=0 && n>1)
        return false;
        else if(n==1)
        return true;
        else
        return true&& pow(n/2);
    }
}
