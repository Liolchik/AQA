public class PassDomain {
    public static void main(String[] args) {
        String emailAddress = "john_smith@example.com";
        String login = emailAddress.substring(0, 9);
        String domain = emailAddress.substring(11);
        System.out.println("login: " + (login));
        System.out.println("domain: " + (domain));

    }
}
