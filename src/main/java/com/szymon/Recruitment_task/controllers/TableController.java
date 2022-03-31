package com.szymon.Recruitment_task.controllers;

import com.szymon.Recruitment_task.domain.Table;
import com.szymon.Recruitment_task.model.AjaxResponse;
import com.szymon.Recruitment_task.services.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class TableController {
    @Autowired
    private TableService tableService;
    @RequestMapping("/table")
    public List<Table> getAll(){
        return tableService.getAll();
    }
    @RequestMapping(value = "/table/unique/{columnName}",method = RequestMethod.GET)
    public List<String> getAllUnique(@PathVariable String columnName){
        List<Table>list=tableService.findAllUnique(columnName);
        List<String>finalList=new ArrayList<>();
        for (Table t:list
             ) {finalList.add(t.toString());

        }
        return finalList;
    }
    @RequestMapping(value = "/table/nonunique/{columnName}",method = RequestMethod.GET)
    public List<String> getAllNotUnique(@PathVariable String columnName){
        List<Table>list=tableService.findAllSame(columnName);
        List<String>finalList=new ArrayList<>();
        for (Table t:list
        ) {finalList.add(t.toString());

        }
        return finalList;
    }


}
