package com.DigitalHouse.blog.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.Date;


@Entity
@Table(name = "tb_postagem")
public class Postagem {


    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "post_titulo")
    @NotNull
    @Size (min = 5, max = 100)
    private String titulo;

    @NotNull
    @Size (min = 5, max = 500)
    private String texto;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date = new java.sql.Date(System.currentTimeMillis());

//    @Temporal(TemporalType.TIMESTAMP)
//    private LocalDateTime dateTime =  LocalDateTime.now();

    public long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getDate() {return date;}
    public void setDate(Date date) {this.date = date;}

//    public LocalDateTime getDateTime() { return dateTime;}
//    public void setDateTime(LocalDateTime dateTime) { this.dateTime = dateTime;}



}
