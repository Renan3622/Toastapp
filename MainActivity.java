package com.mycompany.toast;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.Toast;
import com.mycompany.toast.R;
import android.view.View;


public class MainActivity extends Activity {
    Button btnto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);			
					
					//PositioningToast
            btnto=(Button)findViewById(R.id.btnt) ;
				  btnto.setOnClickListener(new View.OnClickListener() {
								@Override
								public void onClick(View view) {
											Toast ToastTop=Toast.makeText(getApplicationContext(),"Position Top",Toast.LENGTH_SHORT);
											ToastTop.setGravity(Gravity.TOP,0,0);
											ToastTop.show();

											Toast ToastCenter=Toast.makeText(getApplicationContext(),"Position Center",Toast.LENGTH_SHORT);
											ToastCenter.setGravity(Gravity.CENTER,0,0);
											ToastCenter.show();

											Toast ToastBottom=Toast.makeText(getApplicationContext(),"Position Bottom",Toast.LENGTH_SHORT);
											ToastBottom.setGravity(Gravity.BOTTOM,0,0);
											ToastBottom.show();


								}
					});
    }
    
    }
    
    
    