package me.aheadlcx.test.small;

import android.app.Activity;
import android.os.Bundle;

import net.wequick.small.Small;

//public class AppActivity extends AppCompatActivity {
public class AppActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Small.setUp(AppActivity.this, new Small.OnCompleteListener() {
            @Override
            public void onComplete() {
                Small.openUri("main", AppActivity.this);
                AppActivity.this.finish();
            }
        });
    }
}
