import java.util.Scanner;

public class root {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        double num=scan.nextInt();
        double root=scan.nextInt();
        // System.out.println(num);
        // System.out.println(root);
        double left=0;
        double right=num;
        double mid=0;
        double error=0.000001;
        // multiply(num,root);
        while((right-left)>error)
        {
            mid=(left+right)/2;
            if((multiply(mid,root))>num)
            {
                right=mid;
            }
            else
            {
                left=mid;
            }

        }
        System.out.println(mid);

    }
    public static double multiply(double num,double root)
    {
        double ans=1;
        for (int i=0;i<root;i++)
        {
            ans*=num;
        }
        return ans;
        
    }
}
