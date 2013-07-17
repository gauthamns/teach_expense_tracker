package com.gauthamns.expensetracker;

import android.app.ListActivity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

/**
 * 
 * @author gauthamns
 * 
 */
public class ExpensesListActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		MySQLiteHelper dbHelper = new MySQLiteHelper(this);
		SQLiteDatabase db = dbHelper.getReadableDatabase();
		// Desired columns and views.
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {

		TextView amountText = (TextView) findViewById(R.id.textView1);
		TextView noteText = (TextView) findViewById(R.id.textView2);
		TextView dateText = (TextView) findViewById(R.id.textView3);
		String note = noteText.getText().toString();
		double amount = Double.valueOf(amountText.getText().toString());
		long time = Long.valueOf(dateText.getText().toString());

		// Show Expenses in ShowActivity.
		Intent i = new Intent(this, ShowActivity.class);
		i.putExtra("amount", amount);
		i.putExtra("note", note);
		i.putExtra("date", time);
		startActivity(i);
	}
}
