package com.mpdome.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mpdome.dao.SmbmsUserDao;
import com.mpdome.entity.SmbmsUser;
import com.mpdome.service.SmbmsUserService;
import org.springframework.stereotype.Service;

/**
 * (SmbmsUser)表服务实现类
 *
 * @author lmz
 * @since 2020-08-11 16:39:41
 */
@Service("smbmsUserService")
public class SmbmsUserServiceImpl extends ServiceImpl<SmbmsUserDao, SmbmsUser> implements SmbmsUserService {

}
