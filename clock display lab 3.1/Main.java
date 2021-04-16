package com.company;

public class Main {

    public static void main(String[] args) {

        ClockDisplay clock = new ClockDisplay(5,24,56);

	    for (int i = 0; i < 4000; i++){
	        clock.timeTick();
            System.out.println(clock.getTime());
        }
    }
}
