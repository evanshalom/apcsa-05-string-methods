public class EmailParser {
    public static void main(String[] args) {
        String email = "maya.cohen@school.org";
        // 1. length  2. index of @  3. user and domain
        // 4. first and last name  5. "Cohen, M."  6. first and last char
        System.out.println(email.length());

        int at = email.indexOf("@");
        System.out.println(at);

        //  m  a  y  a  .  c  o  h
        //  0  1  2  3  4  5  6  7

        String user = email.substring(0, at);
        String domain = email.substring(at + 1);

        System.out.println(user);
        System.out.println(domain);

        int dot = user.indexOf(".");
        String first = user.substring(0, dot);
        String last = user.substring(dot + 1);

        System.out.println(first);
        System.out.println(last);

        String formatted = last.substring(0, 1).toUpperCase()
                + last.substring(1) + ", "
                + first.substring(0, 1).toUpperCase() + ".";

        System.out.println(formatted);

        System.out.println(user.charAt(0));
        System.out.println(user.charAt(user.length() - 1));

        email = "sam.lee@yofhs.org";
        user = email.substring(0, email.indexOf("@"));
        System.out.println(user);

        email = "samlee@yofhs.org";
        user = email.substring(0, email.indexOf("@"));
        dot = user.indexOf(".");

        // StringIndexOutOfBoundsException, index -1, length 6
        first = user.substring(0, dot);
    }
}
