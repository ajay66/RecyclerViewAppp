package com.example.recycleviewapp;

import java.util.ArrayList;

import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
 
public class MainActivity extends Activity {
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 1. get a reference to recyclerView 
         
        // this is data fro recycler view
//        ItemData itemsData[] = { new ItemData("Android",R.drawable.ic_launcher),
//                new ItemData("Iphone",R.drawable.iphone),
//                new ItemData("Windows",R.drawable.windows),
//                new ItemData("BlackBerry",R.drawable.blackberry)
//        };
        
        ListView lv=(ListView)findViewById(R.id.list);
//        ArrayList<String> list=new ArrayList<String>();
//        list.add("Gmail");
//        list.add("Youtube");
//        list.add("Maps");
//        list.add("PlayStore");
//        list.add("WhatsApp");
//        list.add("Facebook");
//        list.add("Skype");
//        list.add("contacts");
//        list.add("Calender");
        
        final ArrayList<String> prglist=new ArrayList<String>();
        prglist.add("listview with vertical scroll");
        prglist.add("listview with horizontal scroll");
        prglist.add("gridview with vertical scroll");
        prglist.add("gridview with horizontal scroll");
        prglist.add("ListView with reverse order");
        prglist.add("GridView with reverse order");
        
//        ItemData itemsData[] = { new ItemData("Gmail",R.drawable.gmail),
//        		new ItemData("Youtube",R.drawable.youtube),
//        		new ItemData("Google Maps",R.drawable.maps),
//        		new ItemData("PlayStore",R.drawable.playstore),
//                new ItemData("WhatsApp",R.drawable.watsapp2),
//                new ItemData("facebook",R.drawable.fb2),
//                new ItemData("Skype",R.drawable.skype1),
//                new ItemData("Contacts",R.drawable.contacts),
//                new ItemData("Calendar",R.drawable.calendar2)
//        };
        
        ItemData itemsData[] = { new ItemData("Gmail",R.drawable.gmail),
        		new ItemData("Youtube",R.drawable.ic_launcher),
        		new ItemData("Google Maps",R.drawable.ic_launcher),
        		new ItemData("PlayStore",R.drawable.ic_launcher),
                new ItemData("WhatsApp",R.drawable.ic_launcher),
                new ItemData("facebook",R.drawable.ic_launcher),
                new ItemData("Skype",R.drawable.ic_launcher),
                new ItemData("Contacts",R.drawable.ic_launcher),
                new ItemData("Calendar",R.drawable.ic_launcher),
                new ItemData("Linked in",R.drawable.ic_launcher),
        		new ItemData("Hike",R.drawable.ic_launcher),
                new ItemData("camera",R.drawable.ic_launcher),
                new ItemData("games",R.drawable.ic_launcher),
                new ItemData("flipkart",R.drawable.ic_launcher),
                new ItemData("paytm",R.drawable.ic_launcher),
                new ItemData("snapdeal",R.drawable.ic_launcher),
                new ItemData("flipboard",R.drawable.ic_launcher),
                new ItemData("books",R.drawable.ic_launcher),
                new ItemData("music",R.drawable.ic_launcher),
                new ItemData("events",R.drawable.ic_launcher),
                new ItemData("amazon",R.drawable.ic_launcher),
            	new ItemData("Youtube",R.drawable.ic_launcher),
        		new ItemData("Google Maps",R.drawable.ic_launcher),
        		new ItemData("PlayStore",R.drawable.ic_launcher),
                new ItemData("WhatsApp",R.drawable.ic_launcher),
                new ItemData("facebook",R.drawable.ic_launcher),
                new ItemData("Skype",R.drawable.ic_launcher),
                new ItemData("Contacts",R.drawable.ic_launcher),
                new ItemData("Calendar",R.drawable.ic_launcher),
                new ItemData("Linked in",R.drawable.ic_launcher),
        		new ItemData("Hike",R.drawable.ic_launcher),
                new ItemData("camera",R.drawable.ic_launcher),
                new ItemData("games",R.drawable.ic_launcher),
                new ItemData("flipkart",R.drawable.ic_launcher),
                new ItemData("paytm",R.drawable.ic_launcher),
                new ItemData("snapdeal",R.drawable.ic_launcher),
                new ItemData("flipboard",R.drawable.ic_launcher),
                new ItemData("books",R.drawable.ic_launcher),
                new ItemData("music",R.drawable.ic_launcher),
                new ItemData("events",R.drawable.ic_launcher),
                new ItemData("amazon",R.drawable.ic_launcher)
        };

        
        // 2. set layoutManger
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        
//        StaggeredGridLayoutManager layoutmanager=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
//        LinearLayoutManager layoutmanager=new LinearLayoutManager(getApplicationContext());
//        	LinearLayoutManager layoutmanager=new LinearLayoutManager(getApplicationContext(),1,false);
//        	GridLayoutManager layoutmanager=new GridLayoutManager(getApplicationContext(), 2);
//        GridLayoutManager layoutmanager=new GridLayoutManager(getApplicationContext(), 2,1,false);
//        layoutmanager.setGapStrategy(StaggeredGridLayoutManager.GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS);
//        recyclerView.setLayoutManager(layoutmanager);
        
//        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.HORIZONTAL));
//        
//        // 3. create an adapter 
//        MyAdapter mAdapter = new MyAdapter(this,itemsData);
////        MyAdapter mAdapter = new MyAdapter(this,list);
//        // 4. set adapter
//        recyclerView.setAdapter(mAdapter);
//        // 5. set item animator to DefaultAnimator
//        recyclerView.setItemAnimator(new DefaultItemAnimator());
//        
        
        ArrayAdapter adapter=new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,prglist);
        lv.setAdapter(adapter);
        
        
        lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
//				Toast.makeText(getApplicationContext(), "clicked"+prglist.get(position).toString(), 1).show();
				
				Intent intent=new Intent(MainActivity.this,DetailsActivity.class);
				intent.putExtra("name", position);
				startActivity(intent);
				
			}
		});
 
    }
}