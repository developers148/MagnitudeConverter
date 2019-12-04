package bd.com.rafi.magnitudeconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.arch.core.internal.FastSafeIterableMap;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;


public class TitleActivity extends AppCompatActivity {


    ImageButton imageButton,imageButton2,imagebutton1;

    TextView textView1, textView2,textView;
    Button submitBtn;
    ArrayList<String> catagory,Item,Subitem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitBtn = findViewById(R.id.submit);
        imageButton = findViewById(R.id.imageBtn);
        textView1 = findViewById(R.id.textv1);
        imageButton2 = findViewById(R.id.secimageBtn);
        textView2 = findViewById(R.id.sectextv1);
        textView=findViewById(R.id.itemtextview);
        imagebutton1=findViewById(R.id.itembutton1);
        catagory=new ArrayList<>();

        catagory.add("Currency");
        catagory.add("Length");
        catagory.add("Pressure");
        catagory.add("Temperature");
        catagory.add("Weight");
        catagory.add("Time");
        catagory.add("Number Conversion");
        catagory.add("Number To Word");
        catagory.add("Word To Number");


        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopup3(view);
            }
        });
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopup(view);
            }
        });



        imagebutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopup2(view);
            }
        });


        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopup(view);
            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopup3(view);
            }
        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopup2(view);
            }
        });




        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(TitleActivity.this,ConvertActivity.class);
                i.putExtra("data",textView1.getText().toString());
                startActivity(i);
            }
        });




    }


    private void showPopup3(View v){
        PopupMenu popupMenu=new PopupMenu(this,v);
        for(int j=0;j<Subitem.size();j++){
            popupMenu.getMenu().add(Subitem.get(j));
        }
        popupMenu.getMenuInflater().inflate(R.menu.popup,popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                CharSequence charSequence=menuItem.getTitle();

                return true;
            }
        });

        popupMenu.show();
    }

        private void showPopup2(View v){
        PopupMenu popupMenu=new PopupMenu(this,v);
            for(int j=0;j<Item.size();j++){
                popupMenu.getMenu().add(Item.get(j));
            }
            popupMenu.getMenuInflater().inflate(R.menu.popup,popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem menuItem) {
                    CharSequence charSequence=menuItem.getTitle();

                    return true;
                }
            });

            popupMenu.show();
        }




    private void showPopup(View v){
        PopupMenu popup = new PopupMenu(this,v);


        for(int i =0;i<catagory.size();i++){
            popup.getMenu().add(catagory.get(i));
        }

        popup.getMenuInflater().inflate(R.menu.popup, popup.getMenu());

        final String[] currencylist = {"Doller $","BDT","Rupee","Pound","Yuan","Dirham"};
        final String [] lengthlist={"Kilometer","Meter","Centimeter","Millimeter","Micrometer","Mile","Yard","Foot","Inch"};
        final String [] pressurelist = {"Bar","Pascal","Kilo Pascal","PSI","ATM"};
        final String [] temparaturelist = {"Centigrade","Fahrenheit","Kelvin"};
        final String [] weightlist = {"Kilogram","Gram","Pound","Ton","Ounce"};

        final String [] timelist = {"Minuite","Second","Hour","Day","Week","Year"};
        final String [] numberlist= {"Decimal","Octal","Binary","Hexadecimal"};
        final String [] wordtonumber = {"Word","Number"};
        final String [] numbertoword = {"Number","Word"};




        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                CharSequence title = menuItem.getTitle();
                if ("Currency".contentEquals(title)) {
                    Item=new ArrayList<>();
                    Subitem=new ArrayList<>();
                    Item.addAll(Arrays.asList(currencylist));
                    Subitem.addAll(Arrays.asList(currencylist));
                    textView1.setText(catagory.get(0));
                    textView.setText(Item.get(0));
                    textView2.setText(Subitem.get(1));
                    return true;
                } else if ("Length".contentEquals(title)) {
                    Item=new ArrayList<>();
                    Subitem=new ArrayList<>();
                    Item.addAll(Arrays.asList(lengthlist));
                    Subitem.addAll(Arrays.asList(lengthlist));
                    textView1.setText(catagory.get(1));
                    textView.setText(Item.get(0));
                    textView2.setText(Subitem.get(1));
                    return true;
                }else if ("Pressure".contentEquals(title)){
                    Item=new ArrayList<>();
                    Subitem=new ArrayList<>();
                    Item.addAll(Arrays.asList(pressurelist));
                    Subitem.addAll(Arrays.asList(pressurelist));
                    textView1.setText(catagory.get(2));
                    textView.setText(Item.get(0));
                    textView2.setText(Subitem.get(1));
                }else if ("Temperature".contentEquals(title)){
                    Item=new ArrayList<>();
                    Subitem=new ArrayList<>();
                    Item.addAll(Arrays.asList(temparaturelist));
                    Subitem.addAll(Arrays.asList(temparaturelist));
                    textView1.setText(catagory.get(3));
                    textView.setText(Item.get(0));
                    textView2.setText(Subitem.get(1));
                }else if ("Weight".contentEquals(title)){
                    Item=new ArrayList<>();
                    Subitem=new ArrayList<>();
                    Item.addAll(Arrays.asList(weightlist));
                    Subitem.addAll(Arrays.asList(weightlist));
                    textView1.setText(catagory.get(4));
                    textView.setText(Item.get(0));
                    textView2.setText(Subitem.get(1));
                }else if ("Time".contentEquals(title)){
                    Item=new ArrayList<>();
                    Subitem=new ArrayList<>();
                    Item.addAll(Arrays.asList(timelist));
                    Subitem.addAll(Arrays.asList(timelist));
                    textView1.setText(catagory.get(5));
                    textView.setText(Item.get(0));
                    textView2.setText(Subitem.get(1));
                }else if ("Number Conversion".contentEquals(title)){
                    Item=new ArrayList<>();
                    Subitem=new ArrayList<>();
                    Item.addAll(Arrays.asList(numberlist));
                    Subitem.addAll(Arrays.asList(numberlist));
                    textView1.setText(catagory.get(6));
                    textView.setText(Item.get(0));
                    textView2.setText(Subitem.get(1));
                }else if ("Word To Number".contentEquals(title)){
                    Item=new ArrayList<>();
                    Subitem=new ArrayList<>();
                    Item.addAll(Arrays.asList(wordtonumber));
                    Subitem.addAll(Arrays.asList(wordtonumber));
                    textView1.setText(catagory.get(7));
                    textView.setText(Item.get(0));
                    textView2.setText(Subitem.get(1));
                }
                else if ("Number To Word".contentEquals(title)){
                    Item=new ArrayList<>();
                    Subitem=new ArrayList<>();
                    Item.addAll(Arrays.asList(numbertoword));
                    Subitem.addAll(Arrays.asList(numbertoword));
                    textView1.setText(catagory.get(8));
                    textView.setText(Item.get(0));
                    textView2.setText(Subitem.get(1));


                }
                return false;
            }
        });

        popup.show();
    }

}