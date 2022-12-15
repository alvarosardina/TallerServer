package taller.BD.Server;

//import java.util.Date;
import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Socios")
public class Persona {
    @Id
    @GeneratedValue
    private Integer idSocio;
    @Column( length = 10)
    private String cedula;
    @Column(length = 15)
    private String nombres;
    @Column(length = 20)
    private String apellidos;
    private String celular;
    private String correo;
    private Boolean activo;
    private byte[] foto;
    private Date fechanacimiento;// Date .util yo y .sql
    private Date fecharegistro;// Date .util yo y .sql
    private String direccion;
    @OneToOne(cascade = CascadeType.REMOVE,optional = true)
    private Usuario usr;

    @OneToMany(mappedBy = "soc")
    private Set<Medidor> medidor;


    @OneToMany(mappedBy = "soc")
    Set<Solicitudes> solicitudes;

    public Usuario getUsr() {
        return usr;
    }
    public void setUsr(Usuario usr) {
        this.usr = usr;
    }

    public Integer getIdSocio() {
        return idSocio;
    }
    public void setIdSocio(Integer idSocio) {
        this.idSocio = idSocio;
    }
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String ced) {
        cedula = ced;
    }

    public Persona() {
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public Boolean getActivo() {
        return activo;
    }
    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public Date getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(Date fecharegistro) {
        this.fecharegistro = fecharegistro;
    }
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] fot) {
        foto = fot;
    }
 
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idSocio == null) ? 0 : idSocio.hashCode());
        result = prime * result + ((cedula == null) ? 0 : cedula.hashCode());
        result = prime * result + ((nombres == null) ? 0 : nombres.hashCode());
        result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
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
        Persona other = (Persona) obj;
        if (idSocio == null) {
            if (other.idSocio != null)
                return false;
        } else if (!idSocio.equals(other.idSocio))
            return false;
        if (cedula == null) {
            if (other.cedula != null)
                return false;
        } else if (!cedula.equals(other.cedula))
            return false;
        if (nombres == null) {
            if (other.nombres != null)
                return false;
        } else if (!nombres.equals(other.nombres))
            return false;
        if (apellidos == null) {
            if (other.apellidos != null)
                return false;
        } else if (!apellidos.equals(other.apellidos))
            return false;
        return true;
    }
    
    @Override
    public String toString() {
        return "Persona [nombres=" + nombres + ", apellidos=" + apellidos + "]";
    }
    
    public Set<Medidor> getMedidor() {
        return medidor;
    }
    public void setMedidor(Set<Medidor> medidor) {
        this.medidor = medidor;
    }

    public Set<Solicitudes> getSolicitudes() {
        return solicitudes;
    }
    public void setSolicitudes(Set<Solicitudes> solicitudes) {
        this.solicitudes = solicitudes;
    }
    
}
