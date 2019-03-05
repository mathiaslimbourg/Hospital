package be.intecbrussel.hospital;

import java.time.LocalDate;

public class Gynocologist extends Doctor {

    private String speciality = "Babies babies babies";

    public Gynocologist(Title title, String givenName, String middlename, String famelyname, String homeAdress, Gender gender, LocalDate joined) {
        super(title, givenName, middlename, famelyname, homeAdress, gender, joined);
    }

    @Override
    public String toString() {

        return super.toString() + "\n speciality='" + speciality + '\'';
    }

}
