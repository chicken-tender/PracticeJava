package 템플릿메소드;
import java.util.Map;

public abstract class ConnectionManager {
    protected abstract Map<String, String> decodedInfo(Map<String, String> rawUserInfo);
    protected abstract boolean authentication(String username, String password);
    protected abstract int authorization(String username);
    protected abstract Object getConnection(String username, int authority);

    public Object requestConnection(Map<String, String> rawUserInfo) {
        // 1. 암호화 된 유저 정보 복호화
        final Map<String, String> userInfo = decodedInfo(rawUserInfo);
        final String username = userInfo.get("username");
        final String password = userInfo.get("password");
        // 2. 아이디와 패스워드 인증
        if(!authentication(username,password)) {
            throw new RuntimeException("인증 실패!");
        }
        // 3. 권한 확인
        final int authority = authorization(username);
        // 4. 서비스 접속
        return getConnection(username,authority);
    }
}
