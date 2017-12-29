package in.meamsler.mu.digitalamsler;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class AmslerStatic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amsler_static);





        new Handler().postDelayed(new Runnable() {
            public void run() {

                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), DefectList.class);

                AmslerStatic.this.startActivity(intent);
                AmslerStatic.this.finish();

                // transition from splash to main menu
                //overridePendingTransition(R.layout.activityfadein, R.layout.splashfadeout);

            }
        }, 10000);



    }

}
