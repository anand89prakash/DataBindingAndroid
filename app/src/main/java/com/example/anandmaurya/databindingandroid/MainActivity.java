package com.example.anandmaurya.databindingandroid;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.anandmaurya.databindingandroid.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding mainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        UserDataModel userData = new UserDataModel("Anand" , "Prakash");
        mainBinding.setUserdata(userData);
        mainBinding.fullName.setText(mainBinding.getUserdata().getFirstName()+ " " +mainBinding.getUserdata().getLastName());
    }
}
