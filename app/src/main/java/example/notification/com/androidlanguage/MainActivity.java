package example.notification.com.androidlanguage;

import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView txtSinghala,txtTamil,txtSinghala1,txtSinghala2;
    Button btnTamil,btnsinhala;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

    }

    private void initViews() {


        txtSinghala =(TextView)findViewById(R.id.txt_singhala);
        txtSinghala1=(TextView)findViewById(R.id.txt_singhala1);
        txtSinghala2=(TextView)findViewById(R.id.txt_singhala2);
        btnTamil=(Button)findViewById(R.id.btn_tamil);
        btnsinhala=(Button)findViewById(R.id.btn_sinhala);
        btnTamil.setOnClickListener(this);
        btnsinhala.setOnClickListener(this);




       // txtTamil.setTypeface(tamilFont);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_tamil:{
                String nandri ="நன்றி";
                txtSinghala.setText(nandri);
                txtSinghala1.setText("வாங்க");
                txtSinghala2.setText(" கடவுள்");
                Typeface tamilFont = Typeface.createFromAsset(getAssets(), "bamini.TTF");
                txtSinghala.setTypeface(tamilFont);
                txtSinghala1.setTypeface(tamilFont);
                txtSinghala2.setTypeface(tamilFont);
            }
            break;

            case R.id.btn_sinhala:{
                String thanks= "Tnkak";
                txtSinghala.setText(thanks);
                txtSinghala1.setText("sadarayen");
                txtSinghala2.setText("Jathiya");
                Typeface sinhalaFont = Typeface.createFromAsset(getAssets(), "ARADANA.TTF");
                txtSinghala.setTypeface(sinhalaFont);
                txtSinghala1.setTypeface(sinhalaFont);
                txtSinghala2.setTypeface(sinhalaFont);
            }
            break;
            default:
                break;
        }
    }
}
