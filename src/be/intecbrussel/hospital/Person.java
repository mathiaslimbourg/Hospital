package be.intecbrussel.hospital;

import be.intecbrussel.hospital.Gender;

public class Person {

    Title title;
    public String givenName;
    public String middlename;
    public String famelyname;
    public String homeAdress;
    Gender gender;

    //Constr
    public Person() {
    }
    public Person(Title title, String givenName, String middlename, String famelyname, String homeAdress, Gender gender) {
        this.title = title;
        this.givenName = givenName;
        this.middlename = middlename;
        this.famelyname = famelyname;
        this.homeAdress = homeAdress;
        this.gender = gender;
    }



    //Getters & setters


    public void setTitle(Title title) {
        this.title = title;
    }
    public Title getTitle() {
        return title;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getFamelyname() {
        return famelyname;
    }

    public void setFamelyname(String famelyname) {
        this.famelyname = famelyname;
    }

    public String getHomeAdress() {
        return homeAdress;
    }

    public void setHomeAdress(String homeAdress) {
        this.homeAdress = homeAdress;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return  "\n title = " + title +
                ",\n givenName = '" + givenName + '\'' +
                ",\n middlename = '" + middlename + '\'' +
                ",\n famelyname = '" + famelyname + '\'' +
                ",\n homeAdress = '" + homeAdress + '\'' +
                ",\n gender = " + gender + ",";
    }
}
