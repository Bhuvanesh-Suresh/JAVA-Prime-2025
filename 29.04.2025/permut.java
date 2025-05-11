import java.util.ArrayList;

public class permut {
    public static void main(String[] args) {
        String str="ABC";
        ArrayList<String> result=new ArrayList<String>();
        permute(str,"",result);
        System.out.println("Permutation"+result);
    }
    public static void permute(String str,String perm,ArrayList<String> result) {
        if(str.isEmpty())
        {
            result.add(perm);
        }
        for(int i=0;i<str.length();i++)
        {
            String curr=""+str.charAt(i);
            String remainiString=str.substring(0,i)+str.substring(i+1);
            permute(remainiString,perm+curr,result);
        }
    }
}
