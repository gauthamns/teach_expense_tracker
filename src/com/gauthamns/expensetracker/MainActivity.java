package com.gauthamns.expensetracker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

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
		// Obtain the views.
		EditText amountEdit = (EditText) findViewById(R.id.editText1);
		EditText noteEdit = (EditText) findViewById(R.id.editText3);
		DatePicker datePicker = (DatePicker) findViewById(R.id.datePicker1);

		// Obtain data from the views
		String amountStr = amountEdit.getText().toString();
		String note = noteEdit.getText().toString();
		int day = datePicker.getDayOfMonth();
		int month = datePicker.getMonth();
		int year = datePicker.getYear();

		// Show in a toast message using Toast.
		String text = "Amount: " + amountStr + "\nNote: " + note + "\nDate: "
				+ year + "/" + month + "/" + day;

		// Send the data to ShowActivity through an intent.
		Intent i = new Intent(this, ShowActivity.class);
		i.putExtra("amount", amountStr);
		i.putExtra("note", note);
		i.putExtra("day", day);
		i.putExtra("month", month);
		i.putExtra("year", year);

		// Toast.makeText(this, text, Toast.LENGTH_LONG).show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
