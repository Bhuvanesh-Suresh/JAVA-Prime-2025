import java.util.Scanner;

public class prime1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        boolean[] flag =new boolean[n+1];
        int j;
        for(int i=2;i<=n;i++)
        {
            flag[i]= true;
        }
        for(int i=2;i<n;i++)
        {
            if(flag[i]==true)
            {
                // for(j=n;j>=i;j--)
                // {
                //     if(j%i==0)
                //     {
                //         // System.out.println(j);
                //         flag[j]=false;
                //     }
                // }
                for(j=i*2;j<n;j+=i)
                {
                    flag[j]=false;
                }
                    
                }

            }
        
        for(int i=2;i<=n;i++)
        {
            if(flag[i]==true)
            {
                System.out.println(i);
            }
            // System.out.println(i);
        }
        // System.out.println(flag[9]);
    }
}
