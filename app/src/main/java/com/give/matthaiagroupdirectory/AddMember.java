package com.give.matthaiagroupdirectory;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddMember extends AppCompatActivity {

    EditText name, phone, details;
    FirebaseDatabase database;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_member);

        name = findViewById(R.id.name);
        phone = findViewById(R.id.phone);
        details = findViewById(R.id.details);
        button =findViewById(R.id.addButton);

        database = FirebaseDatabase.getInstance();

    }

    public void addMemberClick(View view) {

        button.setVisibility(View.GONE);
        MemberEntity memberEntity = new MemberEntity();

        memberEntity.setName(name.getText().toString());
        memberEntity.setPhone(phone.getText().toString());
        memberEntity.setDetails(details.getText().toString());
        DatabaseReference myRef = database.getReference("member");

        String key =  myRef.push().getKey();

        myRef.child(key).setValue(memberEntity).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                button.setVisibility(View.VISIBLE);
            }
        });

    }
}
