package com.baiminai.giuhub.com.androidfragment_adapter_recyclerview_mainactivity;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.baiminai.giuhub.com.androidfragment_adapter_recyclerview_mainactivity.Fragment.FARMFragment;

public class MainActivity extends AppCompatActivity {
/*
*
* Android
* Fragment-Adapter-RecyclerView-MainActivity-Data
* 文画baiminai的giuhub欢迎star
*
* */

private FARMFragment farmFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        replaceFragment(farmFragment);
    }
    private void replaceFragment(FARMFragment fragment){
        android.support.v4.app.FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.framelayout,fragment);
        fragmentTransaction.commit();

    }
}
