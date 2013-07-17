/**
 * 
 */
package com.gauthamns.expensetracker;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * @author gauthamns
 * 
 */
public class MySQLiteHelper extends SQLiteOpenHelper {

	public static final String TABLE_EXPENSES = "expenses";
	public static final String COLUMN_ID = "_id";
	public static final String COLUMN_AMOUNT = "amount";
	public static final String COLUMN_NOTE = "note";
	public static final String COLUMN_CREATED_AT = "created_at";

	private static final String DATABASE_NAME = "expenses.db";
	private static final int DATABASE_VERSION = 1;

	// Database creation sql statement
	private static final String DATABASE_CREATE = "create table "
			+ TABLE_EXPENSES + "(" + COLUMN_ID
			+ " integer primary key autoincrement, " + COLUMN_AMOUNT
			+ " NUMERIC NOT NULL, " + COLUMN_NOTE + " TEXT, "
			+ COLUMN_CREATED_AT + " INTEGER NOT NULL " + ");";

	public MySQLiteHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	}
}
