package com.dutt.rishabh.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Rishabh on 08-06-2016.
 */
public class ThirdActivity extends Activity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int turn=1;
    static int X=0;
    static int O=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arena);

        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        b3=(Button) findViewById(R.id.b3);
        b4=(Button) findViewById(R.id.b4);
        b5=(Button) findViewById(R.id.b5);
        b6=(Button) findViewById(R.id.b6);
        b7=(Button) findViewById(R.id.b7);
        b8=(Button) findViewById(R.id.b8);
        b9=(Button) findViewById(R.id.b9);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b1.getText().toString().equals("")){
                    if(turn==1){
                        turn=2;
                        b1.setText("X");
                    }else if(turn==2){
                        turn=1;
                        b1.setText("O");
                    }
                }
                endGame();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b2.getText().toString().equals("")){
                    if(turn==1){
                        turn=2;
                        b2.setText("X");
                    }else if(turn==2){
                        turn=1;
                        b2.setText("O");
                    }
                }
                endGame();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b3.getText().toString().equals("")){
                    if(turn==1){
                        turn=2;
                        b3.setText("X");
                    }else if(turn==2){
                        turn=1;
                        b3.setText("O");
                    }
                }
                endGame();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b4.getText().toString().equals("")){
                    if(turn==1){
                        turn=2;
                        b4.setText("X");
                    }else if(turn==2){
                        turn=1;
                        b4.setText("O");
                    }
                }
                endGame();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b5.getText().toString().equals("")){
                    if(turn==1){
                        turn=2;
                        b5.setText("X");
                    }else if(turn==2){
                        turn=1;
                        b5.setText("O");
                    }
                }
                endGame();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b6.getText().toString().equals("")){
                    if(turn==1){
                        turn=2;
                        b6.setText("X");
                    }else if(turn==2){
                        turn=1;
                        b6.setText("O");
                    }
                }
                endGame();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b7.getText().toString().equals("")){
                    if(turn==1){
                        turn=2;
                        b7.setText("X");
                    }else if(turn==2){
                        turn=1;
                        b7.setText("O");
                    }
                }
                endGame();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b8.getText().toString().equals("")){
                    if(turn==1){
                        turn=2;
                        b8.setText("X");
                    }else if(turn==2){
                        turn=1;
                        b8.setText("O");
                    }
                }
                endGame();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b9.getText().toString().equals("")){
                    if(turn==1){
                        turn=2;
                        b9.setText("X");
                    }else if(turn==2){
                        turn=1;
                        b9.setText("O");
                    }
                }
                endGame();
            }


        });
    }
    public void endGame(){
        String a,b,c,d,e,f,g,h,i;
        boolean end=false;
        a=b1.getText().toString();
        b=b2.getText().toString();
        c=b3.getText().toString();
        d=b4.getText().toString();
        e=b5.getText().toString();
        f=b6.getText().toString();
        g=b7.getText().toString();
        h=b8.getText().toString();
        i=b9.getText().toString();
        if(a.equals("X") && b.equals("X") && c.equals("X")){
            Toast.makeText(ThirdActivity.this,"Player 1 is Winner!",Toast.LENGTH_LONG).show();
            end=true;
            X++;

        }
        if(a.equals("X") && d.equals("X") && g.equals("X")){
            Toast.makeText(ThirdActivity.this,"Player 1 is Winner!",Toast.LENGTH_LONG).show();
            end=true;
            X++;
                    }
        if(b.equals("X") && e.equals("X") && h.equals("X")){
            Toast.makeText(ThirdActivity.this,"Player 1 is Winner!",Toast.LENGTH_LONG).show();
            end=true;
            X++;
        }
        if(c.equals("X") && f.equals("X") && i.equals("X")){
            Toast.makeText(ThirdActivity.this,"Player 1 is Winner!",Toast.LENGTH_LONG).show();
            end=true;
            X++;
        }
        if(d.equals("X") && e.equals("X") && f.equals("X")){
            Toast.makeText(ThirdActivity.this,"Player 1 is Winner!",Toast.LENGTH_LONG).show();
            end=true;
            X++;
        }
        if(g.equals("X") && h.equals("X") && i.equals("X")){
            Toast.makeText(ThirdActivity.this,"Player 1 is Winner!",Toast.LENGTH_LONG).show();
            end=true;
            X++;
        }
        if(a.equals("X") && e.equals("X") && i.equals("X")){
            Toast.makeText(ThirdActivity.this,"Player 1 is Winner!",Toast.LENGTH_LONG).show();
            end=true;
            X++;
        }
        if(c.equals("X") && e.equals("X") && g.equals("X")){
            Toast.makeText(ThirdActivity.this,"Player 1 is Winner!",Toast.LENGTH_LONG).show();
            end=true;
            X++;
        }
        if(a.equals("O") && b.equals("O") && c.equals("O")){
            Toast.makeText(ThirdActivity.this,"Player 2 is Winner!",Toast.LENGTH_LONG).show();
            end=true;
            O++;
        }
        if(a.equals("O") && d.equals("O") && g.equals("O")){
            Toast.makeText(ThirdActivity.this,"Player 2 is Winner!",Toast.LENGTH_LONG).show();
            end=true;
            O++;
        }
        if(b.equals("O") && e.equals("O") && h.equals("O")){
            Toast.makeText(ThirdActivity.this,"Player 2 is Winner!",Toast.LENGTH_LONG).show();
            end=true;
            O++;
        }
        if(c.equals("O") && f.equals("O") && i.equals("O")){
            Toast.makeText(ThirdActivity.this,"Player 2 is Winner!",Toast.LENGTH_LONG).show();
            end=true;
            O++;    }
        if(d.equals("O") && e.equals("O") && f.equals("O")){
            Toast.makeText(ThirdActivity.this,"Player 2 is Winner!",Toast.LENGTH_LONG).show();
            end=true;
            O++;
        }
        if(g.equals("O") && h.equals("O") && i.equals("O")){
            Toast.makeText(ThirdActivity.this,"Player 2 is Winner!",Toast.LENGTH_LONG).show();
            end=true;
            O++;
        }
        if(a.equals("O") && e.equals("O") && i.equals("O")){
            Toast.makeText(ThirdActivity.this,"Player 2 is Winner!",Toast.LENGTH_LONG).show();
            end=true;
            O++;   }
        if(c.equals("O") && e.equals("O") && g.equals("O")){
            Toast.makeText(ThirdActivity.this,"Player 2 is Winner!",Toast.LENGTH_LONG).show();
            end=true;
            O++;
        }
        if(!(a.equals("") || b.equals("") || c.equals("") || d.equals("") || e.equals("") || f.equals("") || g.equals("") || h.equals("") || i.equals("")))
        {
            Toast.makeText(ThirdActivity.this,"It's a DRAW!",Toast.LENGTH_LONG).show();
            end=true;
            X++;
            O++;
        }

        if(end){
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
        StringBuilder s=new StringBuilder();
        s.append("Player 1:");
        s.append(X);
        String src=s.toString();
        StringBuilder p=new StringBuilder();
        p.append("Player 2:");
        p.append(O);
        String src1=p.toString();
        TextView score1=(TextView) findViewById(R.id.t1);
        score1.setText(src);
        TextView score2=(TextView) findViewById(R.id.t2);
        score2.setText(src1);


    }
    public void onHit(View x){
        if(x.getId()==R.id.pab){
            Intent k=getIntent();
            finish();
            startActivity(k);
            X=X;
            O=O;

        }
    }
    public void onHitButton(View w){
        if(w.getId()==R.id.Quit){
            Intent back=new Intent(ThirdActivity.this,tictactoe.class);
            startActivity(back);
            X=0;
            O=0;
        }
    }


}
