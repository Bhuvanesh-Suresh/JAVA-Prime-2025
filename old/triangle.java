import java.util.Scanner;

public class triangle
 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int num=scan.nextInt();
        int i,j;
        int k=1;
        for (i=0;i<num;i++)
        {
            for (j=0;j<=i;j++)
            {

                System.out.print(k+" ");
                k++;
            }
            System.out.println(" ");
        }
    }
    
}
