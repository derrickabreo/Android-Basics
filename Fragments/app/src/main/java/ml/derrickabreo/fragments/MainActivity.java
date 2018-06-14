package ml.derrickabreo.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;

public class MainActivity extends AppCompatActivity implements TopSectionFragment.TopSectionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //THis get called by topFragment when user clicks button
    @Override
    public void createMeme(String top, String bottom) {
        BottomPictureFragment bottomPictureFragment = (BottomPictureFragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        bottomPictureFragment.setMemeText(top, bottom);
    }
}
