package com.study.hamalb.helloworld;

// 必要なライブラリをimportする
// Alt + Enterで必要なライブラリを追加
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

// AppCompatActivityを継承してMainActivityを実装
public class MainActivity extends AppCompatActivity {
    private TextView textView;

    /**
     * Activityが生成された時に呼ばれるメソッド
     * @link https://developer.android.com/guide/components/activities/activity-lifecycle.html
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // 使用するレイアウトを指定 (res/layout/activity_main

        // LayoutID helloTextからTextView型のviewを取得しtextViewに代入
        // textViewの文章を変更
        textView = (TextView)findViewById(R.id.helloText);

        // 直接入れる方法 (HardCode
        textView.setText("研究は論文を書く前提で進めると良い");

        // strings.xmlを経由する方法
        textView.setText(getString(R.string.tips));
    }
}
