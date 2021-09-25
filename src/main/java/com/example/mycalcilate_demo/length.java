package com.example.mycalcilate_demo;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class length extends AppCompatActivity implements View.OnClickListener{
    /*
           实例化数字0-9
            */
    private Button n_0_l;
    private Button n_1_l;
    private Button n_2_l;
    private Button n_3_l;
    private Button n_4_l;
    private Button n_5_l;
    private Button n_6_l;
    private Button n_7_l;
    private Button n_8_l;
    private Button n_9_l;


    private Button n_equ_l;//=
    private Button n_point_l;//.
    private Button n_Del_l;//删除
    private Button n_Clear_l;//清除
    private Button backM_l;//返回

    private EditText e1_l,e2_l,e3_l,e4_l,e5_l,e6_l,e7_l;

    private String text_l="";//保存输入的数字和符号
    //private double result_l=0.0;//输出结果


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

        //数字0-9
        n_0_l=findViewById(R.id.btn0_l);
        n_1_l=findViewById(R.id.btn1_l);
        n_2_l=findViewById(R.id.btn2_l);
        n_3_l=findViewById(R.id.btn3_l);
        n_4_l=findViewById(R.id.btn4_l);
        n_5_l=findViewById(R.id.btn5_l);
        n_6_l=findViewById(R.id.btn6_l);
        n_7_l=findViewById(R.id.btn7_l);
        n_8_l=findViewById(R.id.btn8_l);
        n_9_l=findViewById(R.id.btn9_l);

        n_equ_l=findViewById(R.id.btnequal_l);//=
        n_point_l=findViewById(R.id.btnpoint_l);//.
        n_Del_l=findViewById(R.id.btnDel_l);//删除
        n_Clear_l=findViewById(R.id.btnC_l);//清除
        backM_l=findViewById(R.id.btnback_l);//返回

        n_0_l.setOnClickListener((View.OnClickListener) this);
        n_1_l.setOnClickListener((View.OnClickListener)this);
        n_2_l.setOnClickListener((View.OnClickListener)this);
        n_3_l.setOnClickListener((View.OnClickListener)this);
        n_4_l.setOnClickListener((View.OnClickListener)this);
        n_5_l.setOnClickListener((View.OnClickListener)this);
        n_6_l.setOnClickListener((View.OnClickListener)this);
        n_7_l.setOnClickListener((View.OnClickListener)this);
        n_8_l.setOnClickListener((View.OnClickListener)this);
        n_9_l.setOnClickListener((View.OnClickListener)this);
        n_equ_l.setOnClickListener((View.OnClickListener)this);
        n_point_l.setOnClickListener((View.OnClickListener)this);
        n_Del_l.setOnClickListener((View.OnClickListener)this);
        n_Clear_l.setOnClickListener((View.OnClickListener)this);
        backM_l.setOnClickListener((View.OnClickListener)this);


        e1_l=(EditText)findViewById(R.id.e1_l);
        e2_l=(EditText)findViewById(R.id.e2_l);
        e3_l=(EditText)findViewById(R.id.e3_l);
        e4_l=(EditText)findViewById(R.id.e4_l);
        e5_l=(EditText)findViewById(R.id.e5_l);
        e6_l=(EditText)findViewById(R.id.e6_l);
        e7_l=(EditText)findViewById(R.id.e7_l);




    }
    @Override
    public void onClick(View v) {
        String string=e2_l.getText().toString();
        switch (v.getId()){
            case R.id.btn0_l://0
                num(0);
                break;
            case R.id.btn1_l://1
                num(1);
                break;
            case R.id.btn2_l://2
                num(2);
                break;
            case R.id.btn3_l://3
                num(3);
                break;
            case R.id.btn4_l://4
                num(4);
                break;
            case R.id.btn5_l://5
                num(5);
                break;
            case R.id.btn6_l://6
                num(6);
                break;
            case R.id.btn7_l://7
                num(7);
                break;
            case R.id.btn8_l://8
                num(8);
                break;
            case R.id.btn9_l://9
                num(9);
                break;
            case R.id.btnequal_l://=
                result();
                break;
            case R.id.btnpoint_l://.
                point();
                break;
            case R.id.btnDel_l://删除
                del();
                break;
            case R.id.btnC_l://清除
                clear();
                break;
        }
        e2_l.setText(text_l);

    }


    private void num(int i){
        text_l=text_l+String.valueOf(i);
    }
    private void point(){
        int a=text_l.length();
        String s1="+";
        String s2="-";
        String s3="*";
        String s4="÷";
        String s5=".";
        if(a!=0){

            String s=text_l.substring(a-1,a);//获取用户输入的符号
            String s_num=text_l.substring(0,a-1);//获取用户输入的数字
            if(s1.equals(s)||s2.equals(s)||s3.equals(s)||s4.equals(s)||s5.equals(s)){
                text_l=s_num+".";
            }else{
                text_l+=".";
            }
        }else{
            text_l="";
            e2_l.setText("");
        }
    }

    private void del(){
        if (text_l.length() != 0) {
            String str=text_l.substring(0,text_l.length()-1);
            text_l=str;
        }
    }

    private void clear(){
        text_l="";
       // result_l=0.0;
        e1_l.setText("");
        e2_l.setText("");
        e3_l.setText("");
        e4_l.setText("");
        e5_l.setText("");
        e6_l.setText("");
        e7_l.setText("");

    }

    private void result(){
        String str=e2_l.getText().toString().trim();//获得对象的字段的值，然后转成string类型，并且去掉前后空白
        double num=Double.valueOf(str);
        double num1=num*0.001;//km
        e1_l.setText(num1+" km");
        e2_l.setText(num+" m");
        double num2=num*10;//dm
        e3_l.setText(num2+" dm");

        double num3=num*100;//cm
        e4_l.setText(num3+" cm");

        double num4=num*1000;//mm
        e5_l.setText(num4+" mm");

        double num5=num*3.28084;//foot
        e6_l.setText(num5+" foot");

        double num6=num*39.37008;//inch
        e7_l.setText(num6+" inch");

    }

}