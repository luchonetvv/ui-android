package ni.com.example.luchonetvv.myapplicationtestcomponentgoogle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnScrollingActivity;
    private Button btnLoginActivity;
    private Button btnNavigationDrawerActivity;
    private Button btnTabbedSwipesViewActivity;
    private Button btnTabbedActionBarTabsWithVPActivity;
    private Button btnTabbedActionBarSpinnerActivity;
    private Button btnSettingsActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();

        btnScrollingActivity = (Button) findViewById(R.id.btnScrollingActivity);
        btnScrollingActivity.setOnClickListener(this);

        btnLoginActivity = (Button) findViewById(R.id.btnLoginActivity);
        btnLoginActivity.setOnClickListener(this);

        btnNavigationDrawerActivity = (Button) findViewById(R.id.btnNavigationDrawerActivity);
        btnNavigationDrawerActivity.setOnClickListener(this);

        btnTabbedSwipesViewActivity = (Button) findViewById(R.id.btnTabbedSwipesViewActivity);
        btnTabbedSwipesViewActivity.setOnClickListener(this);

        btnTabbedActionBarTabsWithVPActivity = (Button) findViewById(R.id.btnTabbedActionBarTabsWithVPActivity);
        btnTabbedActionBarTabsWithVPActivity.setOnClickListener(this);

        btnTabbedActionBarSpinnerActivity = (Button) findViewById(R.id.btnTabbedActionBarSpinnerActivity);
        btnTabbedActionBarSpinnerActivity.setOnClickListener(this);

        btnSettingsActivity = (Button) findViewById(R.id.btnSettingsActivity);
        btnSettingsActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnScrollingActivity:
                Intent intentScrollingActivity = new Intent(this, ScrollingActivity.class);
                startActivity(intentScrollingActivity);
                break;
            case R.id.btnLoginActivity:
                Intent intentLoginActivity = new Intent(this, LoginActivity.class);
                startActivity(intentLoginActivity);
                break;
            case R.id.btnNavigationDrawerActivity:
                Intent intentNavigationDrawerActivity = new Intent(this, NavigationDrawerActivity.class);
                startActivity(intentNavigationDrawerActivity);
                break;
            case R.id.btnTabbedSwipesViewActivity:
                Intent intentTabbedSwipesViewActivity = new Intent(this, TabbedSwipesViewActivity.class);
                startActivity(intentTabbedSwipesViewActivity);
                break;
            case R.id.btnTabbedActionBarTabsWithVPActivity:
                Intent intentTabbedActionBarTabsWithVPActivity = new Intent(this, TabbedActionBarTabsWithVPActivity.class);
                startActivity(intentTabbedActionBarTabsWithVPActivity);
                break;
            case R.id.btnTabbedActionBarSpinnerActivity:
                Intent intentTabbedActionBarSpinnerActivity = new Intent(this, TabbedActionBarSpinnerActivity.class);
                startActivity(intentTabbedActionBarSpinnerActivity);
                break;
            case R.id.btnSettingsActivity:
                Intent intentSettingsActivity = new Intent(this, SettingsActivity.class);
                startActivity(intentSettingsActivity);
                break;
            default:
                break;
        }
    }
}
