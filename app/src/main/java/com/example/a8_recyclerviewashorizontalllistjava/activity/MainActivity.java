package com.example.a8_recyclerviewashorizontalllistjava.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.a8_recyclerviewashorizontalllistjava.R;
import com.example.a8_recyclerviewashorizontalllistjava.adapter.CustomAdapter;
import com.example.a8_recyclerviewashorizontalllistjava.model.Member;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        List<Member> members = prepareMemberList();
        refreshAdapter(members);

    }
    private  void initView(){
        recyclerView = findViewById(R.id.recycleViewMain);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
            //LinearLayoutManager bu gorizontal holatni chiqarish uchun kerak bu jarayon.
    }
    private void refreshAdapter(List<Member> members){
        CustomAdapter adapter = new CustomAdapter(members,context);
        recyclerView.setAdapter(adapter);
    }
    private  List<Member> prepareMemberList(){
        List<Member> members = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            members.add(new Member("Sherzod","Jurabekov"));
        }
        return members;
    }
}