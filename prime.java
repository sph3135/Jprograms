
public class prime{
    public static void main(String[] args) {
        int n,i,c,j;
        
        for(i=2; i<100; i++)
        {
            c=0;
            for(j=1; j<=i; j++)
            {
            if(i%j==0)
            {
                c++;
                
            }
            }
            if(c==2)
            {
                System.out.println(i);
            }
        }
        
    }


}