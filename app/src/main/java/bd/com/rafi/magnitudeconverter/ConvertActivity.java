package bd.com.rafi.magnitudeconverter;

import androidx.appcompat.app.AppCompatActivity;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.Arrays;

public class ConvertActivity extends AppCompatActivity {
    EditText e1,e2,e3;

   // TextView convertiontype,t2;
    ImageButton imagebtn,imagebtn2;
    Button convert;
    ArrayList<String> item,subitem;
    int skip=0;
    String from,to;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert);
        imagebtn=findViewById(R.id.imagebutton);
        imagebtn2=findViewById(R.id.imagebutton1);
        convert=findViewById(R.id.convert);
        e1=findViewById(R.id.spinner);
        e2=findViewById(R.id.spinner1);
        e3=findViewById(R.id.spinner2);





        final String data=getIntent().getStringExtra("value");
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
                InputMethodManager imm = (InputMethodManager) ConvertActivity.this.getSystemService(Activity.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
                if (data.equals("Currency")) {

                ConverterDollarToBDT converterDollarToBDT = new ConverterDollarToBDT();
                String result=String.valueOf(converterDollarToBDT.CurrencyConverter(Float.valueOf(e1.getText().toString()), from, to));
                e3.setText(result);

            }
                else if(data.equals("Length")){
                    LengthConverter lengthConverter=new LengthConverter();
                    e3.setText(String.valueOf(lengthConverter.getresult(from, to,e1.getText().toString())));
                }
                else if(data.equals("Number")){
                    NumberConversion n=new NumberConversion();
                   e3.setText(n.numberSystemConversion(e1.getText().toString(),from,to));
                }
                else if(data.equals("Word")){
                      if(from.equals("Word")){
                         e3.setText(String.valueOf(WordNNumber.wordToNumber(e1.getText().toString())));
                      }
                      else{
                          NumberToWords.AbstractProcessor processor;
                          processor=new NumberToWords.DefaultProcessor();
                          e3.setText(processor.getName(e1.getText().toString()));
                      }
                }
                else if(data.equals("Pressure")){
                 PressureConverter p=new PressureConverter();
                 e3.setText(p.BarToPascal(e1.getText().toString(),from,to));

                }
                else if(data.equals("Temperature")){
                  TempCon t=new TempCon();
                  e3.setText(t.tempConversion(e1.getText().toString(),from,to));
                }
                else if(data.equals("Time")){
                       TimeConversion t=new TimeConversion();
                       e3.setText(t.time(e1.getText().toString(),from,to));
                       Log.e("time",t.time(e1.getText().toString(),from,to));
                }
                else if(data.equals("Weight")){
                       WeightMassConverter w=new WeightMassConverter();
                       e3.setText(w.weightToMass(e1.getText().toString(),from,to));
                }
            }
        });




    }



    public void dataload(String value){
          item=new ArrayList<>();
          subitem=new ArrayList<>();

        final String [] currencylist = {"USA(Dollar)","Bangladesh(Bdt)","India(Rupee)","Uk(Pound)","UAE(Dirham)","China(Yuan)"};
        final String [] lengthlist={"Kilometer","Meter","Centimeter","Millimeter","Micrometer","Mile","Yard","Foot","Inch"};
        final String [] pressurelist = {"Bar","Pascal","KiloPascal","PSI","ATM"};
        final String [] temparaturelist = {"Celsius","Fahrenheit","Kelvin"};
        final String [] weightlist = {"Kilogram","Gram","Pound","Ton","Ounce"};
        final String [] timelist = {"Minute","Second","Hour","Day","Week","Month","Year"};
        final String [] numberlist= {"Decimal","Octal","Binary","Hexadecimal"};
        final String [] wordtonumber = {"Word","Number"};


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
        else if(value.equals("Number")){
            item.addAll(Arrays.asList(numberlist));
            subitem.addAll(Arrays.asList(numberlist));
            e1.setHint(item.get(0));
            e2.setHint(item.get(1));
            from=item.get(0);
            to=item.get(1);
        }
        else if(value.equals("Word")){
            item.addAll(Arrays.asList(wordtonumber));
            subitem.addAll(Arrays.asList(wordtonumber));
            e1.setHint(item.get(0));
            e2.setHint(item.get(1));
            from=item.get(0);
            to=item.get(1);
        }
        else if(value.equals("Pressure")){
            item.addAll(Arrays.asList(pressurelist));
            subitem.addAll(Arrays.asList(pressurelist));
            e1.setHint(item.get(0));
            e2.setHint(item.get(1));
            from=item.get(0);
            to=item.get(1);
        }
        else if(value.equals("Time")){
            item.addAll(Arrays.asList(timelist));
            subitem.addAll(Arrays.asList(timelist));
            e1.setHint(item.get(0));
            e2.setHint(item.get(1));
            from=item.get(0);
            to=item.get(1);
        }
        else if(value.equals("Weight")){
            item.addAll(Arrays.asList(weightlist));
            subitem.addAll(Arrays.asList(weightlist));
            e1.setHint(item.get(0));
            e2.setHint(item.get(1));
            from=item.get(0);
            to=item.get(1);
        }
        else if(value.equals("Temperature")){
            item.addAll(Arrays.asList(temparaturelist));
            subitem.addAll(Arrays.asList(temparaturelist));
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

