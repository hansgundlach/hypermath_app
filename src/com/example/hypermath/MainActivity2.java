package com.example.hypermath;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity2 extends Activity{

	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main2);
		
		Button button1 = (Button) findViewById(R.id.button1);
		button1.setOnClickListener (new OnClickListener() {
			public void onClick(View v){
				Intent intent = new Intent(v.getContext(),MainActivity.class);
				startActivityForResult(intent, 0);
			}
		});
	}
}




































