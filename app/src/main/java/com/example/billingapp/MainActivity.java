 package com.example.billingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

 public class MainActivity extends AppCompatActivity {

     TextView editText;
     TextView text0, text1, text2, text3, text4, text5, text6, text7, text8, text9, textDot, textC,
             textMinus, textPlus, textMultiply, textDivide, textOpenParanthese, textCloseParanthese, textEqual, result;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);

         ScriptEngineManager manager = new ScriptEngineManager();
         final ScriptEngine engine = manager.getEngineByName("js");

         getWidgets();

         editText.setText("");

         text0.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 editText.setText(editText.getText().toString() + "0");
             }
         });

         text1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 editText.setText(editText.getText().toString() + "1");
             }
         });

         text2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 editText.setText(editText.getText().toString() + "2");
             }
         });

         text3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 editText.setText(editText.getText().toString() + "3");
             }
         });

         text4.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 editText.setText(editText.getText().toString() + "4");
             }
         });

         text5.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 editText.setText(editText.getText().toString() + "5");
             }
         });

         text6.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 editText.setText(editText.getText().toString() + "6");
             }
         });

         text7.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 editText.setText(editText.getText().toString() + "7");
             }
         });

         text8.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 editText.setText(editText.getText().toString() + "8");
             }
         });

         text9.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 editText.setText(editText.getText().toString() + "9");
             }
         });

         textMinus.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 editText.setText(editText.getText().toString() + " - ");
             }
         });

         textPlus.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 editText.setText(editText.getText().toString() + " + ");
             }
         });

         textDivide.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 editText.setText(editText.getText().toString() + " / ");
             }
         });

         textMultiply.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 editText.setText(editText.getText().toString() + " * ");
             }
         });

         textOpenParanthese.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 editText.setText(editText.getText().toString() + " (");
             }
         });

         textCloseParanthese.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 editText.setText(editText.getText().toString() + ") ");
             }
         });

         textDot.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 editText.setText(editText.getText().toString() + ".");
             }
         });

         textC.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 editText.setText("");
             }
         });

         textEqual.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 try {
                     result.setText(engine.eval(editText.getText().toString()).toString());
                 } catch (ScriptException e) {
                     Toast.makeText(MainActivity.this, "Please enter right format", Toast.LENGTH_SHORT).show();
                     e.printStackTrace();
                 }

             }
         });

     }

     private void getWidgets(){

         text0 = findViewById(R.id.text0);
         text1 = findViewById(R.id.text1);
         text2 = findViewById(R.id.text2);
         text3 = findViewById(R.id.text3);
         text4 = findViewById(R.id.text4);
         text5 = findViewById(R.id.text5);
         text6 = findViewById(R.id.text6);
         text7 = findViewById(R.id.text7);
         text8 = findViewById(R.id.text8);
         text9 = findViewById(R.id.text9);
         textMinus = findViewById(R.id.textMinus);
         textPlus = findViewById(R.id.textPlus);
         textMultiply = findViewById(R.id.textMultiply);
         textDivide = findViewById(R.id.textDivide);
         textOpenParanthese = findViewById(R.id.txtOpenParantheses);
         textCloseParanthese = findViewById(R.id.txtCloseParantheses);
         textEqual = findViewById(R.id.textEqual);
         editText = findViewById(R.id.editText);
         textDot = findViewById(R.id.textDot);
         textC = findViewById(R.id.textC);
         result = findViewById(R.id.numberResult);

     }


 }