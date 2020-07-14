package sg.edu.rp.c346.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView lvAndroidList;
    ArrayList<AndroidVersion> alAndroid;
    ArrayAdapter<AndroidVersion> aaAndroid;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvAndroidList = findViewById(R.id.listViewAndroid);
        alAndroid = new ArrayList<AndroidVersion>();
        alAndroid.add(new AndroidVersion("pie","9.0"));
        alAndroid.add(new AndroidVersion("Oreo","8.0-8.1"));
        alAndroid.add(new AndroidVersion("Nougat","7.0-7.1.2"));

        aaAndroid = new CustomAdapter(this, R.layout.row,alAndroid);

        lvAndroidList.setAdapter(aaAndroid);





    }
}