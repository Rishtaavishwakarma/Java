
public class Strings_all {

    public static void main(String[] args) {

        // 1. String Declaration and Initialization
        String str1 = "Hello";
        String str2 = new String("World");

        System.out.println("1. String Declaration:");
        System.out.println("  str1 = " + str1);
        System.out.println("  str2 = " + str2);

        // 2. Escape Sequences
        System.out.println("\n2. Escape Sequences:");
        System.out.println("  Newline:\n  This is a new line.");
        System.out.println("  Tab:\tThis is tabbed.");
        System.out.println("  Quote: \"Quoted Text\"");
        System.out.println("  Backslash: C:\\Users\\Name");

        // 3. String Concatenation
        System.out.println("\n3. String Concatenation:");
        String full = str1 + " " + str2;
        System.out.println("  Full string = " + full);

        // 4. String Methods
        System.out.println("\n4. Common String Methods:");
        String sample = "  Java Programming  ";
        System.out.println("  Original = '" + sample + "'");
        System.out.println("  Length = " + sample.length());
        System.out.println("  Trimmed = '" + sample.trim() + "'");
        System.out.println("  To Upper = " + sample.toUpperCase());
        System.out.println("  To Lower = " + sample.toLowerCase());
        System.out.println("  Substring (5, 16) = " + sample.substring(5, 16));
        System.out.println("  Char at index 2 = " + sample.charAt(2));
        System.out.println("  Index of 'a' = " + sample.indexOf('a'));
        System.out.println("  Replace 'a' with '@' = " + sample.replace('a', '@'));
        System.out.println("  Starts with '  Java' = " + sample.startsWith("  Java"));
        System.out.println("  Ends with 'ing  ' = " + sample.endsWith("ing  "));
        System.out.println("  Contains 'Program' = " + sample.contains("Program"));

        // 5. String Comparison
        System.out.println("\n5. String Comparison:");
        String a = "Hello";
        String b = "hello";
        System.out.println("  a.equals(b) = " + a.equals(b));
        System.out.println("  a.equalsIgnoreCase(b) = " + a.equalsIgnoreCase(b));
        System.out.println("  a.compareTo(b) = " + a.compareTo(b));

        // 6. Splitting and Joining
        System.out.println("\n6. Splitting and Joining:");
        String sentence = "Java,is,fun";
        String[] words = sentence.split(",");
        System.out.print("  Split: ");
        for (String word : words) {
            System.out.print(word + " | ");
        }
        String joined = String.join(" ", words);
        System.out.println("\n  Joined: " + joined);

        // 7. StringBuilder (mutable string)
        System.out.println("\n7. StringBuilder:");
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        sb.replace(6, 11, "Java");
        sb.delete(0, 1);
        System.out.println("  Modified StringBuilder: " + sb);

        // 8. StringBuffer (thread-safe mutable string)
        System.out.println("\n8. StringBuffer:");
        StringBuffer sbf = new StringBuffer("Welcome");
        sbf.append(" User");
        System.out.println("  Modified StringBuffer: " + sbf);
    }
}
