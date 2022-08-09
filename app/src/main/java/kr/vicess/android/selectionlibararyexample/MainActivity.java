package kr.vicess.android.selectionlibararyexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    // initialize variables
    RecyclerView recyclerView;
    TextView tvEmpty;
    ArrayList<String> arrayList=new ArrayList<>();
    MainAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // assign variable
        recyclerView=findViewById(R.id.recycler_view);
        tvEmpty=findViewById(R.id.tv_empty);

        // add values in arraylist
        arrayList.addAll(Arrays.asList("One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven"
                ,"Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen","Twenty"));

        // set layout manager
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize adapter
        adapter=new MainAdapter(this,arrayList,tvEmpty);

        // set adapter
        recyclerView.setAdapter(adapter);
    }
}