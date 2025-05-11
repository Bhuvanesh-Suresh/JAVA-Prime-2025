public class arrlogic {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int pos=2;
        int value=5;
        calc(pos,value,arr);
        remove(arr);
        
    }
    public static void calc(int pos,int value,int[] arr)
    {
        int size=0;
        int[] newarr=new int[20];
        for(int i=0;i<pos;i++)
        {
            newarr[i]=arr[i];
            size++;
            
        }
        newarr[pos]=value;
        for(int i=pos;i<arr.length;i++)
         {
             newarr[i+1]=arr[i];
             size++;
         }
        for(int i=0;i<=size;i++)
        {
            System.out.println(newarr[i]);
        }
    }
    public static void remove(int[] arr)
    {
        int laelem=arr.length;
        arr[laelem-1]=0;
        laelem--;
        for(int i=0;i<laelem;i++)
        {
            System.out.println(arr[i]);
        }
        
    }
}
