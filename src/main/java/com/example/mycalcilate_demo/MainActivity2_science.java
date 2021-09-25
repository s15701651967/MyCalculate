package com.example.mycalcilate_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2_science extends AppCompatActivity {
    /*
      实例化数字0-9
       */
private Button n_0,n_1,n_2,n_3,n_4,n_5,n_6,n_7,n_8,n_9;

    /*
    实例化运算符号
     */
    private Button n_sin;//sin
    private Button n_cos;//cos
    private Button n_tan;//tan
    private Button n_N;//N!

    private Button n_point;//.
    private Button n_equal;//=
    private Button n_add;//+
    private Button n_sub;//-
    private Button n_mul;//*
    private Button n_div;///

    private Button n_left;//(
    private Button n_right;//)

    private Button n_root;//根号
    private Button n_square;//平方
    private Button n_log;//log
    private Button n_ln;//ln

    private Button n_help;
    private Button n_C;//清除
    private Button n_back;//删除

    private EditText editText1;
    private String text="";//保存输入的数字和符号
    private double result=0.0;//输出结果




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main_activity2_science);

   editText1=(EditText) findViewById(R.id.input);

        //数字0-9
        n_0=findViewById(R.id.num_0);
        n_1=findViewById(R.id.num_1);
        n_2=findViewById(R.id.num_2);
        n_3=findViewById(R.id.num_3);
        n_4=findViewById(R.id.num_4);
        n_5=findViewById(R.id.num_5);
        n_6=findViewById(R.id.num_6);
        n_7=findViewById(R.id.num_7);
        n_8=findViewById(R.id.num_8);
        n_9=findViewById(R.id.num_9);

        //运算符
        n_sin=findViewById(R.id.sin);//sin
        n_cos=findViewById(R.id.cos);//cos
        n_tan=findViewById(R.id.tan);//tan
        n_N=findViewById(R.id.factorial);//N!

        n_point=findViewById(R.id.point);//.
        n_equal=findViewById(R.id.equal);//=
        n_add=findViewById(R.id.add);//+
        n_sub=findViewById(R.id.minus);//-
        n_mul=findViewById(R.id.multiply);//*
        n_div=findViewById(R.id.num_divide);///

        n_left=findViewById(R.id.num_left);//(
        n_right=findViewById(R.id.num_right);//)

        n_root=findViewById(R.id.radical);//根号
        n_square=findViewById(R.id.square);//平方
        n_log=findViewById(R.id.log);//log
        n_ln=findViewById(R.id.ln);//ln
        n_help=findViewById(R.id.help);//help
        n_C=findViewById(R.id.C);//清除
        n_back=findViewById(R.id.back);//删除

//数字0-9
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

        //运算符
        n_sin.setOnClickListener((View.OnClickListener)this);//sin
        n_cos.setOnClickListener((View.OnClickListener)this);//cos
        n_tan.setOnClickListener((View.OnClickListener)this);//tan
        n_N.setOnClickListener((View.OnClickListener)this);//N!

        n_point.setOnClickListener((View.OnClickListener)this);//.
        n_equal.setOnClickListener((View.OnClickListener)this);//=
        n_add.setOnClickListener((View.OnClickListener)this);//+
        n_sub.setOnClickListener((View.OnClickListener)this);//-
        n_mul.setOnClickListener((View.OnClickListener)this);//*
        n_div.setOnClickListener((View.OnClickListener)this);///

        n_left.setOnClickListener((View.OnClickListener)this);//(
        n_right.setOnClickListener((View.OnClickListener)this);//)

        n_root.setOnClickListener((View.OnClickListener)this);//根号
        n_square.setOnClickListener((View.OnClickListener)this);//平方
        n_log.setOnClickListener((View.OnClickListener)this);//log
        n_ln.setOnClickListener((View.OnClickListener)this);//ln
        n_help.setOnClickListener((View.OnClickListener)this);//help
        n_C.setOnClickListener((View.OnClickListener)this);//清除
        n_back.setOnClickListener((View.OnClickListener)this);//删除
    }

    public void oClick(View v){

    }

    private void num(int i){
        text=text+String.valueOf(i);
    }
}