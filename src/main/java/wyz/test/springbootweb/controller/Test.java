package wyz.test.springbootweb.controller;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import wyz.test.springbootweb.bean.LoginUser;

import java.util.ArrayList;
import java.util.List;

/**
 * 值的传递还是对象的传递
 */
public class Test {
    public User setName(User user){
        user.setName("hello");
        user=new User();
        user.setName("world");
        return user;
    }

    public static void main(String[] args) {
        /*String hello1="hello";
        String hello2="he"+new String("llo");
        System.out.println(hello1==hello2);*/
       /* User user=new User();
        Test test=new Test();
        test.setName(user);
        System.out.println(user.getName());*/
        List<JSONObject> reList=new ArrayList<>();
        List<LoginUser> list=new ArrayList<>();
        LoginUser loginUser1=new LoginUser();
        loginUser1.setUserName("第一个");
        loginUser1.setPassWord("1");
        loginUser1.setPid(1);
        LoginUser loginUser2=new LoginUser();
        loginUser2.setUserName("第二个");
        loginUser2.setPassWord("2");
        loginUser1.setPid(2);
        list.add(loginUser1);
        list.add(loginUser2);
        JsonConfig jsonConfig=new JsonConfig();
        JSONArray json = JSONArray.fromObject(list,jsonConfig);
        for(LoginUser loginUser:list){
            JSONObject jsonObject = JSONObject.fromObject(loginUser);
            Long l=Long.parseLong(jsonObject.getString("passWord"));
            jsonObject.put("passWord",l);
            reList.add(jsonObject);
        }
        System.out.println(json.toString());
        System.out.println(reList.toString());
    }
}

class User{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
