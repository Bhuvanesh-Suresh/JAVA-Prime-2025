public class string1 {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        String c = new String("hello");

        // Comparing references
        System.out.println("a == b: " + (a == b));    
        System.out.println("a == c: " + (a == c));    
        
        // Comparing content
        System.out.println("a.equals(c): " + a.equals(c));
    }
}
