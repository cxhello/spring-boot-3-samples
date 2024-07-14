package top.cxhello.sso.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import jakarta.annotation.Resource;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import top.cxhello.sso.entity.SysUser;
import top.cxhello.sso.service.SysUserService;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author cxhello
 * @date 2024/7/14
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Resource
    private SysUserService sysUserService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser sysUser = sysUserService.getOne(Wrappers.<SysUser>lambdaQuery().eq(SysUser::getUsername, username));
        List<SimpleGrantedAuthority> grantedAuthorityList = Stream.of("USER").map(SimpleGrantedAuthority::new).toList();
        return new User(username, sysUser.getPassword(), grantedAuthorityList);
    }

}
