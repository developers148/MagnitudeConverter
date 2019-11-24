package bd.com.rafi.magnitudeconverter;

import androidx.appcompat.app.AppCompatActivity;



import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ConvertActivity extends AppCompatActivity {
EditText e1,e2;
TextView t1,t2;
    static public NumberToWords.AbstractProcessor processor;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert);
        e1=(EditText)findViewById(R.id.e1);
        e2=(EditText)findViewById(R.id.e2);
        t1=(TextView)findViewById(R.id.t1);
        t2=(TextView)findViewById(R.id.t2);

        button=(Button)findViewById(R.id.Convert);
        final String data=getIntent().getStringExtra("data");
        //getActionBar().setTitle(data);
        if(data.equals("Numeric")){
            t2.setText("word");
            t1.setText("Numeric");
            e2.setEnabled(false);
        }
        else{
            t1.setText("word");
            t2.setText("Numeric");

            e2.setEnabled(false);

        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(data.equals("Numeric")){
                    converterNumbertoWord();

                }
                else{
                    convertWordtoNumber();
                }
            }
        });




    }

    public void converterNumbertoWord(){

        processor=new NumberToWords.DefaultProcessor();


            e2.setText(processor.getName(e1.getText().toString()));
    }

    public void convertWordtoNumber(){
        String word=e1.getText().toString();
        long digit=WordNNumber.wordToNumber(word);
        e2.setText(Long.toString(digit));
    }
}
