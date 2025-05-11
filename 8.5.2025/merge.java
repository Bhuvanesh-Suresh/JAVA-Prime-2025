public class merge {
    public static void main(String[] args) {
        int[] arr1={1,4,9,13,42};
        int[] arr2={3,5,7,24,63};
        int[] newarr=new int[20];
        int i=0;
        int j=0;
        int k=0;
        int size=0;
        for(;i<arr1.length && j<arr2.length;k++)
        {
            if(arr1[i]<arr2[j])
                {
                    newarr[k]=arr1[i];
                    i++;
                    size++;
                }
            else
                {
                    newarr[k]=arr2[j];
                    j++;
                    size++;
                }
        }
        for(;i<arr1.length;i++,k++)
        {
            newarr[k]=arr1[i];
        }
        for(;j<arr2.length;j++,k++)
        {
            newarr[k]=arr2[j];
        }
        for(k=0;k<=size;k++)
        {
            System.out.println(newarr[k]);
        }
    }
    
}
