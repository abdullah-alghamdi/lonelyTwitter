package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.Date;

/**
 * Created by aalghamd on 9/16/15.
 */
public abstract class Tweet extends Object implements Tweetable {

    private String text;
    protected Date date;

    public String getText() {
        return text;
    }

    public void setText(String text) throws IOException{

            if (text.length() <= 140) {
                this.text = text;
            } else {
                throw new IllegalArgumentException("Tweet was too long");
            }
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Tweet(String text, Date date) throws IOException {
        this.text = text;
        this.date = date;
    }
    public Tweet(String text) throws IOException{
        this.text = text;
        this.date = new Date();
    }

    public abstract boolean isImportant();
}
