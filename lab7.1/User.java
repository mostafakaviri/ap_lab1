package com.company;
import com.sun.nio.sctp.SctpSocketOption;

/**
 * user
 * @author Mostafa
 * @version 0.0
 */

import java.io.*;
import java.util.*;

public class User {

    private String name;
    private ArrayList<Note> notes;

    /**
     * constructor
     * @param name
     */

    public User(String name){
        this.name = name;
        notes = new ArrayList<>();
    }

    /**
     * remove all notes
     */

    public void removeAllNotesFromRam(){
        notes.removeAll(notes);
    }

    /**
     * getter notes
     * @return
     */

    public ArrayList<Note> getNotes() {
        return notes;
    }

    /**
     * add note
     * @param note
     * @throws IOException
     */

    public void addNote(Note note) throws IOException {
        notes.add(note);
    }

    /**
     * remove note
     */

    public void removeNote(){
        int a = chooseNote();
        notes.remove(notes.get(a));
    }

    /**
     * choose note
     * @return choice
     */

    public int chooseNote(){
        int res = 0;
        for (int i = 0; i < notes.size(); i++){
            System.out.print((i+1) + ". ");
            System.out.println(notes.get(i).getAbstractNote());
        }

        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        res = choice -1;
        return res;
    }

    /**
     * print note
     * @param choice to print
     */

    public void printNote(int choice){
        System.out.println(notes.get(choice).getAbstractNote());
        System.out.println("Note:");
        System.out.println(notes.get(choice).getNote());
    }

    /**
     * save notes.
     * @throws IOException
     */

    public void saveNote() throws IOException{
        FileOutputStream fileWriter = new FileOutputStream(String.format("%s.txt", name));

        ObjectOutputStream out = new ObjectOutputStream(fileWriter);

        for (int i = 0; i <notes.size(); i++){
            out.writeObject(notes.get(i));
        }
        fileWriter.close();
    }

    /**
     * load notes
     * @throws IOException
     * @throws ClassNotFoundException
     */

    public void loadNote() throws IOException, ClassNotFoundException {

        FileInputStream fileReader = new FileInputStream(String.format("%s.txt", name));
        ObjectInputStream in = new ObjectInputStream(fileReader);
        Object c;
        while ((c = in.readObject()) != null){
            System.out.println("ann");
            notes.add((Note) c);
        }
    }
}

