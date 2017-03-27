package chat.loanxu.chatfree.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import chat.loanxu.chatfree.R;

public class LoginChat extends AppCompatActivity {
private Button bt_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_chat);
        bt_login= (Button) findViewById(R.id.bt_login);
        bt_login.setOnClickListener(on_click);
    }
    private View.OnClickListener on_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent it=new Intent(LoginChat.this,MainChat.class);
            startActivity(it);
        }
    };
}
