package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void shouldCheckRemain() {

        assertEquals(cashbackHackService.remain(900), 100);
    }

    @Test
    public void shouldCheckRemainIfAmountEqualToBoundary() {
        assertEquals(cashbackHackService.remain(1000), 0);

    }
}