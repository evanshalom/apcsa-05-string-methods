
public class WordSplitter {
    public static void main(String[] args) {
        String word = "extraordinary";

        System.out.println(word.length());
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(word.length() - 1));

        int mid = word.length() / 2;
        System.out.println(word.substring(0, mid));
        System.out.println(word.substring(mid));

        String swapped = word.substring(word.length() - 1)
                + word.substring(1, word.length() - 1)
                + word.substring(0, 1);
        System.out.println(swapped);

        int ord = word.indexOf("ord");
        System.out.println(ord);
        System.out.println(word.substring(ord + 3));

        word = "programming";
        ord = word.indexOf("ord");
        System.out.println(ord);

        // "programming" does not contain "ord", so indexOf returns -1.
        // substring(ord + 3) starts at index 2 and prints "ogramming".
        System.out.println(word.substring(ord + 3));
    }
}
