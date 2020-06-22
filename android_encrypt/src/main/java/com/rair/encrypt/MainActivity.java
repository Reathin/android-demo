package com.rair.encrypt;

import android.os.Bundle;
import android.util.Base64;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.nio.charset.StandardCharsets;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String oldWord = "大家要注意身体，不要熬夜写代码";
        String encodeWord = Base64.encodeToString(oldWord.getBytes(StandardCharsets.UTF_8), Base64.NO_WRAP);
        Log.i("Rair", " encode words = " + encodeWord);
        String decodeWord = new String(Base64.decode(encodeWord, Base64.NO_WRAP), StandardCharsets.UTF_8);
        Log.i("Rair", "encode words = " + decodeWord);
    }
}
