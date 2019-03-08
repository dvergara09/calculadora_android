package com.example.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnUno, btnDos, btnTres, btnCuatro, btnCinco, btnSeis, btnSiete, btnOcho, btnNueve, btnCero,
            suma, resta, multiplicacion, division, borrar, decimal, igual;
    TextView cajatxt, cajatxt2;
    double resultado;
    String operador, mostrar , reserva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnUno          = (Button)findViewById(R.id.btn1);
        btnDos          = (Button)findViewById(R.id.btn2);
        btnTres         = (Button)findViewById(R.id.btn3);
        btnCuatro       = (Button)findViewById(R.id.btn4);
        btnCinco        = (Button)findViewById(R.id.btn5);
        btnSeis         = (Button)findViewById(R.id.btn6);
        btnSiete        = (Button)findViewById(R.id.btn7);
        btnOcho         = (Button)findViewById(R.id.btn8);
        btnNueve        = (Button)findViewById(R.id.btn9);
        btnCero         = (Button)findViewById(R.id.btn0);
        suma            = (Button)findViewById(R.id.sum);
        resta           = (Button)findViewById(R.id.rest);
        multiplicacion  = (Button)findViewById(R.id.mul);
        division        = (Button)findViewById(R.id.div);
        borrar          = (Button)findViewById(R.id.btndel);
        decimal         = (Button)findViewById(R.id.btndec);
        igual           = (Button)findViewById(R.id.equal);
        cajatxt         = (TextView)findViewById(R.id.txt);
        cajatxt2        = (TextView)findViewById(R.id.txt2);


        btnUno.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = cajatxt.getText().toString();
                mostrar = mostrar + "1";
                cajatxt.setText(mostrar);
            }
        });

        btnDos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = cajatxt.getText().toString();
                mostrar = mostrar + "2";
                cajatxt.setText(mostrar);
            }
        });

        btnTres.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = cajatxt.getText().toString();
                mostrar = mostrar + "3";
                cajatxt.setText(mostrar);
            }
        });

        btnCuatro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = cajatxt.getText().toString();
                mostrar = mostrar + "4";
                cajatxt.setText(mostrar);
            }
        });

        btnCinco.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = cajatxt.getText().toString();
                mostrar = mostrar + "5";
                cajatxt.setText(mostrar);
            }
        });

        btnSeis.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = cajatxt.getText().toString();
                mostrar = mostrar + "6";
                cajatxt.setText(mostrar);
            }
        });

        btnSiete.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = cajatxt.getText().toString();
                mostrar = mostrar + "7";
                cajatxt.setText(mostrar);
            }
        });

        btnOcho.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = cajatxt.getText().toString();
                mostrar = mostrar + "8";
                cajatxt.setText(mostrar);
            }
        });

        btnNueve.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = cajatxt.getText().toString();
                mostrar = mostrar + "9";
                cajatxt.setText(mostrar);
            }
        });

        suma.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reserva = cajatxt.getText().toString();
                operador = "+";
                cajatxt.setText("");
            }
        });

        resta.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reserva = cajatxt.getText().toString();
                operador = "-";
                cajatxt.setText("");
            }
        });

        multiplicacion.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reserva = cajatxt.getText().toString();
                operador = "*";
                cajatxt.setText("");
            }
        });

        division.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reserva = cajatxt.getText().toString();
                operador = "/";
                cajatxt.setText("");
            }
        });

        decimal.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = cajatxt.getText().toString();
                mostrar = mostrar + ".";
                cajatxt.setText(mostrar);
            }
        });


        borrar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = "";
                cajatxt.setText(mostrar);
                reserva = "";
                operador = "";

            }
        });

        igual.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = cajatxt.getText().toString();
                mostrar = mostrar + "1";
                if(operador.equals("-")){
                    resultado = Double.parseDouble(reserva) - Double.parseDouble(cajatxt.getText().toString());
                    cajatxt.setText(String.valueOf(resultado));
                }
                if(operador.equals("+")){
                    resultado = Double.parseDouble(reserva) + Double.parseDouble(cajatxt.getText().toString());
                    cajatxt.setText(String.valueOf(resultado));
                }
                if(operador.equals("/")){
                    resultado = Double.parseDouble(reserva) / Double.parseDouble(cajatxt.getText().toString());
                    cajatxt.setText(String.valueOf(resultado));
                }
                if(operador.equals("*")){
                    resultado = Double.parseDouble(reserva) * Double.parseDouble(cajatxt.getText().toString());
                    cajatxt.setText(String.valueOf(resultado));
                }
            }
        });


    }

    public void onClick(View view){
        Intent myIntent = new Intent(MainActivity.this, history.class);
        startActivity(myIntent);
    }


}
