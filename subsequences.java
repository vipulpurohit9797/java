public class subsequences {
    public static void subsequence(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(idx);
        subsequence(str, idx + 1, newString + currentChar);
        subsequence(str, idx + 1, newString);
    }

    public static void main(String args[]) {
        String str = "abcd";
        subsequence(str, 0, "");
    }
}
