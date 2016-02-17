package com.example.recycleviewapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.GridLayoutManager.SpanSizeLookup;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Toast;

public class DetailsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_details);
		
		 ItemData itemsData[] = { new ItemData("Gmail",R.drawable.gmail),
	        		new ItemData("Youtube",R.drawable.youtube),
	        		new ItemData("Google Maps",R.drawable.maps),
	        		new ItemData("PlayStore",R.drawable.youtube),
	                new ItemData("WhatsApp",R.drawable.watsapp2),
	                new ItemData("facebook",R.drawable.fb2),
	                new ItemData("Skype",R.drawable.gmail),
	                new ItemData("Contacts",R.drawable.contacts),
	                new ItemData("Calendar",R.drawable.maps),
	                new ItemData("Linked in",R.drawable.windows),
	        		new ItemData("Hike",R.drawable.music5),
	                new ItemData("camera",R.drawable.message),
	                new ItemData("games",R.drawable.candycrush),
	                new ItemData("flipkart",R.drawable.true1),
	                new ItemData("paytm",R.drawable.windows),
	                new ItemData("snapdeal",R.drawable.watsapp2),
	                new ItemData("flipboard",R.drawable.maps),
	                new ItemData("books",R.drawable.fb2),
	                new ItemData("music",R.drawable.music5),
	                new ItemData("events",R.drawable.true1),
	                new ItemData("amazon",R.drawable.windows),
	                
	                new ItemData("Gmail",R.drawable.gmail),
	        		new ItemData("Youtube",R.drawable.youtube),
	        		new ItemData("Google Maps",R.drawable.maps),
	        		new ItemData("PlayStore",R.drawable.youtube),
	                new ItemData("WhatsApp",R.drawable.watsapp2),
	                new ItemData("facebook",R.drawable.fb2),
	                new ItemData("Skype",R.drawable.gmail),
	                new ItemData("Contacts",R.drawable.contacts),
	                new ItemData("Calendar",R.drawable.maps),
	                new ItemData("Linked in",R.drawable.windows),
	        		new ItemData("Hike",R.drawable.music5),
	                new ItemData("camera",R.drawable.message),
	                new ItemData("games",R.drawable.candycrush),
	                new ItemData("flipkart",R.drawable.true1),
	                new ItemData("paytm",R.drawable.windows),
	                new ItemData("snapdeal",R.drawable.watsapp2),
	                new ItemData("flipboard",R.drawable.maps),
	                new ItemData("books",R.drawable.fb2),
	                new ItemData("music",R.drawable.music5),
	                new ItemData("events",R.drawable.true1),
	                new ItemData("amazon",R.drawable.windows)
	        };
		
		RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
		
		 MyAdapter mAdapter = new MyAdapter(this,itemsData);
		 recyclerView.setAdapter(mAdapter);
		 
		 Intent intent=getIntent();
		 int n=(int) intent.getExtras().get("name");
		 System.out.println("n values is"+n);
//		 Toast.makeText(this, "n value is"+n, 1).show();
		 LinearLayoutManager layoutmanager;
		 GridLayoutManager glayoutmanager;
		 StaggeredGridLayoutManager slayoutmanager;
		 if(n==0)
		 {
			 layoutmanager=new LinearLayoutManager(DetailsActivity.this, LinearLayoutManager.VERTICAL, false);
			 recyclerView.setLayoutManager(layoutmanager);
			 
		 }
		 else if(n==1)
		 {
			  layoutmanager=new LinearLayoutManager(DetailsActivity.this, LinearLayoutManager.HORIZONTAL, false);
			  recyclerView.setLayoutManager(layoutmanager);
		 }
		 else if(n==2)
		 {
			 glayoutmanager=new GridLayoutManager(DetailsActivity.this, 3, GridLayoutManager.VERTICAL, false);
			 recyclerView.setLayoutManager(glayoutmanager);
		 }
		 else if(n==3)
		 {
			 glayoutmanager=new GridLayoutManager(DetailsActivity.this, 4, 0, false);
			 recyclerView.setLayoutManager(glayoutmanager);
		 }
		 else if(n==4)
		 {
//			 slayoutmanager=new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
//			 slayoutmanager=new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.HORIZONTAL);
//			 recyclerView.setLayoutManager(slayoutmanager);
			 layoutmanager=new LinearLayoutManager(DetailsActivity.this, 1, true);
			  recyclerView.setLayoutManager(layoutmanager);
		 }
		 else if(n==5)
		 {
			 glayoutmanager=new GridLayoutManager(DetailsActivity.this, 4, 0, true);
			 recyclerView.setLayoutManager(glayoutmanager);
		 }
		 else
		 {
			 System.out.println("nothing");
			 slayoutmanager=new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
			 glayoutmanager=new GridLayoutManager(DetailsActivity.this, 2, 0, false);
			 glayoutmanager.setSpanSizeLookup(new SpanSizeLookup() {
				
				@Override
				public int getSpanSize(int arg0) {
					
					return (3 - arg0 % 3);
				}
			});
			 recyclerView.setLayoutManager(glayoutmanager);
		 }
//		LinearLayoutManager layoutmanager=new LinearLayoutManager(DetailsActivity.this, 0, false);
//		LinearLayoutManager layoutmanager=new LinearLayoutManager(DetailsActivity.this, 1, false);
//		GridLayoutManager glayoutmanager=new GridLayoutManager(DetailsActivity.this, 2, 0, false);
//		GridLayoutManager glayoutmanager=new GridLayoutManager(DetailsActivity.this, 2, 1, false);
//		GridLayoutManager glayoutmanager=new GridLayoutManager(DetailsActivity.this, 2, 0, true);
		
//		recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.HORIZONTAL));
//		recyclerView.setLayoutManager(layoutmanager);
		 
		 recyclerView.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "u clicked id--"+v.getId(), 1).show();
				Toast.makeText(getApplicationContext(), "u clicked tag--"+v.getTag(), 1).show();
			}
		});
		 
		 recyclerView.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				
//				Toast.makeText(getApplicationContext(), "u clicked id--"+v.getId(), 1).show();
//				Toast.makeText(getApplicationContext(), "u clicked tag--"+v.getTag(), 1).show();
				return false;
			}
		});
		 
		 
		
	}
}
