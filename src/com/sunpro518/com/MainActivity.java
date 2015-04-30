package com.sunpro518.com;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.widget.TextView;

public class MainActivity extends Activity {

	int width;
	private TextView text1;
	private TextView text2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		text1 = (TextView)findViewById(R.id.textView1);
		text2 = (TextView)findViewById(R.id.textView2);
		Display display = getWindowManager().getDefaultDisplay();            
		DisplayMetrics dm = new DisplayMetrics();            
		display.getMetrics(dm);
		width = dm.widthPixels;
		//根据屏幕调整文字大小
		//sets line spacing for this TextView.
		//Each line will have its height multiplied by mult and have add added to it.
		text2.setLineSpacing(0f, 1.5f); 
		text2.setTextSize(8*(float)width/320f);                        
		//设置TextView
		text2.setText(R.string.content);    
		            
//		TextJustification.justify(text2,text2.getWidth());
	}
}
