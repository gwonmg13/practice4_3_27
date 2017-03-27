package kr.soen.practice4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;

public class Main2Activity extends AppCompatActivity {
    TabHost tabhost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //인플레이션 해주는 함수

        tabhost = (TabHost)findViewById(R.id.tabhost1);
        tabhost.setup();

        //첫번째 방법
        TabHost.TabSpec tab1 = tabhost.newTabSpec("A").setContent(R.id.tab1)
                .setIndicator("날짜선택");
        tabhost.addTab(tab1);

        //두번째 방법
        TabHost.TabSpec tab2 = tabhost.newTabSpec("B").setContent(R.id.tab2)
                .setIndicator("시간선택");
        tabhost.addTab(tab2);
//        tabhost.addTab(tabhost.newTabSpec("B").setContent(R.id.tab2)
//                .setIndicator("시간선택"));

        tabhost.addTab(tabhost.newTabSpec("c").setIndicator("tab3").
                setContent(new TabHost.TabContentFactory() {
                    @Override
                    public View createTabContent(String tag) {
                        View view = View.inflate(Main2Activity.this,
                                R.layout.tab3, null);


                        return view;
                    }
                }));

    }
}
