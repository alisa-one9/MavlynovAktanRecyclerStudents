package com.example.mavlynovaktanrecyclerstudents;

import java.io.Serializable;

public class Day implements Serializable {


    private int dayImage;
    private String name_day;

    private String plan_text;

    public Day(String name_day,int dayImage) {
        this.name_day = name_day;
        this.dayImage = dayImage;
    }


    public Day(String plan_text) {

        this.plan_text = plan_text;
    }



    public int getDayImage() {  return dayImage;
    }

    public void setDayImage(int dayImage) {
        this.dayImage = dayImage;
    }

    public String getName_day() {
        return name_day;
    }

    public void setName_day(String name_day) {
        this.name_day = name_day;
    }

    public String getPlan_text() {
        return plan_text;
    }

    public void setPlan_text(String plan_text) {
        this.plan_text = plan_text;
    }
}
