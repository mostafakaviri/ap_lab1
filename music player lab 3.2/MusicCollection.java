package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * A class to hold details of audio files.
 *
 * @author David J. Barnes and Michael K�lling
 * @version 2011.07.31
 */
public class MusicCollection
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<Music> files;
    // A player for the music files.
    private MusicPlayer player;

    /**
     * Create a MusicCollection
     */
    public MusicCollection()
    {
        this.files = new ArrayList<Music>();
        this.player = new MusicPlayer();
    }

    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(Music filename)
    {
        files.add(filename);
    }

    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }

    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public Music listFile(int index)
    {
        if (validIndex(index)){
            System.out.println(files.get(index).getName());
            return files.get(index);
        }
        return null;
    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        for (int i = 0; i < files.size(); i++){
            System.out.print(i+1 + ". ");
            System.out.println(files.get(i).getName());
        }
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if (validIndex(index)){
            files.remove(files.get(index));
        }

    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        if (validIndex(index)){
            player.startPlaying(files.get(index));
        }
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }


    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index)
    {
        if (index < files.size()){
            return true;
        }
        else{
            System.out.println("Index is not valid");
            return false;
        }

    }

    /**
     * find string in name of file
     * @param name to search
     * @return
     */
    public Music findName(String name){
        for (int i = 0; i < files.size(); i++){
            if (files.get(i).getName() == name){
                return files.get(i);
            }
        }
        return null;
    }
}