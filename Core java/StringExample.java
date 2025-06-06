public class StringExample {

    public static void main(String[] args) {

        // String str = "Abhay";
        // System.out.println(str);
        
        // String name = new String("Hello World");
        // System.out.println(name);
        
        // str += name ;
        // System.out.println(str);

        // System.out.println(str.hashCode());
        // System.out.println(str.charAt(1));
        
//         🔹 1. Creation & Conversion
// Method	Description
// String s = new String("Hello")	Creates a new String object
// String.valueOf(123)	Converts various types to String
// "123".toCharArray()	Converts String to char array

// 🔹 2. Length & Emptiness
// Method	Description
// length()	Returns the number of characters
// isEmpty()	Checks if the string is empty (length() == 0)
// isBlank() (Java 11+)	Checks if string is empty or contains only whitespace

// 🔹 3. Character Access
// Method	Description
// charAt(int index)	Gets character at index
// codePointAt(int index)	Returns Unicode code point at index

// 🔹 4. Comparison
// Method	Description
// equals(String s)	Compares contents (case-sensitive)
// equalsIgnoreCase(String s)	Case-insensitive comparison
// compareTo(String s)	Lexicographical comparison
// compareToIgnoreCase(String s)	Case-insensitive comparison

// 🔹 5. Searching & Matching
// Method	Description
// contains(CharSequence s)	Checks if string contains a sequence
// indexOf(char or String)	Finds first occurrence
// lastIndexOf(char or String)	Finds last occurrence
// startsWith(String s)	Checks if it starts with s
// endsWith(String s)	Checks if it ends with s
// matches(String regex)	Regex match

// 🔹 6. Substrings & Parts
// Method	Description
// substring(int beginIndex)	From index to end
// substring(int begin, int end)	From index to index (exclusive)

// 🔹 7. Modification
// Method	Description
// toUpperCase()	Converts to uppercase
// toLowerCase()	Converts to lowercase
// trim()	Removes leading/trailing whitespace
// replace(char old, char new)	Replaces characters
// replaceAll(String regex, String repl)	Replaces matching regex
// replaceFirst(String regex, String repl)	Replaces first match only

// 🔹 8. Splitting & Joining
// Method	Description
// split(String regex)	Splits string into array
// String.join(delimiter, elements...)	Joins elements with delimiter

// 🔹 9. Formatting
// Method	Description
// String.format(String fmt, args...)	Formats values into a string
// printf(...)	Prints formatted output (not a String method but used with strings)

// 🔹 10. Interning & Identity
// Method	Description
// intern()	Returns canonical representation (from string pool)

// 🔹 11. Miscellaneous
// Method	Description
// toCharArray()	Converts string to array of characters
// repeat(int count) (Java 11+)	Repeats the string multiple times

        
        // String s = String.valueOf(45454);
        // System.out.println(s);
        // System.out.println(s.contains("45"));
        // System.out.println(s.startsWith("45"));
        // System.out.println(s.endsWith("45"));
        // System.out.println(s.lastIndexOf("45"));

        // System.out.println();

        // String name1 = "Abhay";
        // String name2 = "Abhay";
        // name1 += " Patil";
        // System.out.println(name1);
        // System.out.println(name2);

        // string buffer 

        StringBuffer sb = new StringBuffer("Abhay");
        System.out.println(sb.capacity());
        System.out.println(sb);
        System.out.println(sb.length());
        sb.append(" Patil");
        System.out.println(sb);
        
        String str = sb.toString();
        System.out.println(str);
        sb.deleteCharAt(1);
        System.out.println(sb);

    }
}

