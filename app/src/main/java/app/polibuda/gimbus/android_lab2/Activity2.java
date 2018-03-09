package app.polibuda.gimbus.android_lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        final RadioButton radioButton = findViewById(R.id.radio1);
        final RadioButton radioButton1 = findViewById(R.id.radio2);
        final CheckBox checkBox = findViewById(R.id.checkbox1);
        final ImageView imageView = findViewById(R.id.image1);
        Button button = findViewById(R.id.back_button);

        radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    radioButton.setTextColor(getResources().getColor(R.color.colorAccent));
                    radioButton1.setTextColor(getResources().getColor(R.color.colorAccent));
                }
            }
        });

        radioButton1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    radioButton.setTextColor(getResources().getColor(R.color.colorPrimary));
                    radioButton1.setTextColor(getResources().getColor(R.color.colorPrimary));
                }
            }
        });

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) imageView.setVisibility(View.VISIBLE);
                else imageView.setVisibility(View.INVISIBLE);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}
