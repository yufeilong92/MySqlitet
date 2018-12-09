package com.example.dell.myapplication;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnContent;
    private Button mBtnAdd;
    private SQLiteDatabase mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initDb();
    }

    private void initDb() {
        DatabaseContext context = new DatabaseContext(this);
        DataBaseOpenHelp help = new DataBaseOpenHelp(context);
        mDatabase = help.getReadableDatabase();
    }

    private void initView() {
        mBtnContent = (Button) findViewById(R.id.btn_content);
        mBtnAdd = (Button) findViewById(R.id.btn_add);

        mBtnContent.setOnClickListener(this);
        mBtnAdd.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_content:
                if (mDatabase == null) {
                    DatabaseContext context = new DatabaseContext(this);
                    DataBaseOpenHelp help = new DataBaseOpenHelp(context);
                    mDatabase = help.getReadableDatabase();
                } else {
                    Toast.makeText(MainActivity.this, "数据库已经创建", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btn_add:

                mDatabase.beginTransaction();
                for (int i = 0; i < 20; i++) {
                    String sql = "insert into " + DataBaseManger.getInstance().dbUser +
                            "(name,age,vid,kname,progress)" +
                            "values(" +
                            "'于飞龙" + i + "'," +
                            i + " ,"
                            + "212" + i
                            + "," +
                            "'三年级"+i+"班',"+
                            "22)";
                    mDatabase.execSQL(sql);
                }
                mDatabase.endTransaction();
                mDatabase.close();
                break;
        }
    }
}
