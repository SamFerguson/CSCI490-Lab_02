package sammybammy.intentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.view.View;

public class AlternativeActivity extends AppCompatActivity {

    private ImageView Blood;
    private ImageView Waterfall;
    private int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alternative);

        Blood = (ImageView) findViewById(R.id.moon);
        Waterfall = (ImageView) findViewById(R.id.waterfall);

        Blood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = R.drawable.supermoon;
                finish();
            }
        });
        Waterfall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = R.drawable.waterfall;
                finish();

            }
        });



    }

    @Override
    public void finish() {

        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        i.putExtra("bgImg", id);
        setResult(RESULT_OK, i);

        super.finish();

    }
}
