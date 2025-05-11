public class hamming {
    public static void main(String[] args) {
        int n1=4;
        int n2=5;
        int xor=n1^n2;
        int count=0;
        while(xor!=0)
        {
            if((xor&1)==1)
            {
                count++;
            }
            xor=xor>>1;
        }
        System.out.println("The hamming distance is: "+count);
    }
}
