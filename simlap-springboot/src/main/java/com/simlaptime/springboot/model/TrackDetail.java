package com.simlaptime.springboot.model;


import javax.persistence.*;
@Entity
@Table(name = "trackdetail")
public class TrackDetail {
    
    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getCountry() {
        return country;
    }


    public void setCountry(String country) {
        this.country = country;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column (name = "name")
    private String name;

    @Column (name="country")
    private String country;


    public TrackDetail(){

    }


    public TrackDetail(Long id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    
}
