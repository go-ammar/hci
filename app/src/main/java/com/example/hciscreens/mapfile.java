package com.example.hciscreens;

import android.os.Bundle;

import com.example.hciscreens.databinding.ActivityMapfileBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.navigation.ui.AppBarConfiguration;

import android.view.MenuItem;
import android.view.View;

import java.util.Objects;

public class mapfile extends AppCompatActivity {

    AppBarConfiguration appBarConfiguration;
    ActivityMapfileBinding binding;


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_mapfile);
//        setContentView(R.layout.activity_mapfile);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Radius Alert");
//        toolbar.setVisibility(View.GONE);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        getSupportActionBar().setTitle("Radius Alert");

//        appBarConfiguration= new AppBarConfiguration.Builder(
//                R.id.nav_dashboard,
//                R.id.nav_notifications,
//                R.id.nav_contact, R.id.nav_about)
//                .setOpenableLayout(binding.drawerLayout)
//                .build();

    }
}