package taller.BD.Server;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Medidor {
    @Id
    @GeneratedValue
    private Integer id_Medidor;
    private String serial;
    private String marca;
    private Float reg_Inic;
    private Date fechaInstalacion;
 
    @ManyToOne
    private Persona soc;
    
    @OneToMany(mappedBy = "med")
    private Set<Consumos> lecturas;

    public Integer getId_Medidor() {
        return id_Medidor;
    }
    public void setId_Medidor(Integer id_Medidor) {
        this.id_Medidor = id_Medidor;
    }

    public String getSerial() {
        return serial;
    }
    public void setSerial(String serial) {
        this.serial = serial;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public Float getReg_Inic() {
        return reg_Inic;
    }
    public void setReg_Inic(Float reg_Inic) {
        this.reg_Inic = reg_Inic;
    }
    public Date getFechaInstalacion() {
        return fechaInstalacion;
    }
    public void setFechaInstalacion(Date fechaInstalacion) {
        this.fechaInstalacion = fechaInstalacion;
    }
    
    public Medidor() {
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((fechaInstalacion == null) ? 0 : fechaInstalacion.hashCode());
        result = prime * result + ((marca == null) ? 0 : marca.hashCode());
        result = prime * result + ((reg_Inic == null) ? 0 : reg_Inic.hashCode());
        result = prime * result + ((serial == null) ? 0 : serial.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Medidor other = (Medidor) obj;
        if (fechaInstalacion == null) {
            if (other.fechaInstalacion != null)
                return false;
        } else if (!fechaInstalacion.equals(other.fechaInstalacion))
            return false;
        if (marca == null) {
            if (other.marca != null)
                return false;
        } else if (!marca.equals(other.marca))
            return false;
        if (reg_Inic == null) {
            if (other.reg_Inic != null)
                return false;
        } else if (!reg_Inic.equals(other.reg_Inic))
            return false;
        if (serial == null) {
            if (other.serial != null)
                return false;
        } else if (!serial.equals(other.serial))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Medidor [fechaInstalacion=" + fechaInstalacion +", marca=" + marca
                + ", reg_Inic=" + reg_Inic + ", serial=" + serial + "]";
    }
    public Set<Consumos> getLecturas() {
        return lecturas;
    }
    public void setLecturas(Set<Consumos> lecturas) {
        this.lecturas = lecturas;
    }
    
    public Persona getSoc() {
        return soc;
    }
    public void setSoc(Persona soc) {
        this.soc = soc;
    }

    
   
}
