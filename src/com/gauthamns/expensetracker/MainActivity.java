package com.gauthamns.expensetracker;

import java.util.Calendar;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	/**
	 * Lifecycle method.
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	/**
	 * Called when the button is clicked. This method has been declared in the
	 * android:onClick property of the button in the layout.
	 * 
	 * @param v
	 */
	public void onSaveExpense(View v) {

		String amountStr = "";
		String note = "";

		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(System.currentTimeMillis());

		// Obtain the views.
		EditText amountEdit = (EditText) findViewById(R.id.editText1);
		EditText noteEdit = (EditText) findViewById(R.id.editText2);

		// Obtain data from the views
		amountStr = amountEdit.getText().toString();
		note = noteEdit.getText().toString();

		// Show in a toast message using Toast.
		String text = "Amount: " + amountStr + "\nNote: " + note + "\nDate: "
				+ cal.getTime().toString();
		Toast.makeText(this, text, Toast.LENGTH_LONG).show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
