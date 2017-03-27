package kr.soen.practice4;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView)findViewById(R.id.textView1);
        registerForContextMenu(tv1);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        if(v == tv1){
            getMenuInflater().inflate(R.menu.menu1,menu);
        }
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.mnuBule:
                tv1.setBackgroundColor(Color.BLUE);
                break;
            case R.id.mnuYello:
                tv1.setBackgroundColor(Color.YELLOW);
                break;
            case R.id.item1:
                tv1.setTextSize(20);
                break;
            case R.id.item2:
                tv1.setTextSize(40);
                break;

        }
        return super.onContextItemSelected(item);
    }
    //  @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu,menu);
//
//        //menu.add(0,100,0,"배경색");
//        return super.onCreateOptionsMenu(menu);
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        if(item.getItemId() == R.id.mnuYello){
//        }else if(item.getItemId() == R.id.mnuBule){
//
//        }else if(item.getItemId() == R.id.item1){
//            tv1.setTextSize(20);
//
//        }else if(item.getItemId() == R.id.item2){
//            tv1.setTextSize(40);
//
//        }
//        return super.onOptionsItemSelected(item);
//    }
}
