package com.example.android.p1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void movieToast(View view) {
        Toast.makeText(MainActivity.this, "启动应用：热门电影", Toast.LENGTH_SHORT).show();
    }

    public void stockToast(View view) {
        Toast.makeText(MainActivity.this, "启动应用：股票雄鹰", Toast.LENGTH_SHORT).show();
    }

    public void readerToast(View view) {
        Toast.makeText(MainActivity.this, "启动应用：XYZ阅读器", Toast.LENGTH_SHORT).show();
    }

    public void newsToast(View view) {
        Toast.makeText(MainActivity.this, "启动应用：最新闻", Toast.LENGTH_SHORT).show();
    }

    public void designToast(View view) {
        Toast.makeText(MainActivity.this, "启动应用：毕业设计", Toast.LENGTH_SHORT).show();
    }
}
