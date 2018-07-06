package co.thedevden.firstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.myRecyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        String[] arr = {"Hello","C","C++","VB","Today","is","Friday","What","apple"};
        recyclerView.setAdapter(new myAdapter(arr));



    }


    //Test Comment Check Now Quick
}
