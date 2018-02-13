package com.myblog.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/2/10.
 */
public class Myreading implements Serializable{
    private Integer id;
    private String title;
    private String author;
    private String bookIndex;
    private String rentDate;
    private String returnDate;

    @Override
    public String toString() {
        return "Myreading{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", bookIndex='" + bookIndex + '\'' +
                ", rentDate='" + rentDate + '\'' +
                ", returnDate='" + returnDate + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getBookIndex() {
        return bookIndex;
    }

    public void setBookIndex(String bookIndex) {
        this.bookIndex = bookIndex;
    }

    public String getRentDate() {
        return rentDate;
    }

    public void setRentDate(String rentDate) {
        this.rentDate = rentDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
}
