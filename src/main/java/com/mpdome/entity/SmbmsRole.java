package com.mpdome.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * (SmbmsRole)表实体类
 *
 * @author lmz
 * @since 2020-08-11 15:21:29
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuppressWarnings("serial")
public class SmbmsRole extends Model<SmbmsRole> {
    /**
     *主键ID
     */
    private Long id;
    /**
     *角色编码
     */
    private String rolecode;
    /**
     *角色名称
     */
    private String rolename;

    /**
     * 权限列表
     */
    private List<SmbmsPermission> permissions;

    @Override
    public String toString() {
        return rolename +", 所有的权限：" + permissions;
    }

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
