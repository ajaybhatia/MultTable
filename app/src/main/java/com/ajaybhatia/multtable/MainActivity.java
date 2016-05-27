package com.ajaybhatia.multtable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText number;
//    Button button;
    TextView table;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number = (EditText) findViewById(R.id.number);
//        button = (Button) findViewById(R.id.button);
        table = (TextView) findViewById(R.id.table);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int n = Integer.parseInt(number.getText().toString());
//
//                StringBuilder sb = new StringBuilder();
//                for (int i = 1; i <= 10; i++)
//                    sb.append(n + " X " + i + " = " + (n*i)).append("\n");
//
//                table.setText(sb.toString());
//            }
//        });


//        number.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                try {
//                    int n = Integer.parseInt(number.getText().toString());
//
//                    StringBuilder sb = new StringBuilder();
//                    for (int i = 1; i <= 10; i++)
//                        sb.append(n + " X " + i + " = " + (n * i)).append("\n");
//
//                    table.setText(sb.toString());
//                } catch (Exception e) {
//                    table.setText("");
//                }
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });

        number.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN) {
                    if (keyCode == KeyEvent.KEYCODE_ENTER) {
                        try {
                            int n = Integer.parseInt(number.getText().toString());

                            StringBuilder sb = new StringBuilder();
                            for (int i = 1; i <= 10; i++)
                                sb.append(n + " X " + i + " = " + (n * i)).append("\n");

                            table.setText(sb.toString());
                        } catch (Exception e) {
                            table.setText("");
                        }
                    }
                }
                return false;
            }
        });
    }
}
