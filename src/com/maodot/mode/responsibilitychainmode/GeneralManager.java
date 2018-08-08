package com.maodot.mode.responsibilitychainmode;

/**
 * 总经理
 * @author maodot
 */
public class GeneralManager extends Leader {

    /**
     * 允许的请假天数
     */
    public final static int LEAVE_DAYS_ALLOW = 30;
    /**
     * 允许的加薪数（元）
     */
    public final static int SALARY_INCREASE_ALLOW = 100;

    protected GeneralManager(Leader superior, String name) {
        super(superior, name);
    }

    @Override
    public Response handler(Request request) {
        int requestType = request.getRequestType();
        switch (requestType){
            case Request.REQUEST_TYPE_LEAVE:
            {
                if(request.getLeaveDays() > LEAVE_DAYS_ALLOW){
                    response.addResponseContent(this.getClass().getSimpleName()+"你干脆辞职算了");
                }else {
                    response.addResponseContent(this.getClass().getSimpleName()+"批准你请假"+request.getLeaveDays()+"天");
                }
                break;
            }
            case Request.REQUEST_TYPE_SALARY_INCREASE:
            {
                if(request.getSalaryIncreaseNum() > SALARY_INCREASE_ALLOW){
                    response.addResponseContent(this.getClass().getSimpleName()+"不可能");
                }else{
                    response.addResponseContent(this.getClass().getSimpleName()+"给你加薪加了"+request.getSalaryIncreaseNum()+"元");
                }
                break;
            }
            case Request.REQUEST_TYPE_RESIGNATION:
            {
                response.addResponseContent(superior.handler(request).getContent());
                break;
            }
            default:
            {
                response.addResponseContent(request.getClass().getSimpleName()+"我不知道你要干啥？");
            }
        }
        return response;
    }
}
