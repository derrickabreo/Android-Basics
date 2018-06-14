package ml.derrickabreo.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    Adapter adapter;
    datasource[] data ={
            new datasource("david"),
            new datasource("Petr"),
            new datasource("Per"),
            new datasource("Laurent"),
            new datasource("ROB"),
            new datasource("Calum"),
            new datasource("david"),
            new datasource("Petr"),
            new datasource("Per"),
            new datasource("Laurent"),
            new datasource("ROB"),
            new datasource("Calum"),
            new datasource("david"),
            new datasource("Petr"),
            new datasource("Per"),
            new datasource("Laurent"),
            new datasource("ROB"),
            new datasource("Calum")
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycle);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new Adapter(data);
        recyclerView.setAdapter(adapter);
    }

}
