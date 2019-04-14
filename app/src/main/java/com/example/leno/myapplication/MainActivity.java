package com.example.leno.myapplication;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;

import swipereveallayout.SwipeRevealLayout;


public class MainActivity extends AppCompatActivity {

    int state1 = 0;
    int state2 = 0;
    int state3 = 0;
    int state4 = 0;
    int state5 = 0;

    int state1_more = 0;
    int state2_more = 0;
    int state3_more = 0;
    int state4_more = 0;
    int state5_more = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
*/
    }

/*    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_recycler_view:
                startActivity(new Intent(this, RecyclerDemoActivity.class));
                return true;

            case R.id.action_list_view:
                startActivity(new Intent(this, ListDemoActivity.class));
                return true;

            case R.id.action_grid_view:
                startActivity(new Intent(this, GridActivity.class));
                return true;
        }

        return false;
    }*/

    public void layoutOneOnClick1(View v) {
        //int state = 0;
        Toast.makeText(MainActivity.this, "Layout 1 clicked", Toast.LENGTH_SHORT).show();
        if(state1 == 0){
            RelativeLayout rl = (RelativeLayout) findViewById(R.id.RL1);
            rl.setVisibility(View.VISIBLE);
            state1 = 1;
        }
        else{
            RelativeLayout rl = (RelativeLayout) findViewById(R.id.RL1);
            rl.setVisibility(View.GONE);
            state1 = 0;
        }
    }

    public void moreOnClick1(View v) {
        Toast.makeText(MainActivity.this, "More clicked", Toast.LENGTH_SHORT).show();
        if(state1_more == 0){
            RelativeLayout rl = (RelativeLayout) findViewById(R.id.RL1_more);
            rl.setVisibility(View.VISIBLE);
            state1_more = 1;
        }
        else{
            RelativeLayout rl = (RelativeLayout) findViewById(R.id.RL1_more);
            rl.setVisibility(View.GONE);
            state1_more = 0;
        }
    }

    public void deleteOnClick1(View v) {
        Toast.makeText(MainActivity.this, "Delete clicked", Toast.LENGTH_SHORT).show();
        if(state1 == 1){
            RelativeLayout rl = (RelativeLayout) findViewById(R.id.RL1);
            rl.setVisibility(View.GONE);
            state1 = 0;
        }
        if(state1_more == 1){
            RelativeLayout rl = (RelativeLayout) findViewById(R.id.RL1_more);
            rl.setVisibility(View.GONE);
            state1_more = 0;
        }
        SwipeRevealLayout t = (SwipeRevealLayout) findViewById(R.id.swipe_layout_1);
        t.setVisibility(View.GONE);
    }

    public void layoutOneOnClick2(View v) {
        //int state = 0;
        Toast.makeText(MainActivity.this, "Layout 2 clicked", Toast.LENGTH_SHORT).show();
        if(state2 == 0){
            RelativeLayout rl = (RelativeLayout) findViewById(R.id.RL2);
            rl.setVisibility(View.VISIBLE);
            state2 = 1;
        }
        else{
            RelativeLayout rl = (RelativeLayout) findViewById(R.id.RL2);
            rl.setVisibility(View.GONE);
            state2 = 0;
        }
    }

    public void moreOnClick2(View v) {
        Toast.makeText(MainActivity.this, "More clicked", Toast.LENGTH_SHORT).show();
        if(state2_more == 0){
            RelativeLayout rl = (RelativeLayout) findViewById(R.id.RL2_more);
            rl.setVisibility(View.VISIBLE);
            state2_more = 1;
        }
        else{
            RelativeLayout rl = (RelativeLayout) findViewById(R.id.RL2_more);
            rl.setVisibility(View.GONE);
            state2_more = 0;
        }
    }

    public void deleteOnClick2(View v) {
        Toast.makeText(MainActivity.this, "Delete clicked", Toast.LENGTH_SHORT).show();
        if(state2 == 1){
            RelativeLayout rl = (RelativeLayout) findViewById(R.id.RL2);
            rl.setVisibility(View.GONE);
            state2 = 0;
        }
        if(state2_more == 1){
            RelativeLayout rl = (RelativeLayout) findViewById(R.id.RL2_more);
            rl.setVisibility(View.GONE);
            state2_more = 0;
        }
        SwipeRevealLayout t = (SwipeRevealLayout) findViewById(R.id.swipe_layout_2);
        t.setVisibility(View.GONE);
    }

    public void layoutOneOnClick3(View v) {
        //int state = 0;
        Toast.makeText(MainActivity.this, "Layout 3 clicked", Toast.LENGTH_SHORT).show();
        if(state3 == 0){
            RelativeLayout rl = (RelativeLayout) findViewById(R.id.RL3);
            rl.setVisibility(View.VISIBLE);
            state3 = 1;
        }
        else{
            RelativeLayout rl = (RelativeLayout) findViewById(R.id.RL3);
            rl.setVisibility(View.GONE);
            state3 = 0;
        }
    }

    public void moreOnClick3(View v) {
        Toast.makeText(MainActivity.this, "More clicked", Toast.LENGTH_SHORT).show();
        if(state3_more == 0){
            RelativeLayout rl = (RelativeLayout) findViewById(R.id.RL3_more);
            rl.setVisibility(View.VISIBLE);
            state3_more = 1;
        }
        else{
            RelativeLayout rl = (RelativeLayout) findViewById(R.id.RL3_more);
            rl.setVisibility(View.GONE);
            state3_more = 0;
        }
    }

    public void deleteOnClick3(View v) {
        Toast.makeText(MainActivity.this, "Delete clicked", Toast.LENGTH_SHORT).show();
        if(state3 == 1){
            RelativeLayout rl = (RelativeLayout) findViewById(R.id.RL3);
            rl.setVisibility(View.GONE);
            state3 = 0;
        }
        if(state3_more == 1){
            RelativeLayout rl = (RelativeLayout) findViewById(R.id.RL3_more);
            rl.setVisibility(View.GONE);
            state3_more = 0;
        }
        SwipeRevealLayout t = (SwipeRevealLayout) findViewById(R.id.swipe_layout_3);
        t.setVisibility(View.GONE);
    }

    public void layoutOneOnClick4(View v) {
        //int state = 0;
        Toast.makeText(MainActivity.this, "Layout 4 clicked", Toast.LENGTH_SHORT).show();
        if(state4 == 0){
            RelativeLayout rl = (RelativeLayout) findViewById(R.id.RL4);
            rl.setVisibility(View.VISIBLE);
            state4 = 1;
        }
        else{
            RelativeLayout rl = (RelativeLayout) findViewById(R.id.RL4);
            rl.setVisibility(View.GONE);
            state4 = 0;
        }
    }

    public void moreOnClick4(View v) {
        Toast.makeText(MainActivity.this, "More clicked", Toast.LENGTH_SHORT).show();
        if(state4_more == 0){
            RelativeLayout rl = (RelativeLayout) findViewById(R.id.RL4_more);
            rl.setVisibility(View.VISIBLE);
            state4_more = 1;
        }
        else{
            RelativeLayout rl = (RelativeLayout) findViewById(R.id.RL4_more);
            rl.setVisibility(View.GONE);
            state4_more = 0;
        }
    }

    public void deleteOnClick4(View v) {
        Toast.makeText(MainActivity.this, "Delete clicked", Toast.LENGTH_SHORT).show();
        if(state4 == 1){
            RelativeLayout rl = (RelativeLayout) findViewById(R.id.RL4);
            rl.setVisibility(View.GONE);
            state4 = 0;
        }
        if(state4_more == 1){
            RelativeLayout rl = (RelativeLayout) findViewById(R.id.RL4_more);
            rl.setVisibility(View.GONE);
            state4_more = 0;
        }
        SwipeRevealLayout t = (SwipeRevealLayout) findViewById(R.id.swipe_layout_4);
        t.setVisibility(View.GONE);
    }

    public void layoutOneOnClick5(View v) {
        //int state = 0;
        Toast.makeText(MainActivity.this, "Layout 5 clicked", Toast.LENGTH_SHORT).show();
        if(state5 == 0){
            RelativeLayout rl = (RelativeLayout) findViewById(R.id.RL5);
            rl.setVisibility(View.VISIBLE);
            state5 = 1;
        }
        else{
            RelativeLayout rl = (RelativeLayout) findViewById(R.id.RL5);
            rl.setVisibility(View.GONE);
            state5 = 0;
        }
    }

    public void moreOnClick5(View v) {
        Toast.makeText(MainActivity.this, "More clicked", Toast.LENGTH_SHORT).show();
        if(state5_more == 0){
            RelativeLayout rl = (RelativeLayout) findViewById(R.id.RL5_more);
            rl.setVisibility(View.VISIBLE);
            state5_more = 1;
        }
        else{
            RelativeLayout rl = (RelativeLayout) findViewById(R.id.RL5_more);
            rl.setVisibility(View.GONE);
            state5_more = 0;
        }
    }

    public void deleteOnClick5(View v) {
        Toast.makeText(MainActivity.this, "Delete clicked", Toast.LENGTH_SHORT).show();
        if(state5 == 1){
            RelativeLayout rl = (RelativeLayout) findViewById(R.id.RL5);
            rl.setVisibility(View.GONE);
            state5 = 0;
        }
        if(state5_more == 1){
            RelativeLayout rl = (RelativeLayout) findViewById(R.id.RL5_more);
            rl.setVisibility(View.GONE);
            state5_more = 0;
        }
        SwipeRevealLayout t = (SwipeRevealLayout) findViewById(R.id.swipe_layout_5);
        t.setVisibility(View.GONE);
    }
}
