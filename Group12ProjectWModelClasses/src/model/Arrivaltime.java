/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Nicol Farias
 */
@Entity
@Table(name = "ARRIVALTIME")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Arrivaltime.findAll", query = "SELECT a FROM Arrivaltime a")
    , @NamedQuery(name = "Arrivaltime.findByArrivalid", query = "SELECT a FROM Arrivaltime a WHERE a.arrivalid = :arrivalid")
    , @NamedQuery(name = "Arrivaltime.findByArrivallocation", query = "SELECT a FROM Arrivaltime a WHERE a.arrivallocation = :arrivallocation")})
public class Arrivaltime implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ARRIVALID")
    private Integer arrivalid;
    @Basic(optional = false)
    @Column(name = "ARRIVALLOCATION")
    private Boolean arrivallocation;

    public Arrivaltime() {
    }

    public Arrivaltime(Integer arrivalid) {
        this.arrivalid = arrivalid;
    }

    public Arrivaltime(Integer arrivalid, Boolean arrivallocation) {
        this.arrivalid = arrivalid;
        this.arrivallocation = arrivallocation;
    }

    public Integer getArrivalid() {
        return arrivalid;
    }

    public void setArrivalid(Integer arrivalid) {
        this.arrivalid = arrivalid;
    }

    public Boolean getArrivallocation() {
        return arrivallocation;
    }

    public void setArrivallocation(Boolean arrivallocation) {
        this.arrivallocation = arrivallocation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (arrivalid != null ? arrivalid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arrivaltime)) {
            return false;
        }
        Arrivaltime other = (Arrivaltime) object;
        if ((this.arrivalid == null && other.arrivalid != null) || (this.arrivalid != null && !this.arrivalid.equals(other.arrivalid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Arrivaltime[ arrivalid=" + arrivalid + " ]";
    }
    
}
