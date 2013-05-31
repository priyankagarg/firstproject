package com.example.shufflingapp;

import java.util.ArrayList;

import java.util.Collections;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;




public class MainActivity extends Activity {
	private EditText edittext;
	private Button button;
	private TextView txt;
		@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		clickButton();
	}
	
		public void clickButton()
		{
		edittext=(EditText)findViewById(R.id.edit);
	    txt=(TextView)findViewById(R.id.text);
		button=(Button)findViewById(R.id.jumble);
		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				
				shuffle1(edittext.getText().toString());
				
			}

			
		});
	}
	
	private void shuffle1(String word)
	{
		ArrayList<Character>arr=new ArrayList<Character>();
		for(int i=0;i<edittext.length();i++)
		{
			arr.add(word.charAt(i));
		}
		Collections.shuffle(arr);
		for (int i = 0; i < arr.size(); i++) {
		}
		txt.setText(arr.toString());
	}
		
}