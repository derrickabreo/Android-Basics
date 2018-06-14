package ml.derrickabreo.fragments;

//import android.app.Fragment;
import android.support.v4.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by derri on 06/02/2018.
 */

public class TopSectionFragment extends Fragment {
    private EditText topTextInput;
    private EditText bottomTextInput;

    TopSectionListener activityCommander;

    public interface TopSectionListener{
        void createMeme(String  top, String bottom);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            activityCommander = (TopSectionListener) context;
        }catch (ClassCastException e){
            throw new ClassCastException(context.toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_section_fragment,container,false);

        topTextInput = view.findViewById(R.id.topTextInput);
        bottomTextInput = view.findViewById(R.id.bottomTextInput);
        Button button =  view.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activityCommander.createMeme(topTextInput.getText().toString(),bottomTextInput.getText().toString());
            }
        });

        return view;
    }
    //gets called whenever button is clicked

}
