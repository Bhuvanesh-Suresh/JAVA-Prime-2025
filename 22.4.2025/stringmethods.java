public class stringmethods {
    public static void main(String[] args) {
        // Create a string
        String str = " Hello World ";

        // Convert string to lowercase
        System.out.println(str.toLowerCase()); // Output: " hello world "

        // Convert string to uppercase
        System.out.println(str.toUpperCase()); // Output: " HELLO WORLD "

        // Get character at index 1
        System.out.println(str.charAt(1)); // Output: 'H' (0th index is space)

        // Get the length of the string (including spaces)
        System.out.println(str.length()); // Output: 13

        // Get a substring from index 1 to 5 (6-1)
        System.out.println(str.substring(1, 6)); // Output: "Hello"

        // Check if string is exactly equal to another string (case-sensitive)
        System.out.println(str.equals(" Hello World ")); // Output: true

        // Check if string is equal ignoring case
        System.out.println(str.equalsIgnoreCase(" hello world ")); // Output: true

        // Check if string contains a certain word
        System.out.println(str.contains("World")); // Output: true

        // Check if string starts with " H"
        System.out.println(str.startsWith(" H")); // Output: true

        // Check if string ends with "d "
        System.out.println(str.endsWith("d ")); // Output: true

        // Replace "World" with "Java"
        System.out.println(str.replace("World", "Java")); // Output: " Hello Java "

        // Remove spaces from beginning and end
        System.out.println(str.trim()); // Output: "Hello World"
    }
}