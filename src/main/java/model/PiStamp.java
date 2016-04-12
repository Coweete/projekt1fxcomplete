package model;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Created by jonatan on 2016-04-11.
 */

public class PiStamp implements Serializable {


    private String lastName;
    private String fristName;
    private Calendar date;
    private boolean checkIn;

    public PiStamp(){

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFristName() {
        return fristName;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public boolean isCheckIn() {
        return checkIn;
    }

    public void setCheckIn(boolean checkIn) {
        this.checkIn = checkIn;
    }

    @Override
    public String toString() {
        return "PiStamp{" +
                "lastName='" + lastName + '\'' +
                ", fristName='" + fristName + '\'' +
                ", date=" + date +
                ", checkIn=" + checkIn +
                '}';
    }
}
