package bd.com.rafi.magnitudeconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectActivity extends AppCompatActivity implements View.OnClickListener {
Button currency,length,digitletter,pressure,weight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
        length=(Button)findViewById(R.id.length);
        digitletter=(Button)findViewById(R.id.digitletter);
        pressure=(Button)findViewById(R.id.pressure);
        currency=(Button)findViewById(R.id.currency);
        weight=(Button)findViewById(R.id.weight);




    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.length){
            Intent intent=new Intent(SelectActivity.this,TitleActivity.class);
            intent.putExtra("data","length");
            startActivity(intent);
        }
        else if(v.getId()==R.id.digitletter){
            Intent intent=new Intent(SelectActivity.this,TitleActivity.class);
            intent.putExtra("data","digitletter");
            startActivity(intent);
        }
        else if(v.getId()==R.id.pressure){
            Intent intent=new Intent(SelectActivity.this,TitleActivity.class);
            intent.putExtra("data","pressure");
            startActivity(intent);
        }
    }
}
