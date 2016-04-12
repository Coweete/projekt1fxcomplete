package model;

/**
 * Created by Jonatan Fridsten on 2016-04-07.
 */
public class RfidKey {
    private String key;

    public RfidKey(String key){
        this.key = key;
    }

    public void setRfidKey(String key){
        this.key = key;
    }

    public String getRfidKey(){
        return this.key;
    }
}
