import io.jsonwebtoken.io.Encoders;

import java.security.SecureRandom;
import java.util.logging.Logger;

public class SecretKeyGenerator {
    private static final Logger log = Logger.getLogger(SecretKeyGenerator.class.getName());

    public static void main(String[] args) {
        byte[] key = new byte[64]; // 512-bit cho HS512
        new SecureRandom().nextBytes(key);

        //Base64 encode
        String base64Key = Encoders.BASE64.encode(key);
        log.info("Base64 Standard Key:");
        System.out.println(base64Key);

        //Base54URL encode
        String base64UrlKey = Encoders.BASE64URL.encode(key);
        log.info("Base64 Url Key:");
        System.out.println(base64UrlKey);
    }
}
