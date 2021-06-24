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
@Table(name = "DEPARTURETIME")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Departuretime.findAll", query = "SELECT d FROM Departuretime d")
    , @NamedQuery(name = "Departuretime.findByDepartureid", query = "SELECT d FROM Departuretime d WHERE d.departureid = :departureid")
    , @NamedQuery(name = "Departuretime.findByDeparturelocation", query = "SELECT d FROM Departuretime d WHERE d.departurelocation = :departurelocation")})
public class Departuretime implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DEPARTUREID")
    private Integer departureid;
    @Basic(optional = false)
    @Column(name = "DEPARTURELOCATION")
    private String departurelocation;

    public Departuretime() {
    }

    public Departuretime(Integer departureid) {
        this.departureid = departureid;
    }

    public Departuretime(Integer departureid, String departurelocation) {
        this.departureid = departureid;
        this.departurelocation = departurelocation;
    }

    public Integer getDepartureid() {
        return departureid;
    }

    public void setDepartureid(Integer departureid) {
        this.departureid = departureid;
    }

    public String getDeparturelocation() {
        return departurelocation;
    }

    public void setDeparturelocation(String departurelocation) {
        this.departurelocation = departurelocation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (departureid != null ? departureid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Departuretime)) {
            return false;
        }
        Departuretime other = (Departuretime) object;
        if ((this.departureid == null && other.departureid != null) || (this.departureid != null && !this.departureid.equals(other.departureid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Departuretime[ departureid=" + departureid + " ]";
    }
    
}
