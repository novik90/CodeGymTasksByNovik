package com.codegym.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
Kind Emma and the summer holidays

*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Schwarzenegger", df.parse("JULY 30 1947"));
        map.put("Al Pacino", df.parse("APRIL 25 1940"));
        map.put("Robert De Niro", df.parse("AUGUST 17 1943"));
        map.put("Jim Kerry", df.parse("JANUARY 17 1962"));
        map.put("Adam Sandler", df.parse("SEPTEMBER 9 1966"));
        map.put("Ben Affleck", df.parse("AUGUST 15 1972"));
        map.put("Tom Cruise", df.parse("JULY 3 1962"));
        map.put("Novikov Ivan", df.parse("JUNE 1 1990"));
        map.put("Brad Pitt", df.parse("DECEMBER 18 1963"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Date> entry = it.next();
            if(entry.getValue().getMonth() > 4 && entry.getValue().getMonth() < 8){
                it.remove();
            }
        }
    }

    public static void main(String[] args) throws ParseException {
        removeAllSummerPeople(createMap());
    }
}
