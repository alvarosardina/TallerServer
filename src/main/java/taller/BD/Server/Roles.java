package taller.BD.Server;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Roles {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false,unique = true)//Para que no haya valores nulos
    private String codigo;
    @Column(nullable = false)
    private String descripcion;
    @Column(nullable = false)
    private Boolean activo;

    @ManyToMany
    Set<Usuario> users;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Set<Usuario> getUsers() {
        return users;
    }

    public void setUsers(Set<Usuario> users) {
        this.users = users;
    }

    public Roles() {
        activo=true;
    }
/* 
    public Roles(Integer id) {
        this.id = id;
    }
*/
}
