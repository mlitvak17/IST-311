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
@Table(name = "USERS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u")
    , @NamedQuery(name = "Users.findByUserid", query = "SELECT u FROM Users u WHERE u.userid = :userid")
    , @NamedQuery(name = "Users.findByTripstaken", query = "SELECT u FROM Users u WHERE u.tripstaken = :tripstaken")
    , @NamedQuery(name = "Users.findByIsaccountactive", query = "SELECT u FROM Users u WHERE u.isaccountactive = :isaccountactive")
    , @NamedQuery(name = "Users.findByUsername", query = "SELECT u FROM Users u WHERE u.username = :username")})
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USERID")
    private Integer userid;
    @Column(name = "TRIPSTAKEN")
    private Integer tripstaken;
    @Basic(optional = false)
    @Column(name = "ISACCOUNTACTIVE")
    private Boolean isaccountactive;
    @Basic(optional = false)
    @Column(name = "USERNAME")
    private String username;

    public Users() {
    }

    public Users(Integer userid) {
        this.userid = userid;
    }

    public Users(Integer userid, Boolean isaccountactive, String username) {
        this.userid = userid;
        this.isaccountactive = isaccountactive;
        this.username = username;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getTripstaken() {
        return tripstaken;
    }

    public void setTripstaken(Integer tripstaken) {
        this.tripstaken = tripstaken;
    }

    public Boolean getIsaccountactive() {
        return isaccountactive;
    }

    public void setIsaccountactive(Boolean isaccountactive) {
        this.isaccountactive = isaccountactive;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userid != null ? userid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.userid == null && other.userid != null) || (this.userid != null && !this.userid.equals(other.userid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Users[ userid=" + userid + " ]";
    }
    
}
