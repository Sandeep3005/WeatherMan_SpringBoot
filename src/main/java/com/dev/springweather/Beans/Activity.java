package com.dev.springweather.Beans;

public class Activity {
    private String activity;
    private String type;
    private Integer participants;
    private Integer price;
    private String link;
    private String key;
    private Float accessibility;

    public String getActivity() {
        return activity;
    }
    public void setActivity(String activity) {
        this.activity = activity;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Integer getParticipants() {
        return participants;
    }
    public void setParticipants(Integer participants) {
        this.participants = participants;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
    public Float getAccessibility() {
        return accessibility;
    }
    public void setAccessibility(Float accessibility) {
        this.accessibility = accessibility;
    }
}
