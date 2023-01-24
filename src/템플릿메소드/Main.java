package 템플릿메소드;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        final ConnectionManager cm = new DefaultConnection();

        final Map<String,String> userInfo = new HashMap<>();
        userInfo.put("username", "yang");
        userInfo.put("password", "yangkongmi");

        final Object connectionObj = cm.requestConnection(userInfo);
    }
}
