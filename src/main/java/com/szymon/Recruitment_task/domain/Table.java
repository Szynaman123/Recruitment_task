package com.szymon.Recruitment_task.domain;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@javax.persistence.Table(name="tabela_testowa")
public class Table {
    @Id
    private Long id;
    private String kolumna1;
    private String kolumna2;
    private String kolumna3;
    private Long kolumna4;

    public Table() {
    }

    public Table(Long id, String kolumna1, String kolumna2, String kolumna3, Long kolumna4) {
        this.id = id;
        this.kolumna1 = kolumna1;
        this.kolumna2 = kolumna2;
        this.kolumna3 = kolumna3;
        this.kolumna4 = kolumna4;
    }

    @Override
    public String toString() {
        return id + ";" + kolumna1 + ";" +
                kolumna2 + ";" +
                 kolumna3 + ";" +
                 kolumna4;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKolumna1() {
        return kolumna1;
    }

    public void setKolumna1(String kolumna1) {
        this.kolumna1 = kolumna1;
    }

    public String getKolumna2() {
        return kolumna2;
    }

    public void setKolumna2(String kolumna2) {
        this.kolumna2 = kolumna2;
    }

    public String getKolumna3() {
        return kolumna3;
    }

    public void setKolumna3(String kolumna3) {
        this.kolumna3 = kolumna3;
    }

    public Long getKolumna4() {
        return kolumna4;
    }

    public void setKolumna4(Long kolumna4) {
        this.kolumna4 = kolumna4;
    }
}
