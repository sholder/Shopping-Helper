package com.teamholder.shopping.test;

import android.content.Intent;
import android.test.ActivityUnitTestCase;
import android.view.View;
import android.widget.Button;

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
	
	public void testCleanButton() {
		startActivity(new Intent(), null, null);

		View v = getActivity().findViewById(R.id.clean_button);
		getActivity().onClick(v);
		
		Intent intent = getStartedActivityIntent();
		assertNotNull(intent);
		String targetUrl = intent.getExtras().getString(DisplayLists.LIST_URL);
		assertNotNull(targetUrl);
		assertEquals("file:///android_asset/html/clean_15.html", targetUrl);		
	}
	
	public void testFullButton() {
		startActivity(new Intent(), null, null);

		View v = getActivity().findViewById(R.id.full_button);
		getActivity().onClick(v);
		
		Intent intent = getStartedActivityIntent();
		assertNotNull(intent);
		String targetUrl = intent.getExtras().getString(DisplayLists.LIST_URL);
		assertNotNull(targetUrl);
		assertEquals("file:///android_asset/html/full_list.html", targetUrl);
	}
	
	public void testUnknownButton() {
		startActivity(new Intent(), null, null);
		
		View dummyView = new Button(getActivity().getBaseContext());
		getActivity().onClick(dummyView);
		
		// should not have started anything
		assertNull(getStartedActivityIntent());
	}
}
