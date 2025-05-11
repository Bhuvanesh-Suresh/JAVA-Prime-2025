public class strpreffix {
    public static void main(String[] args) {
        String arr[]={"flower","flow","flight"};
        String pr=arr[0];
        int i;
        for(i=1;i<arr.length;i++)
        {
            // while(arr[i].indexOf(pr)!=0)
            while(arr[i].startsWith(pr)==false)
            {
                pr=pr.substring(0,pr.length()-1);
                if(pr.isEmpty())
                {
                    break;
                }
            }
        }
        System.out.println("Longest common prefix: "+pr);

        }
        
    }
