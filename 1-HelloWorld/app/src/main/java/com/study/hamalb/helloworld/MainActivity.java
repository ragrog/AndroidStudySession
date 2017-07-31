package com.study.hamalb.helloworld;

// 必要なライブラリをimportする
// Alt + Enterで必要なライブラリを追加
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

// AppCompatActivityを継承してMainActivityを実装
public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private static final String TAG = "MainActivity_DEBUG"; // DebugLog検索用のタグ

    /**
     * Activityが生成された時に呼ばれるメソッド
     * @link https://developer.android.com/guide/components/activities/activity-lifecycle.html
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // 使用するレイアウトを指定 (res/layout/activity_main

        /** テストコード **/
        int i = 0;
        // LayoutID helloTextからTextView型のviewを取得しtextViewに代入
        // textViewの文章を変更
        textView = (TextView)findViewById(R.id.helloText);
        textView.setText("こんにちは世界 : " + Integer.toString(i));

        i = 3;
        // Logで出力
        // AndroidMonitorで出力を見ることができる
        // BrakePointと平行的に利用する
        Log.d(TAG, Integer.toString(i));
    }
}
