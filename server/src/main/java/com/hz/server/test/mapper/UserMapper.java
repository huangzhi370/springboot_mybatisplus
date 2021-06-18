package com.hz.server.test.mapper;

import com.hz.server.test.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author huangzhi
 * @since 2021-05-31
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
