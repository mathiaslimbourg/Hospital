package be.intecbrussel.hospital;

import java.time.LocalDate;

public class FrontDeskStaff extends AdministrativeStaff {
    public FrontDeskStaff(Title title, String givenName, String middlename, String famelyname, String homeAdress, Gender gender, LocalDate joined) {
        super(title, givenName, middlename, famelyname, homeAdress, gender, joined);
    }
}
