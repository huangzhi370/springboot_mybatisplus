package com.hz.server.test.service.impl;

import com.hz.server.test.entity.User;
import com.hz.server.test.mapper.UserMapper;
import com.hz.server.test.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author huangzhi
 * @since 2021-05-31
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
