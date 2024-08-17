package modulo_04.changeactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    }

    public void siguiente(View view){
        Intent intent = new Intent(this, SecondaryActivity.class);
        startActivity(intent);
    }
    public void cerrarApp(View view){
        finishAffinity();
    }

}