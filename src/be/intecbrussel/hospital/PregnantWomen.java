package be.intecbrussel.hospital;

import be.intecbrussel.hospital.Departement;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class PregnantWomen extends Patient   {
    LocalDate dateOfExpectedDelivery;
    public PregnantWomen(Title title, String givenName, String middlename, String famelyname, String homeAdress, Gender gender, double id, BloodType bloodType, LocalDate birthDate, LocalDate dateOfAddmission) {
        super(title, givenName, middlename, famelyname, homeAdress, gender, id, bloodType, birthDate, dateOfAddmission);
        this.dateOfExpectedDelivery = LocalDate.now().plusWeeks(40);
    }

    //toString

    public LocalDate getDateOfExpectedDelivery() {
        return dateOfExpectedDelivery;
    }

    public void setDateOfExpectedDelivery(LocalDate dateOfExpectedDelivery) {
        this.dateOfExpectedDelivery = dateOfExpectedDelivery;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n dateOfExpectedDelivery = " + dateOfExpectedDelivery;

    }
}
