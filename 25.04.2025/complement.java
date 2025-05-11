public class complement {
    public static void main(String[] args) {
        int input=10;
        int  mask=0;
        int comp=~input;
        while(mask<input)
        {
            mask=(mask << 1) |1;
        }
        comp=comp&mask;
        System.out.println(comp);

    }
}
