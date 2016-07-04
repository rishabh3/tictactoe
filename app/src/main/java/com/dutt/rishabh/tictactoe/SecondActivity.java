package com.dutt.rishabh.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * Created by Rishabh on 08-06-2016.
 */

public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rules);
        populateList();

    }
    private void populateList(){
        String[] Rules={"RULES OF THE GAME ARE:","1.Only two players can play the game at a single time.",
        "2.Any three combinations of the same symbol of a particular player leads that player to victory. ",
        "3.The three combinations of the symbols could be in row or column or diagonal.",
        "4.First player to get this combination is victorious."};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(SecondActivity.this,android.R.layout.simple_list_item_1,Rules);
        ListView list= (ListView) findViewById(R.id.listViewMain);
        list.setAdapter(adapter);


    }
    public void onButtonHit(View y){
        if(y.getId()==R.id.Back){
            Intent m=new Intent(SecondActivity.this,tictactoe.class);
            startActivity(m);
        }
    }
}
