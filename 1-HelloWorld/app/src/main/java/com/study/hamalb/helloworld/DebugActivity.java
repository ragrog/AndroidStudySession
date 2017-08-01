package com.study.hamalb.helloworld;

// 必要なライブラリをimportする
// Alt + Enterで必要なライブラリを追加

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class DebugActivity extends AppCompatActivity {
    private TextView textView;
    private static final String TAG = "TestActivity_DEBUG"; // DebugLog検索用のタグ

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debug);

        int i = 0;
        // LayoutID helloTextからTextView型のviewを取得しtextViewに代入
        // textViewの文章を変更
        textView = (TextView)findViewById(R.id.debug);
        textView.setText("こんにちは世界 : " + Integer.toString(i));

        i = 3;
        // Logで出力
        // AndroidMonitorで出力を見ることができる
        // BrakePointと平行的に利用する
        Log.d(TAG, Integer.toString(i));
    }
}
