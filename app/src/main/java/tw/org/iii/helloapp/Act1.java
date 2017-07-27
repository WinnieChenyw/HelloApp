package tw.org.iii.helloapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Act1 extends Activity {

    View.OnClickListener btn_Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {


            double a = Double.parseDouble(textA.getText().toString());
            double b = Double.parseDouble(textB.getText().toString());
            double c = Double.parseDouble(textC.getText().toString());
            double r = b * b - 4 * a * c;//一次二元方程式
            r=Math.sqrt(r);
            DecimalFormat formater = new DecimalFormat("0.00");
            lblResult.setText("Ans: x=" + formater.format((-b + r) / (2 * a)) +
                    "or" + formater.format((-b - r) / (2 * a)));
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("LOG_DEMO","Program was Started");
        super.onCreate(savedInstanceState);
        Log.d("LOG_DEMO","Asinged xml");
        setContentView(R.layout.act1);
        Log.d("LOG_DEMO","InitialComponent starting");
        InitialComponent();
        Log.d("LOG_DEMO","ready");
       // Button btnOK=(Button) findViewById(R.id.btnOK);

    }

    private  void InitialComponent(){
        textA = (EditText) findViewById(R.id.textA);
        textB = (EditText) findViewById(R.id.textB);
        textC = (EditText) findViewById(R.id.textC);
        btnOK=(Button) findViewById(R.id.btnOK);
        btnOK.setOnClickListener(btn_Click);
        lblResult = (TextView) findViewById(R.id.lblResult);
    }
    EditText textA;
    EditText textB;
    EditText textC;
    Button btnOK;
    TextView lblResult;
/*
    @Override
    public void onClick(View v) {
        //TextView t = (TextView) findViewById(R.id.btnOK);
        //t.setText((new CLottoGen()).GetNumbers());

    }*/
}
