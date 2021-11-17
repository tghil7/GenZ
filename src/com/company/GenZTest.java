package com.company;

import static org.junit.jupiter.api.Assertions.*;

class GenZTest {


    @org.junit.jupiter.api.Test
    void isGenZMinValue() {
        assertThrows(IllegalArgumentException.class,
                () -> GenZHelper.isGenZ(Integer.MIN_VALUE), "Min Value is outside of the Gregorian calendar.");
    }

    @org.junit.jupiter.api.Test
    void isGenZMinPlusOne(){
        assertThrows(IllegalArgumentException.class,
                () ->GenZHelper.isGenZ(Integer.MIN_VALUE + 1));
    }

    @org.junit.jupiter.api.Test
    void isGenZMaxMinusOne(){
        assertEquals(false, GenZHelper.isGenZ(Integer.MAX_VALUE - 1));
    }

    @org.junit.jupiter.api.Test
    void isGenZMax(){
       assertEquals(false, GenZHelper.isGenZ(Integer.MAX_VALUE));
    }

    @org.junit.jupiter.api.Test
    void isGenZ1581() {
        assertThrows(IllegalArgumentException.class,
                () -> GenZHelper.isGenZ(1581), "1581 is outside of the Gregorian calendar.");
    }

    @org.junit.jupiter.api.Test
    void isGenZ1582(){
        assertEquals(false,GenZHelper.isGenZ(1582), "People born in 1582 are not Gen Z. ");
    }

    @org.junit.jupiter.api.Test
    void isGenZ1583(){
        assertEquals(false,GenZHelper.isGenZ(1583), "People born in 1583 are not Gen Z. ");
    }

    @org.junit.jupiter.api.Test
    void isGenZ1996(){
        assertEquals(false,GenZHelper.isGenZ(1996), "People born in 1996 are not Gen Z ");
    }

    @org.junit.jupiter.api.Test
    void isGenZ1997(){
        assertEquals(true,GenZHelper.isGenZ(1997), "People born in 1997 are Gen Z! ");
    }

    @org.junit.jupiter.api.Test
    void isGenZ1998(){
        assertEquals(true,GenZHelper.isGenZ(1998), "People born in 1998 are Gen Z! ");
    }

    @org.junit.jupiter.api.Test
    void isGenZ2014(){
        assertEquals(true,GenZHelper.isGenZ(2014), "People born in 2014 are Gen Z! ");
    }

    @org.junit.jupiter.api.Test
    void isGenZ2015(){
        assertEquals(true,GenZHelper.isGenZ(2015), "People born in 2015 are Gen Z! ");
    }

    @org.junit.jupiter.api.Test
    void isGenZ2016(){
        assertEquals(false,GenZHelper.isGenZ(2016), "People born in 2016 are not Gen Z ");
    }

}