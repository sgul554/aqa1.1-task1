package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackerTest {
    @Test
    public void shouldCheckRemain() {
        CashbackHacker cashbackHacker = new CashbackHacker();
        assertEquals(100, cashbackHacker.remain(900));
    }
    @Test
    public void shouldCheckRemainIfAmountEqualToBoundary() {
        CashbackHacker cashbackHacker = new CashbackHacker();
        assertEquals(1000, cashbackHacker.remain(1000));
    }


}