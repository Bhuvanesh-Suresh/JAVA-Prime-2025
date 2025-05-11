public class swap {
    public static void main(String[] args) {
        int a=1000;
        int b=0001;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);

    }
}
