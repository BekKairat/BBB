package hs.ws.no.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn9;
    private Button btn8;
    private Button btn7;
    private Button btn6;
    private Button btn5;
    private Button btn4;
    private Button btn3;
    private Button btn2;
    private Button btn1;
    private Button btn0;
    private Button btnComma;
    private Button btnClear;
    private ImageButton btnDivide;
    private ImageButton btnMultiply;
    private ImageButton btnSubtract;
    private ImageButton btnAddition;
    private ImageButton btnEquals;
    private TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void initFields(){
        btn9 = (Button) findViewById(R.id.btn9);
        btn8 = (Button) findViewById(R.id.btn8);
        btn7 = (Button) findViewById(R.id.btn7);
        btn6 = (Button) findViewById(R.id.btn6);
        btn5 = (Button) findViewById(R.id.btn5);
        btn4 = (Button) findViewById(R.id.btn4);
        btn3 = (Button) findViewById(R.id.btn3);
        btn2 = (Button) findViewById(R.id.btn2);
        btn1 = (Button) findViewById(R.id.btn1);
        btn0 = (Button) findViewById(R.id.btn0);
        btnComma = (Button) findViewById(R.id.btnComma);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnDivide = (ImageButton) findViewById(R.id.btnDivide);
        btnMultiply = (ImageButton) findViewById(R.id.btnMultiply);
        btnSubtract = (ImageButton) findViewById(R.id.btnSubtract);
        btnAddition = (ImageButton) findViewById(R.id.btnAddition);
        btnEquals = (ImageButton) findViewById(R.id.btnEquals);
        resultView = (TextView) findViewById(R.id.resultView);
    }

    public double divide(double x, double y){
        return x / y;
    }

    public double mulitply(double x, double y){
        return x * y;
    }

    public double subtract(double x, double y){
        return x - y;
    }

    public double addition(double x, double y){
        return x + y;
    }
}
