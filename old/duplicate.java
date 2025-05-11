import java.util.Arrays;

public class duplicate {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,5,5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int i;
        // int j;
        for(i=0;i<arr.length-1;i++)
        {
             if(arr[i]==arr[i+1])
               {
                  System.out.println(arr[i]);
               }
        }
        // for(i=0;i<arr.length;i++)
        // {
        //     for (j=0;i<arr.length;j++)
        //     {
        //         if(arr[i]==arr[j])
        //         {
        //             System.out.println(i);
        //             break;
        //         }

        //     }
        // }
    }
}
