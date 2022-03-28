package com.szymon.Recruitment_task.controllers;

import com.szymon.Recruitment_task.domain.Table;
import com.szymon.Recruitment_task.services.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TableController {
    @Autowired
    private TableService tableService;
    @RequestMapping("/table")
    public List<Table> getAll(){
        return tableService.getAll();
    }
}
