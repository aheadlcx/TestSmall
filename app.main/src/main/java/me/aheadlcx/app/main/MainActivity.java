package me.aheadlcx.app.main;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;

import net.wequick.small.Small;

//public class MainActivity extends AppCompatActivity {
public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.txtMain).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Small.openUri("home", MainActivity.this);
            }
        });
    }
}
