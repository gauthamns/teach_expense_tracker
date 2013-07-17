package com.gauthamns.expensetracker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
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
		// Obtain the views.
		EditText amountEdit = (EditText) findViewById(R.id.editText1);
		EditText noteEdit = (EditText) findViewById(R.id.editText2);

		// Obtain data from the views
		String amountStr = amountEdit.getText().toString();
		String note = noteEdit.getText().toString();
		long timeMillis = System.currentTimeMillis();

		// Get double of amount.
		if (TextUtils.isEmpty(amountStr)) {
			Toast.makeText(this, "Please enter the amount", Toast.LENGTH_SHORT)
					.show();
			return;
		}

		double amount = Double.valueOf(amountStr);

		// Show Expenses in ShowActivity.
		Intent i = new Intent(this, ShowActivity.class);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
