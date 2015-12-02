package com.example.maoztamir.recyclerview;

        import android.os.Bundle;
        import android.support.v7.widget.DefaultItemAnimator;
        import android.support.v7.widget.LinearLayoutManager;
        import android.support.v7.widget.RecyclerView;
        import android.app.Activity;
        import android.widget.Button;
        import android.content.Intent;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.widget.Toast;
        import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        
        ArrayList<ItemData> itemsData = new ArrayList<ItemData>() {
            {
                add(new ItemData("mission 1",R.drawable.ic_action_name));
                add(new ItemData("mission 2",R.drawable.ic_action_name));
                add(new ItemData("mission 3",R.drawable.ic_action_name));
                add(new ItemData("mission 4",R.drawable.ic_action_name));
                add(new ItemData("mission 5",R.drawable.ic_action_name));
                add(new ItemData("mission 6",R.drawable.ic_action_name));
                add(new ItemData("mission 7",R.drawable.ic_action_name));
                add(new ItemData("mission 8",R.drawable.ic_action_name));
                add(new ItemData("mission 9",R.drawable.ic_action_name));
                add(new ItemData("mission 10",R.drawable.ic_action_name));
                add(new ItemData("mission 11",R.drawable.ic_action_name));
                add(new ItemData("mission 12",R.drawable.ic_action_name));
                add(new ItemData("mission 13",R.drawable.ic_action_name));
                add(new ItemData("mission 14",R.drawable.ic_action_name));
                add(new ItemData("mission 15",R.drawable.ic_action_name));
                add(new ItemData("mission 16",R.drawable.ic_action_name));
                add(new ItemData("mission 17",R.drawable.ic_action_name));
                add(new ItemData("mission 18",R.drawable.ic_action_name));
                add(new ItemData("mission 19",R.drawable.ic_action_name));
                add(new ItemData("mission 20",R.drawable.ic_action_name));
            }
        };

        recyclerView.setLayoutManager(new LinearLayoutManager(this)); // set layoutManger
        MyAdapter mAdapter = new MyAdapter(itemsData);  // create an adapter
        recyclerView.setAdapter(mAdapter);  // set adapter
        recyclerView.setItemAnimator(new DefaultItemAnimator()); // set item animator to DefaultAnimator

        Button button;
        button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                Intent myIntent = new Intent(MainActivity.this, CreateTaskActivity.class);
                startActivity(myIntent);
            }
        });

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("txtData");
            Toast.makeText(getApplicationContext(), "added the task: " + value ,
                    Toast.LENGTH_LONG).show();
            ItemData tempTask =new ItemData(value,R.drawable.ic_action_name);
            itemsData.add(tempTask);
            mAdapter.notifyDataSetChanged();
        }

    }
}