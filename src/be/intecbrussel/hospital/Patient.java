package be.intecbrussel.hospital;

import java.time.LocalDate;

public class Patient extends Person {
    double id;
    BloodType bloodType;

    LocalDate birthDate;
    int age;
    //private String[] presciptions;
    LocalDate DateOfAddmission;


    //Constructor
    public Patient(Title title, String givenName, String middlename, String famelyname, String homeAdress, Gender gender, double id, BloodType bloodType, LocalDate birthDate, LocalDate dateOfAddmission) {
        super(title, givenName, middlename, famelyname, homeAdress, gender);
        this.id = id;
        this.bloodType = bloodType;
        this.birthDate = birthDate;
        this.age = LocalDate.now().getYear() - birthDate.getYear();
        this.DateOfAddmission = dateOfAddmission;
    }

    //Getters en setters
    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {


        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public LocalDate getDateOfAddmission() {
        return DateOfAddmission;
    }

    public void setDateOfAddmission(LocalDate dateOfAddmission) {
        DateOfAddmission = dateOfAddmission;
    }

    //toString


    @Override
    public String toString() {
        return
                "\n id = " + id +
                ",\n DateOfAddmission = " + DateOfAddmission +
                ",\n title = '" + title + '\'' +
                ",\n givenName = '" + givenName + '\'' +
                ",\n middlename ='" + middlename + '\'' +
                ",\n famelyname ='" + famelyname + '\'' +
                ",\n homeAdress ='" + homeAdress + '\'' +
                ",\n bloodType = " + bloodType +
                ",\n birthDate = " + birthDate +
                ",\n age = " + age +
                ",\n gender = " + gender + ",";

    }
}
