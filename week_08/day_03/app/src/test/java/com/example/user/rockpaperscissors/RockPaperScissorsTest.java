package com.example.user.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by user on 24/01/2018.
 */

public class RockPaperScissorsTest {

    RockPaperScissors rockPaperScissors;

    @Before
    public void before(){
        rockPaperScissors = new RockPaperScissors();
    }

    @Test
    public void canGetList(){
        assertEquals(3, rockPaperScissors.getList().size());
    }

    @Test
    public void canGetRandomAnswer(){
        String expected = rockPaperScissors.getRandomAnswer();
        assertNotNull(expected);
    }

    @Test
    public void rockBeatsScissors(){
        String playerAnswer = "Rock";
        String computerAnswer = "Scissor";
        assertEquals("player wins", rockPaperScissors.checkWin(playerAnswer, computerAnswer));
    }

    @Test
    public void paperBeatsRock(){
        String playerAnswer = "Rock";
        String computerAnswer = "Paper";
        assertEquals("computer wins", rockPaperScissors.checkWin(playerAnswer, computerAnswer));
    }
    @Test
    public void checkDraw(){
        String playerAnswer = "Rock";
        String computerAnswer = "Rock";
        assertEquals("It's a draw, play again", rockPaperScissors.checkWin(playerAnswer, computerAnswer));
    }
}
