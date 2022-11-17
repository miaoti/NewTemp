package edu.baylor.cs.se.hibernate.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Book {
    @Id
    @GeneratedValue
    @Column(name = "bookId", nullable = false)
    private Long bookId;


    @Column(name = "name")
    private String name;

   @Column(name = "authername")
   private String authername;

   @Column(name = "date")
   private String date;

    @Column(name = "copy")
    private int copy;

    public Long getStudentId() {
        return bookId;
    }

    public void setStudentId(Long studentId) {
        this.bookId = studentId;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
     {
         this.name = name;
     }

    public String getAuthername() {
        return authername;
    }

    public void setAddress(String authername) {
        this.authername = authername;
    }

    public int getCopy() {
        return copy;
    }

    public void setCopy(int copy) {
        this.copy = copy;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
