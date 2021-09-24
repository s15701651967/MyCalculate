package com.example.mycalcilate_demo;


import androidx.appcompat.app.AppCompatActivity;


import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.StringTokenizer;


public class MainActivity_test extends AppCompatActivity {
    //0~9十个按键
    private Button[] btn = new Button[10];
    //显示器,用于显示输出结果
    private EditText input;
    //显示器下方的记忆器，用于记录上一次计算结果
    private TextView tip;
    private Button
            div, mul, sub, add, equal,            // ÷ × - + =
            sin, cos, tan, log, ln,               //函数
            sqrt, square, factorial, bksp,  	  //根号  平方  阶乘   退格
            left, right, dot, exit,          //（     ）  .  退出
            c;                                //     input清屏键
    //保存原来的算式样子，为了输出时好看，因计算时，算式样子被改变
    public String str_old;
    //π值：3.14
    public double pi=4*Math.atan(1);
    //标记是否清零
    public boolean clean_tag=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        if(this.getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE)

        {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main_test);
            Log.i("info", "landscape"); // 横屏

        }  else if(this.getResources().getConfiguration().orientation==Configuration.ORIENTATION_PORTRAIT)

        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main_test);
            Log.i("info", "portrait"); // 竖屏

        }

        Button button = findViewById(R.id.Return2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        input = (EditText)findViewById(R.id.input);
        tip = (TextView)findViewById(R.id.tip);
        btn[0] = (Button)findViewById(R.id.num_0);
        btn[1] = (Button)findViewById(R.id.num_1);
        btn[2] = (Button)findViewById(R.id.num_2);
        btn[3] = (Button)findViewById(R.id.num_3);
        btn[4] = (Button)findViewById(R.id.num_4);
        btn[5] = (Button)findViewById(R.id.num_5);
        btn[6] = (Button)findViewById(R.id.num_6);
        btn[7] = (Button)findViewById(R.id.num_7);
        btn[8] = (Button)findViewById(R.id.num_8);
        btn[9] = (Button)findViewById(R.id.num_9);
        div = (Button)findViewById(R.id.num_divide);
        mul = (Button)findViewById(R.id.multiply);
        sub = (Button)findViewById(R.id.minus);
        add = (Button)findViewById(R.id.add);
        equal = (Button)findViewById(R.id.equal);
        sin = (Button)findViewById(R.id.sin);
        cos = (Button)findViewById(R.id.cos);
        tan = (Button)findViewById(R.id.tan);
        log = (Button)findViewById(R.id.log);
        ln = (Button)findViewById(R.id.ln);
        sqrt = (Button)findViewById(R.id.radical);
        square = (Button)findViewById(R.id.square);
        factorial = (Button)findViewById(R.id.factorial);
        bksp = (Button)findViewById(R.id.bksp);
        left = (Button)findViewById(R.id.num_left);
        right = (Button)findViewById(R.id.num_right);
        dot = (Button)findViewById(R.id.point);
        exit = (Button)findViewById(R.id.exit);
        c = (Button)findViewById(R.id.C);


        //为数字按键绑定监听器
        btn[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clean_tag){
                    String str=input.getText().toString().trim();
                    input.setText(str+btn[0].getText().toString().trim());
                }
                else
                {
                    input.setText(btn[0].getText().toString().trim());
                    clean_tag=true;
                }
            }
        });
        btn[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clean_tag) {
                    String str = input.getText().toString().trim();
                    input.setText(str + btn[1].getText().toString().trim());
                }
                else
                {
                    input.setText(btn[1].getText().toString().trim());
                    clean_tag=true;
                }
            }
        });
        btn[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clean_tag) {
                    String str = input.getText().toString().trim();
                    input.setText(str + btn[2].getText().toString().trim());
                }
                else{
                    input.setText(btn[2].getText().toString().trim());
                    clean_tag=true;
                }
            }
        });
        btn[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clean_tag) {
                    String str=input.getText().toString().trim();
                    input.setText(str+btn[3].getText().toString().trim());
                }
                else{
                    input.setText(btn[3].getText().toString().trim());
                    clean_tag=true;
                }
            }
        });
        btn[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clean_tag) {
                    String str=input.getText().toString().trim();
                    input.setText(str+btn[4].getText().toString().trim());
                }
                else{
                    input.setText(btn[4].getText().toString().trim());
                    clean_tag=true;
                }
            }
        });
        btn[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clean_tag) {
                    String str=input.getText().toString().trim();
                    input.setText(str+btn[5].getText().toString().trim());
                }
                else{
                    input.setText(btn[5].getText().toString().trim());
                    clean_tag=true;
                }
            }
        });
        btn[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clean_tag) {
                    String str=input.getText().toString().trim();
                    input.setText(str+btn[6].getText().toString().trim());
                }
                else{
                    input.setText(btn[6].getText().toString().trim());
                    clean_tag=true;
                }
            }
        });
        btn[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clean_tag) {
                    String str=input.getText().toString().trim();
                    input.setText(str+btn[7].getText().toString().trim());
                }
                else{
                    input.setText(btn[7].getText().toString().trim());
                    clean_tag=true;
                }
            }
        });
        btn[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clean_tag) {
                    String str=input.getText().toString().trim();
                    input.setText(str+btn[8].getText().toString().trim());
                }
                else{
                    input.setText(btn[8].getText().toString().trim());
                    clean_tag=true;
                }
            }
        });
        btn[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clean_tag) {
                    String str=input.getText().toString().trim();
                    input.setText(str+btn[9].getText().toString().trim());
                }
                else{
                    input.setText(btn[9].getText().toString().trim());
                    clean_tag=true;
                }
            }
        });

        //为+-x÷等按键绑定监听器
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clean_tag) {
                    String str = input.getText().toString().trim();
                    input.setText(str + '/');
                }
                else{
                    tip.setText("别把/放第一位");
                    input.setText("0");
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clean_tag) {
                    String str=input.getText().toString().trim();
                    input.setText(str+'*');
                }
                else{
                    tip.setText("别把*放第一位");
                    input.setText("0");
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clean_tag){
                    String str=input.getText().toString().trim();
                    input.setText(str+'-');
                }
                else{
                    input.setText("-");
                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clean_tag){
                    String str=input.getText().toString().trim();
                    input.setText(str+'+');
                }
                else{
                    tip.setText("别把+放第一位");
                    input.setText("0");
                }
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=input.getText().toString().trim();
                calc cal=new calc();
                cal.process(str);
            }
        });
        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clean_tag) {
                    String str = input.getText().toString().trim();
                    input.setText(str + "sin");
                    tip.setText("sin 函数用法示例：\n" +
                            "DEG：sin30 = 0.5      RAD：sin1 = 0.84\n" +
                            "注：与其他函数一起使用时要加括号，如：\n" +
                            "sin(cos45)，而不是sincos45");
                }
                else{
                    input.setText("sin");
                    clean_tag=true;
                    tip.setText("sin 函数用法示例：\n" +
                            "DEG：sin30 = 0.5      RAD：sin1 = 0.84\n" +
                            "注：与其他函数一起使用时要加括号，如：\n" +
                            "sin(cos45)，而不是sincos45");
                }
            }
        });
        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clean_tag) {
                    String str = input.getText().toString().trim();
                    input.setText(str + "cos");
                    tip.setText("cos 函数用法示例：\n" +
                            "DEG：cos60 = 0.5      RAD：cos1 = 0.54\n" +
                            "注：与其他函数一起使用时要加括号，如：\n" +
                            "cos(sin45)，而不是cossin45");
                }
                else{
                    input.setText("cos");
                    clean_tag=true;
                    tip.setText("cos 函数用法示例：\n" +
                            "DEG：cos60 = 0.5      RAD：cos1 = 0.54\n" +
                            "注：与其他函数一起使用时要加括号，如：\n" +
                            "cos(sin45)，而不是cossin45");
                }
            }
        });
        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clean_tag) {
                    String str = input.getText().toString().trim();
                    input.setText(str + "tan");
                    tip.setText("tan 函数用法示例：\n" +
                            "DEG：tan45 = 1      RAD：tan1 = 1.55\n" +
                            "注：与其他函数一起使用时要加括号，如：\n" +
                            "tan(cos45)，而不是tancos45");
                }
                else{
                    input.setText("tan");
                    clean_tag=true;
                    tip.setText("tan 函数用法示例：\n" +
                            "DEG：tan45 = 1      RAD：tan1 = 1.55\n" +
                            "注：与其他函数一起使用时要加括号，如：\n" +
                            "tan(cos45)，而不是tancos45");
                }
            }
        });
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clean_tag) {
                    String str=input.getText().toString().trim();
                    input.setText(str+"log");
                    tip.setText("log 函数用法示例：\n" +
                            "log10 = log(5+5) = 1\n" +
                            "注：与其他函数一起使用时要加括号，如：\n" +
                            "log(tan45)，而不是logtan45" );
                }
                else{
                    tip.setText("log 函数用法示例：\n" +
                            "log10 = log(5+5) = 1\n" +
                            "注：与其他函数一起使用时要加括号，如：\n" +
                            "log(tan45)，而不是logtan45");
                    clean_tag=true;
                    input.setText("");
                }

            }
        });
        ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clean_tag) {
                    String str=input.getText().toString().trim();
                    input.setText(str+ln);
                    tip.setText("ln 函数用法示例：\n" +
                            "ln10 = le(5+5) = 2.3、lne = 1\n" +
                            "注：与其他函数一起使用时要加括号，如：\n" +
                            "ln(tan45)，而不是lntan45");
                }
                else{
                    input.setText("ln");
                    tip.setText("ln 函数用法示例：\n" +
                            "ln10 = le(5+5) = 2.3   lne = 1\n" +
                            "注：与其他函数一起使用时要加括号，如：\n" +
                            "ln(tan45)，而不是lntan45" );
                    clean_tag=true;
                }
            }
        });
        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clean_tag) {
                    String str=input.getText().toString().trim();
                    input.setText(str+"√");
                    tip.setText("√ 用法示例：开任意次根号\n" +
                            "如：27开3次根为  27√3 = 3\n" +
                            "注：与其他函数一起使用时要加括号，如：\n" +
                            "(函数)√(函数) ， (n!3)√(log100) = 2.45");
                }
                else{
                    tip.setText("√不能放第一位");
                }
            }
        });
        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clean_tag) {
                    String str=input.getText().toString().trim();
                    input.setText(str+"^");
                    tip.setText("^ 用法示例：开任意次平方\n" +
                            "如：2的3次方为  2^3 = 8\n" +
                            "注：与其他函数一起使用时要加括号，如：\n" +
                            "(函数)√(函数) ， (n!3)^(log100) = 36");
                }
                else{
                    input.setText("0");
                    tip.setText("不要把^放第一位");
                }
            }
        });
        factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clean_tag) {
                    String str=input.getText().toString().trim();
                    input.setText(str+"!");
                    tip.setText("n! 函数用法示例：\n "+
                            "n!3 = n!(1+2) = 3×2×1 = 6 \n"+
                            "注：与其他函数一起使用时要加括号，如：\n "+
                            "n!(log1000)，而不是n!log1000");
                }
                else{
                    input.setText("!");
                    tip.setText("n! 函数用法示例：\n "+
                            "n!3 = n!(1+2) = 3×2×1 = 6 \n"+
                            "注：与其他函数一起使用时要加括号，如：\n "+
                            "n!(log1000)，而不是n!log1000");
                }

            }
        });
        bksp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=input.getText().toString().trim();
                int clean=TTO(str);
                if(clean==3)
                {
                    str=str.substring(0,str.length()-3);
                    input.setText(str);
                }
                else if(clean==2){
                    str=str.substring(0,str.length()-2);
                    input.setText(str);
                }
                else{
                    str=str.substring(0,str.length()-1);
                    input.setText(str);
                }
                if(str.length()==0)
                {
                    input.setText("0");
                    clean_tag=false;
                }

            }
        });
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clean_tag) {
                    String str = input.getText().toString().trim();
                    input.setText(str + "(");
                }
                else{
                    input.setText("(");
                    clean_tag=true;
                }
            }
        });
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clean_tag) {
                    String str=input.getText().toString().trim();
                    input.setText(str+")");
                }
                else{
                    input.setText(")");
                    clean_tag=true;
                }
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clean_tag) {
                    String str = input.getText().toString().trim();
                    input.setText(str + ".");
                }
                else{
                    input.setText("0");
                    tip.setText("不要把.放第一位");
                }
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText("0");
                clean_tag=false;
            }
        });

    }
    public class calc {
        public calc(){

        }
        final int MAXLEN = 500;
        /*
          计算表达式
          从左向右扫描，数字入number栈，运算符入operator栈
          +-基本优先级为1，×÷基本优先级为2，log ln sin cos tan n!基本优先级为3，√^基本优先级为4
          括号内层运算符比外层同级运算符优先级高4
          当前运算符优先级高于栈顶压栈，低于栈顶弹出一个运算符与两个数进行运算
          重复直到当前运算符大于栈顶
          扫描完后对剩下的运算符与数字依次计算
         */
        public void process(String str) {
            int weightPlus = 0;//记录优先级
            int topOp = 0;//优先级符号栈计数器
            int topNum = 0; //数字栈计数器
            int flag = 1;//正负数标记1为正-1为负
            int weightTemp = 0;//暂时存储优先级
            str = str.replaceAll("sin", "s");
            str = str.replaceAll("cos", "c");
            str = str.replaceAll("tan", "t");
            str = str.replaceAll("log", "g");
            str = str.replaceAll("ln", "l");
            str = str.replaceAll("n!", "!");
            str = str.replaceAll("-", "-1*");//处理字符串方便后续分割
            int weight[];  //保存operator栈中运算符的优先级，以topOp计数
            double number[];  //保存数字，以topNum计数
            char ch, ch_gai, operator[];//operator[]保存运算符，以topOp计数
            String num;//记录数字
            weight = new int[MAXLEN];
            number = new double[MAXLEN];
            operator = new char[MAXLEN];
            String expression = str;
            StringTokenizer expToken = new StringTokenizer(expression,"+-*/()sctgl!√^");
            //以"+-*/()sctgl!√^"分隔，中间的即为数字
            int i = 0;
            while (i < expression.length()) {
                ch = expression.charAt(i);
                //判断正负数
                if (i == 0) {
                    if (ch == '-')
                        flag = -1;
                } else if(expression.charAt(i-1) == '(' && ch == '-')
                    flag = -1;
                //取得数字，并将正负符号转移给数字
                if (ch <= '9' && ch >= '0'|| ch == '.') {
                    num = expToken.nextToken();
                    ch_gai = ch;
                    //取得整个数字
                    while (i < expression.length() &&
                            (ch_gai <= '9' && ch_gai >= '0'|| ch_gai == '.'))
                    {
                        ch_gai = expression.charAt(i++);
                    }
                    //将指针退回之前的位置
                    if (i >= expression.length())
                        i-=1;
                    else {i-=2;}
                    if (num.compareTo(".") == 0) number[topNum++] = 0;
                        //将正负符号转移给数字
                    else {
                        number[topNum++] = Double.parseDouble(num)*flag;
                        flag = 1;
                    }
                }
                //计算运算符的优先级
                if (ch == '(') weightPlus+=4;
                if (ch == ')') weightPlus-=4;
                if (ch == '-' && flag == 1 || ch == '+' || ch == '*'|| ch == '/' ||
                        ch == 's' ||ch == 'c' || ch == 't' || ch == 'g' || ch == 'l' ||
                        ch == '!' || ch == '√' || ch == '^') {
                    switch (ch) {
                        //+-的优先级最低，为1
                        case '+':
                        case '-':
                            weightTemp = 1 + weightPlus;
                            break;
                        //x÷的优先级稍高，为2
                        case '*':
                        case '/':
                            weightTemp = 2 + weightPlus;
                            break;
                        //sincos之类优先级为3
                        case 's':
                        case 'c':
                        case 't':
                        case 'g':
                        case 'l':
                        case '!':
                            weightTemp = 3 + weightPlus;
                            break;
                        //其余优先级为4
                        //case '^':
                        //case '√':
                        default:
                            weightTemp = 4 + weightPlus;
                            break;
                    }
                    //如果当前优先级大于堆栈顶部元素，则直接入栈
                    if (topOp == 0 || weight[topOp-1] < weightTemp) {
                        weight[topOp] = weightTemp;
                        operator[topOp] = ch;
                        topOp++;
                        //否则将堆栈中运算符逐个取出，直到当前堆栈顶部运算符的优先级小于当前运算符
                    }else {
                        while (topOp > 0 && weight[topOp-1] >= weightTemp) {
                            switch (operator[topOp-1]) {
                                //取出数字数组的相应元素进行运算
                                case '+':
                                    number[topNum-2]+=number[topNum-1];
                                    break;
                                case '-':
                                    number[topNum-2]-=number[topNum-1];
                                    break;
                                case '*':
                                    number[topNum-2]*=number[topNum-1];
                                    break;
                                //判断除数为0的情况
                                case '/':
                                    if (number[topNum-1] == 0) {
                                        showError(1,str_old);
                                        return;
                                    }
                                    number[topNum-2]/=number[topNum-1];
                                    break;
                                case '√':
                                    if(number[topNum-1] == 0 || (number[topNum-2] < 0 &&
                                            number[topNum-1] % 2 == 0)) {
                                        showError(2,str_old);
                                        return;
                                    }
                                    number[topNum-2] =
                                            Math.pow(number[topNum-2], 1/number[topNum-1]);
                                    break;
                                case '^':
                                    number[topNum-2] =
                                            Math.pow(number[topNum-2], number[topNum-1]);
                                    break;
                                //计算时进行角度弧度的判断及转换
                                //sin
                                case 's':
                                    number[topNum-1] = Math.sin((number[topNum-1]/180)*pi);
                                    topNum++;
                                    break;
                                //cos
                                case 'c':

                                    number[topNum-1] = Math.cos((number[topNum-1]/180)*pi);
                                    topNum++;
                                    break;
                                //tan
                                case 't':
                                    if((Math.abs(number[topNum-1])/90)%2 == 1) {
                                        showError(2,str_old);
                                        return;
                                    }
                                    number[topNum-1] = Math.tan((number[topNum-1]/180)*pi);
                                    topNum++;
                                    break;
                                //log
                                case 'g':
                                    if(number[topNum-1] <= 0) {
                                        showError(2,str_old);
                                        return;
                                    }
                                    number[topNum-1] = Math.log10(number[topNum-1]);
                                    topNum++;
                                    break;
                                //ln
                                case 'l':
                                    if(number[topNum-1] <= 0) {
                                        showError(2,str_old);
                                        return;
                                    }
                                    number[topNum-1] = Math.log(number[topNum-1]);
                                    topNum++;
                                    break;
                                //阶乘
                                case '!':
                                    if(number[topNum-1] > 170) {
                                        showError(3,str_old);
                                        return;
                                    } else if(number[topNum-1] < 0) {
                                        showError(2,str_old);
                                        return;
                                    }
                                    number[topNum-1] = N(number[topNum-1]);
                                    topNum++;
                                    break;
                            }
                            //继续取堆栈的下一个元素进行判断
                            topNum--;
                            topOp--;
                        }
                        //将运算符如堆栈
                        weight[topOp] = weightTemp;
                        operator[topOp] = ch;
                        topOp++;
                    }
                }
                i++;
            }
            //依次取出堆栈的运算符进行运算
            while (topOp>0) {
                //+-x直接将数组的后两位数取出运算
                switch (operator[topOp-1]) {
                    case '+':
                        number[topNum-2]+=number[topNum-1];
                        break;
                    case '-':
                        number[topNum-2]-=number[topNum-1];
                        break;
                    case '*':
                        number[topNum-2]*=number[topNum-1];
                        break;
                    //涉及到除法时要考虑除数不能为零的情况
                    case '/':
                        if (number[topNum-1] == 0) {
                            showError(1,str_old);
                            return;
                        }
                        number[topNum-2]/=number[topNum-1];
                        break;
                    case '√':
                        if(number[topNum-1] == 0 || (number[topNum-2] < 0 &&
                                number[topNum-1] % 2 == 0)) {
                            showError(2,str_old);
                            return;
                        }
                        number[topNum-2] =
                                Math.pow(number[topNum-2], 1/number[topNum-1]);
                        break;
                    case '^':
                        number[topNum-2] =
                                Math.pow(number[topNum-2], number[topNum-1]);
                        break;
                    //sin
                    case 's':
                        number[topNum-1] = Math.sin((number[topNum-1]/180)*pi);
                        topNum++;
                        break;
                    //cos
                    case 'c':
                        number[topNum-1] = Math.cos((number[topNum-1]/180)*pi);
                        topNum++;
                        break;
                    //tan
                    case 't':
                        if((Math.abs(number[topNum-1])/90)%2 == 1) {
                            showError(2,str_old);
                            return;
                        }
                        number[topNum-1] = Math.tan((number[topNum-1]/180)*pi);
                        topNum++;
                        break;
                    //对数log
                    case 'g':
                        if(number[topNum-1] <= 0) {
                            showError(2,str_old);
                            return;
                        }
                        number[topNum-1] = Math.log10(number[topNum-1]);
                        topNum++;
                        break;
                    //自然对数ln
                    case 'l':
                        if(number[topNum-1] <= 0) {
                            showError(2,str_old);
                            return;
                        }
                        number[topNum-1] = Math.log(number[topNum-1]);
                        topNum++;
                        break;
                    //阶乘
                    case '!':
                        if(number[topNum-1] > 170) {
                            showError(3,str_old);
                            return;
                        } else if(number[topNum-1] < 0) {
                            showError(2,str_old);
                            return;
                        }
                        number[topNum-1] = N(number[topNum-1]);
                        topNum++;
                        break;
                }
                //取堆栈下一个元素计算
                topNum--;
                topOp--;
            }
            //如果是数字太大，提示错误信息
            if(number[0] > 7.3E306) {
                showError(3,str_old);
                return;
            }
            //输出最终结果
            input.setText(String.valueOf(FP(number[0])));
            tip.setText("计算完毕，要继续请按归零键 C");
        }

        /*
         FP = floating point 控制小数位数，达到精度
         本格式精度为15位
         */
        public double FP(double n) {
            DecimalFormat format = new DecimalFormat("0.#############");
            return Double.parseDouble(format.format(n));
        }

        /*
          阶乘算法
         */
        public double N(double n) {
            int i = 0;
            double sum = 1;
            //依次将小于等于n的值相乘
            for(i = 1;i <= n;i++) {
                sum = sum*i;
            }
            return sum;
        }

        /*
          错误提示，按了"="之后，若计算式在process()过程中，出现错误，则进行提示
         */
        public void showError(int code ,String str) {
            String message="";
            switch (code) {
                case 1:
                    message = "零不能作除数";
                    break;
                case 2:
                    message = "函数格式错误";
                    break;
                case 3:
                    message = "值太大了，超出范围";
            }
            input.setText("\""+str+"\""+": "+message);
            tip.setText(message+"\n"+"计算完毕，要继续请按归零键 C");
        }
    }


    private int TTO(String str) {
        if((str.charAt(str.length() - 1) == 'n' &&
                str.charAt(str.length() - 2) == 'i' &&
                str.charAt(str.length() - 3) == 's') ||
                (str.charAt(str.length() - 1) == 's' &&
                        str.charAt(str.length() - 2) == 'o' &&
                        str.charAt(str.length() - 3) == 'c') ||
                (str.charAt(str.length() - 1) == 'n' &&
                        str.charAt(str.length() - 2) == 'a' &&
                        str.charAt(str.length() - 3) == 't') ||
                (str.charAt(str.length() - 1) == 'g' &&
                        str.charAt(str.length() - 2) == 'o' &&
                        str.charAt(str.length() - 3) == 'l')) {
            return 3;
        } else if((str.charAt(str.length() - 1) == 'n' &&
                str.charAt(str.length() - 2) == 'l') ) {
            return 2;
        } else { return 1; }
    }

}

