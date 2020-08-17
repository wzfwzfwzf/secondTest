package com.wzf.entity;

import java.io.Serializable;

/**
 * (TPoem)实体类
 *
 * @author makejava
 * @since 2020-08-16 12:33:34
 */
public class TPoem implements Serializable {
    private static final long serialVersionUID = 878056212981886151L;
    
    private String id;
    
    private String name;
    
    private String author;
    
    private String type;
    
    private String content;
    
    private String href;
    
    private String authordes;
    
    private String origin;
    
    private String categoryid;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getAuthordes() {
        return authordes;
    }

    public void setAuthordes(String authordes) {
        this.authordes = authordes;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid;
    }

}