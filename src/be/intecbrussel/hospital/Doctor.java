package be.intecbrussel.hospital;

import java.time.LocalDate;

public class Doctor extends OperationStaff {


    public Doctor(Title title, String givenName, String middlename, String famelyname, String homeAdress, Gender gender, LocalDate joined) {
        super(title, givenName, middlename, famelyname, homeAdress, gender, joined);
    }
}
