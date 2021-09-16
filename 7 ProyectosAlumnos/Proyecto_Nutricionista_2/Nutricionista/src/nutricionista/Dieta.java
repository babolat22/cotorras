/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricionista;

import java.time.LocalDate;

/**
 *
 * @author USER
 */
public class Dieta {
    private int idDieta;
    private int idPaciente;
    private int idComida;
    private LocalDate fechInicio;
    private LocalDate fechFin;
    private float pesoInicial;
    private float pesoBuscado;

    public Dieta() {
    }

    public Dieta(int idDieta) {
        this.idDieta = idDieta;
    }

    public Dieta(int idDieta, int idPaciente, int idComida, LocalDate fechInicio, LocalDate fechFin, float pesoInicial, float pesoBuscado) {
        this.idDieta = idDieta;
        this.idPaciente = idPaciente;
        this.idComida = idComida;
        this.fechInicio = fechInicio;
        this.fechFin = fechFin;
        this.pesoInicial = pesoInicial;
        this.pesoBuscado = pesoBuscado;
    }

    public int getIdDieta() {
        return idDieta;
    }

    public void setIdDieta(int idDieta) {
        this.idDieta = idDieta;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdComida() {
        return idComida;
    }

    public void setIdComida(int idComida) {
        this.idComida = idComida;
    }

    public LocalDate getFechInicio() {
        return fechInicio;
    }

    public void setFechInicio(LocalDate fechInicio) {
        this.fechInicio = fechInicio;
    }

    public LocalDate getFechFin() {
        return fechFin;
    }

    public void setFechFin(LocalDate fechFin) {
        this.fechFin = fechFin;
    }

    public float getPesoInicial() {
        return pesoInicial;
    }

    public void setPesoInicial(float pesoInicial) {
        this.pesoInicial = pesoInicial;
    }

    public float getPesoBuscado() {
        return pesoBuscado;
    }

    public void setPesoBuscado(float pesoBuscado) {
        this.pesoBuscado = pesoBuscado;
    }
    
  }
