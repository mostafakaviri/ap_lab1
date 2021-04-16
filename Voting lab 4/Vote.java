package com.company;
import ir.huri.jcal.JalaliCalendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Vote {

    Person person;
    JalaliCalendar date;

    public Vote(Person person, Date intDate){

        //Date d = new Date();
        this.person = person;
        this.date = new JalaliCalendar(new GregorianCalendar(intDate.getYear(),intDate.getMonth(),intDate.getDay()));
    }

    public Person getPerson() {
        return person;
    }

    public JalaliCalendar getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vote vote = (Vote) o;
        return Objects.equals(person, vote.person) && Objects.equals(date, vote.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, date);
    }
}
