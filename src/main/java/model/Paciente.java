/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kevin
 */
public class Paciente {
    
    private String data;
    private String hora;
    private String PressaoSistolica;
    private String PressaoDiastolica;
    private String estresse;
    
    public Paciente(){
        
    }

    public Paciente(String data, String hora, String PressaoSistolica, String PressaoDiastolica, String estresse) {
        this.data = data;
        this.hora = hora;
        this.PressaoSistolica = PressaoSistolica;
        this.PressaoDiastolica = PressaoDiastolica;
        this.estresse = estresse;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getPressaoSistolica() {
        return PressaoSistolica;
    }

    public void setPressaoSistolica(String PressaoSistolica) {
        this.PressaoSistolica = PressaoSistolica;
    }

    public String getPressaoDiastolica() {
        return PressaoDiastolica;
    }

    public void setPressaoDiastolica(String PressaoDiastolica) {
        this.PressaoDiastolica = PressaoDiastolica;
    }

    public String getEstresse() {
        return estresse;
    }

    public void setEstresse(String estresse) {
        this.estresse = estresse;
    }
    
    
}
