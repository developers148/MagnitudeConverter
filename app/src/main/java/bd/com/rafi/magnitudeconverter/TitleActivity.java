package bd.com.rafi.magnitudeconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class TitleActivity extends AppCompatActivity  implements View.OnClickListener {

    public String value1 = "Numeric", value2 = "Alphabetic";
    ImageButton imageButton1,imageButton2,imageButton3;
    RelativeLayout relativeLayout, relativeLayout2;
    TextView textView1, textView2,textView3;
    Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submitBtn = findViewById(R.id.submit);

        imageButton1 = findViewById(R.id.imageBtn1);
        textView1 = findViewById(R.id.textv1);

        imageButton2 = findViewById(R.id.imageBtn2);
        textView2 = findViewById(R.id.textv2);

        imageButton3 = findViewById(R.id.imageBtn3);
        textView3 = findViewById(R.id.textv3);

        imageButton1.setOnClickListener(this);
        textView1.setOnClickListener(this);

        imageButton2.setOnClickListener(this);
        textView2.setOnClickListener(this);

        imageButton3.setOnClickListener(this);
        textView3.setOnClickListener(this);



        submitBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.imageBtn1 || view.getId() == R.id.textv1) {
            showPopup(view);

        }

        if (view.getId() == R.id.submit){
          Intent i=new Intent(TitleActivity.this,ConvertActivity.class);
          i.putExtra("data",textView1.getText().toString());
          startActivity(i);
        }

        }


    private void showPopup(View v){
        PopupMenu popup = new PopupMenu(this,v);
        popup.getMenuInflater().inflate(R.menu.popup, popup.getMenu());

        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.ConvertDollarToBDT:
                        textView1.setText("Convert Dollar To BDT");
                        value1 = textView1.getText().toString();

                        //textView2.setText("Alphabetic");

                        if(value1 == "Convert Dollar To BDT"){

                        }
                        return true;

                    case R.id.LengthConverter:
                        textView1.setText("Length Converter");
                        value1 = textView1.getText().toString();
                        //textView2.setText("Numeric");
                        return true;

                    case R.id.NumberConverter:
                        textView1.setText("Number Converter");
                        value1 = textView1.getText().toString();
                        //textView2.setText("Numeric");
                        return true;

                    case R.id.NumbersToWord:
                        textView1.setText("Numbers To Word");
                        value1 = textView1.getText().toString();
                        //textView2.setText("Numeric");
                        return true;

                    case R.id.pressureConverter:
                        textView1.setText("Pressure Converter");
                        value1 = textView1.getText().toString();
                        //textView2.setText("Numeric");
                        return true;
                    case R.id.timeConverter:
                        textView1.setText("Time Converter");
                        value1 = textView1.getText().toString();
                        //textView2.setText("Numeric");
                        return true;
                    case R.id.weightMassConverter:
                        textView1.setText("Weight Mass Converter");
                        value1 = textView1.getText().toString();
                        //textView2.setText("Numeric");
                        return true;
                    case R.id.wordToNumber:
                        textView1.setText("Word To Number");
                        value1 = textView1.getText().toString();
                        //textView2.setText("Numeric");
                        return true;

                    default:
                        return false;
                }
            }
        });

        popup.show();
    }

}