package ml.derrickabreo.fragments;

//import android.app.Fragment;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by derri on 06/02/2018.
 */

public class BottomPictureFragment extends Fragment{

    private TextView topMemeText;
    private TextView bottomMemeText;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_picture_fragment,container,false);
        topMemeText = view.findViewById(R.id.TopMemetext);
        bottomMemeText = view.findViewById(R.id.BottomMemeText);
        return view;
    }

    public void setMemeText(String top, String bottom){
        topMemeText.setText(top);
        bottomMemeText.setText(bottom);
    }
}
