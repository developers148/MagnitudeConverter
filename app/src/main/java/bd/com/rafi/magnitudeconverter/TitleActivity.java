package bd.com.rafi.magnitudeconverter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class TitleActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void click(View v){

        if(v.getId()==R.id.currencyimage||v.getId()==R.id.currencytext){
            Intent i=new Intent(TitleActivity.this,ConvertActivity.class);
            i.putExtra("value","Currency");
            startActivity(i);

        }
        else if(v.getId()==R.id.lengthtext1||v.getId()==R.id.lenthgimage){
            Intent i=new Intent(TitleActivity.this,ConvertActivity.class);
            i.putExtra("value","Length");
            startActivity(i);

        }
        else if(v.getId()==R.id.numberimage||v.getId()==R.id.numbertext2){
            Intent i=new Intent(TitleActivity.this,ConvertActivity.class);
            i.putExtra("value","Number");
            startActivity(i);
        }
        else if(v.getId()==R.id.wordimage||v.getId()==R.id.wordtext3){
            Intent i=new Intent(TitleActivity.this,ConvertActivity.class);
            i.putExtra("value","Word");
            startActivity(i);
        }
        else if(v.getId()==R.id.pressureimage||v.getId()==R.id.pressuretext4){
            Intent i=new Intent(TitleActivity.this,ConvertActivity.class);
            i.putExtra("value","Pressure");
            startActivity(i);
        }
        else if(v.getId()==R.id.temparatureimage||v.getId()==R.id.temparaturetext5){
            Intent i=new Intent(TitleActivity.this,ConvertActivity.class);
            i.putExtra("value","Temperature");
            startActivity(i);
        }
        else if(v.getId()==R.id.timetext6||v.getId()==R.id.timeiamge){
            Intent i=new Intent(TitleActivity.this,ConvertActivity.class);
            i.putExtra("value","Time");
            startActivity(i);
        }
        else if(v.getId()==R.id.weightimage||v.getId()==R.id.weighttext7){
            Intent i=new Intent(TitleActivity.this,ConvertActivity.class);
            i.putExtra("value","Weight");
            startActivity(i);
        }
    }

}