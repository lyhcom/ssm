package com.zking.mybatis01.model;

import lombok.ToString;

import java.util.List;
import java.util.Objects;

/**
 * @author Administrator
 * @create 2019-11-1314:06
 */
@ToString(exclude = "categorys")
public class TNews {

    private Integer newsId;
    private String title;

    private List<TCategory> categorys;

    public List<TCategory> getCategorys() {
        return categorys;
    }

    public void setCategorys(List<TCategory> categorys) {
        this.categorys = categorys;
    }

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TNews tNews = (TNews) o;
        return Objects.equals(newsId, tNews.newsId) &&
                Objects.equals(title, tNews.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newsId, title);
    }
}
