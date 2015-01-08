/*package com.example.hypermath;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
}*/

/*package com.example.hypermath;
import android.os.Bundle;
import android.app.Activity;
//import android.text.Editable;
//import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
public class MainActivity extends Activity{
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final EditText editCentimeters = (EditText) findViewById(R.id.editCentimeters);
		final EditText editInches = (EditText) findViewById(R.id.editInches);
		//final EditText editText3 = (EditText) findViewById(R.id.editText3);
		//final EditText editText4 = (EditText) findViewById(R.id.editText4);
		
		Button buttonConvert = (Button) findViewById(R.id.buttonConvert);
		buttonConvert.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v){
				double centimeters =  Double.parseDouble(editCentimeters.getText().toString());
				double inches = centimeters*2;
				editInches.setText(String.valueOf(inches));
				//int i = 2;
			/*while(i<Math.sqrt(number)){
				if(number%i == 0){
					String editText21 = "False";
				
				break;	
				
					
				} else {
					String editText21 = number+"is not prime"+i+"is a factor";
					editText2.setText(String.valueOf(editText21));
					break;
				}
			}
			/*public  boolean perfsquare(int j){
				int p = sqrt(j);
				if(p*p == j*j){
					return true;
				}
			}
			
			public static String{
			if(perfsquare(5*number*number +4) && perfsquare(5*number*number -4)){
				String editText31 = "True";
			}}
			
			if(perfsquare(number)){
				String editText41 = "True";
			}else{
				string editText41 = "False";
			}*/
					
					
				
				
				//editText3.setText(editText31);
				//editText4.setText(editText41);
				
				
				
				
				
				
				
				
				
				
				
	//	}
	//	}
	
	//	});
	//}

//}



/*package com.example.hypermath;

/*import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;*/
//import android.os.Bundle;
//import android.app.Activity;
//import android.text.Editable;
//import android.view.Menu;
//import android.view.View;
//import android.widget.EditText;
//import android.widget.Button;
//public class MainActivity extends Activity{ 



/*public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
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



        @Override
        protected void onCreate(Bundle savedInstanceState){

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            final EditText editCentimeters = (EditText) findViewById(R.id.editCentimeters);
            final EditText editInches = (EditText) findViewById(R.id.editInches);
            //final EditText editText3 = (EditText) findViewById(R.id.editText3);
            //final EditText editText4 = (EditText) findViewById(R.id.editText4);

            Button buttonConvert = (Button) findViewById(R.id.buttonConvert);
            buttonConvert.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    double centimeters = Double.parseDouble(editCentimeters.getText().toString());
                    double inches = centimeters * 2;
                    editInches.setText(String.valueOf(inches));


                }
                });
            }

        }



*/package com.example.hypermath;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    protected static final boolean True = false;
	protected static final boolean False = false;
	Button mButton;
    EditText mEdit;
    TextView mText;
    EditText mEdit2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (Button)findViewById(R.id.button1);

        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                mEdit   = (EditText)findViewById(R.id.editText1);
                mText = (TextView)findViewById(R.id.textView1);
                /*mEdit2 = (EditText)findViewById(R.id.textView5);/*previously TextView5*/
                double mNumb2 = Double.parseDouble(mEdit.getText().toString());
                int i = 2;
                for(i=2;i<Math.sqrt(mNumb2);i++){
                	
                	if(mNumb2 %i==0){
                		String mNumb = "False";
                		 mText.setText(String.valueOf(mNumb));
                		break;
                	}else{
                		String mNumb = "True";
                		 mText.setText(String.valueOf(mNumb));
                	}
                }
                
                
                
               /*if( perfsquare((5*mNumb2*mNumb2) + 4)||perfsquare((5*mNumb2*mNumb2) - 4) ) {
            	   String Numb = "True";
            	  mEdit2.setText(String.valueOf(Numb)) ;
               }
               else{
            	   String Numb = "False";
            	   mEdit2.setText(String.valueOf(Numb)) ;
               }*/
                
                
                
               // double mNumb = mNumb2*2;
              // mText.setText(String.valueOf(mNumb));
               // mText.setText(mEdit.getText().toString());
            }
           // @Override
            public  boolean perfsquare(double n) {
                int p = (int) Math.sqrt(n) ;
                	if(p*p == n)	{
                		return True;
                		
                	}else{
                		return False;
                	}
                }
                
            
            
            
        });
    }
}








