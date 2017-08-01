package com.study.hamalb.listenerandadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SimpleListenerActivity extends AppCompatActivity {
    private TextView textView;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listener_simple);

        // viewを取得
        textView = (TextView)findViewById(R.id.textView);
        button = (Button)findViewById(R.id.button);

        // リスナーをセット
        button.setOnClickListener(new ButtonClickListener());
        button.setOnLongClickListener(new ButtonLongClickListener());
    }

    // OnClickListenerを継承したクラス
    private class ButtonClickListener implements View.OnClickListener{
        private int counter;

        // コンストラクタ
        public ButtonClickListener(){
            counter = 0;
        }

        // クリックすると呼び出されるメソッド
        @Override
        public void onClick(View view) {
            // click回数を表示
            textView.setText("click : " + Integer.toString(counter));
            counter += 1;
        }
    }
    // OnLongClickListenerを継承したクラス
    private class ButtonLongClickListener implements View.OnLongClickListener{

        // ロングクリックすると呼び出されるメソッド
        @Override
        public boolean onLongClick(View view) {
            // long clickと表示
            textView.setText("long click");
            return false;
        }
    }
}
