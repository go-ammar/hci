package com.example.hciscreens;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;

import com.example.hciscreens.databinding.ActivityMainBinding;
import com.example.hciscreens.databinding.CoronaDialogBinding;
import com.example.hciscreens.ui.AboutDetails;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.menu.setOnClickListener(v -> {
            startActivity(new Intent(this, mapfile.class));
        });

        binding.today.setChipBackgroundColor(ColorStateList.valueOf(getResources().getColor(R.color.purple_200)));


        binding.notificationBackground.setOnClickListener(v -> {

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

        binding.seriousCV.setOnClickListener(v -> {
            startActivity(new Intent(this, loginActivity.class));
        });

        binding.affectedCV.setOnClickListener(v -> {
            startActivity(new Intent(this, AboutDetails.class));
        });

        binding.activeCV.setOnClickListener(v -> {
            startActivity(new Intent(this, sopViolations.class));
        });

    }


}