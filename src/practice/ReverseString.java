package practice;

public class ReverseString {
	public static void main(String[] args) {
        String temp = "&6G%8HK%&9e6&";
        String result = reverseStringKeepingSpecialChars(temp);
        System.out.println("Original String: " + temp);
        System.out.println("Reversed String: " + result);
    }

    public static String reverseStringKeepingSpecialChars(String str) {
        // Step 1: Identify special characters and alphanumeric characters
        StringBuilder alphanumeric = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                alphanumeric.append(c);
            }
        }

        // Step 2: Reverse the alphanumeric characters
        alphanumeric.reverse();
        
        // Step 3: Reconstruct the string with reversed alphanumeric characters
        StringBuilder result = new StringBuilder();
        int index = 0;
        for (char c : str.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                result.append(alphanumeric.charAt(index++));
            } else {
                result.append(c);
            }
        }
        
        return result.toString();
    }
}


