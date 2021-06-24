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
@Table(name = "ROUTE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Route.findAll", query = "SELECT r FROM Route r")
    , @NamedQuery(name = "Route.findByRouteid", query = "SELECT r FROM Route r WHERE r.routeid = :routeid")
    , @NamedQuery(name = "Route.findByRoutename", query = "SELECT r FROM Route r WHERE r.routename = :routename")})
public class Route implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ROUTEID")
    private Integer routeid;
    @Basic(optional = false)
    @Column(name = "ROUTENAME")
    private String routename;

    public Route() {
    }

    public Route(Integer routeid) {
        this.routeid = routeid;
    }

    public Route(Integer routeid, String routename) {
        this.routeid = routeid;
        this.routename = routename;
    }

    public Integer getRouteid() {
        return routeid;
    }

    public void setRouteid(Integer routeid) {
        this.routeid = routeid;
    }

    public String getRoutename() {
        return routename;
    }

    public void setRoutename(String routename) {
        this.routename = routename;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (routeid != null ? routeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Route)) {
            return false;
        }
        Route other = (Route) object;
        if ((this.routeid == null && other.routeid != null) || (this.routeid != null && !this.routeid.equals(other.routeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Route[ routeid=" + routeid + " ]";
    }
    
}
