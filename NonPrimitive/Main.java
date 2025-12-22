package NonPrimitive;

public class Main {
    public static void main(String[] args) {

        // String is a non-primitive data type
        // String isnon-primitive data type
//string is a class in java which is used to store multiple characters
//string is used to store text data
//string is immutable means once string is created it cannot be changed
// String methods
// concteanate
String name5 = "Priya";
String name6  = "Mathur";
System.out.println("Full Name: " + name5 + " " + name6);
System.out.println( "My name is:"  +name5 + " and my surname is " + name6);

// length
System.out.println("Length of name5: " + name5.length());

//charAt- gives character at specific index
System.out.println("Character at index 2: " + name5.charAt(2));

//substring- gives substring from specific index
System.out.println("Substring from index 1: " + name5.substring(1));
System.out.println("Substring from index 1 to 3: " + name5.substring(1, 3));

//toUpperCase- converts string to uppercase
System.out.println("Uppercase: " + name5.toUpperCase());
//toLowerCase- converts string to lowercase
System.out.println("Lowercase: " + name6.toLowerCase());

//replace- replaces character with another character
System.out.println("Replace 'a' with 'o': " + name6.replace('a', 'o'));

//trim- removes whitespace from both ends of string
String name7 = "   Priya Mathur   ";
System.out.println("Trimmed: " + name7.trim());

//indexOf- gives index of specific character
System.out.println("Index of 'M': " + name6.indexOf('M'));

//equals- compares two strings
String name8 = "Priya";
System.out.println("Equals: " + name5.equals(name8));

//equalsIgnoreCase- compares two strings ignoring case
String name9 = "priya";
System.out.println("Equals Ignore Case: " + name5.equalsIgnoreCase(name9));




    }
}
