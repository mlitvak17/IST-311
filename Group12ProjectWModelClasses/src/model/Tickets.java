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
@Table(name = "TICKETS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tickets.findAll", query = "SELECT t FROM Tickets t")
    , @NamedQuery(name = "Tickets.findByTicketid", query = "SELECT t FROM Tickets t WHERE t.ticketid = :ticketid")
    , @NamedQuery(name = "Tickets.findByPrice", query = "SELECT t FROM Tickets t WHERE t.price = :price")
    , @NamedQuery(name = "Tickets.findByReferencecode", query = "SELECT t FROM Tickets t WHERE t.referencecode = :referencecode")})
public class Tickets implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TICKETID")
    private Integer ticketid;
    @Basic(optional = false)
    @Column(name = "PRICE")
    private double price;
    @Column(name = "REFERENCECODE")
    private Integer referencecode;

    public Tickets() {
    }

    public Tickets(Integer ticketid) {
        this.ticketid = ticketid;
    }

    public Tickets(Integer ticketid, double price) {
        this.ticketid = ticketid;
        this.price = price;
    }

    public Integer getTicketid() {
        return ticketid;
    }

    public void setTicketid(Integer ticketid) {
        this.ticketid = ticketid;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getReferencecode() {
        return referencecode;
    }

    public void setReferencecode(Integer referencecode) {
        this.referencecode = referencecode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ticketid != null ? ticketid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tickets)) {
            return false;
        }
        Tickets other = (Tickets) object;
        if ((this.ticketid == null && other.ticketid != null) || (this.ticketid != null && !this.ticketid.equals(other.ticketid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Tickets[ ticketid=" + ticketid + " ]";
    }
    
}
