package com.example.user1.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.example.user1.myapplication.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Add Fragment to Activity

      if (savedInstanceState == null ) {

          getSupportFragmentManager()
                  .beginTransaction()
                  .add(R.id.contentMainFragment, new MainFragment())
                  .commit();

      }


    } // Main Method



} // Main Class
