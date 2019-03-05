package be.intecbrussel.hospital;

import java.time.LocalDate;
import static be.intecbrussel.hospital.Gender.*;
import static be.intecbrussel.hospital.Title.*;

public class MainApp {
    public static void main(String[] args) {

        //pregnantwomen object
        PregnantWomen Pierre = new PregnantWomen(DR,"Pierre","La Blonde",
                "Ghy","Stonestreet",MAN,1.0,BloodType.A,
                LocalDate.of(1996,8,6),LocalDate.now());
        //genicoloog object
        Gynocologist Genicoloog = new Gynocologist(DR,"Julien", "Marcel", "Depauw",
                "LoserStraat",MAN,LocalDate.of(1993,8,19));

        Receptionist receptionist = new Receptionist(MV,"Margaritte","Odette","Vansteenkiste","Steenstraat",WOMAN,LocalDate.of(1977,3,9));

        System.out.println(Pierre.toString());
        System.out.println(Genicoloog.toString());

        System.out.println("Margaritte");
        System.out.println(receptionist.getPensionDate());
        System.out.println(receptionist.getDaysTillPension());
    }
}
