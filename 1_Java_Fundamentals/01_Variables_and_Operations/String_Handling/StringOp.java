public class StringOp {
    public static void main(String[] args) {
        // 1. String Creation, we put string in double quotes
        String str1 = "Hello, World!";
        String str2 = new String("Java Programming");

        // 2. String Concatenation, concatenation it means joining two strings using + operator
        String greeting = str1 + " Welcome to " + str2;
        System.out.println("Concatenated String: " + greeting);

        // 3. String Methods, this methord is used to get the kength of string, convert to upper case, lower case, check if it contains a substring
        int length = greeting.length();
        System.out.println("Length of greeting: " + length);

        String upperCaseGreeting = greeting.toUpperCase();
        System.out.println("Uppercase Greeting: " + upperCaseGreeting);

        String lowerCaseGreeting = greeting.toLowerCase();
        System.out.println("Lowercase Greeting: " + lowerCaseGreeting);

        boolean containsJava = greeting.contains("Java");
        System.out.println("Does the greeting contain 'Java'? " + containsJava);

        // 4. Substring
        String subStr = greeting.substring(7, 12);
        System.out.println("Substring (7 to 12): " + subStr);

        // 5. Replace
        String replacedStr = greeting.replace("World", "Universe");
        System.out.println("Replaced String: " + replacedStr);

        // 6. Split
        String[] words = greeting.split(" ");
        System.out.println("Words in the greeting:");
        for (String word : words) {
            System.out.println(word);
        }

        // 7. Trim
        String strWithSpaces = "   Hello Java!   ";
        String trimmedStr = strWithSpaces.trim();
        System.out.println("Trimmed String: '" + trimmedStr + "'");
    }
}
