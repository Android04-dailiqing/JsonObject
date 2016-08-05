package com.weather.next;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout          mDrawerLayout;
    private NavigationView        mNavigationView;
    private Toolbar               mToolbar;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.root);
        mToolbar = (Toolbar) findViewById(R.id.toolbar1);
        mNavigationView = (NavigationView) findViewById(R.id.navi);
        setSupportActionBar(mToolbar);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
