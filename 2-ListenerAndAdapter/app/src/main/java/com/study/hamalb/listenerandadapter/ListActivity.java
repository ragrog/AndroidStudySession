package com.study.hamalb.listenerandadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {
    private ListView list;
    private String[] data = {"愛知", "三重", "岐阜", "静岡"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


        // ListViewを取得
        list = (ListView)findViewById(R.id.list);
        // data配列からAdapterを作成
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        //Adapterをセット
        list.setAdapter(adapter);
    }
}
