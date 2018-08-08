package com.maodot.mode.responsibilitychainmode;

/**
 * 责任链模式
 * 案例: 雇员要求 (请假 & 涨薪), 要经过总监Director -> 经理Manager -> 总经理GeneralManager的层层审批.
 * @author maodot
 */
public class Client {

    public static void main(String[] args) {
        //员工发出请求
        Request request = new Request(Request.REQUEST_TYPE_LEAVE,"我想请假");
        request.setLeaveDays(16);

        Leader generalManager = new GeneralManager(null,"总经理");
        Leader manager = new Manager(generalManager,"经理");
        Leader director = new Director(manager,"总监");

        /* 向总监经理 */
        Response response = director.handler(request);
        //得到的回应
        System.out.println("总监回应："+response.getContent());
    }
}
