
public class NameTag {
    public static void main(String[] args) {
        String full = "Maya Rose Cohen";
        // 1. find the first space
        String first = full.substring(0, full.indexOf(" "));
        System.out.println(first);

        // 2. cut first and rest
        String rest = full.substring(full.indexOf(" ") + 1);
        System.out.println(rest);

        // 3. same pattern on rest
        String middle = rest.substring(0, rest.indexOf(" "));
        System.out.println(middle);

        String last = rest.substring(rest.indexOf(" ") + 1);
        System.out.println(last);

        //4. initials
        System.out.println(first.substring(0,1) + "." + middle.substring(0,1) + "." + last.substring(0,1) + ".");

        //5. username
        System.out.println(first.toLowerCase() + "." + last.toLowerCase());
    }
}
