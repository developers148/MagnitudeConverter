package bd.com.rafi.magnitudeconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class TitleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent= new Intent(TitleActivity.this,ConvertActivity.class);
        intent.putExtra("data","wordtonumeric");
        startActivity(intent);
    }
}
