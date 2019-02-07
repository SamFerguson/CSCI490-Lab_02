package sammybammy.intentdemo;

import android.app.Activity;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final int REQUEST_CODE = 69;
    private Button set;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        set = (Button) findViewById(R.id.setBackground);
        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), AlternativeActivity.class);
                startActivityForResult(i, REQUEST_CODE);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){

        if(requestCode == REQUEST_CODE && resultCode == Activity.RESULT_OK){
            Bundle extras = data.getExtras();
                if (extras != null){
                    int image = extras.getInt("bgImg");
                    ConstraintLayout newLayout = findViewById(R.id.mainLayout);
                    newLayout.setBackground(getDrawable(image));
                }
        }
    }
}


