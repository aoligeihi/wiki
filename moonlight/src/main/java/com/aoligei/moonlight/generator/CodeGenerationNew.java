package com.aoligei.moonlight.generator;


import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.DateType;

import java.util.Collections;

public class CodeGenerationNew {

    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/testtwo?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8", "root", "mysql")
                .globalConfig(builder -> {
                    builder.author("yuyang") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .dateType(DateType.TIME_PACK)
                            .commentDate("yyyy-MM-dd")
                            .outputDir("D://demo"); // 指定输出目录
                })
                .packageConfig(builder -> {
                   builder.parent("com.dongmu.mybatisplus")
                            .moduleName("blog")
                            .entity("pojo")
                            .service("service")
                            .serviceImpl("service.impl")
                            .mapper("mapper")
                            .xml("mapper.xml")
                            .controller("controller")
                            .other("other")
                            .pathInfo(Collections.singletonMap(OutputFile.mapper, "D://"))
                            .build();
                })
                .strategyConfig(builder -> {
                    builder.addInclude("mystu") // 设置需要生成的表名
                            .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                .templateConfig(builder -> {
                    builder.disable(TemplateType.ENTITY)
                            .entity("/templates/entity.java")
                            .service("/templates/service.java")
                            .serviceImpl("/templates/serviceImpl.java")
                            .mapper("/templates/mapper.java")
                            .controller("/templates/controller.java")
                            .build();
                })
//                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }

}
