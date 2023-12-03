public class Shiftxx {

    private static char currentChar;

    public static void Shiftxxx(String str, int count, int idx, String newString) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';

            }
            System.out.println(newString);
            return;
        }
        currentChar = str.charAt(idx);
        if (currentChar == 'x') {
            count++;
            Shiftxxx(str, count, idx + 1, newString);
        } else {
            newString += currentChar;
            Shiftxxx(str, count, idx + 1, newString);
        }
    }

    public static void main(String[] args) {
        String str = "axbcxxdxexfxghxxk";
        Shiftxxx(str, 0, 0, "");

    }
}
