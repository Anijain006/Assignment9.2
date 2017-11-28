package com.animeshjain.assignment92;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    This method will create the Menu with four items in it
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

//        add(groupID,itemID,ItemPosition,ItemTitle)
        menu.add(0,1,1,"B");
        menu.add(0,3,3,"D");
        menu.add(0,2,2,"C");
        menu.add(0,0,0,"A");


        return super.onCreateOptionsMenu(menu);
    }

//      Set what to do on selecting a MenuItem here , eg: make toast, or perform some other action.
//      Here it is used to make different toasts
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int x= item.getItemId();
        switch(x){
            case 0:
                Toast.makeText(this, "You selected A Option from the menu", Toast.LENGTH_SHORT).show();
                break;
            case 1:
                Toast.makeText(this, "You selected B Option from the menu", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(this, "You selected C Option from the menu", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(this, "You selected D Option from the menu", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
