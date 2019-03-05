package be.intecbrussel.hospital;

import java.time.LocalDate;

public class Receptionist extends FrontDeskStaff {
    public Receptionist(Title title, String givenName, String middlename, String famelyname, String homeAdress, Gender gender, LocalDate joined) {
        super(title, givenName, middlename, famelyname, homeAdress, gender, joined);
    }

    @Override
    public String toString() {
        return super.toString() +  "joined = " + joined;
    }
}
