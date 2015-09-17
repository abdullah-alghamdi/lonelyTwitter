package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by aalghamd on 9/16/15.
 */
public abstract class Mood extends Object{



    private String mood;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    protected Date date;

    public Mood(String mood, Date date) {
        this.mood = mood;
        this.date = date;
    }
    public Mood(String mood){
        this.mood = mood;
        this.date = new Date();
    }

    public abstract boolean isSleepy();
}
