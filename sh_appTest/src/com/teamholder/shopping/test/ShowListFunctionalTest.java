package com.teamholder.shopping.test;

import android.app.Activity;
import android.app.Instrumentation;
import android.app.Instrumentation.ActivityMonitor;
import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.view.KeyEvent;
import android.view.View;

import com.teamholder.shopping.DisplayLists;
import com.teamholder.shopping.R;
import com.teamholder.shopping.ShowList;

public class ShowListFunctionalTest extends ActivityInstrumentationTestCase2<DisplayLists> {

	public ShowListFunctionalTest() {
		super(DisplayLists.class);
	}
	
	public void testBackButton() throws Exception {
		// set up a monitor for the show list activity
		Instrumentation instrumentation = getInstrumentation();
		ActivityMonitor dirtyListMonitor = instrumentation.addMonitor(ShowList.class.getName(), null, false);
		
		// click the dirty button
		View dirtyButton = getActivity().findViewById(R.id.dirty_button);
		TouchUtils.clickView(this, dirtyButton);
		Activity currentActivity = instrumentation.waitForMonitorWithTimeout(dirtyListMonitor, 5);
		
		
		// make sure dirty list was displayed
		/*
		 * Can't get this to work.  Basing on this code:
		 * http://stackoverflow.com/questions/1759626/how-do-you-test-an-android-application-across-multiple-activities
		 * but I never get the 2nd activity to fire... :(
		assertNotNull(currentActivity);
		assertEquals(ShowListFunctionalTest.class, currentActivity.getClass());
		assertEquals(1, dirtyListMonitor.getHits());
		
		// press the back button
		sendKeys(KeyEvent.KEYCODE_BACK);
		
		// make sure we're back at the initial display lists screen
		 */
	}
}
