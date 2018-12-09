package com.example.dell.myapplication;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: DataBaseManger.java
 * @Package com.example.dell.myapplication
 * @Description: todo
 * @author: YFL
 * @date: 2018/12/8 20:47
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018/12/8 星期六
 * 注意：本内容仅限于学川教育有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class DataBaseManger {

    private DataBaseManger() {
    }

    public static DataBaseManger getInstance() {
        return SingletonHolder.instance;
    }

    /**
     * 静态内部类,只有在装载该内部类时才会去创建单例对象
     */
    private static class SingletonHolder {
        private static final DataBaseManger instance = new DataBaseManger();
    }

    public final String dbName = "userinfom.db";
    public final String dbUser = "user";
    public final String dbQuestion = "question";

}
