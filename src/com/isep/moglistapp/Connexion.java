package com.isep.moglistapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Connexion extends Activity {
	private EditText username = null;
	private EditText password = null;
	private TextView attempts;
	@SuppressWarnings("unused")
	private Button login;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_connexion);
		username = (EditText) findViewById(R.id.editText1);
		password = (EditText) findViewById(R.id.editText2);
		login = (Button) findViewById(R.id.button1);
		
		//listening to button event
		login.setOnClickListener(new View.OnClickListener(){
			public void onClick(View arg0){
				//starting a new intent (to open new activity)
				Intent nextScreen = new Intent(getApplicationContext(), HomeActivity.class);
				
				//Sending data to another Activity
				nextScreen.putExtra("name", username.getText().toString());
				nextScreen.putExtra("pwd", password.getText().toString());
		
				Log.e("n", username.getText()+"."+password.getText());
				
				startActivity(nextScreen);
			}
		});
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
