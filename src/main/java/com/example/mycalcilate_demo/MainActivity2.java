package com.example.mycalcilate_demo;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.SubMenu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.Nullable;
public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    private Button simple;
    private Button science;
    private Button length;
    private Button scale;
    private Button volume;
    /*
       实例化数字0-9
        */
    private Button n_0;
    private Button n_1;
    private Button n_2;
    private Button n_3;
    private Button n_4;
    private Button n_5;
    private Button n_6;
    private Button n_7;
    private Button n_8;
    private Button n_9;

    /*
    实例化运算符号
     */
    private Button n_add;//+
    private Button n_sub;//-
    private Button n_mul;//*
    private Button n_div;///
    private Button n_addsub;//+- 加负数
    private Button n_equ;//=
    private Button n_point;//.
    private Button n_Del;//删除
    private Button n_Clear;//清除

    boolean clean;//清空

    private EditText editText1,editText2;

    private String text="";//保存输入的数字和符号

    private double result=0.0;//输出结果



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_FULL_SENSOR);
        setContentView(R.layout.activity_main2);

//        if(this.getResources().getConfiguration().orientation==Configuration.ORIENTATION_LANDSCAPE)
//
//        {
//
//            Log.i("info", "landscape"); // 横屏
//            setContentView(R.layout.activity_main);
//
//        }  else
//            if(this.getResources().getConfiguration().orientation==Configuration.ORIENTATION_PORTRAIT)
//
//        {
//
//            Log.i("info", "portrait"); // 竖屏
//            setContentView(R.layout.length);
//
//        }
//int orientation=getResources().getConfiguration().orientation;
//if(orientation== Configuration.ORIENTATION_LANDSCAPE){
//    setContentView(R.layout.activity_main);
//}
//else if(orientation==Configuration.ORIENTATION_PORTRAIT){
//    setContentView(R.layout.length);
//}

        //结果
        editText1=(EditText)findViewById(R.id.input);
        editText2=(EditText)findViewById(R.id.output);

        //数字0-9
        n_0=findViewById(R.id.bt_0);
        n_1=findViewById(R.id.bt_1);
        n_2=findViewById(R.id.bt_2);
        n_3=findViewById(R.id.bt_3);
        n_4=findViewById(R.id.bt_4);
        n_5=findViewById(R.id.bt_5);
        n_6=findViewById(R.id.bt_6);
        n_7=findViewById(R.id.bt_7);
        n_8=findViewById(R.id.bt_8);
        n_9=findViewById(R.id.bt_9);

        //运算符
        n_add=findViewById(R.id.bt_add);//+
        n_sub=findViewById(R.id.bt_sub);//-
        n_mul=findViewById(R.id.bt_mul);//*
        n_div=findViewById(R.id.bt_div);///
        n_addsub=findViewById(R.id.bt_addsub);//+- 加负数
        n_equ=findViewById(R.id.bt_equal);//=
        n_point=findViewById(R.id.bt_point);//.
        n_Del=findViewById(R.id.bt_Del);//删除
        n_Clear=findViewById(R.id.bt_C);//清除


        n_0.setOnClickListener((View.OnClickListener) this);
        n_1.setOnClickListener((View.OnClickListener)this);
        n_2.setOnClickListener((View.OnClickListener)this);
        n_3.setOnClickListener((View.OnClickListener)this);
        n_4.setOnClickListener((View.OnClickListener)this);
        n_5.setOnClickListener((View.OnClickListener)this);
        n_6.setOnClickListener((View.OnClickListener)this);
        n_7.setOnClickListener((View.OnClickListener)this);
        n_8.setOnClickListener((View.OnClickListener)this);
        n_9.setOnClickListener((View.OnClickListener)this);
        n_add.setOnClickListener((View.OnClickListener)this);
        n_sub.setOnClickListener((View.OnClickListener)this);
        n_mul.setOnClickListener((View.OnClickListener)this);
        n_div.setOnClickListener((View.OnClickListener)this);
        n_addsub.setOnClickListener((View.OnClickListener)this);
        n_equ.setOnClickListener((View.OnClickListener)this);
        n_point.setOnClickListener((View.OnClickListener)this);
        n_Del.setOnClickListener((View.OnClickListener)this);
        n_Clear.setOnClickListener((View.OnClickListener)this);

        simple=findViewById(R.id.simple);
        science=findViewById(R.id.science);
        length=findViewById(R.id.length);
        scale=findViewById(R.id.scale);
        volume=findViewById(R.id.volume);

        //simple.setOnClickListener((View.OnClickListener)simple);
    }
    //public View.OnClickListener simple=new View.OnClickListener() {
//    @Override
//    public void onClick(View view) {
//        Intent intent=new Intent();
//        intent.setClass(MainActivity.this,menu.class);
//    }
//};
    //    @SuppressLint("ResourceType")
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.layout.activity_main,menu);
//        SubMenu length=menu.addSubMenu("长度");
//        SubMenu scale=menu.addSubMenu("长度");
//        SubMenu volume=menu.addSubMenu("长度");
//
//        getMenuInflater().inflate(R.layout.length,length);
//        getMenuInflater().inflate(R.layout.scale,scale);
//        getMenuInflater().inflate(R.layout.volume,volume);
//
//        return super.onCreateOptionsMenu(menu);
//    }
    public void onClick(View v) {
        String string=editText1.getText().toString();
        switch (v.getId()){
            case R.id.bt_0://0
                num(0);
                break;
            case R.id.bt_1://1
                num(1);
                break;
            case R.id.bt_2://2
                num(2);
                break;
            case R.id.bt_3://3
                num(3);
                break;
            case R.id.bt_4://4
                num(4);
                break;
            case R.id.bt_5://5
                num(5);
                break;
            case R.id.bt_6://6
                num(6);
                break;
            case R.id.bt_7://7
                num(7);
                break;
            case R.id.bt_8://8
                num(8);
                break;
            case R.id.bt_9://9
                num(9);
                break;
            case R.id.bt_add://+
                add();
                break;
            case R.id.bt_sub://-
                sub();
                break;
            case R.id.bt_mul://*
                mul();
                break;
            case R.id.bt_div:///
                div();
                break;
            case R.id.bt_addsub://+- 加负数

                break;
            case R.id.bt_equal://=
                result();
                break;
            case R.id.bt_point://.
                point();
                break;
            case R.id.bt_Del://删除
                del();
                break;
            case R.id.bt_C://清除
                clear();
                break;
        }
        editText1.setText(text);
        editText2.setText(String.valueOf(result));

    }
    private void num(int i){
        text=text+String.valueOf(i);
    }
    private void point(){
        int a=text.length();
        String s1="+";
        String s2="-";
        String s3="*";
        String s4="÷";
        String s5=".";
        if(a!=0){
            String s=text.substring(a-1,a);//获取用户输入的符号
            String s_num=text.substring(0,a-1);//获取用户输入的数字
            if(s1.equals(s)||s2.equals(s)||s3.equals(s)||s4.equals(s)||s5.equals(s)){
                text=s_num+".";
            }else{
                text+=".";
            }
        }else{
            text="";
            result=0.0;
            editText1.setText("");
            editText2.setText("");
        }
    }

    private void del(){
        if (text.length() != 0) {
            String str=text.substring(0,text.length()-1);
            text=str;
        }
    }

    private void clear(){
        text="";
        result=0.0;
        editText1.setText("");
        editText2.setText("");
    }

    private void add(){
        int a=text.length();
        String s1="+";
        String s2="-";
        String s3="*";
        String s4="÷";
        String s5=".";
        if(a!=0){
            String s=text.substring(a-1,a);//获取用户输入的符号
            String s_num=text.substring(0,a-1);//获取用户输入的数字
            if(s1.equals(s)||s2.equals(s)||s3.equals(s)||s4.equals(s)||s5.equals(s)){
                text=s_num+"+";
            }else{
                text+="+";
            }
        }else{
            text="";
            result=0.0;
            editText1.setText("");
            editText2.setText("");
        }
    }

    private void sub(){
        int a=text.length();
        String s1="+";
        String s2="-";
        String s3="*";
        String s4="÷";
        String s5=".";
        if(a!=0){
            String s=text.substring(a-1,a);//获取用户输入的符号
            String s_num=text.substring(0,a-1);//获取用户输入的数字
            if(s1.equals(s)||s2.equals(s)||s3.equals(s)||s4.equals(s)||s5.equals(s)){
                text=s_num+"-";
            }else{
                text+="-";
            }
        }else{
            text="";
            result=0.0;
            editText1.setText("");
            editText2.setText("");
        }
    }

    private void mul(){
        int a=text.length();
        String s1="+";
        String s2="-";
        String s3="*";
        String s4="÷";
        String s5=".";
        if(a!=0){
            String s=text.substring(a-1,a);//获取用户输入的符号
            String s_num=text.substring(0,a-1);//获取用户输入的数字
            if(s1.equals(s)||s2.equals(s)||s3.equals(s)||s4.equals(s)||s5.equals(s)){
                text=s_num+"×";
            }else{
                text+="×";
            }
        }else{
            text="";
            result=0.0;
            editText1.setText("");
            editText2.setText("");
        }
    }

    private void div(){
        int a=text.length();
        String s1="+";
        String s2="-";
        String s3="*";
        String s4="÷";
        String s5=".";
        if(a!=0){
            String s=text.substring(a-1,a);//获取用户输入的符号
            String s_num=text.substring(0,a-1);//获取用户输入的数字
            if(s1.equals(s)||s2.equals(s)||s3.equals(s)||s4.equals(s)||s5.equals(s)){
                text=s_num+"÷";
            }else{
                text+="÷";
            }
        }else{
            text="";
            result=0.0;
            editText1.setText("");
            editText2.setText("");
        }
    }

    private void result(){
        result=operation(text);
    }

    public Double operation(String s){
        //将字符分割后放进数组
        String s1=s.replace("+","-");
        String[] str=s1.split("-");
        double total_final=0;//结果


        //先遍历数组，将乘法和除法算出来  括号优先级
        for(String str1:str){
            if(str1.contains("×")||str1.contains("÷")){
                double total1=0;
                for(int i=0;i<str1.length();){
                    int count=1;
                    a:for(int j=i+1;j<str1.length();j++){
                        char c=str1.charAt(j);
                        if(c=='×'||c=='÷'){
                            break a;
                        }else{
                            count++;
                        }
                    }
                    //截取数字
                    String s2=str1.substring(i,i+count);
                    double d=Double.parseDouble(s2);
                    if(i==0){
                        total1=d;
                    }else{
                        char c1=str1.charAt(i-1);
                        if(c1=='×'){
                            total1*=d;
                        }else if(c1=='÷'){
                            if(d==0){
                                return null;
                            }total1/=d;
                        }
                    }
                    i+=count+1;
                }
                s=s.replace(str1,total1+"");
            }
        }

        //加减运算
        for(int i=0;i<s.length();i++){
            int count=1;
            a:for(int j=i+1;j<s.length();j++){
                char c=s.charAt(j);
                if(c=='+'||c=='-'){
                    break a;
                }else{
                    count++;
                }
            }
            String s3=s.substring(i,i+count);
            double d2=Double.parseDouble(s3);
            if(i==0){
                total_final=d2;
            }else{
                char c=s.charAt(i-1);
                if(c=='+'){
                    total_final+=d2;
                }else if(c=='-'){
                    total_final-=d2;
                }
            }
            i+=count;
        }
        return total_final;
    }

}
