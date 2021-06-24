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
@Table(name = "GUEST")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Guest.findAll", query = "SELECT g FROM Guest g")
    , @NamedQuery(name = "Guest.findByGuestid", query = "SELECT g FROM Guest g WHERE g.guestid = :guestid")
    , @NamedQuery(name = "Guest.findByGuestname", query = "SELECT g FROM Guest g WHERE g.guestname = :guestname")})
public class Guest implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "GUESTID")
    private Integer guestid;
    @Column(name = "GUESTNAME")
    private String guestname;

    public Guest() {
    }

    public Guest(Integer guestid) {
        this.guestid = guestid;
    }

    public Integer getGuestid() {
        return guestid;
    }

    public void setGuestid(Integer guestid) {
        this.guestid = guestid;
    }

    public String getGuestname() {
        return guestname;
    }

    public void setGuestname(String guestname) {
        this.guestname = guestname;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (guestid != null ? guestid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Guest)) {
            return false;
        }
        Guest other = (Guest) object;
        if ((this.guestid == null && other.guestid != null) || (this.guestid != null && !this.guestid.equals(other.guestid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Guest[ guestid=" + guestid + " ]";
    }
    
}
