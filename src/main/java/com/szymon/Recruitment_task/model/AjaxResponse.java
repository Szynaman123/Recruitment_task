package com.szymon.Recruitment_task.model;

import com.szymon.Recruitment_task.domain.Table;

import java.util.List;

public class AjaxResponse {
    private String msg;
    private List<Table> result;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<Table> getResult() {
        return result;
    }

    public void setResult(List<Table> result) {
        this.result = result;
    }
}
