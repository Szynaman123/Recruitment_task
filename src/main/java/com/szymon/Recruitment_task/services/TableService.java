package com.szymon.Recruitment_task.services;

import com.szymon.Recruitment_task.domain.Table;
import com.szymon.Recruitment_task.repositories.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TableService {
    @Autowired
    private TableRepository tableRepository;

    public List<Table> getAll(){
        List<Table> list=new ArrayList<>();
        tableRepository.findAll().forEach(list::add);
        return list;
    }
    public Optional<Table> get(Long id){
       return tableRepository.findById(id);
    }


}
