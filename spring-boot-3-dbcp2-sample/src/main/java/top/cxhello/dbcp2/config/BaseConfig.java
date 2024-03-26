package top.cxhello.dbcp2.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author cxhello
 * @date 2024/3/26
 */
@Configuration
@ConfigurationProperties(prefix = "base")
public class BaseConfig {

    /**
     * 用户名
     */
    private String name = "";

    /**
     * 密码
     */
    private String password = "";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
