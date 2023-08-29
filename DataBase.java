import java.util.ArrayList;
import java.util.List;

public class DataBase {
    static List<User> userList = new ArrayList<>();

    public static List<User> getUserList() {
        return userList;
    }

    public static void setUserList(List<User> userList) {
        DataBase.userList = userList;
    }
}
