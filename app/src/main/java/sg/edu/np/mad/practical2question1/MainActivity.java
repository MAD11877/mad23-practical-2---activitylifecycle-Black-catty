package sg.edu.np.mad.practical2question1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    final String TITLE ="Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TITLE, "On Create!");

    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.v(TITLE, "On Start!");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.v(TITLE, "On Pause!");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TITLE, "On Resume!");
        User myUser= new User("john","kind",5,false);
        String name=myUser.getName();
        String desc= myUser.getDescription();
        Button myButton = findViewById(R.id.button);
        myButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (myUser.getFollowed()==false)
                {
                    Log.v(TITLE,"You have followed "+ name +" he is "+desc);
                    myUser.followed=true;
                    Button btn = (Button)findViewById(R.id.button);
                    btn.setText("UNFOLLOW");
                }
                else if (myUser.getFollowed()==true)
                {
                    Log.v(TITLE, "You have unfollowed " + name + " he is " + desc);
                    myUser.followed = false;
                    Button btn = (Button) findViewById(R.id.button);
                    btn.setText("FOLLOW");
                }


            }


        });




    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.v(TITLE,"On Stop!");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.v(TITLE, "On Destroy!");
    }

}