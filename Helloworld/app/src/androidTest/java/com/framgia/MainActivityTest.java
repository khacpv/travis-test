package com.framgia;

import android.app.Instrumentation;
import android.support.test.annotation.UiThreadTest;
import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.test.ViewAsserts;
import android.view.View;
import android.widget.Button;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by khacpham on 1/21/16.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private Instrumentation mInstrumentation;
    MainActivity activity;

    View button1;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        setActivityInitialTouchMode(false);

        mInstrumentation = getInstrumentation();
        activity = getActivity();
        button1 = activity.findViewById(R.id.button1);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testActivityCreated() throws Exception{
        assertNotNull(activity);
    }

    public void testButton1Click() throws Exception{
        Instrumentation.ActivityMonitor activityMonitor =
                mInstrumentation.addMonitor(MainActivity.class.getName(),
                        null, false);
        assertNotNull(button1);
        assertEquals("Calculate", ((Button) button1).getText().toString());

        View mainActivityDecorView = activity.getWindow().getDecorView();
        ViewAsserts.assertOnScreen(mainActivityDecorView, button1);

//        TouchUtils.clickView(this, button1);

//        MainActivity activity = (MainActivity)activityMonitor.getLastActivity();
//        assertNotNull(activity);

        // Check the Activity has loaded
//        assertEquals("Monitor button click:", 1, activityMonitor.getHits());

        getInstrumentation().removeMonitor(activityMonitor);
    }
}
