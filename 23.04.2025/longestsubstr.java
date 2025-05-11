import java.util.HashMap;

public class longestsubstr
{
    public static void main(String[] args) {
        String str="pwwkew";
        int max=0;
        int left=0;
        HashMap<Character,Integer> position =new HashMap<>();
        for(int right=0;right<str.length();right++)
        {
            char current =str.charAt(right);
            if(!position.containsKey(current))
            {
                position.put(current,right);
            }
            else{
                left=Math.max(left,position.get(current)+1);
                position.put(current,right);
            }
            max=Math.max(max,(right-left)+1);
        }
        System.out.println("Max"+max);
    }
}