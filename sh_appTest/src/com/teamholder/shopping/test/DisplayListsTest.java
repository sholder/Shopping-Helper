package com.teamholder.shopping.test;

import android.content.Intent;
import android.test.ActivityUnitTestCase;
import android.view.View;

import com.teamholder.shopping.DisplayLists;
import com.teamholder.shopping.R;

public class DisplayListsTest extends ActivityUnitTestCase<DisplayLists> {

	public DisplayListsTest() {
		super(DisplayLists.class);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testDirtyButton() {
		startActivity(new Intent(), null, null);

		View v = getActivity().findViewById(R.id.dirty_button);
		getActivity().onClick(v);
		
		Intent intent = getStartedActivityIntent();
		assertNotNull(intent);
		String targetUrl = intent.getExtras().getString(DisplayLists.LIST_URL);
		assertNotNull(targetUrl);
		assertEquals("file:///android_asset/html/dirty_dozen.html", targetUrl);
	}
}
