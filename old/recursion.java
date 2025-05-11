public class recursion {
    public static void main(String[] args) {
        welcomemsg(5);
    }
    public static void welcomemsg(int count)
    {
        if(count < 1)
        {
            return;
        }
        System.out.println("Welcome");
        welcomemsg(count-1);
    }
}
