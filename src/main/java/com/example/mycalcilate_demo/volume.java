package com.example.mycalcilate_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class volume extends AppCompatActivity implements View.OnClickListener{
    /*
               实例化数字0-9
                */
    private Button n_0_v;
    private Button n_1_v;
    private Button n_2_v;
    private Button n_3_v;
    private Button n_4_v;
    private Button n_5_v;
    private Button n_6_v;
    private Button n_7_v;
    private Button n_8_v;
    private Button n_9_v;


    private Button n_equ_v;//=
    private Button n_point_v;//.
    private Button n_Del_v;//删除
    private Button n_Clear_v;//清除
    private Button backM_v;//返回

    private EditText e1_v,e2_v,e3_v,e4_v;

    private String text_v="";//保存输入的数字和符号

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume);

        //数字0-9
        n_0_v=findViewById(R.id.btn0_v);
        n_1_v=findViewById(R.id.btn1_v);
        n_2_v=findViewById(R.id.btn2_v);
        n_3_v=findViewById(R.id.btn3_v);
        n_4_v=findViewById(R.id.btn4_v);
        n_5_v=findViewById(R.id.btn5_v);
        n_6_v=findViewById(R.id.btn6_v);
        n_7_v=findViewById(R.id.btn7_v);
        n_8_v=findViewById(R.id.btn8_v);
        n_9_v=findViewById(R.id.btn9_v);

        n_equ_v=findViewById(R.id.btnequal_v);//=
        n_point_v=findViewById(R.id.btnpoint_v);//.
        n_Del_v=findViewById(R.id.btnDel_v);//删除
        n_Clear_v=findViewById(R.id.btnC_v);//清除
        backM_v=findViewById(R.id.btnback_v);//返回

        n_0_v.setOnClickListener((View.OnClickListener) this);
        n_1_v.setOnClickListener((View.OnClickListener)this);
        n_2_v.setOnClickListener((View.OnClickListener)this);
        n_3_v.setOnClickListener((View.OnClickListener)this);
        n_4_v.setOnClickListener((View.OnClickListener)this);
        n_5_v.setOnClickListener((View.OnClickListener)this);
        n_6_v.setOnClickListener((View.OnClickListener)this);
        n_7_v.setOnClickListener((View.OnClickListener)this);
        n_8_v.setOnClickListener((View.OnClickListener)this);
        n_9_v.setOnClickListener((View.OnClickListener)this);
        n_equ_v.setOnClickListener((View.OnClickListener)this);
        n_point_v.setOnClickListener((View.OnClickListener)this);
        n_Del_v.setOnClickListener((View.OnClickListener)this);
        n_Clear_v.setOnClickListener((View.OnClickListener)this);
        backM_v.setOnClickListener((View.OnClickListener)this);


        e1_v=(EditText)findViewById(R.id.e1_v);
        e2_v=(EditText)findViewById(R.id.e2_v);
        e3_v=(EditText)findViewById(R.id.e3_v);
        e4_v=(EditText)findViewById(R.id.e4_v);

    }

    @Override
    public void onClick(View v) {
        String string=e1_v.getText().toString();
        switch (v.getId()){
            case R.id.btn0_v://0
                num(0);
                break;
            case R.id.btn1_v://1
                num(1);
                break;
            case R.id.btn2_v://2
                num(2);
                break;
            case R.id.btn3_v://3
                num(3);
                break;
            case R.id.btn4_v://4
                num(4);
                break;
            case R.id.btn5_v://5
                num(5);
                break;
            case R.id.btn6_v://6
                num(6);
                break;
            case R.id.btn7_v://7
                num(7);
                break;
            case R.id.btn8_v://8
                num(8);
                break;
            case R.id.btn9_v://9
                num(9);
                break;
            case R.id.btnequal_v://=
                result();
                break;
            case R.id.btnpoint_v://.
                point();
                break;
            case R.id.btnDel_v://删除
                del();
                break;
            case R.id.btnC_v://清除
                clear();
                break;
        }
        e1_v.setText(text_v);

    }


    private void num(int i){
        text_v=text_v+String.valueOf(i);
    }
    private void point(){
        int a=text_v.length();
        String s1="+";
        String s2="-";
        String s3="*";
        String s4="÷";
        String s5=".";
        if(a!=0){

            String s=text_v.substring(a-1,a);//获取用户输入的符号
            String s_num=text_v.substring(0,a-1);//获取用户输入的数字
            if(s1.equals(s)||s2.equals(s)||s3.equals(s)||s4.equals(s)||s5.equals(s)){
                text_v=s_num+".";
            }else{
                text_v+=".";
            }
        }else{
            text_v="";
            e1_v.setText("");
        }
    }

    private void del(){
        if (text_v.length() != 0) {
            String str=text_v.substring(0,text_v.length()-1);
            text_v=str;
        }
    }

    private void clear(){
        text_v="";
        // result_l=0.0;
        e1_v.setText("");
        e2_v.setText("");
        e3_v.setText("");
        e4_v.setText("");


    }

    private void result(){
        String str=e1_v.getText().toString().trim();
        double num=Double.valueOf(str);
        e1_v.setText(str+ " m^3");

        double num1=num*1000;//dm^3
        e2_v.setText(num1+" dm^3");

        double num2=num*1000000;//cm^3
        e3_v.setText(num2+" cm^3");

        double num3=num*1000;//l
        e4_v.setText(num3+" l");
    }

}