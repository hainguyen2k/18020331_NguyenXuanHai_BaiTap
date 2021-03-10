package com.example.a18020331_nguyenxuanhai_baitap3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spnThings;
    ListView listThings;
    GridView gridThings;
    ArrayList<String> arrThings;
    ArrayAdapter adtThings;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Spinner
        spnThings = findViewById(R.id.spnThings);
        listThings = findViewById(R.id.listThings);
        gridThings = findViewById(R.id.gridThings);
        addArrays();
        adtThings = new ArrayAdapter(
                MainActivity.this,
                android.R.layout.simple_spinner_item,
                arrThings);
        spnThings.setAdapter(adtThings);
        //Listview
        addArrays();
        adtThings = new ArrayAdapter(
                MainActivity.this,
                android.R.layout.simple_spinner_item,
                arrThings);
        listThings.setAdapter(adtThings);
        //Gridview
        addArrays();
        adtThings = new ArrayAdapter(
                MainActivity.this,
                android.R.layout.simple_spinner_item,
                arrThings);
        gridThings.setAdapter(adtThings);
    }
    private void addArrays(){
        arrThings = new ArrayList<>();
        arrThings.add("Hang gia dung");
        arrThings.add("Hang nha lam");
        arrThings.add("Hang cong ty");
        arrThings.add("Hang an uong");
    }
}