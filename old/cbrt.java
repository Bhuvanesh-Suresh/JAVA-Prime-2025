import java.util.Scanner;
public class cbrt {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int left=0;
        int right=num;
        int mid;
        while(left<=right)
        {
            mid=(left+right)/2;
            if((mid*mid*mid)==num)
            {
                System.out.println(mid);
                break;
            }
            else if((mid*mid*mid)<num)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        // float ans=(float)Math.pow(num,1.0/3.0);
        // System.out.println(ans);
    }
}
