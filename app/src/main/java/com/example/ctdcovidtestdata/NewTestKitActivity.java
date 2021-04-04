package com.example.ctdcovidtestdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NewTestKitActivity extends AppCompatActivity {

    private EditText TestKitNameText, StockText;
    private String TestKitName, Stock;

    testkit testkit = new testkit();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_test_kit);

        TestKitNameText       = findViewById(R.id.TestKitNameText);
        StockText            = findViewById(R.id.StockText);
    }

    public void BackMenu(View view) {
        Intent intent = new Intent(getApplicationContext(), ManageTestKitStockActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    public void testkit(View view) {
        TestKitName = TestKitNameText.getText().toString().trim();
        Stock = StockText.getText().toString().trim();

        System.out.println(TestKitName + " -----------------------------------");
        testkit.addNewTestKit(getApplicationContext(), TestKitName, Stock);

        Intent intent = new Intent(getApplicationContext(), ManageTestKitStockActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}