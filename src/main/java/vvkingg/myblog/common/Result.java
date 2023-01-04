package vvkingg.myblog.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result implements Serializable {
    private int errno;   //200正常、非200异常
    private String message;     //提示信息
    private Object data;    //返回数据

    public static Result success(String msg, Object data) {
        Result r = new Result();
        r.setErrno(0);
        r.setMessage(msg);
        r.setData(data);
        return r;
    }

    public static Result fail(int code, String msg, Object data) {
        Result r = new Result();
        r.setErrno(code);
        r.setMessage(msg);
        r.setData(data);
        return r;
    }

}
