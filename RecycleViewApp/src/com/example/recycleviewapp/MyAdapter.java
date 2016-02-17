package com.example.recycleviewapp;

import com.google.android.gms.wearable.internal.GetAllCapabilitiesResponse;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
 
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> implements View.OnClickListener{
    private ItemData[] itemsData;
    Activity context;
 
    public MyAdapter(Activity context,ItemData[] itemsData) {
        this.itemsData = itemsData;
        this.context=context;
    }
     
    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,int viewType) {
        // create a new view
        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, null);
        // create ViewHolder
        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }
 
    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
         
        // - get data from your itemsData at this position
        // - replace the contents of the view with that itemsData
         
        viewHolder.txtViewTitle.setText(itemsData[position].getTitle());
        viewHolder.imgViewIcon.setImageResource(itemsData[position].getImageUrl());
        
        viewHolder.txtViewTitle.setTag("txt--"+itemsData[position].getTitle());
        viewHolder.imgViewIcon.setTag("img--"+itemsData[position].getTitle());
        
        viewHolder.txtViewTitle.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(context, "u clicked text "+itemsData[position].getTitle().toString(), 1).show();
			}
		});
        
        viewHolder.imgViewIcon.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(context, "u clicked img "+itemsData[position].getTitle().toString(), 1).show();
			}
		});
        
        viewHolder.rel.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(context, "u clicked rel layout "+itemsData[position].getTitle().toString(), 1).show();
			}
		});
        
        
    }

     
    // inner class to hold a reference to each item of RecyclerView 
    public static class ViewHolder extends RecyclerView.ViewHolder {
        
        public TextView txtViewTitle;
        public ImageView imgViewIcon;
        public RelativeLayout rel;
         
        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            txtViewTitle = (TextView) itemLayoutView.findViewById(R.id.item_title);
            imgViewIcon = (ImageView) itemLayoutView.findViewById(R.id.item_icon);
            rel = (RelativeLayout) itemLayoutView.findViewById(R.id.rel);
        }
    }
 
    // Return the size of your itemsData (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return itemsData.length;
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Toast.makeText(context, "u clicked row "+v.getTag().toString(), 1).show();
		
	}
}