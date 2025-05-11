public class inselement
{
    public static void main(String[] args) {
        int[] arr={3,5,7,24,63,72};
        int[] newarr= new int[10];
        int ele=91;
        int i;
        int size=0;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]<=ele)
            {
                newarr[i]=arr[i];
                size++;
            }
        }
        newarr[size]=ele;
        for(i=size;i<arr.length;i++)
        {
            if(arr[i]>ele)
            {
                newarr[i+1]=arr[i];
                size++;
            }
        }
        for(i=0;i<=size;i++)
        {
            System.out.println(newarr[i]);
        }
    }
}