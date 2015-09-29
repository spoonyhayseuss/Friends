package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class i_friends_d_i_viewFriendBadgesDailyClimb extends ActivityInstrumentationTestCase2 {
    private Solo solo;

    private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.fitbit.onboarding.landing.LandingActivity";

    private static Class<?> launcherActivityClass;
    static{
        try {
            launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public i_friends_d_i_viewFriendBadgesDailyClimb() throws ClassNotFoundException {
        super(launcherActivityClass);
    }

    public void setUp() throws Exception {
        super.setUp();
        solo = new Solo(getInstrumentation());
        getActivity();
    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
        super.tearDown();
    }

    public void testRun() {
        //Wait for activity: 'com.fitbit.onboarding.landing.LandingActivity_'
        solo.waitForActivity("LandingActivity_", 500);

        //Click on ImageView
        solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));


        //Click on Friends
        solo.clickOnText("Friends");
        solo.sleep(500);

        solo.clickOnText("7 DAY STEPS");

        solo.clickOnText("Show Inactive Friends");
        solo.clickOnText("Aaron W.");
        solo.sleep(500);


        solo.clickOnText("DAILY CLIMB");
        solo.clickOnText("Redwood Forest");

        solo.clickOnText("Redwood Forest");
        solo.clickOnText("25 floors in a day");
        solo.clickOnText("The tallest trees on Earth can't top the heights");
        solo.clickOnText("Earned 17 times");
        solo.clickOnText("Last earned on August 28, 2014");



    }
}
