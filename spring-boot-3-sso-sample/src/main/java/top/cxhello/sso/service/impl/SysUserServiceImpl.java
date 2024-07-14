package top.cxhello.sso.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.cxhello.sso.entity.SysUser;
import top.cxhello.sso.mapper.SysUserMapper;
import top.cxhello.sso.service.SysUserService;

/**
 * @author cxhello
 * @date 2024/7/14
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

}
