package taller.BD.Server;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Comunicados {
    @Id
    @GeneratedValue
    private Integer id_Comunicado;
    //@Column(name = "nro",length = 10)
    private String descripcion;
    private Date fechaInicio ;
    private Integer vigencia;
   // private Integer estado;

    public Integer getId_Comunicado() {
        return id_Comunicado;
    }
    public void setId_Comunicado(Integer id_Comunicado) {
        this.id_Comunicado = id_Comunicado;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Date getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public Integer getVigencia() {
        return vigencia;
    }
    public void setVigencia(Integer vigencia) {
        this.vigencia = vigencia;
    }
 /*   
    public Integer getEstado() {
        return estado;
    }
    public void setEstado(Integer estado) {
        this.estado = estado;
    }
*/
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
        result = prime * result + ((fechaInicio == null) ? 0 : fechaInicio.hashCode());
        result = prime * result + ((id_Comunicado == null) ? 0 : id_Comunicado.hashCode());
        result = prime * result + ((vigencia == null) ? 0 : vigencia.hashCode());
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
        Comunicados other = (Comunicados) obj;
        if (descripcion == null) {
            if (other.descripcion != null)
                return false;
        } else if (!descripcion.equals(other.descripcion))
            return false;
        if (fechaInicio == null) {
            if (other.fechaInicio != null)
                return false;
        } else if (!fechaInicio.equals(other.fechaInicio))
            return false;
        if (id_Comunicado == null) {
            if (other.id_Comunicado != null)
                return false;
        } else if (!id_Comunicado.equals(other.id_Comunicado))
            return false;
        if (vigencia == null) {
            if (other.vigencia != null)
                return false;
        } else if (!vigencia.equals(other.vigencia))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Comunicados [descripcion=" + descripcion + ", fechaInicio=" + fechaInicio + ", id_Comunicado="
                + id_Comunicado + ", vigencia=" + vigencia + "]";
    }
  
}
