package bd.com.rafi.magnitudeconverter;

import androidx.appcompat.app.AppCompatActivity;



import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertActivity extends AppCompatActivity {
    EditText e1,e2,e3;
    TextView convertiontype,t2;
    ImageButton imagebtn,imagebtn2;
    Button convert;
    ArrayList<String> item,subitem;
    int skip=0;
    String from,to;
    static public NumberToWords.AbstractProcessor processor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert);
        // s1=findViewById(R.id.spinner1);
        imagebtn=(ImageButton)findViewById(R.id.imagebutton);
        imagebtn2=(ImageButton)findViewById(R.id.imagebutton1);
       convertiontype=(TextView)findViewById(R.id.convertiontype);
        convert=(Button)findViewById(R.id.convert);
       e1=(EditText)findViewById(R.id.spinner);
       e2=(EditText)findViewById(R.id.spinner1);
       e3=(EditText)findViewById(R.id.spinner2);
        final String data=getIntent().getStringExtra("value");
        convertiontype.setText(data);
        dataload(data);
        imagebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopup2(view);
            }
        });
        imagebtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopup3(view);
            }
        });
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (data.equals("Currency")) {

                ConverterDollarToBDT converterDollarToBDT = new ConverterDollarToBDT();

                e3.setText(String.valueOf(converterDollarToBDT.CurrencyConverter(Float.valueOf(e1.getText().toString()), from, to)));
            }
                else if(data.equals("Length")){
                    LengthConverter lengthConverter=new LengthConverter();
                   // Log.e("kenthg",lengthConverter.getresult("Kilometer","Meter","12"));
                    e3.setText(String.valueOf(lengthConverter.getresult(from, to,e1.getText().toString())));
                }
                else if(data.equals("Number")){

                }
                else if(data.equals("Word")){

                }
                else if(data.equals("Pressure")){

                }
                else if(data.equals("Temperature")){

                }
                else if(data.equals("Time")){

                }
                else if(data.equals("Weight")){

                }
            }
        });




        //getActionBar().setTitle(data);
        /*if(data.equals("Numeric")){
            t2.setText("word");
            t1.setText("Numeric");
            //e2.setEnabled(false);
        }
        else{
            t1.setText("word");
            t2.setText("Numeric");

           // e2.setEnabled(false);

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
        });*/


    }



    public void converterNumbertoWord(){

        processor=new NumberToWords.DefaultProcessor();


            e2.setText(processor.getName(e1.getText().toString()));
    }

    public void convertWordtoNumber(){
        String word=e1.getText().toString();
        long digit=WordNNumber.wordToNumber(word,ConvertActivity.this);
       // Toast.makeText(ConvertActivity.this,digit,Toast.LENGTH_SHORT).show();
        e2.setText(Long.toString(digit));
    }

    public void dataload(String value){
          item=new ArrayList<>();
          subitem=new ArrayList<>();

        final String [] currencylist = {"USA(Dollar)","Bangladesh(Bdt)","India(Rupee)","Uk(Pound)","UAE(Dirham)","China(Yuan)"};
        final String [] lengthlist={"Kilometer","Meter","Centimeter","Millimeter","Micrometer","Mile","Yard","Foot","Inch"};
        final String [] pressurelist = {"Bar","Pascal","Kilo Pascal","PSI","ATM"};
        final String [] temparaturelist = {"Centigrade","Fahrenheit","Kelvin"};
        final String [] weightlist = {"Kilogram","Gram","Pound","Ton","Ounce"};

        final String [] timelist = {"Minuite","Second","Hour","Day","Week","Year"};
        final String [] numberlist= {"Decimal","Octal","Binary","Hexadecimal"};
        final String [] wordtonumber = {"Word","Number"};
        final String [] numbertoword = {"Number","Word"};


        if(value.equals("Currency")){
            item.addAll(Arrays.asList(currencylist));
            subitem.addAll(Arrays.asList(currencylist));

            e1.setHint(item.get(0));
            e2.setHint(item.get(1));
            from=item.get(0);
            to=item.get(1);

        }
        else if(value.equals("Length")){
            item.addAll(Arrays.asList(lengthlist));
            subitem.addAll(Arrays.asList(lengthlist));
            e1.setHint(item.get(0));
            e2.setHint(item.get(1));
            from=item.get(0);
            to=item.get(1);
        }
    }
    private void showPopup2(View v){
        PopupMenu popupMenu=new PopupMenu(this,v);
        for(int j=0;j<item.size();j++){
            popupMenu.getMenu().add(item.get(j));
        }
        popupMenu.getMenuInflater().inflate(R.menu.popup,popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                CharSequence charSequence=menuItem.getTitle();
                e1.setHint(charSequence);
                from=charSequence.toString();
                skip=item.indexOf(charSequence);
                subitem.clear();
                subitem.addAll(item);
                subitem.remove(skip);
                e2.setHint(subitem.get(0));
                to=subitem.get(0);


                return true;
            }
        });

        popupMenu.show();
    }
    private void showPopup3(View v){
        PopupMenu popupMenu=new PopupMenu(this,v);
        for(int j=0;j<subitem.size();j++){
            /*if(skip==j) {
                continue;
            }*/
            popupMenu.getMenu().add(subitem.get(j));
        }
        popupMenu.getMenuInflater().inflate(R.menu.popup,popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                CharSequence charSequence=menuItem.getTitle();
                e2.setHint(charSequence);
                to=charSequence.toString();
                return true;
            }
        });

        popupMenu.show();
    }



}

