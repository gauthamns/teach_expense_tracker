package com.gauthamns.expensetracker;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * @author gauthamns
 * 
 */

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

		// Get double value of amount.
		if (TextUtils.isEmpty(amountStr)) {
			Toast.makeText(this, "Please enter the amount", Toast.LENGTH_SHORT)
					.show();
			return;
		}

		double amount = Double.valueOf(amountStr);
		long time = System.currentTimeMillis();
		String note = noteEdit.getText().toString();

		// Insert and show the id as toast.
		long id = insertExpense(amount, note, time);
		Toast.makeText(this, "Inserted Id is: " + id, Toast.LENGTH_SHORT)
				.show();

		// Show Expenses in ShowActivity.
		Intent i = new Intent(this, ShowActivity.class);
		i.putExtra("amount", amount);
		i.putExtra("note", note);
		i.putExtra("date", time);
		startActivity(i);
	}

	private long insertExpense(double amount, String note, long time) {
		MySQLiteHelper dbHelper = new MySQLiteHelper(this);
		SQLiteDatabase db = dbHelper.getWritableDatabase();

		// Create content values.
		ContentValues values = new ContentValues();
		values.put(MySQLiteHelper.COLUMN_AMOUNT, amount);
		values.put(MySQLiteHelper.COLUMN_NOTE, note);
		values.put(MySQLiteHelper.COLUMN_CREATED_AT, time);

		return db.insert(MySQLiteHelper.TABLE_EXPENSES, null, values);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		switch (item.getItemId()) {
		case R.id.action_expenses:
			Intent i = new Intent(this, ExpensesListActivity.class);
			startActivity(i);
			return true;
		}

		return super.onOptionsItemSelected(item);
	}
}
