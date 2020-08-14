package com.mpdome.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mpdome.entity.SmbmsRole;
import com.mpdome.entity.SmbmsUser;

import java.util.List;

/**
 * (SmbmsUser)表数据库访问层
 *
 * @author lmz
 * @since 2020-08-11 15:21:46
 */
public interface SmbmsUserDao extends BaseMapper<SmbmsUser> {

    /**
     *查询所有的用户
     * @return 用户列表
     */
    SmbmsUser findUser();
}
