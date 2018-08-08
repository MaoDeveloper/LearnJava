package com.maodot.mode.responsibilitychainmode;

/**
 *  角色：总监
 *  上级：经理
 *  职责：负责接收员工的请假，加薪，辞职的申请。请假最多是10天，加薪最多20块，更多就要交给经理，辞职交给经理
 * @author maodot
 */
public class Director extends Leader {

    /**
     * 允许的请假天数
     */
    public final static int LEAVE_DAYS_ALLOW = 10;
    /**
     * 允许的加薪数（元）
     */
    public final static int SALARY_INCREASE_ALLOW = 10;

    public Director(Leader superior, String name) {
        super(superior, name);
    }

    @Override
    public Response handler(Request request) {
        int requestType = request.getRequestType();
        switch (requestType){
            case Request.REQUEST_TYPE_LEAVE:
                {
                    if(request.getLeaveDays() > LEAVE_DAYS_ALLOW){
                        response.addResponseContent(this.superior.handler(request).getContent());
                    }else{
                        response.addResponseContent("好的，你可以请假"+request.getLeaveDays()+"天");
                    }
                    break;
                }
            case Request.REQUEST_TYPE_RESIGNATION:
                {
                    this.superior.handler(request);
                    break;
                }
            case Request.REQUEST_TYPE_SALARY_INCREASE:
                {
                    if(request.getSalaryIncreaseNum() > SALARY_INCREASE_ALLOW){
                        response.addResponseContent(this.superior.handler(request).getContent());
                    }else{
                        response.addResponseContent("好的！"+this.getClass().getSimpleName()+"给您加薪加了"+request.getSalaryIncreaseNum());
                    }
                    break;
                }
             default:
                 {
                     response.addResponseContent(this.getClass().getSimpleName()+"不知道你想干啥");
                 }
        }
        return response;
    }
}
