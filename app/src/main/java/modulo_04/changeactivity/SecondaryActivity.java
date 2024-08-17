package modulo_04.changeactivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SecondaryActivity extends AppCompatActivity {
    private WebView mywebView;
    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_secondary);
        mywebView = (WebView) findViewById(R.id.webview);
        mywebView.setWebViewClient(new WebViewClient());
        url = getString(R.string.txt_URL);

    }
    public void btn_goToURL(View view){
        mywebView.loadUrl(url);
        WebSettings webSettings=mywebView.getSettings();
        webSettings.setJavaScriptEnabled(false);
    }

    public void atras(View view ){
        Intent in = new Intent(this, MainActivity.class);
        startActivity(in);
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.d("_OnStart_", "OnStart Method");
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.d("_OnResume_", "OnResume Method");
    }
    @Override
    public void onPause(){
        super.onPause();
        Log.d("_OnPause_", "OnPause Method");
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.d("_OnStop_", "OnStop Method");
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d("_OnDestroy_", "OnDestroy Method");
    }
}