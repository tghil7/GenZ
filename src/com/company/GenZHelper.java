package com.company;

public class GenZHelper {

    public static boolean isGenZ(int year){
        if (year <= 1581){
            throw  new IllegalArgumentException();
        }
        return (year >= 1997 & year <= 2015);
    }

    public static void main(String[] args) {
	// write your code here
    }
}
