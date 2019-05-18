package com.example.fragmentbasicapp;

import android.content.Intent;
import android.provider.MediaStore;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Button activity_btn;
    ActionMode actionMode;
   // ToggleButton toggleButton1,toggleButton2;
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity_btn=findViewById(R.id.activity_btn);


        activity_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "call !!!", Toast.LENGTH_SHORT).show();
            }
        });



    }

    private class ActionBarCallback implements android.support.v7.view.ActionMode.Callback {


        @Override
        public boolean onCreateActionMode(android.support.v7.view.ActionMode actionMode, Menu menu) {


            actionMode.getMenuInflater().inflate(R.menu.menu, menu);


            return true;
        }

        @Override
        public boolean onPrepareActionMode(android.support.v7.view.ActionMode actionMode, Menu menu) {


            actionMode.setTitle("CHANGED ACTION MODE");
            return false;
        }

        @Override
        public boolean onActionItemClicked(android.support.v7.view.ActionMode actionMode, MenuItem menuItem) {

            Toast.makeText(MainActivity.this, "Item Action Clicked", Toast.LENGTH_SHORT).show();
            // You can add Functionality to your Menu Buttons here.
            // Apply switch case statements in case there are more than one Menu Buttons.
            //  Intent intent=new Intent(getApplicationContext(),onCreateActionMode());
            return false;
        }

        @Override


        public void onDestroyActionMode(android.support.v7.view.ActionMode actionMode) {
            Toast.makeText(MainActivity.this, "finish", Toast.LENGTH_SHORT).show();
            // This is called when Action Mode is completed.

        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //linked  resources id
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.logout:
               // startActivity(new Intent(Settings.ACTION_DATE_SETTINGS));
                Toast.makeText(MainActivity.this, "u click logout", Toast.LENGTH_SHORT).show();
                break;

            case R.id.newfragment:
                Toast.makeText(MainActivity.this, "u click newfragment", Toast.LENGTH_SHORT).show();
                Intent invokcam = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(invokcam);
                break;

            case R.id.toggle:
                Intent intent=new Intent(MainActivity.this,Main3Activity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "u click toggle", Toast.LENGTH_SHORT).show();

                break;
        }
        return super.onOptionsItemSelected(item);
    }
}

