package com.waldoro.models;

import java.util.Date;
import org.springframework.data.annotation.Id;

/**
 * Created by wrokita on 15/11/2016.
 */
public class Event {

    public Event() {}
    public Event(double lat, double lon, long id, String title, String authorNickName, String mail, String description, String category, String level) {
        this.latitude = lat;
        this.longitude = lon;
        this.id = String.valueOf(id);
        this.title = title;
        this.authorNickName = authorNickName;
        this.mail = mail;
        this.description = description;
        this.category = category;
        this.level = level;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorNickName() {
        return authorNickName;
    }

    public void setAuthorNickName(String authorNickName) {
        this.authorNickName = authorNickName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getValidFromDate() {
        return validFromDate;
    }

    public void setValidFromDate(Date validFromDate) {
        this.validFromDate = validFromDate;
    }

    public Date getValidToDate() {
        return validToDate;
    }

    public void setValidToDate(Date validToDate) {
        this.validToDate = validToDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }


    private double latitude;

    private double longitude;

    @Id
    private String id;

    private String title;

    private String authorNickName;

    private String mail;

    private String description;

    private Date validFromDate;

    private Date validToDate;

    private String category;

    private String level;
}
