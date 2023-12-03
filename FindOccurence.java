public class FindOccurence {
    public static int first = -1;
    public static int last = -1;

    public static void Occurence(String str, int index, char element) {
        if (index == str.length()) {
            System.out.println("first occurence is at : " + first);
            System.out.println("last occurence is at : " + last);
            return;
        }
        char currentchar = str.charAt(index);
        if (currentchar == element) {
            if (first == -1) {
                first = index;
                last = index;
            } else {
                last = index;
            }
        }
        Occurence(str, index + 1, element);
    }

    public static void main(String args[]) {
        String str = "bbbbbbasdsdsd";
        Occurence(str, 0, 'a');
    }
}
