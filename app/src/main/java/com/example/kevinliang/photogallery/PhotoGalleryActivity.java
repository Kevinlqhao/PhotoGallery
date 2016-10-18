package com.example.kevinliang.photogallery;


public class PhotoGalleryActivity extends SingleFragmentActivity {

    @Override
    public PhotoGalleryFragment createFragment() {
        return PhotoGalleryFragment.newInstance();
    }

}
