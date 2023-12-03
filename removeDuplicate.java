public class removeDuplicate {
    public static boolean[] map = new boolean[26];
    private static char currentchar;

    public static void Removedup(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        currentchar = str.charAt(idx);
        if (map[currentchar - 'a'] == true) {
            Removedup(str, idx + 1, newString);
        } else {
            newString += currentchar;
            map[currentchar - 'a'] = true;
            Removedup(str, idx + 1, newString);
        }
    }

    public static void main(String args[]) {
        String str = "abbcddeff";
        Removedup(str, 0, "");
    }
}
