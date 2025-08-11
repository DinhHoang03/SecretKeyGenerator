import io.jsonwebtoken.io.Encoders;

import java.security.SecureRandom;

public class SecretKeyGenerator {
    public static void main(String[] args) {
        byte[] key = new byte[64]; // 512-bit cho HS512
        new SecureRandom().nextBytes(key);
        String base64Key = Encoders.BASE64.encode(key);
        System.out.println(base64Key);
    }
}
