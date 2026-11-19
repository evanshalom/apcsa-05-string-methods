public class PasswordValidator {
    public static void main(String[] args) {
        String stored = "Bluebird7";
        // attempt1 is exact, attempt2 has the wrong case, attempt3 is built with new.
        // Print the result of each comparison. No if statements yet: just print the boolean.

        String attempt1 = "Bluebird7";
        System.out.println(attempt1.equals(stored));

        String attempt2 = "bluebird7";
        System.out.println(attempt2.equals(stored));

        System.out.println(attempt2.toLowerCase().equals(stored.toLowerCase()));

        String attempt3 = new String("Bluebird7");
        System.out.println(attempt3 == stored);
        System.out.println(attempt3.equals(stored));

        String missing = null;
        System.out.println(stored.equals(missing));

        System.out.println("Miriam".compareTo("Noah"));
        System.out.println("Noah".compareTo("Miriam"));

        String name1 = "Alex";
        String name2 = "Brian";
        String name3 = "Chris";

        System.out.println(name1.compareTo(name2));
        System.out.println(name2.compareTo(name3));
        System.out.println(name3.compareTo(name1));
    }
}
