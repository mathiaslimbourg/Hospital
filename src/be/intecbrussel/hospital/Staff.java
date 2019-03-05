package be.intecbrussel.hospital;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Staff extends Person {

    LocalDate joined;



    public Staff(Title title, String givenName, String middlename, String famelyname, String homeAdress, Gender gender, LocalDate joined) {
        super(title, givenName, middlename, famelyname, homeAdress, gender);
        this.joined = joined;
    }

    public LocalDate getJoined() {
        return joined;
    }

    public void setJoined(LocalDate joined) {
        this.joined = joined;
    }


    //methods

    public int getWorkDays(){
       int workdays = LocalDate.now().getDayOfYear() -  getJoined().getDayOfYear();
        return workdays;
    }
    public int getWorkYears(){
        int workYears = LocalDate.now().getYear() -  getJoined().getYear();
        return workYears;
    }
    public LocalDate getPensionDate(){
        LocalDate pensionDate = getJoined().plusYears(42);

        return pensionDate;
    }
    public long getDaysTillPension(){

        long pensionDaysTill = ChronoUnit.DAYS.between(LocalDate.now(),getPensionDate());
        return pensionDaysTill;
    }

    @Override
    public String toString() {
        return super.toString() + "\n joined=" + joined +",";
    }
}
