package com.company;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //instantiate all objects
        Director director=new Director("Directing", 15000000, "Jack","Hollywood");
        Actor ac1=new Actor("BatBoy", 90000000, "Bryce", "Gothic City");
        Actor ac2=new Actor("Amazing Lady", 30000000, "Gale", "Brazil");
        Actor ac3=new Actor("Great Lad", 75000000, "Clank", "DMV");
        PA pa1=new PA("Production", "Henry", "Wisconsin", 19, 19200);
        PA pa2=new PA("Production", "Naldo", "Spain", 20, 19200);
        PA pa3=new PA("Production", "Chris", "Dakota", 17, 15000);
        Crew cr1=new Crew("Visual Effects", 750000, "Ben", "Ohio");
        Crew cr2=new Crew("Music", 600000, "Moz", "Detroit");
        Person p1=new Person( "Joe", "Texas",15);

        //create actor and crew lists
        List<Actor> actorList=new ArrayList<>();
        List<Crew> crewList=new ArrayList<>();
        //add crews to the list
        crewList.add(pa1);
        crewList.add(pa2);
        crewList.add(pa3);
        crewList.add(cr1);
        crewList.add(cr2);
        //add actors to the list
        actorList.add(ac1);
        actorList.add(ac1);
        actorList.add(ac1);
        //create Movie object
        Movie movie=new Movie("Equity League", "Action", director, 300000000, 3500000,actorList,crewList);

        movie.payDay();
        //print values after payDay
        DecimalFormat fm = new DecimalFormat("#,###");//to format doubles with commas
        System.out.println("Title:"+movie.title
                            +"\nBudget:$"+fm.format(movie.budget)+"   Total amount spent:$"+fm.format(movie.moneySpent)+"   Total earned:$"+fm.format(movie.moneyEarned)+"    Total profit:$"+fm.format(movie.profit)
                            +"\nDirector: "+director.name+"($"+fm.format(director.pay)+" + royalties:$"+fm.format(director.royalty)+")"
                            +"\nactors: "+ac1.role+","+ac2.role+","+ac3.role
                            +"\nPAs: "+pa1.name+"($"+fm.format(pa1.pay)+"), "+pa2.name+"($"+fm.format(pa2.pay)+"), "+pa3.name+"($"+fm.format(pa3.pay)+")"
                            +"\nCrew members: "+cr1.name+"($"+fm.format(cr1.pay)+"), "+cr2.name+"($"+fm.format(cr2.pay)+")");
    }
}
