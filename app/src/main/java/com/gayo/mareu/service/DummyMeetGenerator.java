package com.gayo.mareu.service;

import com.gayo.mareu.model.Meet;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Date;
import java.util.List;


public class DummyMeetGenerator {

    public static List<Meet> DUMMY_MEET = Arrays.asList(
            new Meet("Reunion client 1", generateRandomDate(),"Salle 1", generateMailList(4)),
            new Meet("Point Dev.", generateRandomDate(),"Salle 1", generateMailList(3)),
            new Meet("Entretien embauche", generateRandomDate(),"Salle 1", generateMailList(5)),
            new Meet("Entretien personnel Kevin", generateRandomDate(),"Salle 1", generateMailList(2)),
            new Meet("Reunion client - projet ADEP", generateRandomDate(),"Salle 1", generateMailList(6))
    );

    static List<Meet> generateMeets(){return new ArrayList<>(DUMMY_MEET);}

    public static  List<String> DUMMY_MAIL = Arrays.asList(
            new String("pr.gaillot@gmail.com"),
            new String("lea.coul@yahoo.fr"),
            new String("tim.salme@lycos.fr"),
            new String("Muz.pauline@caramail.fr"),
            new String("cordonier.clement@ovh.net"),
            new String("clemence.cousin@hotmail.com"),
            new String("juliendubois@wanadoo.com"),
            new String("djill.achiba@aol.com"),
            new String("kevin.mille@alice.fr"),
            new String("benedictd@free.fr"),
            new String("thomas.denut@msn.com"),
            new String("angelique.s@essteam.fr")
            );

    /** Return a random list of Email
     * @param listLength
     */
    public static List<String > generateMailList(int listLength){
        int random_int = (int)Math.floor(Math.random()*(DUMMY_MAIL.size()-1)+1);
        List<String> mailList = Arrays.asList();
        for (int i = 0; i < listLength ; i++) {
            mailList.add(DUMMY_MAIL.get(random_int));
        }
        return mailList;
    };

    /** Return a Date
     */
    public static Date generateRandomDate(){
        Date date = new Date();
        return date;
    }

}
