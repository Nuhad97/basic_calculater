package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.calculater.R;

public class MainActivity extends AppCompatActivity {
//    Button b = (Button) findViewById(R.id.button);
//    TextView t =(TextView) findViewById(R.id.textView);
    TextView t;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b0;
    Button bEql;
    Button bDIV;
    Button bMUL;
    Button bSUB;
    Button bADD;
    Button bDEC;
    Button bAC;
    Button bCLR;
    float num1;
    float num2;
    float tot;
    boolean state;
    public void OperatersON(){
        bEql.setEnabled(true);
        bMUL.setEnabled(true);
        bDIV.setEnabled(true);
        bADD.setEnabled(true);
        bSUB.setEnabled(true);
    }

    public void OperatersOFF(){
        bEql.setEnabled(false);
        bMUL.setEnabled(false);
        bDIV.setEnabled(false);
        bADD.setEnabled(false);
//        bSUB.setEnabled(false);
    }

    public boolean IsAnOperatorOff(){
        if(bMUL.isEnabled() & bDIV.isEnabled() & bADD.isEnabled() & bSUB.isEnabled()) return false;
        else if(bMUL.isEnabled() & bDIV.isEnabled() & bADD.isEnabled()) return true;
        else if(bMUL.isEnabled() & bDIV.isEnabled() & bSUB.isEnabled()) return true;
        else if(bMUL.isEnabled() & bADD.isEnabled() & bSUB.isEnabled()) return true;
        else if(bDIV.isEnabled() & bADD.isEnabled() & bSUB.isEnabled()) return true;
        return false;
    }

    public String[] SearchOperator(){
        int x = 0;
        String data[] = new String[4];
        String number1 = "";
        String number2 = "";
        System.out.println(t.getText().length() + "is the number of characters");
        if(t.getText().charAt(x) == '-') {
            x++;
            data[3] = "NegNum";
        }
        while(x != t.getText().length()){
//            System.out.println(t.getText().charAt(x) + " is the charcter for a loop in while loop");
            if(t.getText().charAt(x) == '/'){
                while (x !=(t.getText().length()-1)){
                    number2 = number2 + t.getText().charAt(++x);
                }
                data[0] = "/";
                data[1] = number1;
                data[2] = number2;
                return data;
            }
            if(t.getText().charAt(x) == '*') {
                while (x !=(t.getText().length()-1)){
                    number2 = number2 + t.getText().charAt(++x);
                }
                data[0] = "*";
                data[1] = number1;
                data[2] = number2;
                return data;
            }
            if(t.getText().charAt(x) == '-') {
                while (x !=(t.getText().length()-1)){
                    number2 = number2 + t.getText().charAt(++x);
                }
                data[0] = "-";
                data[1] = number1;
                data[2] = number2;
                return data;
            }
            if(t.getText().charAt(x) == '+') {
                while (x !=(t.getText().length()-1)){
                    number2 = number2 + t.getText().charAt(++x);
                }
                data[0] = "+";
                data[1] = number1;
                data[2] = number2;
                return data;
            }
            number1 = number1 + t.getText().charAt(x);
            x++;
        }
//        System.out.println("after while loop");
        return data;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.btn1);
        b2 = (Button) findViewById(R.id.btn2);
        b3 = (Button) findViewById(R.id.btn3);
        b4 = (Button) findViewById(R.id.btn4);
        b5 = (Button) findViewById(R.id.btn5);
        b6 = (Button) findViewById(R.id.btn6);
        b7 = (Button) findViewById(R.id.btn7);
        b8 = (Button) findViewById(R.id.btn8);
        b9 = (Button) findViewById(R.id.btn9);
        b0 = (Button) findViewById(R.id.btn0);
        bEql = (Button) findViewById(R.id.btnEql);
        bDIV = (Button) findViewById(R.id.btnDiv);
        bMUL = (Button) findViewById(R.id.btnMul);
        bSUB = (Button) findViewById(R.id.btnSub);
        bADD = (Button) findViewById(R.id.btnAdd);
        bDEC = (Button) findViewById(R.id.btnDecimal);
        bAC = (Button) findViewById(R.id.btnAC);
        bCLR = (Button) findViewById(R.id.btnCLR);
        t =(TextView) findViewById(R.id.textView);
        OperatersOFF();
//        float num1 = 0;
//        float num2 = 0;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText(t.getText()+"1");
                OperatersON();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText(t.getText()+"2");
                OperatersON();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText(t.getText()+"3");
                OperatersON();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText(t.getText()+"4");
                OperatersON();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText(t.getText()+"5");
                OperatersON();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText(t.getText()+"6");
                OperatersON();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText(t.getText()+"7");
                OperatersON();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText(t.getText()+"8");
                OperatersON();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText(t.getText()+"9");
                OperatersON();
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText(t.getText()+"0");
                OperatersON();
            }
        });
        bDEC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
//                    System.out.println(t.getText().charAt(-1));  // this statement gives an error
                    System.out.println("last character is " + t.getText().charAt(t.getText().length()-1));
//                    int i = (int)t.getText().charAt(t.getText().length()-1);
                    int i = Character.getNumericValue(t.getText().charAt(t.getText().length()-1));// convert eg:-'7' to integer 7 eg:-'*' return 1
                    if ( i == -1) throw new NumberFormatException();
                    t.setText(t.getText()+".");
                    bDEC.setEnabled(false);

                }catch (NumberFormatException e){
                    char lastChar = t.getText().charAt(t.getText().length()-1);
                    if(lastChar == '+' || lastChar == '-' || lastChar == '/' || lastChar == '*') t.setText(t.getText()+"0.");
                    else t.setText("0.");
                    bDEC.setEnabled(false);
                }catch (StringIndexOutOfBoundsException e){
                    t.setText("0.");
                    bDEC.setEnabled(false);
                }
                OperatersON();
            }
        });
        bDIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t.getText().length()>0){
                    if(IsAnOperatorOff()) {
                        String text = t.getText().toString().substring(0, t.getText().length() - 1);
                        t.setText(text+"/");
                    }else{
                        try {
                            float f = Float.parseFloat(t.getText().toString());
                            t.setText(f+"/");
                        }catch (NumberFormatException e){
                            bEql.performClick();
                            t.setText(t.getText()+"/");
                        }
                    }
                    OperatersON();
                    bDIV.setEnabled(false);
                    bDEC.setEnabled(true);
                }
            }
        });
        bMUL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t.getText().length()>0){
                    if(IsAnOperatorOff()) {
                        String text = t.getText().toString().substring(0, t.getText().length() - 1);
                        t.setText(text+"*");
                    }else{
                        try {
                            float f = Float.parseFloat(t.getText().toString());
                            t.setText(f + "*");
                        }catch (NumberFormatException e){
                            bEql.performClick();
                            t.setText(t.getText() + "*");
                        }
                    }
                    OperatersON();
                    bMUL.setEnabled(false);
                    bDEC.setEnabled(true);
                }
            }
        });
        bSUB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t.getText().length()>0){
                    if(IsAnOperatorOff()) {
                        String text = t.getText().toString().substring(0, t.getText().length() - 1);
                        t.setText(text+"-");
                    }else{
                        try {
                            float f = Float.parseFloat(t.getText().toString());
                            t.setText(f + "-");
                        }catch (NumberFormatException e){
                            bEql.performClick();
                            t.setText(t.getText() + "-");
                        }
                    }
                }
                else t.setText("-");
                OperatersON();
                bSUB.setEnabled(false);
                bDEC.setEnabled(true);
            }
        });
        bADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t.getText().length()>0){
                    System.out.println(IsAnOperatorOff() + "<-- result is an operator off");
                    if(IsAnOperatorOff()) {
                        String text = t.getText().toString().substring(0, t.getText().length() - 1);
                        System.out.println("Inside is an operator off khfuulfglfgljfjlfkhfkhfkhvkvk");
                        t.setText(text+"+");
                    }else{
                        try {
                            float f = Float.parseFloat(t.getText().toString());
                            t.setText(f + "+");
                        }catch (NumberFormatException e){
                            bEql.performClick();
                            t.setText(t.getText() + "+");
                        }
                    }
                    OperatersON();
                    bADD.setEnabled(false);
                    bDEC.setEnabled(true);
                }
            }
        });
        bEql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] opera_num1_num2 = SearchOperator();
                try{
                    num1 = Float.parseFloat(opera_num1_num2[1]);
                    if(opera_num1_num2[3] == "NegNum") num1 = -num1;
                    num2 = Float.parseFloat(opera_num1_num2[2]);
                    if(opera_num1_num2[0] == "/"){
                        tot = num1 / num2;
                        t.setText(Float.toString(tot));
                    }
                    if(opera_num1_num2[0] == "*"){
                        tot = num1 * num2;
                        t.setText(Float.toString(tot));
                    }
                    if(opera_num1_num2[0] == "-"){
                        tot = num1 - num2;
                        t.setText(Float.toString(tot));
                    }
                    if(opera_num1_num2[0] == "+"){
                        tot = num1 + num2;
                        t.setText(Float.toString(tot));
                    }
                    OperatersON();
                    bDEC.setEnabled(false);
                }catch (NullPointerException e){

                }catch (NumberFormatException e){
                    System.out.println("Inside number format exception");
                    if(t.getText().length()>0){
                        char c1 = t.getText().charAt(0);
                        if(c1 == 'N' || c1 == 'I' || c1 == '/' || c1 == '*') bAC.performClick();
                        if(t.getText().length()>1){
                            char c2 = t.getText().charAt(1);
                            if(c2 == '+' || c2 == '-' || c2 == '/' || c2 == '*') bAC.performClick();
                        }
                    }
                }
//                int tot = 12 + operator + 2;
            }
        });
        bAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText("");
                OperatersOFF();
                bSUB.setEnabled(true);
                bDEC.setEnabled(true);
            }
        });
        bCLR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = "";
                char lastChar;
                if(t.getText().length() > 0) {
                    s = t.getText().toString().substring(0, t.getText().length() - 1);
                    lastChar = t.getText().charAt(t.getText().length()-1);
                    if(lastChar == '.') bDEC.setEnabled(true);
                    if(lastChar == '+' || lastChar == '-' || lastChar == '/' || lastChar == '*') {
                        if(t.getText().length()>1) {
                            bDEC.setEnabled(false);
                        }
                        OperatersON();
                    }
                }
                t.setText(s);
                if(s.length() == 0) OperatersOFF();
            }
        });
    }
}