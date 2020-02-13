package com.example.myapplicationaa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import java.text.DecimalFormat;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    EditText txtF, txtC, txtKm, txtM, txtKg, txtLb, txtL, txtG;

    DecimalFormat df = new DecimalFormat("#.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtKg = findViewById(R.id.txtKg);
        txtLb = findViewById(R.id.txtLb);
        txtKm = findViewById(R.id.txtKm);
        txtM = findViewById(R.id.txtM);
        txtL = findViewById(R.id.txtL);
        txtG = findViewById(R.id.txtG);
        txtF = findViewById(R.id.txtF);
        txtC = findViewById(R.id.txtC);



        txtF.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strF = s.toString();
                Log.i("UnitConverter", "Value in txtF = " + strF);

                if (!txtF.isFocused()) return;
                if (strF.length() == 0) return;


                try {
                    double valF = Double.parseDouble(strF);
                    double valC = (valF - 32.0)*5/9;
                    String strC = df.format(valC);
                    Log.i("UnitConverter", "Value in txtC = " + strC);

                    MainActivity.this.txtC.setText(strC);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtC.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strC = s.toString();
                Log.i("UnitConverter", "Value in txtC = " + strC);

                if (!txtC.isFocused()) return;
                if (strC.length() == 0) return;

                try {
                    double valC = Double.parseDouble(strC);
                    double valF = valC*9/5 + 32;
                    String strF = df.format(valF);
                    Log.i("UnitConverter", "Value in txtF = " + strF);

                    MainActivity.this.txtF.setText(strF);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtKm.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strKm = s.toString();
                Log.i("UnitConverter", "Value in txtKm = " + strKm);

                if (!txtKm.isFocused()) return;
                if (strKm.length() == 0) return;


                try {
                    double valKm = Double.parseDouble(strKm);
                    double valM = valKm * 1.6;
                    String strM = df.format(valM);
                    Log.i("UnitConverter", "Value in txtM = " + strM);

                    MainActivity.this.txtM.setText(strM);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtM.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strM = s.toString();
                Log.i("UnitConverter", "Value in txtM = " + strM);

                if (!txtM.isFocused()) return;
                if (strM.length() == 0) return;

                try {
                    double valM = Double.parseDouble(strM);
                    double valKm = valM * 0.621;
                    String strKm = df.format(valKm);
                    Log.i("UnitConverter", "Value in txtKm = " + strKm);

                    MainActivity.this.txtKm.setText(strKm);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtKg.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strKg = s.toString();
                Log.i("UnitConverter", "Value in txtKg = " + strKg);

                if (!txtKg.isFocused()) return;
                if (strKg.length() == 0) return;


                try {
                    double valKg = Double.parseDouble(strKg);
                    double valLb = valKg * 0.454;
                    String strLb = df.format(valLb);
                    Log.i("UnitConverter", "Value in txtLb = " + strLb);

                    MainActivity.this.txtLb.setText(strLb);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtLb.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strLb = s.toString();
                Log.i("UnitConverter", "Value in txtLb = " + strLb);

                if (!txtLb.isFocused()) return;
                if (strLb.length() == 0) return;

                try {
                    double valLb = Double.parseDouble(strLb);
                    double valKg = valLb * 2.205;
                    String strKg = df.format(valKg);
                    Log.i("UnitConverter", "Value in txtKg = " + strKg);

                    MainActivity.this.txtKg.setText(strKg);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtL.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strL = s.toString();
                Log.i("UnitConverter", "Value in txtL = " + strL);

                if (!txtL.isFocused()) return;
                if (strL.length() == 0) return;


                try {
                    double valL = Double.parseDouble(strL);
                    double valG = valL * 3.785;
                    String strG = df.format(valG);
                    Log.i("UnitConverter", "Value in txtG = " + strG);

                    MainActivity.this.txtG.setText(strG);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtG.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strG = s.toString();
                Log.i("UnitConverter", "Value in txtG = " + strG);

                if (!txtG.isFocused()) return;
                if (strG.length() == 0) return;

                try {
                    double valG = Double.parseDouble(strG);
                    double valL = valG * 0.264;
                    String strL = df.format(valL);
                    Log.i("UnitConverter", "Value in txtL = " + strL);

                    MainActivity.this.txtL.setText(strL);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

    }
}
