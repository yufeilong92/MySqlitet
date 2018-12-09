package com.example.dell.myapplication;

import android.content.Context;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: DbHelp.java
 * @Package com.example.dell.myapplication
 * @Description: todo
 * @author: YFL
 * @date: 2018/12/8 20:34
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018/12/8 星期六
 * 注意：本内容仅限于学川教育有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class DbHelp {
    private Context mContext;
    private static volatile DbHelp _instance = null;

    private DbHelp(Context context) {
        this.mContext = context;
    }

    public static DbHelp getInstance(Context context) {
        if (_instance == null) {
            synchronized (DbHelp.class) {
                if (_instance == null) {
                    _instance = new DbHelp(context);
                }
            }
        }
        return _instance;
    }
 

}
