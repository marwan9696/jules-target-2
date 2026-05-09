import java.util.List;

import java.util.Collections;

public class UserService extends BaseService {
    public List<String> getUsers(List<String> input) {
        if (input == null || input.isEmpty()) {
            return Collections.emptyList();
        }
        return input.subList(0, input.size());
    }
}
