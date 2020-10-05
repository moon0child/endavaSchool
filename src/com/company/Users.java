package com.company;
import java.util.Date;

class Users {
    public enum Status {ACTIVE, INACTIVE, BLOCKED, NEW ;};
    private Status status;
    private String firstname;
    private String lastname;
    private int age;
    private String email;
    private Date date;


    Users(String firstname, String lastname, int age, String email, Status status, Date date){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.email = email;
        this.status = status;
        this.date = date;
    }

    public String getFirstname()
    {
        return firstname;
    }
    public void setFirstname()
    {
        this.firstname=firstname;

    }
    public String getLastname()
    {
        return lastname;
    }
    public void setLastname()
    {
        this.lastname=lastname;

    }
    public int getAge()
    {
        return age;
    }
    public void setAge()
    {
        this.age=age;

    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail()
    {
        this.email=email;

    }
    public Status getStatus( )
    {
        return status;
    }
    public void setStatus(Status status1)
    {
        this.status=status1;

    }
    public Date getDate()
    {
        return date;
    }
    public void setDate()
    {
        this.date=date;

    }
    public String toString(){
        return this.firstname+ " "+this.lastname+ "," +getAge() +" years" +"|||" +getStatus() +" ||| "+ this.date;
    }
}