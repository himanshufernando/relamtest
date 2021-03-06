package tkhub.project.relamtest;

import io.realm.RealmObject;
import io.realm.annotations.Ignore;

/**
 * Created by Himanshu on 3/15/2017.
 */

public class User extends RealmObject {

    private String          name;
    private int             age;
    private int             id;
    private int             amount;
    private int             sex;

    @Ignore
    private int             sessionId;

    // Standard getters & setters generated by your IDE…
    public String getName() { return name; }
    public void   setName(String name) { this.name = name; }
    public int    getAge() { return age; }
    public void   setAge(int age) { this.age = age; }
    public int    getSessionId() { return sessionId; }
    public void   setSessionId(int sessionId) { this.sessionId = sessionId; }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}