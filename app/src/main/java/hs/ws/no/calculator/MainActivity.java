package hs.ws.no.calculator;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnComma;
    private Button btnClear;
    private ImageButton btnDivide;
    private ImageButton btnMultiply;
    private ImageButton btnSubtract;
    private ImageButton btnAddition;
    private ImageButton btnEquals;
    private TextView resultView;
    private Button[] buttons = new Button[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFields();

        Resources res = getResources();

        for(int i = 0; i < buttons.length; i++){
            String id = "btn" + i;

            buttons[i] = (Button) findViewById(res.getIdentifier(id, "id", getPackageName()));
        }

        for (int i = 0; i < buttons.length; i++){
            buttons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    changeViewText(view.getResources().getResourceName(view.getId()));
                }
            });
        }

        btnComma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = resultView.getText().toString();
                if( ! result.contains(",")){
                    resultView.append(",");
                }
            }
        });
    }

    private void initFields(){
        btnComma = (Button) findViewById(R.id.btnComma);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnDivide = (ImageButton) findViewById(R.id.btnDivide);
        btnMultiply = (ImageButton) findViewById(R.id.btnMultiply);
        btnSubtract = (ImageButton) findViewById(R.id.btnSubtract);
        btnAddition = (ImageButton) findViewById(R.id.btnAddition);
        btnEquals = (ImageButton) findViewById(R.id.btnEquals);
        resultView = (TextView) findViewById(R.id.resultView);
    }

    private void changeViewText(String id){
        float total = Float.parseFloat(resultView.getText().toString());
        id = String.valueOf(id.charAt(id.length() - 1));

        appeandTextResult(id, total);
    }

    private void appeandTextResult(String id, float number){
        if (number == 0) {
            resultView.setText(id);
        } else {
            resultView.append(id);
        }
    }

    public float divide(float x, float y){
        return x / y;
    }

    public float mulitply(float x, float y){
        return x * y;
    }

    public float subtract(float x, float y){
        return x - y;
    }

    public float addition(float x, float y){
        return x + y;
    }
}
