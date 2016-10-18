package com.example.kevinliang.photogallery;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.example.kevinliang.photogallery.R;

/**
 * Created by kevinliang on 2016/8/11.
 */
public abstract class SingleFragmentActivity extends AppCompatActivity {
    protected abstract PhotoGalleryFragment createFragment();

    @LayoutRes
    protected int getLayoutResId() {
        return R.layout.activity_fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_fragment);
         setContentView(getLayoutResId());
        FragmentManager fm = getSupportFragmentManager();
        //添加一个CrimeFragment
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
            fragment = createFragment();
            fm.beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }
    }
}
