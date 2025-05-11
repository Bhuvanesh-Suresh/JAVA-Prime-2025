public class preffixstr {
    public static void main(String[] args) {
        String arr[]={"flower","flow","fly"};
        // System.out.println(arr[1].charAt(0));
        StringBuilder arr1=new StringBuilder();
        for(int i=0;i<2;i++)
        {
            char let= arr[i].charAt(i);
            if(arr[i].charAt(0)!=arr[i+1].charAt(0))
            {
                arr1=null;    
            }
            else if(arr[i+1].charAt(i)==let)
            {
                arr1.append(let);
                // System.out.println(arr1);
            }
        }
        System.out.println(arr1);
       }
}
