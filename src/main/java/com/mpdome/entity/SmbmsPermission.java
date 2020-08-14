package com.mpdome.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * (SmbmsPermission)表实体类
 *
 * @author lmz
 * @since 2020-08-11 15:21:29
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuppressWarnings("serial")
public class SmbmsPermission extends Model<SmbmsPermission> {
    @TableId
    private Integer pid;
    private String permission;

    @Override
    public String toString() {
        return permission;
    }
}
