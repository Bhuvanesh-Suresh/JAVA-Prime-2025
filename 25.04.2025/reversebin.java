public class reversebin {
    public static void main(String[] args) {
        int input=10;
        int out=0;
        for(int i=0;i<32;i++)
        {
            int last=input & 1;
            if(out!=0)
            {
                out=out << 1;
            }
            if(last==1)
            {
                out=out |1;
            }
            input=input >>1;
        }
        System.out.println(out);
    }
}
