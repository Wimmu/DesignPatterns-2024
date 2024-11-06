package Assignment_12_Proxy;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        AccessControlService accessService = AccessControlService.getInstance();

        User wilma = new User("wilma");
        User soni = new User("soni");

        // Create documents
        library.addUnprotectedDocument("doc1", "Excel Sheet");
        library.addProtectedDocument("doc2", "Passwords");
        library.addProtectedDocument("doc3", "Secrets");
        library.addUnprotectedDocument("doc4", "Photos");

        accessService.grantAccess("doc2", "soni");
        accessService.grantAccess("doc3", "wilma");

        try {
            System.out.println("- Document 1: " + library.getDocument("doc1").getContent(wilma));
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("- Document 2: " + library.getDocument("doc2").getContent(wilma));
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("- Document 3: " + library.getDocument("doc3").getContent(wilma));
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("- Document 4: " + library.getDocument("doc4").getContent(wilma));
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }
    }
}

