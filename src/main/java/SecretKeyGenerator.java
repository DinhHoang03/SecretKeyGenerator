import io.jsonwebtoken.io.Encoders;

import java.security.SecureRandom;

public class SecretKeyGenerator {
    public static void main(String[] args) {
        byte[] key = new byte[64]; // 512-bit cho HS512
        new SecureRandom().nextBytes(key);

        //Base64 encode
        String base64Key = Encoders.BASE64.encode(key);
        System.out.println("Base64 Standard Key:");
        System.out.println(base64Key);

        System.out.println();

        //Base64URL encode
        String base64UrlKey = Encoders.BASE64URL.encode(key);
        System.out.println("Base64 Url Key:");
        System.out.println(base64UrlKey);
    }
}
