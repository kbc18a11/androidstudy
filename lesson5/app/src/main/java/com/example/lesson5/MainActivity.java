package com.example.lesson5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> menuList = new ArrayList<>();
        menuList.add("ちきん");
        menuList.add("うし");
        menuList.add("ぶた");
        menuList.add("やさい");

        ListView lvMenu = findViewById(R.id.lvMenu);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                menuList
        );

        lvMenu.setAdapter(adapter);
        lvMenu.setOnItemClickListener(new ListItemClickListener());
    }

    private class ListItemClickListener implements AdapterView.OnItemClickListener{
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
            OderConfirmDialogFragment dialogFragment = new OderConfirmDialogFragment();
            dialogFragment.show(getSupportFragmentManager(),"OderConfirmDialogFragment");
        }
    }
}