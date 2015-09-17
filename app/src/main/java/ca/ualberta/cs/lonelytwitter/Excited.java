package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by aalghamd on 9/16/15.
 */
public class Excited  extends Mood{
    public Excited(String mood, Date date) {
        super(mood, date);
    }

    public Excited(String mood) {
        super(mood);
    }

    public boolean isSleepy(){
        return Boolean.FALSE;
    }
}
