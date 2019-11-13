package com.zking.mybatis01.model;

import lombok.ToString;

import java.util.List;
import java.util.Objects;

/**
 * @author Administrator
 * @create 2019-11-1314:06
 */
@ToString(exclude = "news")
public class TCategory {
    private Integer categoryId;
    private String categoryName;

    private List<TNews> news;

    public List<TNews> getNews() {
        return news;
    }

    public void setNews(List<TNews> news) {
        this.news = news;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TCategory tCategory = (TCategory) o;
        return Objects.equals(categoryId, tCategory.categoryId) &&
                Objects.equals(categoryName, tCategory.categoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryId, categoryName);
    }
}
