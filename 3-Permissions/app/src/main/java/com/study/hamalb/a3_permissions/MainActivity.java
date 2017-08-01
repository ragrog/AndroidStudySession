package com.study.hamalb.a3_permissions;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.PermissionChecker;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private Button button;
    private TextView permissionText;
    private String LOCAL_FILE = "log.txt";
    private static final int REQUEST_CODE_WRITE_PERMISSION = 222; // 番号は適当で良い
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.editText);
        button = (Button)findViewById(R.id.button);
        permissionText = (TextView)findViewById(R.id.permission);

        LOCAL_FILE = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)  + "/" + LOCAL_FILE;

        if (PermissionChecker.checkSelfPermission(
                MainActivity.this, Manifest.permission.WRITE_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {
            permissionText.setText("パーミッションがありません");
            requestPermission();
        } else {
            permissionText.setText("パーミッションがあります");
        }


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FileOutputStream  out;
                try {
                    out = new FileOutputStream(LOCAL_FILE);
                    out.write(editText.getText().toString().getBytes());
                    out.close();
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                } catch (IOException e) {
                    // TODO 自動生成された catch ブロック
                    e.printStackTrace();
                }
            }
        });


    }
    private void requestPermission(){
        // 権限を取得する
        ActivityCompat.requestPermissions(this, new String[]{
                        Manifest.permission.WRITE_EXTERNAL_STORAGE
                }, REQUEST_CODE_WRITE_PERMISSION);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == REQUEST_CODE_WRITE_PERMISSION) {
            permissionText.setText("パーミッションがあります");
        } else {
            super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }
}
