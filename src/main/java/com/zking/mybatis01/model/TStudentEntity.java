package com.zking.mybatis01.model;

import com.zking.mybatis01.util.PinYinUtil;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * @author Administrator
 * @create 2019-11-0422:53
 */
public class TStudentEntity {

    private Integer sid;

    @NotBlank(message = "姓名不能为空")
    private String sname;

    @NotNull(message = "年龄不能为空")
    private Integer age;

    private String remark;

    private String snamePinyin;


    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
        this.snamePinyin = PinYinUtil.toPinyin(sname);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSnamePinyin() {
        return snamePinyin;
    }

    public void setSnamePinyin(String snamePinyin) {
        this.snamePinyin = snamePinyin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TStudentEntity that = (TStudentEntity) o;
        return Objects.equals(sid, that.sid) &&
                Objects.equals(sname, that.sname) &&
                Objects.equals(age, that.age) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(snamePinyin, that.snamePinyin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, sname, age, remark, snamePinyin);
    }

    @Override
    public String toString() {
        return "TStudentEntity{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", age=" + age +
                ", remark='" + remark + '\'' +
                ", snamePinyin='" + snamePinyin + '\'' +
                '}';
    }
}
