package com.framgia.espresso;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.framgia.MainActivity;
import com.framgia.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by FRAMGIA\pham.van.khac on 22/01/2016.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityEspresso {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void buttonShouldUpdateText(){
        onView(withId(R.id.button1)).perform(click());
        onView(withId(getResourceId("button1"))).check(matches(withText(getResourceStr(R.string.calc))));
    }

    private static int getResourceId(String s){
        Context targetContext = InstrumentationRegistry.getTargetContext();
        String packageName = targetContext.getPackageName();
        return targetContext.getResources().getIdentifier(s, "id", packageName);
    }

    private static String getResourceStr(int id){
        Context targetContext = InstrumentationRegistry.getTargetContext();
        return targetContext.getResources().getString(id);
    }
}
