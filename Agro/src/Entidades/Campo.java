package Entidades;
// Generated 09/12/2018 10:55:58 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

public class Campo  implements java.io.Serializable {

     private Integer idCampo;
     private String nombreCampo;
     private double superficieCampo;
     private String estadoCampo;
     private Set lotes = new HashSet(0);

    public Campo() {
    }

	
    public Campo(String nombreCampo, double superficieCampo, String estadoCampo) {
        this.nombreCampo = nombreCampo;
        this.superficieCampo = superficieCampo;
        this.estadoCampo = estadoCampo;
    }
    public Campo(String nombreCampo, double superficieCampo, String estadoCampo, Set lotes) {
       this.nombreCampo = nombreCampo;
       this.superficieCampo = superficieCampo;
       this.estadoCampo = estadoCampo;
       this.lotes = lotes;
    }
   
    public Integer getIdCampo() {
        return this.idCampo;
    }
    
    public void setIdCampo(Integer idCampo) {
        this.idCampo = idCampo;
    }
    public String getNombreCampo() {
        return this.nombreCampo;
    }
    
    public void setNombreCampo(String nombreCampo) {
        this.nombreCampo = nombreCampo;
    }
    public double getSuperficieCampo() {
        return this.superficieCampo;
    }
    
    public void setSuperficieCampo(double superficieCampo) {
        this.superficieCampo = superficieCampo;
    }
    public String getEstadoCampo() {
        return this.estadoCampo;
    }
    
    public void setEstadoCampo(String estadoCampo) {
        this.estadoCampo = estadoCampo;
    }
    public Set getLotes() {
        return this.lotes;
    }
    
    public void setLotes(Set lotes) {
        this.lotes = lotes;
    }
}


