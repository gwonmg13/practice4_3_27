package kr.soen.practice4;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    ImageView img1;
    LinearLayout linear1,linear2,linear3;
    TextView tv1;
    int flag=0 ;
    int flag2,flag3=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        setTitle("메뉴를 눌러보세요");

        img1 = (ImageView)findViewById(R.id.img1);

        linear1 = (LinearLayout)findViewById(R.id.linear1);
        linear2 = (LinearLayout)findViewById(R.id.linear1);
        linear3 = (LinearLayout)findViewById(R.id.linear1);
        tv1 = (TextView)findViewById(R.id.coment1);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.mnuRed: //배경색 빨강
                linear1.setBackgroundColor(Color.RED);
                break;
            case R.id.mnuBule: //배경색 파란
                linear1.setBackgroundColor(Color.BLUE);
                break;
            case R.id.mnuYello: //배경색 노랑
                linear1.setBackgroundColor(Color.YELLOW);
                break;
            case R.id.item1:

                if(flag==0){
                    img1.setRotation(30);
                    flag=1;
                }else{
                    img1.setRotation(0);
                    flag=0;
                }
                break;
            case R.id.item2:
                if(flag2==0) {
                    item.setChecked(true);
                    tv1.setVisibility(View.VISIBLE);
                    flag2=1;
                }else{
                    item.setChecked(false);
                    tv1.setVisibility(View.INVISIBLE);
                    flag2=0;
                }
//
//                }else{
//                    Toast.makeText(getApplicationContext(),"그림을 선택해주세요",Toast.LENGTH_SHORT).show();
//                }
                break;
            case R.id.item3:
                if(flag3==0){
                    item.setChecked(true);
                    img1.setImageResource(R.drawable.img);
                    img1.setScaleX(2);
                    img1.setScaleY(2);
                    flag3=1;
                }else{
                    item.setChecked(false);
                    img1.setImageResource(R.drawable.img);
                    img1.setScaleX(1);
                    img1.setScaleY(1);
                    flag3=0;
                }
                break;
            case R.id.item4:    // 댓글 치킨
                img1.setVisibility(View.VISIBLE);
                img1.setImageResource(R.drawable.img);
                tv1.setText("칙힌");
                break;
            case R.id.item5:    // 댓글 스파게티
                img1.setVisibility(View.VISIBLE);
                img1.setImageResource(R.drawable.img2);
                tv1.setText("습하게티");
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
