package com.rotateimage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class RotateImageAct extends Activity 
{
    /** Called when the activity is first created. */
	
	 ImageView img;
	
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button btn_rotate=(Button) findViewById(R.id.btn_rotate);
        Button btn_scall=(Button) findViewById(R.id.btn_scall);
        
       
        btn_rotate.setOnClickListener(new OnClickListener() 
        {
			
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				
					Rotate_Img();	
				
				
				
			}
		});
        btn_scall.setOnClickListener(new OnClickListener() 
        {
			
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				
					Scall_img();	
				
				
				
			}
		});
        
    }
    
   
    
    public void Rotate_Img()
    {
		    img=(ImageView)findViewById(R.id.ImageView01);
		    Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.indiaflg);
		    
		 // Getting width & height of the given image.
		    int w = bmp.getWidth();
		    int h = bmp.getHeight();
		    
		 // Setting post rotate to 90
		    Matrix mtx = new Matrix();
		    mtx.postRotate(90);
		    
		    
		 // Rotating Bitmap
		    Bitmap rotatedBMP = Bitmap.createBitmap(bmp, 0, 0, w, h, mtx, true);
		    BitmapDrawable bmd = new BitmapDrawable(rotatedBMP);
		
		    img.setImageDrawable(bmd);
	 }
    public void Scall_img()
    {
    	img=(ImageView)findViewById(R.id.ImageView01);
         Bitmap bMap = BitmapFactory.decodeResource(getResources(), R.drawable.indiaflg);
         Bitmap bMapScaled = Bitmap.createScaledBitmap(bMap, 150, 100, true);
         img.setImageBitmap(bMapScaled);

    }
	
}
