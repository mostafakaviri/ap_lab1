package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    MusicCollection jazz = new MusicCollection();
	    MusicCollection classic = new MusicCollection();
	    MusicCollection metal = new MusicCollection();
	    MusicCollection pop = new MusicCollection();
	    MusicCollection favorite = new MusicCollection();

	    jazz.addFile(new Music("1", "a", "jazz", "c:\\ a", "1998"));
	    jazz.addFile(new Music("2", "b", "jazz", "c:\\ b", "1999"));
	    jazz.addFile(new Music("3", "c", "jazz", "c:\\ c", "1997"));
	    jazz.addFile(new Music("4", "d", "jazz", "c:\\ d", "1995"));

	    System.out.println(jazz.getNumberOfFiles());

		Scanner scan = new Scanner(System.in);

	    jazz.listAllFiles();

	    System.out.println("Choose favorite: ");

	    int favoriteChoice = scan.nextInt();

	    favorite.addFile(jazz.listFile(favoriteChoice-1));

	    jazz.listFile(favoriteChoice-1).setFavorite(true);

	    favorite.listAllFiles();

	    jazz.removeFile(2);

		jazz.listAllFiles();

		int choice = scan.nextInt();

		jazz.startPlaying(choice-1);

		jazz.stopPlaying();

    }
}
