package com.gauthamns.expensetracker;

import android.app.ListActivity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

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
		Cursor cursor = db.query(MySQLiteHelper.TABLE_EXPENSES, null, null,
				null, null, null, MySQLiteHelper.COLUMN_CREATED_AT);

		// Desired columns and views.
		String[] columns = new String[] { MySQLiteHelper.COLUMN_AMOUNT,
				MySQLiteHelper.COLUMN_NOTE, MySQLiteHelper.COLUMN_CREATED_AT };
		int[] to = new int[] { R.id.textView1, R.id.textView2, R.id.textView3 };

		SimpleCursorAdapter adapter = new SimpleCursorAdapter(this,
				R.layout.activity_show, cursor, columns, to);
		setListAdapter(adapter);
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
	}

}
