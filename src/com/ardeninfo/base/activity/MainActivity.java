package com.ardeninfo.base.activity;

import android.widget.ImageButton;
import android.widget.Toast;
import android.app.Activity;

import android.view.HapticFeedbackConstants;
import android.view.MotionEvent;
import android.view.View;

import android.view.View.OnTouchListener;
import android.widget.Button;

import com.ardeninfo.base.R;




public class MainActivity extends Activity {
	ImageButton imageButton;
	
	
    @Override
    protected void onStart() {
    	super.onStart();
    	setContentView( R.layout.main );
		
        initializeWidgets();
    }
    
    private void initializeWidgets() {

		
		Button customBtn = ( Button ) findViewById( R.id.btn_custom );
		customBtn.setOnTouchListener( new BouttonListener() );
		

		
    }
    


    
    private class BouttonListener implements OnTouchListener {

		@Override
		public boolean onTouch( View v, MotionEvent event ) {
			if( event.getAction() == MotionEvent.ACTION_DOWN ){
				Toast.makeText(MainActivity.this,
						"Base", Toast.LENGTH_SHORT).show();

			}
			return true;
		}    	
    }
    }