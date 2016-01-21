package com.framgia;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by khacpham on 1/21/16.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity activity;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        activity = getActivity();
    }

    public void testActivityCreated() throws Exception{
        assertNotNull(activity);
    }
}
