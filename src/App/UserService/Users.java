package App.UserService;

import App.Entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Users {
    public static void UsersList(){
        List<User> users = new ArrayList<>();
        users.add(new User("Alex", "JohnAleif123@Gamail.com"));
        users.add(new User("Bob", "BobRob334@Gamail.com"));
        users.add(new User("Carol", "CarolR334@Gamail.com"));
        users.add(new User("David", "DavidR1234@Gamail.com"));
        users.add(new User("Eric", "Eric234@Gamail.com"));

        List<User> filteredUsers = users.stream()
                .filter(user -> user.getEmail().contains("123"))
                .collect(Collectors.toList());

        System.out.println("All users: ");
        System.out.println(users+ "\n");

        System.out.println("Users with '123' in email: ");
        filteredUsers.forEach(System.out::println);
    }
}