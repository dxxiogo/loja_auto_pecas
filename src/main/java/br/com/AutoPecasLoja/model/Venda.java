package br.com.AutoPecasLoja.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private Date data;
    private Double valor_Total;
    @ManyToOne
    @NotNull
    private Cliente cliente;
    @ManyToOne
    @NotNull
    private Funcionario funcionario;

    public Venda() {
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValor_Total() {
        return valor_Total;
    }

    public void setValor_Total(Double valor_Total) {
        this.valor_Total = valor_Total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "id=" + id +
                ", data=" + data +
                ", valor_Total=" + valor_Total +
                ", cliente=" + cliente +
                ", funcionario=" + funcionario +
                '}';
    }
}
