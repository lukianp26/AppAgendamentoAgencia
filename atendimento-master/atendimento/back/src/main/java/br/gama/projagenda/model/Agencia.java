package br.gama.projagenda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="itmn032_agencia")
public class Agencia {
    
    @Id
    @Column(name ="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nome_agencia")
    private String nome;

    @Column(name = "hora_inicio")
    private int horainicio;

    @Column(name = "hora_fim")
    private int horafinal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(int horainicio) {
        this.horainicio = horainicio;
    }

    public int getHorafinal() {
        return horafinal;
    }

    public void setHorafinal(int horafinal) {
        this.horafinal = horafinal;
    }
}