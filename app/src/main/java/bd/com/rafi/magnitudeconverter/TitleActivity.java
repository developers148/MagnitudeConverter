package bd.com.rafi.magnitudeconverter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.mxn.soul.flowingdrawer_core.FlowingDrawer;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class TitleActivity extends AppCompatActivity {

    private FlowingDrawer mDrawer;


    TextView tvContract;

    AlertDialog.Builder builder;
    AlertDialog alertDialog;




    void showContactDialogueBox(){
        mDrawer.closeMenu(true);
        View dialogView = getLayoutInflater().inflate(R.layout.contact_us, null);
        builder.setView(null);
        builder.setView(dialogView);

        alertDialog = builder.create();

        alertDialog.setCanceledOnTouchOutside(true);

        alertDialogDismiss();

        alertDialog.show();

    }

    private void alertDialogDismiss(){
        if (alertDialog.isShowing()){
            alertDialog.dismiss();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDrawer=findViewById(R.id.drawerlayout);
        setupToolbar();

        builder = new AlertDialog.Builder(TitleActivity.this);


        tvContract = findViewById(R.id.tv_contact);

        tvContract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showContactDialogueBox();
            }
        });
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
    protected void setupToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.menuwhite);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawer.toggleMenu();
            }
        });
    }
}