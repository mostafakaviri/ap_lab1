package com.company;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.*;

public class VotingSystem {

    ArrayList<Voting> votingList;

    public VotingSystem(){
        votingList = new ArrayList<Voting>();
    }

    public void createVoting(String question, int type, ArrayList<String> choices){
        Voting voting = new Voting(type, question);

        if (votingList.contains(voting)){
            System.out.println("This voting already exist");
            return;
        }

        for (int i = 0; i < choices.size(); i++){
            voting.createChoice(choices.get(i));
        }
        votingList.add(voting);
    }

    public void printListOfVoting() {
        for (int i = 0; i < votingList.size(); i++){
            System.out.println(i+1 + ". " + votingList.get(i).getQuestion());
        }
    }

    public void printVoting(int choice){
        System.out.println(votingList.get(choice-1).getQuestion());
        for (Map.Entry<String, HashSet<Vote>> entry : votingList.get(choice-1).getPolls().entrySet()){
            System.out.println(entry.getKey());
        }
    }

    public void vote(int poll, Person person, ArrayList<String> choice){
        votingList.get(poll-1).vote(person, choice);
    }

    public void printResult(int pool){
        int allVotes = 0;

        for (Map.Entry<String, HashSet<Vote>> entry : votingList.get(pool-1).getPolls().entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue().size());
            allVotes += entry.getValue().size();
        }

        System.out.println("...................................");

        System.out.println("All votes : " + allVotes);
    }


}
