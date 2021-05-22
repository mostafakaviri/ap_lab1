package com.company;

public class Note {

    /**
     * note
     * @author Mostafa
     * @version 0.0
     */

    private String abstractNote;
    private String note;

    /**
     * constructor
     * @param abstractNote
     * @param note
     */

    public Note(String abstractNote, String note){
        this.note = note;
        this.abstractNote = abstractNote;
    }

    /**
     * getter
     * @return
     */

    public String getAbstractNote() {
        return abstractNote;
    }

    /**
     * getter
     * @return
     */
    public String getNote() {
        return note;
    }
}
