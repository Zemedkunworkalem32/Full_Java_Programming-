public class StringOperation {
   public static void main(String[] args) {

        String input = "  Hello!!   Welcome to  Java @2026 Programming.   ";

        System.out.println("Original String:");
        System.out.println(input);

        // 1. Remove special characters (keep letters, numbers and spaces)
        String noSpecial = input.replaceAll("[^a-zA-Z0-9 ]", "");
        System.out.println("\nAfter removing special characters:");
        System.out.println(noSpecial);

        // 2. Remove extra spaces
        String noExtraSpaces = noSpecial.trim().replaceAll("\\s+", " ");
        System.out.println("\nAfter removing extra spaces:");
        System.out.println(noExtraSpaces);

        // 3. Count number of words
        if (noExtraSpaces.isEmpty()) {
            System.out.println("\nNumber of words: 0");
        } else {
            String[] words = noExtraSpaces.split(" ");
            System.out.println("\nNumber of words: " + words.length);
        }
    }
  
}
