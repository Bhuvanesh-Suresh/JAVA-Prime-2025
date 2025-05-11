import java.util.Scanner;

class hello
{
    public static void main(String args[])
    {
        Scanner scan =new Scanner(System.in);
        int num=scan.nextInt();
        String n=Integer.toString(num);
        int len=n.length();
        int left=0;
        int right=len-1;
        int flag=0;
        while(left<=right)
        {
            if (n.charAt(left)==n.charAt(right))
            {
                flag=1;
            }
            else
            {
                flag=0;
                break;
            }
            left++;
            right--;
        }
        if(flag==1)
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}