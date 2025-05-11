public class bincout {
    public static void main(String[] args) {
        int num=01001101;
        int count=0;
        int i;
        while(num!=0)
        {
            if((num&1)==1)
            {
                count+=1;
            }
            num=num >> 1;
        }
        System.out.println("Number of 1's are: "+count);
    }
}