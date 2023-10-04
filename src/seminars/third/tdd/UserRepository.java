package seminars.third.tdd;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();

    public void addUser(User user) {
        if (!this.data.contains(user)) {
            user.authenticate(user.name, user.password);
            this.data.add(user);
        }
    }

    public void unLoginNoAdmins() {
        for (int i = 0; i < this.data.size(); i++) {
            if (!this.data.get(i).isAdmin) {
                this.data.get(i).isAuthenticate = false;
                this.data.remove(i);
            }
        }

    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

}