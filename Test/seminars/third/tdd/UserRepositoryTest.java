package seminars.third.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    @Test
    void unLoginNoAdmins() {
        UserRepository userRepository = new UserRepository();
        userRepository.addUser(new User("Boss", "ImTheKingOfTheKING777", true));
        userRepository.addUser(new User("Waiter", "iHateMyJob", false));
        userRepository.addUser(new User("Counter", "IHateTaxes", true));
        userRepository.addUser(new User("Security", "INeedNewJob", false));

        userRepository.unLoginNoAdmins();

        assertTrue(userRepository.findByName("Boss"));
        assertFalse(userRepository.findByName("Waiter"));
        assertTrue(userRepository.findByName("Counter"));
        assertFalse(userRepository.findByName("Security"));
    }
}