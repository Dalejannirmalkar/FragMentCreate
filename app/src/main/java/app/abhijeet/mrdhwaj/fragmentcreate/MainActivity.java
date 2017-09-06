package app.abhijeet.mrdhwaj.fragmentcreate;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void changefragment(View view){
        Fragment fragment;
        FragmentManager fragmentManager;
        FragmentTransaction fragmentTransaction;
        if (view==findViewById(R.id.firstfrag)){
            fragment=new FirstFragment();
            fragmentManager=getFragmentManager();
            fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentshow,fragment);
            fragmentTransaction.commit();


        }
        if (view==findViewById(R.id.secondfrag)){
            fragment=new SecondFragment();
            fragmentManager=getFragmentManager();
            fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentshow,fragment);
            fragmentTransaction.commit();


        }
    }
}
