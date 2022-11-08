package com.company;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    protected String title;
    protected String genre;
    protected Director director;
    protected List<Actor> actorList;
    protected List<Crew> crewList;
    protected double budget;//this is a random number passed to the object
    protected double moneySpent;
    protected double moneyEarned;//this is a random number passed to the object
    protected double profit;

    //default constructor
    public Movie(){}

    //custom constructor: instantiate all variables
    public Movie(String title, String genre, Director director, double budget, double moneyEarned,List<Actor> actorList,List<Crew> crewList){
        this.title=title;
        this.genre=genre;
        this.director=director;
        this.budget=budget;
        this.moneyEarned=moneyEarned;
        this.moneySpent=0;
        this.profit=0;
        this.actorList = actorList;
        this.crewList= crewList;
    }

    public void payDay(){
        //pay each actor
        for(Actor actor: actorList){
            double expense = actor.pay;
            actor.totalEarned+=expense;
            moneySpent+=expense;
        }
        //pay each crew member
        for(Crew crew: crewList){
                double expense=crew.pay;
                crew.totalEarned+=expense;
                moneySpent+=expense;
        }
        //pay director
        director.royalty=moneyEarned*0.01;//royalty is based on box office amount (moneyEarned)
        director.totalEarned+=director.pay+director.royalty;
        moneySpent+=director.pay+director.royalty;

        //calculate profit after paying everyone
        calculateProfit();
    }

    public void calculateProfit(){
        profit=budget+moneyEarned-moneySpent;
    }

    //Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getMoneySpent() {
        return moneySpent;
    }

    public void setMoneySpent(double moneySpent) {
        this.moneySpent = moneySpent;
    }

    public double getMoneyEarned() {
        return moneyEarned;
    }

    public void setMoneyEarned(double moneyEarned) {
        this.moneyEarned = moneyEarned;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }
}
