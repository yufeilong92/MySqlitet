package com.example.dell.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: DataBaseHelp.java
 * @Package com.example.dell.myapplication
 * @Description: todo
 * @author: YFL
 * @date: 2018/12/8 19:51
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018/12/8 星期六
 * 注意：本内容仅限于学川教育有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class DataBaseOpenHelp extends SQLiteOpenHelper {
    public DataBaseOpenHelp(Context context) {
        super(context, DataBaseManger.getInstance().dbName, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createdb = "create table " + DataBaseManger.getInstance().dbUser + "(id integer primary key " +
                ",name varchar," +
                "age integer," +
                "vid integer ," +
                "kname varchar(40)," +
                "progress long" +
                ")";
        String createquestion = "create table " + DataBaseManger.getInstance().dbQuestion + "(id integer primary key " +
                ",name varchar," +
                "age integer," +
                "vid integer ," +
                "kname varchar(40)," +
                "progress long" +
                ")";
        db.execSQL(createdb);
        db.execSQL(createquestion);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
