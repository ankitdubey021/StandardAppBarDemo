package org.ankit.standardappbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import adaptors.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    Toolbar myToolBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myToolBar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(myToolBar);
        setList();
    }


    private void setList(){
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.simpleList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        ArrayAdapter arrayAdapter = new ArrayAdapter(getData());
        recyclerView.setAdapter(arrayAdapter);

    }
    private String[] getData() {
        String[] data = new String[50];
        for(int i=0;i<50;++i){
            data[i]=("Player "+((i+1)));
        }
        return data;
    }
}
