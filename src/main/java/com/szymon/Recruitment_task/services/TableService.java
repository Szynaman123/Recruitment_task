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
    public List<Table> findAllSame(String columnName){
        List<Table>list= new ArrayList<>();
        List<Table>finalList= new ArrayList<>();
        list=getAll();
        switch (columnName){
            case "kolumna1":
                for (int i = 0; i < list.size(); i++){
                    Table t= new Table();
                    t=list.get(i);
                    for (int j=i+1;j<list.size();j++){
                        if(t.getKolumna1().equals(list.get(j).getKolumna1())){
                            if(finalList.contains(t)){
                                finalList.add(list.get(j));
                            }else{
                                finalList.add(t);
                                finalList.add(list.get(j));
                            }
                        }
                    }
                }
                break;
            case "kolumna2":
                for (int i = 0; i < list.size(); i++){
                    Table t= new Table();
                    t=list.get(i);
                    for (int j=i+1;j<list.size();j++){
                        if(t.getKolumna2().equals(list.get(j).getKolumna2())){
                            if(finalList.contains(t)){
                                finalList.add(list.get(j));
                            }else{
                                finalList.add(t);
                                finalList.add(list.get(j));
                            }
                        }
                    }
                }
                break;
                case "kolumna3":
                for (int i = 0; i < list.size(); i++){
                    Table t= new Table();
                    t=list.get(i);
                    for (int j=i+1;j<list.size();j++){
                        if(t.getKolumna3().equals(list.get(j).getKolumna3())){
                            if(finalList.contains(t)){
                                finalList.add(list.get(j));
                            }else{
                                finalList.add(t);
                                finalList.add(list.get(j));
                            }
                        }
                    }
                }
                break;
                case "kolumna4":
                for (int i = 0; i < list.size(); i++){
                    Table t= new Table();
                    t=list.get(i);
                    for (int j=i+1;j<list.size();j++){
                        if(t.getKolumna4().equals(list.get(j).getKolumna4())){
                            if(finalList.contains(t)){
                                finalList.add(list.get(j));
                            }else{
                                finalList.add(t);
                                finalList.add(list.get(j));
                            }
                        }
                    }
                }
                break;
            default:
                return finalList;

        }

        return finalList;

    }
    public List<Table> findAllUnique(String columnName){
        List<Table>list= new ArrayList<>();
        List<Table>finalList= new ArrayList<>();
        list=getAll();

    }


}
