package com.divesh.chairshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.divesh.chairshop.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<Fragment> mFragmentsList = new ArrayList<>();
        mFragmentsList.add(new FirstFragment());
        mFragmentsList.add(new SecondFragment());
        mFragmentsList.add(new ThirdFragment());

        ViewPagerAdapter pagerAdapter = new ViewPagerAdapter(this,mFragmentsList);

        binding.viewpager.setAdapter(pagerAdapter);



    }
}