package bd.com.rafi.magnitudeconverter;

import androidx.appcompat.app.AppCompatActivity;

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
    ImageButton imageButton,imageButton2;
    RelativeLayout relativeLayout, relativeLayout2;
    TextView textView1, textView2;
    Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submitBtn = findViewById(R.id.submit);

        imageButton = findViewById(R.id.imageBtn);
        textView1 = findViewById(R.id.textv1);

        imageButton2 = findViewById(R.id.secimageBtn);
        textView2 = findViewById(R.id.sectextv1);

        imageButton.setOnClickListener(this);
        textView1.setOnClickListener(this);

        imageButton2.setOnClickListener(this);
        textView2.setOnClickListener(this);
        submitBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.imageBtn || view.getId() == R.id.textv1) {
            showPopup(view);

        }
        if (view.getId() == R.id.secimageBtn || view.getId() == R.id.sectextv1) {
//            showPopup2(view);
//        }  if (view.getId() == R.id.submit){
//            Intent intent = new Intent(TitleActivity.this, ConvertActivity.class);
//            intent.putExtra("VALUEONE", value1);
//            intent.putExtra("VALUETWO", value2);
//            startActivity(intent);
//        }

        }


    }

    private void showPopup(View v){
        PopupMenu popup = new PopupMenu(this,v);
        popup.getMenuInflater().inflate(R.menu.popup, popup.getMenu());

        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.menuitem1:
                        textView1.setText("Numeric");
                        value1 = textView1.getText().toString();
                        Log.e("checking",value1);
                        textView2.setText("Alphabetic");
                        return true;
                    case R.id.menuitem2:
                        textView1.setText("Alphabetic");
                        value1 = textView1.getText().toString();
                        Log.e("checking",value1);
                        textView2.setText("Numeric");
                        return true;

                    default:
                        return false;
                }
            }
        });

        popup.show();
    }

}