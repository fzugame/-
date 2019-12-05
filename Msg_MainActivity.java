package com.example.pinpin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import  java.util.List;
import java.util.ArrayList;

public class Msg_MainActivity extends AppCompatActivity {
    private List<Message> msglist= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_msg);

        initMessage();
        MessageAdapter adapter=new MessageAdapter(Msg_MainActivity.this,
                R.layout.activity_list_view,msglist);
        ListView listview=(ListView)findViewById(R.id.list_view);
        listview.setAdapter(adapter);

    }


    public void initMessage(){
        //初始化数据函数
        //如果要输入数据，使用msg.add();方法；
        //为了把能看出效果，我采用循环的方式添加了一些数据；
        // 在实际使用中，可以根据实际请款添加数据
        for(int i=0;i<3;i++){
            Message first=new Message("adoat","09:01",
                    "adoat:有内鬼，停止交易。",R.drawable.t_image1);
            Message second=new Message("动妖动妖","昨天",
                    "动妖动妖:有内鬼，停止交易。",R.drawable.t_image2);
            Message third=new Message("Diout","昨天",
                    "Diout:有内鬼，停止交易。",R.drawable.t_image3);
            Message fourth=new Message("CEO的我","昨天",
                    "CEO的我:我被人出卖的，你跑路吧。",R.drawable.t_image4);
            Message fifth=new Message("贼老天","2019-11-20",
                    "贼老天:昨天那批货很棒呀。",R.drawable.t_image5);
            msglist.add(first);
            msglist.add(second);
            msglist.add(third);
            msglist.add(fourth);
            msglist.add(fifth);
        }
    }
}
