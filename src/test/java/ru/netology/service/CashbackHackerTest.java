package ru.netology.service;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CashbackHackerTest {
    CashbackHackService hacker = new CashbackHackService();

    @Test
public void cashbackTest(){

        int actual = hacker.remain(100);
        int expected = 900;

Assert.assertEquals(actual, expected);

    }
}
