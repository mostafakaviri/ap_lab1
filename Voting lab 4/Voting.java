package com.company;
import java.util.*;

public class Voting {

    private int type;
    private String question;
    private ArrayList<Person> voters;
    private HashMap<String, HashSet<Vote>> choices;

    public Voting(int type, String question) {
        this.question = question;
        this.type = type;
        voters = new ArrayList<Person>();
        this.choices = new HashMap<String, HashSet<Vote>>();
    }

    public String getQuestion() {
        return question;
    }

    public int getType() {
        return type;
    }

    public ArrayList<Person> getVoters() {
        return voters;
    }

    public HashMap<String, HashSet<Vote>> getPolls() {
        return choices;
    }

    public void createChoice(String choice){

        choices.put(choice, new HashSet<Vote>());
    }

    public void vote(Person person, ArrayList<String> intChoices ){

        if (type == 0 && intChoices.size() == 1){

        }
        else if (type == 1){

        }
        else {
            System.out.println("Every one can only one vote");
            return;
        }

        if (voters.contains(person) == false){
            voters.add(person);
            for (int i = 0; i < intChoices.size(); i++){
                if (choices.containsKey(intChoices.get(i))){
                    choices.get(intChoices.get(i)).add(new Vote(person,new Date()));
                }
            }
        }
        else {
            System.out.println("Every one can vote once.");
            System.out.println("..........................");
        }
    }

    public void print(){
        for (Map.Entry<String, HashSet<Vote>> entry : choices.entrySet()) {
            Iterator<Vote> it = entry.getValue().iterator();
            System.out.println(entry.getKey() + " : ");
            while (it.hasNext())
                System.out.println(" " + it.next().getPerson());
        }
    }

}
