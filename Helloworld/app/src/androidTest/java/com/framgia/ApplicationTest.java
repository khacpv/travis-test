package com.framgia;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.test.ApplicationTestCase;
import android.test.MoreAsserts;
import android.test.suitebuilder.annotation.LargeTest;
import android.test.suitebuilder.annotation.SmallTest;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<MainApplication> {

    MainApplication mainApplication;

    public ApplicationTest() {
        super(MainApplication.class);
    }

    public void testSayHello(){
        assertEquals(true,true);
    }

    public void testSayBye(){
        assertEquals(false, false);
    }

    protected void setUp() throws Exception {
        super.setUp();
        createApplication();
        mainApplication = getApplication();

    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        this.mainApplication = null;
    }

    public void testCorrectVersion() throws Exception {
        PackageInfo info = mainApplication.getPackageManager().getPackageInfo(mainApplication.getPackageName(), 0);
        assertNotNull(info);
        MoreAsserts.assertMatchesRegex("\\d\\.\\d", info.versionName);
    }
}