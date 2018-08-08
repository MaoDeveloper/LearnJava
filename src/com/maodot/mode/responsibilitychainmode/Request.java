package com.maodot.mode.responsibilitychainmode;

/**
 * 模拟请求事件
 * @author maoodt
 */
public class Request {
    /**
     * 请求类型：请假
     */
    public static final int REQUEST_TYPE_LEAVE = 1;
    /**
     * 请求类型：加薪
     */
    public static final int REQUEST_TYPE_SALARY_INCREASE = 2;
    /**
     * 请求类型：辞职
     */
    public static final int REQUEST_TYPE_RESIGNATION = 3;

    private int requestType ;

    private String requestContent;

    private int leaveDays ;

    private int salaryIncreaseNum;

    private Request() {
    }

    public Request(int requestType, String requestContent) {
        this.requestType = requestType;
        this.requestContent = requestContent;
    }

    public int getRequestType() {
        return requestType;
    }

    public String getRequestContent() {
        return requestContent;
    }

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }

    public int getSalaryIncreaseNum() {
        return salaryIncreaseNum;
    }

    public void setSalaryIncreaseNum(int salaryIncreaseNum) {
        this.salaryIncreaseNum = salaryIncreaseNum;
    }
}
