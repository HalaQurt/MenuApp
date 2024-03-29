package com.example.menuapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

public class MainActivity extends AppCompatActivity {
private Spinner spnMenu ;
private TextView TxtSelect;
private Button btnSearch;
private ListView Lstitem ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
setUPViews();
populateSpinner();
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseItems db = new DatabaseItems();
                String cat = spnMenu.getSelectedItem().toString();
                List<MenuItem> result = db.getMenuItems(cat);
                MenuItem [] arr = result.toArray(new MenuItem[result.size()]);
                ArrayAdapter <MenuItem> adaptor = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,arr);
                Lstitem.setAdapter(adaptor);

            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void populateSpinner() {
        DatabaseItems db = new DatabaseItems();
        String [] cats = db.getCategories();
        ArrayAdapter<String> adaptor = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,cats);
        spnMenu.setAdapter(adaptor);
    }

    private void setUPViews() {
        spnMenu = findViewById(R.id.spnMenu);
        TxtSelect =findViewById(R.id.TxtSelect);
        btnSearch = findViewById(R.id.btnSearch);
        Lstitem = findViewById(R.id.Lstitem);
    }
}