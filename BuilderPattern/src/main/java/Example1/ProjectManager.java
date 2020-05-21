package Example1;

/**
 * @description:项目经理
 * @author: zhanhongyu
 * @date: 2020/5/21
 * @time: 11:55 上午
 * Copyright (C) 2015
 * All rights reserved
 */
public class ProjectManager {
    private Decorator builder;
    public ProjectManager(Decorator builder) {
        this.builder = builder;
    }
    //产品构建与组装方法
    public Parlour decorate() {
        builder.buildWall();
        builder.buildTV();
        builder.buildSofa();
        return builder.getResult();
    }

}
