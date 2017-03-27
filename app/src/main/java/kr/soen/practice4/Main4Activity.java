package kr.soen.practice4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity  {

    Button button,button2,button3,button8,button9,button10,button11,button12;
    EditText edit1, edit2, edit3, edit4;
    TextView tv4,tv6,tv8;
    String ed1,ed2,ed3,ed4;
    int IntEd1,IntEd2,bmi,IntEd4;
    double IntEd3,result,data;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        init();
    }
    void init(){

        button =(Button)findViewById(R.id.button);
        edit1 = (EditText)findViewById(R.id.editText);
        edit2 = (EditText)findViewById(R.id.editText2);
        tv4 = (TextView)findViewById(R.id.textView4);

        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        edit3 = (EditText)findViewById(R.id.editText3);
        tv6 = (TextView)findViewById(R.id.textView6);


        edit4 = (EditText)findViewById(R.id.editText4);
        tv8 = (TextView)findViewById(R.id.textView8);
        button8 = (Button)findViewById(R.id.button8);

        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {



                if(IntEd1<=0 || IntEd2<=0){

                    Toast.makeText(getApplicationContext(),"다시 입력해주세요.",Toast.LENGTH_SHORT).show();

                }else{
                    ed1 = edit1.getText().toString();
                    ed2 = edit2.getText().toString();
                    IntEd1 = Integer.parseInt(ed1);
                    IntEd2 = Integer.parseInt(ed2);
                    bmi = IntEd2 / ( IntEd1 * IntEd1 );

                    if(bmi<18.5){
                        tv4.setText("체중부족 입니다.");
                    }else if(18.5<=bmi && bmi<22.9){
                        tv4.setText("정상 입니다.");
                    }else if(bmi<24.9){
                        tv4.setText("과체중 입니다.");
                    }else{
                        tv4.setText("비만 입니다.");
                    }

                }


            }
        });

        button2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                ed3 = edit3.getText().toString();
                IntEd3 = Integer.parseInt(ed3);
                result = IntEd3 * 3.305785;
                tv6.setText(result+" 제곱미터");

            }
        });

        button3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                ed3 = edit3.getText().toString();
                IntEd3 = Integer.parseInt(ed3);
                result = IntEd3 * 0.3025;
                tv6.setText(result+" 평");

            }
        });

            /*
        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(edit4.getText().equals("")){
                    Toast.makeText(getApplicationContext(),"값을 입력해주세요.",Toast.LENGTH_SHORT).show();
                }else{
                    ed4 = edit4.getText().toString();
                    IntEd4 = Integer.parseInt(ed4);
                    data = 8 * IntEd4;
                    tv8.setText("결과값 = " + data + " bit" );
                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(edit4.getText().equals("")){
                    Toast.makeText(getApplicationContext(),"값을 입력해주세요.",Toast.LENGTH_SHORT).show();
                }else{
                    ed4 = edit4.getText().toString();
                    IntEd4 = Integer.parseInt(ed4);
                    data = 8192 * IntEd4;
                    tv8.setText("결과값 = " + data + " bit" );
                }
            }
        });
        button10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(edit4.getText().equals("")){
                    Toast.makeText(getApplicationContext(),"값을 입력해주세요.",Toast.LENGTH_SHORT).show();
                }else{
                    ed4 = edit4.getText().toString();
                    IntEd4 = Integer.parseInt(ed4);
                    data = 1048576 * IntEd4;
                    tv8.setText("결과값 = " + data + " bit" );
                }
            }
        });
        button11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                if(edit4.getText().equals("")){
                    Toast.makeText(getApplicationContext(),"값을 입력해주세요.",Toast.LENGTH_SHORT).show();
                }else{
                    ed4 = edit4.getText().toString();
                    IntEd4 = Integer.parseInt(ed4);
                    data = 1048576 * IntEd4;
                    tv8.setText("결과값 = " + data + " KByte" );
                }
            }
        });
            */





    }


}
