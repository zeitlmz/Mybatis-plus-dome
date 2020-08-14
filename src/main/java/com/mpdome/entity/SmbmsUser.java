package com.mpdome.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * (SmbmsUser)表实体类
 *
 * @author lmz
 * @since 2020-08-11 15:21:29
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuppressWarnings("serial")
public class SmbmsUser extends Model<SmbmsUser> {
    /**
     *主键ID
     */
    private Long id;
    /**
     *用户编码
     */
    private String usercode;
    /**
     *用户名称
     */
    private String username;
    /**
     *用户密码
     */
    private String userpassword;
    /**
     *性别（1:女、 2:男）
     */
    private Integer gender;
    /**
     *出生日期
     */
    private Object birthday;
    /**
     *手机
     */
    private String phone;
    /**
     *地址
     */
    private String address;

    /**
     *创建者（userId）
     */
    private Long createdby;
    /**
     *创建时间
     */
    private Date creationdate;
    /**
     *更新者（userId）
     */
    private Long modifyby;
    /**
     *更新时间
     */
    private Date modifydate;

    /**
     * 角色列表
     */
    private List<SmbmsRole> roles;



    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
