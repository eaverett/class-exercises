package edu.macalester.cs124;

import java.awt.Font;
import java.util.Random;

import acm.program.ConsoleProgram;

public class HeadlineGenerator extends ConsoleProgram {
    private final Random rand = new Random();
    
    public void run() {
        setFont(new Font("Helvetica Neue", Font.BOLD, 24));
        
        println("Breaking news!!");
        for(int n = 0; n < 100; n++)
            println(headline() + "!");
    }
    
    public String headline() {
        switch(rand.nextInt(10)) {
            case  1: return person() + " TO WED " + person();
            case  2: return person() + " ANNOUNCES " + issue() + " PLAN";
            case  3: return person() + " ESCAPES FROM " + place();
            case  4: return person() + " SPOTTED NEAR " + place();
            case  5: return person() + " DECRIES " + issue();
            case  6: return person() + " ATTACKS " + place();
            case  7: return issue() + " CLAIMS " + person();
            case  8: return person() + " SUES " + person() + " OVER " + issue();
            case  9: return headline() + " AS " + headline();
            default: return place() + " SUCCUMBS TO " + issue();
        }
    }


    public String person() {
        switch(rand.nextInt(19)) {
            case  1: return "OBAMA";
            case  2: return "LOCAL TEACHER";
            case  3: return "OLYMPIAN";
            case  4: return "LADY GAGA";
            case  5: return "RIHANNA";
            case  6: return "BAT BOY";
            case  7: return "DIANA ROSS";
            case  8: return "CLINTON";
            case  9: return "ELLEN DEGENERES";
            case 10: return "PUTIN";
            case 11: return "OPRAH";
            case 12: return "WAITRESS";
            case 13: return "SWIM COACH";
            case 14: return "JUDO CHAMPION";
            case 15: return "LOCH NESS MONSTER";
            case 16: return "EINSTEIN";
            case 17: return "TOOTH FAIRY";
            case 18: return "JUSTIN BIEBER";
            default: return "POPE";
        }
    }
    
    private String place() {
        switch(rand.nextInt(12)) {
            case  1: return "FLORIDA";
            case  2: return "EARTH";
            case  3: return "MARS";
            case  4: return "THE NORTH POLE";
            case  5: return "LOCAL GAS STATION";
            case  6: return "CLEVELAND";
            case  7: return "VIENNA SAUSAGE FACTORY";
            case  8: return "TURCK HALL";
            case  9: return "MADAGASCAR";
            case 10: return "SPAM MUSEUM";
            case 11: return person() + "'S BASEMENT";
            default: return "MALL OF AMERICA";
        }
    }

    private String issue() {
        switch(rand.nextInt(15)) {
            case  1: return "CLIMATE CHANGE";
            case  2: return "GOLD TOOTH SHORTAGE";
            case  3: return "ALIEN INVASION";
            case  4: return "GOLD TOOTH SHORTAGE";
            case  5: return "ROAD IMPROVEMENTS";
            case  6: return "FLYING CAR";
            case  7: return "HUMAN CLONING";
            case  8: return "PUN PANDEMIC";
            case  9: return "SHOELACE COMBUSTION";
            case 10: return "DEFICIT REDUCTION";
            case 11: return "FASHION AWARENESS";
            case 12: return "VOTER TURNOUT";
            case 13: return person() + "'S PLASTIC SURGERY";
            case 14: return person() + "'S PREGNANCY";
            default: return "SECRET EXPERIMENT";
        }
    }

}
