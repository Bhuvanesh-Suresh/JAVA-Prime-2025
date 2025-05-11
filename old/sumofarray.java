public class sumofarray {
    public static void main(String[] args) {
        int[] arr={4,7,8,3,3};
        int n=4;
        int result=sumarr(arr,n);
        System.out.println(result);
    }
    public static int sumarr(int[] arr,int n)
    {
        if(n==0)
        {
            return arr[0];
        }
       else
       {    
          return arr[n]+(sumarr(arr,n-1));
        }
    }
}
