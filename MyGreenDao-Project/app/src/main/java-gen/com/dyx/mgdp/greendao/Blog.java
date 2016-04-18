package com.dyx.mgdp.greendao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "BLOG".
 */
public class Blog {

    private Long id;
    /** Not-null value. */
    private String author;
    /** Not-null value. */
    private String tab;
    /** Not-null value. */
    private String comment;
    private java.util.Date date;

    public Blog() {
    }

    public Blog(Long id) {
        this.id = id;
    }

    public Blog(Long id, String author, String tab, String comment, java.util.Date date) {
        this.id = id;
        this.author = author;
        this.tab = tab;
        this.comment = comment;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getAuthor() {
        return author;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setAuthor(String author) {
        this.author = author;
    }

    /** Not-null value. */
    public String getTab() {
        return tab;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setTab(String tab) {
        this.tab = tab;
    }

    /** Not-null value. */
    public String getComment() {
        return comment;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setComment(String comment) {
        this.comment = comment;
    }

    public java.util.Date getDate() {
        return date;
    }

    public void setDate(java.util.Date date) {
        this.date = date;
    }

}