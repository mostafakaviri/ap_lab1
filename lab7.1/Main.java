package com.company;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        User mammad = new User("mammad");
        mammad.addNote(new Note("1", "11"));
        mammad.addNote(new Note("2", "22"));
        mammad.addNote(new Note("3", "33"));
        mammad.addNote(new Note("4", "44"));
        mammad.addNote(new Note("5", "55"));
        mammad.addNote(new Note("6", "66"));

        mammad.saveNote();
        mammad.removeAllNotesFromRam();

        try {
            mammad.loadNote();
        } catch (EOFException e){

        }
        int a = mammad.chooseNote();
        mammad.printNote(a);

        mammad.removeNote();

        mammad.saveNote();
        a = mammad.chooseNote();

        mammad.printNote(a);
    }
}
