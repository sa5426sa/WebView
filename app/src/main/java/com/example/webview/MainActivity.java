package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    WebView WV;
    String URL;
    EditText address;
    Button go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WV = findViewById(R.id.WV);
        address = findViewById(R.id.address);
        go = findViewById(R.id.go);
        WV.getSettings().setJavaScriptEnabled(true);
    }
    public void getAddress(EditText edt){
        URL=edt.getText().toString();
    }

    public void goToWebsite(View view) {
        getAddress(address);
        WV.loadUrl(URL);
    }
}
