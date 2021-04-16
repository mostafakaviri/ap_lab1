package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        VotingSystem election = new VotingSystem();

        ArrayList<String> choices1 = new ArrayList<String>();

        choices1.add("Are");
        choices1.add("Na");
        choices1.add("Shayad");

        election.createVoting("Mammad?",0,choices1);

        ArrayList<String> choices2 = new ArrayList<String>();

        choices2.add("Are");
        choices2.add("Na");
        choices2.add("Shayad");

        election.createVoting("Naser?",0,choices2);

        election.printListOfVoting();

        System.out.println("...................................");

        election.printVoting(1);

        System.out.println("...................................");

        ArrayList<String> rai1 = new ArrayList<String>();
        rai1.add("Are");
        //rai1.add("Na");

        ArrayList<String> rai2 = new ArrayList<String>();
        rai2.add("Na");

        election.vote(1, new Person("Mostafa1", "Kaviri1"), rai1);
        election.vote(1, new Person("Mostafa2", "Kaviri2"), rai1);
        election.vote(1, new Person("Mostafa3", "Kaviri3"), rai1);
        election.vote(1, new Person("Mostafa4", "Kaviri4"), rai2);
        election.vote(1, new Person("Mostafa5", "Kaviri5"), rai2);
        election.vote(1, new Person("Mostafa5", "Kaviri5"), rai2);

        election.printResult(1);

    }
}
