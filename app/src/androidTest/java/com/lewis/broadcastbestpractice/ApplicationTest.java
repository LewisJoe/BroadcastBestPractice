package com.lewis.broadcastbestpractice;

import android.app.Application;
import android.test.ApplicationTestCase;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    public void test() throws Exception{
        final int expected = 1;
        final int reality = 1;
        assertEquals(expected, reality);
    }

    public void testAddActivity() throws Exception{
        assertEquals(0, ActivityCollector.activities.size());
        LoginActivity loginActivity = new LoginActivity();
        ActivityCollector.addActivity(loginActivity);
        assertEquals(1, ActivityCollector.activities.size());
        ActivityCollector.addActivity(loginActivity);
        assertEquals(1,ActivityCollector.activities.size());
    }
}