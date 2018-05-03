/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package habitat;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jpizarro377
 */
@Entity
@Table(name = "info")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Info.findAll", query = "SELECT i FROM Info i"),
    @NamedQuery(name = "Info.findByIdInfo", query = "SELECT i FROM Info i WHERE i.idInfo = :idInfo"),
    @NamedQuery(name = "Info.findByFirstName", query = "SELECT i FROM Info i WHERE i.firstName = :firstName"),
    @NamedQuery(name = "Info.findByLastName", query = "SELECT i FROM Info i WHERE i.lastName = :lastName"),
    @NamedQuery(name = "Info.findByEmail", query = "SELECT i FROM Info i WHERE i.email = :email"),
    @NamedQuery(name = "Info.findByNoEmail", query = "SELECT i FROM Info i WHERE i.noEmail = :noEmail"),
    @NamedQuery(name = "Info.findByPhoneNum", query = "SELECT i FROM Info i WHERE i.phoneNum = :phoneNum"),
    @NamedQuery(name = "Info.findByNoPhoneNum", query = "SELECT i FROM Info i WHERE i.noPhoneNum = :noPhoneNum"),
    @NamedQuery(name = "Info.findByStreet", query = "SELECT i FROM Info i WHERE i.street = :street"),
    @NamedQuery(name = "Info.findByCity", query = "SELECT i FROM Info i WHERE i.city = :city"),
    @NamedQuery(name = "Info.findByState", query = "SELECT i FROM Info i WHERE i.state = :state"),
    @NamedQuery(name = "Info.findByZip", query = "SELECT i FROM Info i WHERE i.zip = :zip"),
    @NamedQuery(name = "Info.findByNoAddress", query = "SELECT i FROM Info i WHERE i.noAddress = :noAddress"),
    @NamedQuery(name = "Info.findByEmailContact", query = "SELECT i FROM Info i WHERE i.emailContact = :emailContact"),
    @NamedQuery(name = "Info.findByTextContact", query = "SELECT i FROM Info i WHERE i.textContact = :textContact"),
    @NamedQuery(name = "Info.findByVolunteer", query = "SELECT i FROM Info i WHERE i.volunteer = :volunteer"),
    @NamedQuery(name = "Info.findByComment", query = "SELECT i FROM Info i WHERE i.comment = :comment"),
    @NamedQuery(name = "Info.findByNoComment", query = "SELECT i FROM Info i WHERE i.noComment = :noComment"),
    @NamedQuery(name = "Info.findByQuote", query = "SELECT i FROM Info i WHERE i.quote = :quote"),
    @NamedQuery(name = "Info.findByCreateDate", query = "SELECT i FROM Info i WHERE i.createDate = :createDate")})
public class Info implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idInfo")
    private Integer idInfo;
    @Column(name = "FirstName")
    private String firstName;
    @Column(name = "LastName")
    private String lastName;
    @Column(name = "Email")
    private String email;
    @Column(name = "NoEmail")
    private Boolean noEmail;
    @Column(name = "PhoneNum")
    private String phoneNum;
    @Column(name = "NoPhoneNum")
    private Boolean noPhoneNum;
    @Column(name = "Street")
    private String street;
    @Column(name = "City")
    private String city;
    @Column(name = "State")
    private String state;
    @Column(name = "Zip")
    private Integer zip;
    @Column(name = "NoAddress")
    private Boolean noAddress;
    @Column(name = "EmailContact")
    private Boolean emailContact;
    @Column(name = "TextContact")
    private Boolean textContact;
    @Column(name = "Volunteer")
    private Boolean volunteer;
    @Column(name = "Comment")
    private String comment;
    @Column(name = "NoComment")
    private Boolean noComment;
    @Column(name = "Quote")
    private Boolean quote;
    @Column(name = "CreateDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;

    public Info() {
    }

    public Info(Integer idInfo) {
        this.idInfo = idInfo;
    }

    public Integer getIdInfo() {
        return idInfo;
    }

    public void setIdInfo(Integer idInfo) {
        this.idInfo = idInfo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getNoEmail() {
        return noEmail;
    }

    public void setNoEmail(Boolean noEmail) {
        this.noEmail = noEmail;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Boolean getNoPhoneNum() {
        return noPhoneNum;
    }

    public void setNoPhoneNum(Boolean noPhoneNum) {
        this.noPhoneNum = noPhoneNum;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public Boolean getNoAddress() {
        return noAddress;
    }

    public void setNoAddress(Boolean noAddress) {
        this.noAddress = noAddress;
    }

    public Boolean getEmailContact() {
        return emailContact;
    }

    public void setEmailContact(Boolean emailContact) {
        this.emailContact = emailContact;
    }

    public Boolean getTextContact() {
        return textContact;
    }

    public void setTextContact(Boolean textContact) {
        this.textContact = textContact;
    }

    public Boolean getVolunteer() {
        return volunteer;
    }

    public void setVolunteer(Boolean volunteer) {
        this.volunteer = volunteer;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Boolean getNoComment() {
        return noComment;
    }

    public void setNoComment(Boolean noComment) {
        this.noComment = noComment;
    }

    public Boolean getQuote() {
        return quote;
    }

    public void setQuote(Boolean quote) {
        this.quote = quote;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInfo != null ? idInfo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Info)) {
            return false;
        }
        Info other = (Info) object;
        if ((this.idInfo == null && other.idInfo != null) || (this.idInfo != null && !this.idInfo.equals(other.idInfo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "habitat.Info[ idInfo=" + idInfo + " ]";
    }
    
}
