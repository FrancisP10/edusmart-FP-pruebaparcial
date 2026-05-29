package com.edusmart.edusmart_FP.entity;
import jakarta.persistence.*;
        import java.math.BigDecimal;

@Entity
@Table(name = "tbl_cursos_base")
public class CursoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_curso")
    private Long id;

    @Column(name = "nombre_curso", length = 120, nullable = false, unique = true)
    private String nombreCurso;

    @Column(name = "precio_usd")
    private BigDecimal precioUsd;

    @Column(name = "horas_duracion")
    private Integer horasDuracion;

    public CursoEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public BigDecimal getPrecioUsd() {
        return precioUsd;
    }

    public void setPrecioUsd(BigDecimal precioUsd) {
        this.precioUsd = precioUsd;
    }

    public Integer getHorasDuracion() {
        return horasDuracion;
    }

    public void setHorasDuracion(Integer horasDuracion) {
        this.horasDuracion = horasDuracion;
    }
}