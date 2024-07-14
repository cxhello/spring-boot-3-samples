package top.cxhello.sso;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author cxhello
 * @date 2024/7/14
 */
public class BCryptPasswordEncoderTest {

    @Test
    void testEncode() {
         BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
         System.out.println(bCryptPasswordEncoder.encode("secret"));
         System.out.println(bCryptPasswordEncoder.encode("123456"));
    }

}
