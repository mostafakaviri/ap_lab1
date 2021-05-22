package com.company;
import com.sun.nio.sctp.SctpSocketOption;

import java.io.*;
import java.util.*;

/**
 * user
 * @author Mostafa
 * @version 0.0
 */

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
        FileWriter fileWriter = new FileWriter (String.format("%s.txt", name));
        fileWriter.close();

        FileWriter fileWriter2 = new FileWriter (String.format("%s.txt", name), true);
        for (int i = 0; i < notes.size(); i++){
            fileWriter2.write (notes.get(i).getAbstractNote() + "\n");
            fileWriter2.write (notes.get(i).getNote()+ '\n');
        }
        fileWriter2.close();
    }

    /**
     * load notes
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public void loadNote() throws IOException{

        File file = new File(String.format("%s.txt", name));
        FileReader fr = new FileReader(file);   //reads the file
        BufferedReader br = new BufferedReader(fr);  //creates a buffering character input stream
        StringBuffer exAbsNot = new StringBuffer();    //constructs a string buffer with no characters
        StringBuffer exNot = new StringBuffer();
        String line;
        int count = 0;
        while((line=br.readLine())!=null) {

            if (count == 0){
                exAbsNot.append(line);

                count++;
            }
            else if (count == 1) {
                exNot.append(line);

                notes.add(new Note(exAbsNot.toString(), exNot.toString()));
                count = 0;
                exAbsNot.delete(0, exAbsNot.capacity());
                exNot.delete(0, exNot.capacity());
            }
        }
        fr.close();    //closes the stream and release the resources
    }
}

