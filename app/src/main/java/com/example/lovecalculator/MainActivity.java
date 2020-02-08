package com.example.lovecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

  public EditText firstname, secondname;
  Button btn;
  public LinearLayout l;
  public TextView result, fn,sn;
  public boolean ispressed=false;
  int res=0;

 public String first,second;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstname=findViewById(R.id.firstname);
        secondname=findViewById(R.id.secondname);
        btn=findViewById(R.id.calculate);
        l=findViewById(R.id.layout);
        result=findViewById(R.id.result);
        fn=findViewById(R.id.fn);
        sn=findViewById(R.id.sn);
        result.setVisibility(View.INVISIBLE);
        l.setVisibility(View.INVISIBLE);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                first=firstname.getText().toString();
                second=secondname.getText().toString();
                if(first.isEmpty() || second.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Enter your or your Partner Name", Toast.LENGTH_SHORT).show();
                }
                else{
                    Random r = new Random();
                    int i=r.nextInt(30);
                    int min=70;
                    res=i+min;
                    result.setText(String.valueOf(res)+"%");
                    result.setVisibility(View.VISIBLE);
                    first=firstname.getText().toString();
                    second=secondname.getText().toString();
                    fn.setText(first);
                    sn.setText(second);
                    l.setVisibility(View.VISIBLE);
                    ispressed=true;
                }

            }
        });


    }
}
