package com.byui.thf;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void data_Input_valid() {
        Sales s1 = new Sales();
        s1.account_id.hash = "h5";
        s1.account_id.salt = 5;
        assertEquals(s1.account_id.salt, 5);
    }
}
