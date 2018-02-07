package com.example.allymcgilloway.robot;

import com.example.user.robot.Robot;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class RobotTest {

    Robot robot;

    @Before
    public void before() {

        robot = new Robot("C3PO", "Gold");
    }

    @Test
    public void canCheckBattery() {
        assertEquals(100.0, robot.checkBattery(), 0.1);
    }

    @Test
    public void canMakeDrink() {

        assertEquals("I am making tea", robot.makeDrink("tea"));
    }
}

//
//    passes in the name of the drink being made e.g. tea
//        uses up 10% of the battery life
//        returns the string "I am making" + drink
//        String washDishes()
//
//        uses up 30% of battery life
//        returns the string "I am washing the dishes"
//        String doDusting()
//
//        uses up 20% of the battery life
//        returns the string "I am dusting"
//        void rechargeBattery()
//
//        resets battery to 100.0
