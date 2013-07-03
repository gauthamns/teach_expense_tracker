package com.gauthamns.expensetracker;

import java.util.Calendar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

/**
 * @author gauthamns
 * 
 */
public class ShowActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_show);

		Intent i = getIntent();
		double amount = i.getDoubleExtra("amount", 0);
		String note = i.getStringExtra("note");
		long time = i.getLongExtra("date", System.currentTimeMillis());

		TextView amountText = (TextView) findViewById(R.id.textView1);
		TextView noteText = (TextView) findViewById(R.id.textView2);
		TextView dateText = (TextView) findViewById(R.id.textView3);

		// Set the values.
		amountText.setText(String.valueOf(amount));
		noteText.setText(note);

		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(time);
		dateText.setText(cal.getTime().toString());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.show, menu);
		return true;
	}
}
