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
@Table(name = "RAILWAY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Railway.findAll", query = "SELECT r FROM Railway r")
    , @NamedQuery(name = "Railway.findByRailwayid", query = "SELECT r FROM Railway r WHERE r.railwayid = :railwayid")
    , @NamedQuery(name = "Railway.findByTransportname", query = "SELECT r FROM Railway r WHERE r.transportname = :transportname")
    , @NamedQuery(name = "Railway.findBySeatcapacity", query = "SELECT r FROM Railway r WHERE r.seatcapacity = :seatcapacity")
    , @NamedQuery(name = "Railway.findBySeatstaken", query = "SELECT r FROM Railway r WHERE r.seatstaken = :seatstaken")})
public class Railway implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RAILWAYID")
    private Integer railwayid;
    @Basic(optional = false)
    @Column(name = "TRANSPORTNAME")
    private String transportname;
    @Basic(optional = false)
    @Column(name = "SEATCAPACITY")
    private int seatcapacity;
    @Basic(optional = false)
    @Column(name = "SEATSTAKEN")
    private int seatstaken;

    public Railway() {
    }

    public Railway(Integer railwayid) {
        this.railwayid = railwayid;
    }

    public Railway(Integer railwayid, String transportname, int seatcapacity, int seatstaken) {
        this.railwayid = railwayid;
        this.transportname = transportname;
        this.seatcapacity = seatcapacity;
        this.seatstaken = seatstaken;
    }

    public Integer getRailwayid() {
        return railwayid;
    }

    public void setRailwayid(Integer railwayid) {
        this.railwayid = railwayid;
    }

    public String getTransportname() {
        return transportname;
    }

    public void setTransportname(String transportname) {
        this.transportname = transportname;
    }

    public int getSeatcapacity() {
        return seatcapacity;
    }

    public void setSeatcapacity(int seatcapacity) {
        this.seatcapacity = seatcapacity;
    }

    public int getSeatstaken() {
        return seatstaken;
    }

    public void setSeatstaken(int seatstaken) {
        this.seatstaken = seatstaken;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (railwayid != null ? railwayid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Railway)) {
            return false;
        }
        Railway other = (Railway) object;
        if ((this.railwayid == null && other.railwayid != null) || (this.railwayid != null && !this.railwayid.equals(other.railwayid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Railway[ railwayid=" + railwayid + " ]";
    }
    
}
