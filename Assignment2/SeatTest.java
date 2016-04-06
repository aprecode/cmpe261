package com.company;

import org.junit.Test;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by emirhankutlu on 22/02/16.
 */
public class SeatTest extends Seat {

    @Test
    public void testMain() throws Exception {
        Seat seat = new Seat("A",10,4);
        int output = seat.getNumber();
        double output2 = seat.getPrice();
        assertEquals(4,output);
        assertEquals(10,output2);


    }

    @Test
    public void testSetPrice() throws Exception {

    }

    @Test
    public void testGetPrice() throws Exception {

    }

    @Test
    public void testSetNumber() throws Exception {

    }

    @Test
    public void testGetNumber() throws Exception {

    }

    @Test
    public void testSetType() throws Exception {

    }

    @Test
    public void testGetType() throws Exception {

    }

    @Test
    public void testToString() throws Exception {

    }

    @Test
    public void testTotalSales() throws Exception {

    }
}