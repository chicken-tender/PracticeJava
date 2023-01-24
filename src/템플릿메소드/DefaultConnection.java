package 템플릿메소드;
import java.util.Map;

public class DefaultConnection extends ConnectionManager {
    @Override
    protected Map<String, String> decodedInfo(Map<String, String> rawUserInfo) {
        System.out.println("유저 정보 복호화");
        final Map<String, String> encodedUserInfo = rawUserInfo;
        return encodedUserInfo;
    }

    @Override
    protected boolean authentication(String username, String password) {
        System.out.println("유저 정보 인증 확인");
        if("yang".equals(username)) return true;
        return false;
    }

    @Override
    protected int authorization(String username) {
        System.out.println("권한 정보 확인");
        int authority = 0;
        if("yang".equals(username)) {
            authority = 1;
        }
        switch(authority) {
            case 0 : System.out.println("- 권한 : 일반 사용자"); break;
            case 1 : System.out.println("- 권한 : 관리자"); break;
            case 2 : System.out.println("- 권한 : 슈퍼 관리자"); break;
            case 3 : System.out.println("- 권한 : 올바르지 않은 권한"); break;
        }
        return authority;
    }

    @Override
    protected Object getConnection(String username, int authority) {
        System.out.println(username + " 접속!");
        final Object connectionObj = new Object();
        return connectionObj;
    }
}
