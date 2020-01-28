package lecture.experiments.modularization;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import lecture.experiments.screentime.ScreenTimeFunctionality;

public class MainActivity extends AppCompatActivity {
    ScreenTimeFunctionality screenTimeFunctionality;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screenTimeFunctionality = new ScreenTimeFunctionality();
        
    }

    public void startButton(View view) {
        screenTimeFunctionality.registerEvents(this);
    }

    public void stopButton(View view) {
        screenTimeFunctionality.unregisterEvents(this);
    }
}
