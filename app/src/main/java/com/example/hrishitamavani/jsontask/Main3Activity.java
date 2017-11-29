package com.example.hrishitamavani.jsontask;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;

public class Main3Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        final Spinner spi = (Spinner) findViewById(R.id.spicat);
        String[] c = getResources().getStringArray(R.array.category);
        final ArrayAdapter<String> adptr = new ArrayAdapter<String>(Main3Activity.this, android.R.layout.simple_list_item_1, c);
        spi.setAdapter(adptr);
        final ListView gv =(ListView)findViewById(R.id.category);
        final int [] i=new int[]{R.drawable.bridalclothes2,R.drawable.bridalclothes4,R.drawable.bridalclothes5,R.drawable.bridalclothes6,R.drawable.bridalclothes8,R.drawable.bridalclothes9,R.drawable.bridalclothes10};
        String[] s=new String[]{"Manyavar","Biba","Juliana","Global desi","Tommy anderson","lisa gowns","daisy lehanga"};
        final int [] i1=new int[]{R.drawable.brijwe1,R.drawable.brijwe2,R.drawable.brijwe3,R.drawable.brijwe4,R.drawable.brijwe6,R.drawable.brijwe7,R.drawable.brijwe8};
        String[] s1=new String[]{"Tanishq","Malabar","Kalyan Jwelers","Joyalukkas","Diva","gehana","Nisha diamonds"};
        final int [] i2=new int[]{R.drawable.briase1,R.drawable.briase2,R.drawable.briase3,R.drawable.briase4,R.drawable.briase5,R.drawable.briase6,R.drawable.briase7};
        String[] s2=new String[]{"Kalaniketan","Handloom","Titan","Rado","Cristina bezo","allen solley","Lawgarten"};

        final cstm newcs=new cstm(Main3Activity.this,R.layout.activity_main2,i,s);
        final cstm newcs1=new cstm(Main3Activity.this,R.layout.activity_main2,i1,s1);
        final cstm newcs2=new cstm(Main3Activity.this,R.layout.activity_main2,i2,s2);
        spi.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position==0)
                {

                    gv.setAdapter(newcs);
                }
                else if (position==1)
                {

                    gv.setAdapter(newcs1);
                }
                else if (position==2)
                {

                    gv.setAdapter(newcs2);
                }
                else
                {}
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main3, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        }
        else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
