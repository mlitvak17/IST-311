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
@Table(name = "TRIP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trip.findAll", query = "SELECT t FROM Trip t")
    , @NamedQuery(name = "Trip.findByTripid", query = "SELECT t FROM Trip t WHERE t.tripid = :tripid")
    , @NamedQuery(name = "Trip.findByTripname", query = "SELECT t FROM Trip t WHERE t.tripname = :tripname")})
public class Trip implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TRIPID")
    private Integer tripid;
    @Basic(optional = false)
    @Column(name = "TRIPNAME")
    private String tripname;

    public Trip() {
    }

    public Trip(Integer tripid) {
        this.tripid = tripid;
    }

    public Trip(Integer tripid, String tripname) {
        this.tripid = tripid;
        this.tripname = tripname;
    }

    public Integer getTripid() {
        return tripid;
    }

    public void setTripid(Integer tripid) {
        this.tripid = tripid;
    }

    public String getTripname() {
        return tripname;
    }

    public void setTripname(String tripname) {
        this.tripname = tripname;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tripid != null ? tripid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trip)) {
            return false;
        }
        Trip other = (Trip) object;
        if ((this.tripid == null && other.tripid != null) || (this.tripid != null && !this.tripid.equals(other.tripid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Trip[ tripid=" + tripid + " ]";
    }
    
}
