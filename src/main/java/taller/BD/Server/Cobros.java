package taller.BD.Server;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class Cobros {
    @Id
    @GeneratedValue
    private Integer id_Cobros;
    //@Column(name = "nro",length = 10)
    private Calendar fechahora;
    private Double monto;
    private String ref ;
    private Integer tipo;

    @ManyToOne
    private Persona soc;
    @ManyToOne
    private Multas mult;
    @OneToOne(optional = true)
    private Facturas fact;
    
    public Integer getId_Cobros() {
        return id_Cobros;
    }
    public void setId_Cobros(Integer id_Cobros) {
        this.id_Cobros = id_Cobros;
    }
    public Calendar getFechahora() {
        return fechahora;
    }
    public void setFechahora(Calendar fechahora) {
        this.fechahora = fechahora;
    }
    public Double getMonto() {
        return monto;
    }
    public void setMonto(Double monto) {
        this.monto = monto;
    }
    public String getRef() {
        return ref;
    }
    public void setRef(String ref) {
        this.ref = ref;
    }
    public Integer getTipo() {
        return tipo;
    }
    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Cobros(){
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id_Cobros == null) ? 0 : id_Cobros.hashCode());
        result = prime * result + ((fechahora == null) ? 0 : fechahora.hashCode());
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
        Cobros other = (Cobros) obj;
        if (id_Cobros == null) {
            if (other.id_Cobros != null)
                return false;
        } else if (!id_Cobros.equals(other.id_Cobros))
            return false;
        if (fechahora == null) {
            if (other.fechahora != null)
                return false;
        } else if (!fechahora.equals(other.fechahora))
            return false;
        return true;
    }
    public Persona getSoc() {
        return soc;
    }
    public void setSoc(Persona soc) {
        this.soc = soc;
    }
    public Multas getMult() {
        return mult;
    }
    public void setMult(Multas mult) {
        this.mult = mult;
    }
    public Facturas getFact() {
        return fact;
    }
    public void setFact(Facturas fact) {
        this.fact = fact;
    }
    
    @Override
    public String toString() {
        return "Cobros [id_Cobros=" + id_Cobros + ", fechahora=" + fechahora + ", monto=" + monto + ", ref=" + ref
                + ", tipo=" + tipo + ", soc=" + soc + ", mult=" + mult + ", fact=" + fact + "]";
    }
   
    
}
