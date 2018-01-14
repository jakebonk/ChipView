package com.allyants.chipview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;

import java.util.ArrayList;

/**
 * Created by jbonk on 1/13/2018.
 */

public class SimpleSearchAdapter extends ArrayAdapter<String>{

    private ChipAdapter adapter;
    private ArrayList<Object> data = new ArrayList<>();

    public SimpleSearchAdapter(Context context,ChipAdapter adapter){
        super(context,-1);
        this.adapter = adapter;
        this.data = adapter.data;
    }

    @NonNull
    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                FilterResults results = new FilterResults();
                if(charSequence == null || charSequence.length() == 0){
                    results.values = adapter.data;
                    results.count = adapter.data.size();
                }else{
                    ArrayList<Object> tmp = new ArrayList<>();
                    for(int i = 0;i < adapter.data.size();i++){
                        if(adapter.data.get(i).toString().toLowerCase().indexOf(charSequence.toString().toLowerCase()) == 0){
                            tmp.add(adapter.data.get(i));
                        }
                    }
                    results.values = tmp;
                    results.count = tmp.size();
                }
                return results;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                data = (ArrayList<Object>)filterResults.values;
                notifyDataSetChanged();
            }
        };
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        int pos = adapter.data.indexOf(data.get(position));
        if(pos != -1) {
            return adapter.createSearchView(getContext(), adapter.isSelected(pos), pos);
        }else {
            return null;
        }
    }
}
