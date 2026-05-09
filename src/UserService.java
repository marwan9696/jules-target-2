import java.util.List;

public class UserService {
    public List<String> getUsers(List<String> input) {
        // Bug: throws NullPointerException when input is null or empty
        return input.subList(0, input.size());
    }
}
