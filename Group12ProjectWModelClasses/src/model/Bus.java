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
@Table(name = "BUS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bus.findAll", query = "SELECT b FROM Bus b")
    , @NamedQuery(name = "Bus.findByBusid", query = "SELECT b FROM Bus b WHERE b.busid = :busid")
    , @NamedQuery(name = "Bus.findByTransportname", query = "SELECT b FROM Bus b WHERE b.transportname = :transportname")
    , @NamedQuery(name = "Bus.findBySeatcapacity", query = "SELECT b FROM Bus b WHERE b.seatcapacity = :seatcapacity")
    , @NamedQuery(name = "Bus.findBySeatstaken", query = "SELECT b FROM Bus b WHERE b.seatstaken = :seatstaken")})
public class Bus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BUSID")
    private Integer busid;
    @Basic(optional = false)
    @Column(name = "TRANSPORTNAME")
    private String transportname;
    @Column(name = "SEATCAPACITY")
    private Integer seatcapacity;
    @Column(name = "SEATSTAKEN")
    private Integer seatstaken;

    public Bus() {
    }

    public Bus(Integer busid) {
        this.busid = busid;
    }

    public Bus(Integer busid, String transportname) {
        this.busid = busid;
        this.transportname = transportname;
    }

    public Integer getBusid() {
        return busid;
    }

    public void setBusid(Integer busid) {
        this.busid = busid;
    }

    public String getTransportname() {
        return transportname;
    }

    public void setTransportname(String transportname) {
        this.transportname = transportname;
    }

    public Integer getSeatcapacity() {
        return seatcapacity;
    }

    public void setSeatcapacity(Integer seatcapacity) {
        this.seatcapacity = seatcapacity;
    }

    public Integer getSeatstaken() {
        return seatstaken;
    }

    public void setSeatstaken(Integer seatstaken) {
        this.seatstaken = seatstaken;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (busid != null ? busid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bus)) {
            return false;
        }
        Bus other = (Bus) object;
        if ((this.busid == null && other.busid != null) || (this.busid != null && !this.busid.equals(other.busid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Bus[ busid=" + busid + " ]";
    }
    
}
