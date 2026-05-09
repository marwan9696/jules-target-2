import java.util.*;

public class UserServiceTest {
    public static void main(String[] args) {
        UserService service = new UserService();

        // Test null
        try {
            List<String> result = service.getUsers(null);
            if (result != null && result.isEmpty()) {
                System.out.println("Test null: PASSED");
            } else {
                System.out.println("Test null: FAILED");
            }
        } catch (Exception e) {
            System.out.println("Test null: FAILED with exception " + e.getMessage());
        }

        // Test empty
        try {
            List<String> result = service.getUsers(new ArrayList<>());
            if (result != null && result.isEmpty()) {
                System.out.println("Test empty: PASSED");
            } else {
                System.out.println("Test empty: FAILED");
            }
        } catch (Exception e) {
            System.out.println("Test empty: FAILED with exception " + e.getMessage());
        }

        // Test with data
        try {
            List<String> input = Arrays.asList("a", "b");
            List<String> result = service.getUsers(input);
            if (result != null && result.size() == 2 && result.get(0).equals("a")) {
                System.out.println("Test data: PASSED");
            } else {
                System.out.println("Test data: FAILED");
            }
        } catch (Exception e) {
            System.out.println("Test data: FAILED with exception " + e.getMessage());
        }
    }
}
