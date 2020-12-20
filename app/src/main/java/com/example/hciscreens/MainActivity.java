package com.example.hciscreens;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.databinding.DataBindingUtil;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.example.hciscreens.databinding.ActivityMainBinding;
import com.example.hciscreens.databinding.CoronaDialogBinding;
import com.example.hciscreens.ui.AboutDetails;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

public class    MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);



        binding.layout.menu.setOnClickListener(v -> {
            startActivity(new Intent(this, mapfile.class));
        });

        binding.layout.today.setChipBackgroundColor(ColorStateList.valueOf(getResources().getColor(R.color.purple_200)));


        binding.layout.notificationBackground.setOnClickListener(v -> {

            CoronaDialogBinding binding2 = DataBindingUtil.inflate(LayoutInflater.from(this), R.layout.corona_dialog,
                    null, false);
            AlertDialog dialog = new AlertDialog.Builder(this)
                    .setView(binding2.getRoot())
                    .create();

            if (dialog.getWindow() != null)
                dialog.getWindow().getAttributes();
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

            dialog.show();


            binding2.CancelBtn.setOnClickListener(view -> {
                dialog.dismiss();
            });

            binding2.updateRoomBtn.setOnClickListener(view -> {
                dialog.dismiss();
            });


        });

        binding.layout.seriousCV.setOnClickListener(v -> {
            startActivity(new Intent(this, loginActivity.class));
        });

        binding.layout.affectedCV.setOnClickListener(v -> {
            startActivity(new Intent(this, AboutDetails.class));
        });

        binding.layout.activeCV.setOnClickListener(v -> {
            startActivity(new Intent(this, sopViolations.class));
        });

        binding.layout.menu.setOnClickListener(v -> {

            if (binding.drawerLayout.isDrawerOpen(GravityCompat.END)) {
                binding.drawerLayout.closeDrawer(GravityCompat.END);
            } else {
                binding.drawerLayout.openDrawer(GravityCompat.END);
            }

        });

    }


}