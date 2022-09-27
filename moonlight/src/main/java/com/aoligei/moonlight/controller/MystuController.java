package com.aoligei.moonlight.controller;

import com.aoligei.moonlight.entity.Mystu;
import com.aoligei.moonlight.model.PageModel;
import com.aoligei.moonlight.service.IMystuService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author yuyang
 * @since 2022-09-27
 */
@RestController
public class MystuController {

    @Resource
    private IMystuService mystuService;

    /**
     * 分页查询
     */
    @GetMapping("/myPage")
    public Page<Mystu> testPage(@RequestBody(required = false) PageModel pageModel) {
        pageModel = new PageModel();
        pageModel.setPageNum(1);
        pageModel.setPageSize(1);
        Page page = new Page(pageModel.getPageNum(), pageModel.pageSize);
        LambdaQueryWrapper queryWrapper = new LambdaQueryWrapper<Mystu>().select(Mystu::getId, Mystu::getName);
        mystuService.page(page, queryWrapper);
        return page;
    }

}
