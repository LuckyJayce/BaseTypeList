package com.example.testintlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.LongSparseArray;

import org.apache.poi.util.IntList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntList intList = new IntList(100);
        intList.add(0);
        int[] ints = intList.toArray();
//        LongSparseArray
    }
}
