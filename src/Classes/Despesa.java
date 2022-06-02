/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Date;

/**
 *
 * @author m10816361
 */
public class Despesa {

    private Integer id;
    private String tipo;
    private String descricao;
    private String str_despesa;
    private Date despesa;
    private Float total;

    public String getStr_despesa() {
        return str_despesa;
    }

    public void setStr_despesa(String str_despesa) {
        this.str_despesa = str_despesa;
    }

    public Date getDespesa() {
        return despesa;
    }

    public void setDespesa(Date despesa) {
        this.despesa = despesa;
    }
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData_despesa() {
        return str_despesa;
    }

    public void setData_despesa(String data_despesa) {
        this.str_despesa = data_despesa;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

}
