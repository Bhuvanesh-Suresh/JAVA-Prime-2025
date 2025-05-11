public class string2 {//string methods
    public static void main(String[] args) {
        String str = "Java Programming";

        System.out.println("Original String: \"" + str + "\"");

        // length()
        System.out.println("Length: " + str.length()); // includes spaces

        // charAt(int)
        System.out.println("Char at index 5: " + str.charAt(5)); // 'P'

        // substring(begin)
        System.out.println("Substring from index 5: " + str.substring(5)); // "Programming "

        // substring(begin, end)
        System.out.println("Substring from 1 to 5: " + str.substring(1, 5)); // "Java"

        // equals()
        System.out.println("Equals 'Java Programming': " + str.equals("JavaProgramming")); // false due to spaces

        // equalsIgnoreCase()
        System.out.println("EqualsIgnoreCase ' java programming ': " + str.equalsIgnoreCase(" java programming ")); // true

        // toLowerCase()
        System.out.println("Lowercase: " + str.toLowerCase());

        // toUpperCase()
        System.out.println("Uppercase: " + str.toUpperCase());

        // concat()
        System.out.println("Concat with '-Language': " + str.concat("-Language"));
    }
}
