package com.mpdome.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mpdome.entity.SmbmsUser;
import com.mpdome.service.SmbmsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

/**
 * (SmbmsUser)表控制层
 *
 * @author lmz
 * @since 2020-08-11 16:54:19
 */
@Controller
@RequestMapping("smbmsUser")
public class SmbmsUserController extends ApiController {
    /**
     * 服务对象
     */
    @Autowired
    private SmbmsUserService smbmsUserService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @return 所有数据
     */
    @GetMapping("/selectAll")
    @ResponseBody
    public R selectAll(Page<SmbmsUser> page) {

        return success(this.smbmsUserService.page(page));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.smbmsUserService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param smbmsUser 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody SmbmsUser smbmsUser) {
        return success(this.smbmsUserService.save(smbmsUser));
    }

    /**
     * 修改数据
     *
     * @param smbmsUser 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody SmbmsUser smbmsUser) {
        return success(this.smbmsUserService.updateById(smbmsUser));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.smbmsUserService.removeByIds(idList));
    }
}
