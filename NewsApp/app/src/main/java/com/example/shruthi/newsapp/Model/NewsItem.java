package com.example.shruthi.newsapp.Model;

/**
 * Created by Shruthi on 6/26/2017.
 */

public class NewsItem {
    private String title;
    private String author;
    private String description;
    private String published;
    private String url;

    public NewsItem(String title,String author,String description,String published,String url) {
        this.title = title;
        this.author=author;
        this.description=description;
        this.published=published;
        this.url=url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
