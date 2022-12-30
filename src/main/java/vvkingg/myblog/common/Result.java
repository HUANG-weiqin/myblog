package vvkingg.myblog.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result implements Serializable {
    private int code;   //200正常、非200异常
    private String msg;     //提示信息
    private Object data;    //返回数据

    public static Result success(int code, String msg, Object data) {
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

    public static Result fail(int code, String msg, Object data) {
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

}
