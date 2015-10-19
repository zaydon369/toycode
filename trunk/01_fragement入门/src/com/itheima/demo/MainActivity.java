package com.itheima.demo;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


   public void showSound(View view){
	   SoundFragment fragment = new SoundFragment();
	   FragmentManager fm = getFragmentManager();
	   //事务
	   FragmentTransaction ft =  fm.beginTransaction();
	   ft.replace(R.id.container, fragment);
	   ft.commit();
   }
   public void showShow(View view){
	   ShowFragment fragment = new ShowFragment();
	   FragmentManager fm = getFragmentManager();
	   //事务
	   FragmentTransaction ft =  fm.beginTransaction();
	   ft.replace(R.id.container, fragment);
	   ft.commit();
   }
   public void showStroge(View view){
	   StrogeFragment fragment = new StrogeFragment();
	   FragmentManager fm = getFragmentManager();
	   //事务
	   FragmentTransaction ft =  fm.beginTransaction();
	   ft.replace(R.id.container, fragment);
	   ft.commit();
   }
}
