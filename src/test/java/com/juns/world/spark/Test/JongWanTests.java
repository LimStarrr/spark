package com.juns.world.spark.Test;

import org.junit.Test;

import java.util.Random;

public class JongWanTests {

    @Test
    public void randomTestPageKa() {
        final int COUNT = 10000000;
        int[] hitArray = {0, 0, 0, 0, 0, 0, 0};

        for (int i = 0 ; i < COUNT; i++)
            hitArray[random7() - 1]++;


        for (int i = 0 ; i < hitArray.length; i++)
            System.out.println("value" + (i+1) + " : " + ((double)hitArray[i] / COUNT));
    }

    public int random5() {
        final Random random = new Random();
        return random.nextInt(5) + 1;
    }

    public int random7() {
        int[] sevenArray = {0, 0, 0, 0, 0, 0, 0};
        for (int i = 0 ; i < sevenArray.length; i ++) {
            sevenArray[i] = ((random5() + i) % 7) + 1;
        }
        int totalValue = 0;
        for (int i = 0 ; i < sevenArray.length ; i++)
            totalValue += sevenArray[i];

        return (totalValue % 7) + 1;
    }
}
