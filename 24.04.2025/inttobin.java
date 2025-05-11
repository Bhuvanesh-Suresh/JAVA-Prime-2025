import java.util.Scanner;

public class inttobin {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int i;
            int num = scan.nextInt();
            System.out.println(num);
            StringBuilder revstr=new StringBuilder();
            String binum=Integer.toBinaryString(num);
            System.out.println("Binary: "+binum);
            for(i=binum.length()-1;i>=0;i--)
            {
                revstr.append(binum.charAt(i));
            }
            System.out.println("Reverse: "+revstr);
    }
}
