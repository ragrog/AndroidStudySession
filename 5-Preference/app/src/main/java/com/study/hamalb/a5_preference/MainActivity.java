package com.study.hamalb.a5_preference;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static final String PREF_KEY = "TEXT";
    private static final String FILE_NAME = "PREF";

    private Button button;
    private EditText editText;
    private SharedPreferences prefer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // preferを取得
        prefer = getSharedPreferences(FILE_NAME, MODE_PRIVATE);

        // viewを取得
        button = (Button)findViewById(R.id.button);
        editText = (EditText)findViewById(R.id.edit);

        // テキストを読み込んでEditTextにセット
        editText.setText(load());

        // buttonのリスナーをセット
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // データを保存する
                store(editText.getText().toString());
            }
        });
    }

    // prefから読み込んで値を返す
    private String load(){
        return prefer.getString(PREF_KEY, "");
    }

    // prefにデータを保存する
    private void store(String text){
        SharedPreferences.Editor editor = prefer.edit();
        editor.putString(PREF_KEY, text).apply();
    }
}
