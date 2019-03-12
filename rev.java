import java.util.Scanner;
public class rev{
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        int n,r,s=0;
        System.out.println("Enter the Number :");
        n=num.nextInt();
        while(n!=0)
        {
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        System.out.println("Rev ="+s);

    }


}