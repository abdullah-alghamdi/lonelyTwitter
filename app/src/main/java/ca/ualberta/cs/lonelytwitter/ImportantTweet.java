package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.Date;

/**
 * Created by aalghamd on 9/16/15.
 */
public class ImportantTweet extends Tweet {



    public ImportantTweet(String tweet, Date date) throws IOException{
        super(tweet, date);
        this.setText(tweet);
        this.date = date;
    }

    public ImportantTweet(String text) throws IOException{
        super(text);
    }

    public boolean isImportant(){
        return Boolean.TRUE;
    }


    public String getText(){
        return "!!!" + super.getText();
    }
}
