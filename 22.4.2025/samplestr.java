public class samplestr {
    public static void main(String[] args) {
        String name="Ramesh";
        String empname="Ramesh";
        //l3 ,l4 uses same memory space
        //String name ="Raamesh";
        //l6 wont update the initial position of l3,it just create a new memory space to avoid conflicts.
        String tenant=new String("Ramesh");
        //l8 would always create a seperate memory space even it the used string is same since we use the "new" keyword.
        System.out.println(name == empname);
        System.out.println("Shallow check "+(name == tenant));//checks the address
        System.out.println("Deep check "+name.equals(tenant));//checks the data in string
    }
}
