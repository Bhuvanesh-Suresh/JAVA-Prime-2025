public class restoreip
{
    public static void main(String[] args) {
        String str="101023";
        int length=str.length();
        StringBuilder str1=new StringBuilder();
        for(int i=0;i<length;i++)
        {
            if(str.charAt(i)!=0)
            {
                str1.append(str.charAt(i));
                System.out.println(str1);
            }
            else
            {
                str1.append(".");
            }

        }
        System.out.println(str1);
    }
}