package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by aalghamd on 9/16/15.
 */
public class Sleepy extends Mood {


    public Sleepy(String mood, Date date) {
        super(mood, date);
    }

    public Sleepy(String mood) {
        super(mood);
    }

    public boolean isSleepy(){
        return Boolean.TRUE;

    }
}
