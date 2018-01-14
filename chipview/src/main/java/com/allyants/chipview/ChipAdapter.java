package com.allyants.chipview;

import android.content.Context;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by jbonk on 1/13/2018.
 */

public abstract class ChipAdapter {

    private ChipView chipView;

    public ArrayList<Object> data = new ArrayList<>();
    public abstract Object getItem(int pos);
    public abstract boolean isSelected(int pos);

    public abstract View createSearchView(Context context,boolean is_checked,int pos);
    public abstract View createChip(Context context,int pos);

    public void setChipView(ChipView chipView){
        this.chipView = chipView;
    }


    public void refresh(){
        chipView.notifyDataSetChanged();
    }

    public abstract int getCount();

}
