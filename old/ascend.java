import java.util.Scanner;

public class ascend {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        int i;
        int flag=0;
        for(i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        for(i=1;i<n;i++)
        {
            if(arr[i]>arr[i-1])
            {
                flag=1;
            }
            else{
                flag=0;

                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Ascending");
        }
        else
        {
            System.out.println("Not ascending");
        }

    }
}
