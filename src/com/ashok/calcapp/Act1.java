package com.ashok.calcapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Act1 extends Activity{
	EditText e1, e2;
	public void onCreate(Bundle b){
		super.onCreate(b);
		setContentView(R.layout.first);
		e1=(EditText)findViewById(R.id.et1);
		e2=(EditText)findViewById(R.id.et2);
	}
	public void clickAdd(View v){
		String fn = e1.getText().toString();
		String sn = e2.getText().toString();
		int f = Integer.parseInt(fn);
		int s = Integer.parseInt(sn);
		int res = f+s;
		Toast t = Toast.makeText(this, "the result is "+res, Toast.LENGTH_LONG);
		t.show();
	}
	public void clickClear(View v){
		e1.setText(null);
		e2.setText(null);
	}
}
