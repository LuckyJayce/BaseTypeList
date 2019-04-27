package com.example.testintlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.shizhefei.collections.basetypelist.LongList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LongList longList = new LongList(20);
        for (int i = 0; i < 100; i++) {
            longList.add(i);
        }

        print(longList);

        longList.remove(0);
        longList.removeValue(80);

        Log.d("ttt", "value ----------------------" );
        print(longList);
    }

    private void print(LongList longList){
        int size = longList.size();
        for (int i = 0; i < size; i++) {
            long value = longList.get(i);
            Log.d("ttt", "value:" + value);
        }
    }
}
