package com.zking.mybatis01.vo;

import com.zking.mybatis01.model.TStudentEntity;

import java.util.List;

/**
 * VO对象一般用于传递参数，或存放页面显示的视图数据，与数据库中的表
 * 并不存在对应关系，这一点是与model或entity不同的地方。不同使用
 * VO对象则看个人的习惯
 *
 * @author Administrator
 * @create 2019-11-0623:22
 */
public class StudentVO extends TStudentEntity {

    private List<Integer> sids;

    public List<Integer> getSids() {
        return sids;
    }

    public void setSids(List<Integer> sids) {
        this.sids = sids;
    }
}
