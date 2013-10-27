package com.jaysonfrancis.thenewboston;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Menu extends ListActivity{

    String classes[] = {"startingPoint", "Example1", "Example2", "Example3", "Example4", "Example5", "Example6", "Example7"};


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setListAdapter(new  ArrayAdapter<String>(Menu.this, android.R.layout.simple_list_item_1, classes));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);

        String cheese = classes[position];

        try{
        Class ourClass = Class.forName("com.jaysonfrancis.thenewboston." + cheese);
        Intent ourIntent = new Intent(Menu.this, ourClass);
        startActivity(ourIntent);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }


}