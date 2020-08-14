import com.baomidou.mybatisplus.core.MybatisSqlSessionFactoryBuilder;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mpdome.dao.SmbmsUserDao;
import com.mpdome.entity.SmbmsPermission;
import com.mpdome.entity.SmbmsRole;
import com.mpdome.entity.SmbmsUser;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.lf5.util.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;

// @RunWith(SpringJUnit4ClassRunner.class)
// @ContextConfiguration("classpath:applicationContext.xml")
public class test01 {
    // @Autowired
    // private SmbmsUserService smbmsUserService;
    //
    // @Test
    // public void test01() {
    //     QueryWrapper<SmbmsUser> wrapper = new QueryWrapper<>();
    //     wrapper.eq("userCode", "admin").eq("userPassword", "lmz123456");
    //     SmbmsUser smbmsUser = smbmsUserService.getBaseMapper().selectOne(wrapper);
    //     System.out.println(smbmsUser);
    // }

    @Test
    public void test02() throws IOException {
        String path = "mp-config.xml";
        InputStream stream = Resources.getResourceAsStream(path);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        SmbmsUserDao mapper = sqlSession.getMapper(SmbmsUserDao.class);
        SmbmsUser smbmsUser = mapper.findUser();
        System.out.print(smbmsUser.getUsername() + "\t所有角色：");
        System.out.println(smbmsUser.getRoles());
    }

    @Test
    public void test03() {
        UUID uuid = UUID.randomUUID();
        String u = uuid.toString();
        System.out.println(u);
    }
}
