/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package habitat;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author jpizarro377
 */
@Entity
@Table(name = "Info")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Info.findAll", query = "SELECT a FROM Addresses a"),
    @NamedQuery(name = "InfofindByFirstName", query = "SELECT a FROM Addresses a WHERE a.firstName = :firstName"),
    @NamedQuery(name = "Info.findByLastName", query = "SELECT a FROM Addresses a WHERE a.lastName = :lastName"),
    @NamedQuery(name = "Info.findByEmail", query = "SELECT a FROM Addresses a WHERE a.email = :email"),
    @NamedQuery(name = "Info.findByPhoneNumber", query = "SELECT a FROM Addresses a WHERE a.phoneNumber = :phoneNumber")})
public class habitat implements Serializable {

   private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "FirstName")
    private String firstName;
    @Basic(optional = false)
    @Column(name = "LastName")
    private String lastName;
    @Basic(optional = false)
    @Column(name = "Email")
    private String email;
    @Basic(optional = false)
    @Column(name = "NoEmail")
    private boolean noEmail;
    @Basic(optional = false)
    @Column(name = "PhoneNum")
    private String phoneNum;
    @Basic(optional = false)
    @Column(name = "NoPhoneNum")
    private boolean noPhoneNum;
    @Basic(optional = false)
    @Column(name = "Street")
    private String street;
    @Basic(optional = false)
    @Column(name = "City")
    private String city;
    @Basic(optional = false)
    @Column(name = "State")
    private String state;
    @Basic(optional = false)
    @Column(name = "Zip")
    private int zip;
    @Basic(optional = false)
    @Column(name = "NoAddress")
    private String noAddress;
    @Basic(optional = false)
    @Column(name = "EmailContact")
    private boolean emailContact;
    @Basic(optional = false)
    @Column(name = "TextContatc")
    private boolean textContact;
    @Basic(optional = false)
    @Column(name = "Volunteer")
    private boolean volunteer;
    @Basic(optional = false)
    @Column(name = "Comment")
    private String comment;
    @Basic(optional = false)
    @Column(name = "NoComment")
    private boolean noComment;
    @Basic(optional = false)
    @Column(name = "Quote")
    private boolean quote;
    @Basic(optional = false)
    @Column(name = "CreateDate")
    private Date createDate;
   
        public habitat() {
    }

    

    public habitat( String firstName, String lastName, String email, boolean noEmail, String phoneNum, boolean noPhoneNum, String street, String city, String state, Integer zip, String noAddress, boolean emailContact, boolean textContact, boolean volunteer, String comment, boolean noComment, boolean quote,Date createDate  ) {
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.noEmail = noEmail;
        this.phoneNum = phoneNum;
        this.noPhoneNum = noPhoneNum;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.noAddress = noAddress;
        this.emailContact = emailContact;
        this.textContact = textContact;
        this.volunteer = volunteer;
        this.comment = comment;
        this.noComment = noComment;
        this.quote = quote;
        this.createDate = createDate;
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

    public boolean getNoEmail() {
        return noEmail;
    }

    public void setNoEmail(boolean NoEmail) {
        this.noEmail = noEmail;
    }
    
     public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String PhoneNum) {
        this.phoneNum = phoneNum;
    }
    
    public boolean getNoPhoneNum() {
        return noPhoneNum;
    }

    public void setNoPhoneNum(boolean NoPhoneNum) {
        this.noPhoneNum = noPhoneNum;
    }
    
  public Boolean getEmailContact() {
        return emailContact;
    }

    public void setEmailContact(Boolean emailContact) {
        this.emailContact = emailContact;
    }

    public boolean getTextContact() {
        return textContact;
    }

    public void setTextContact(Boolean textContact) {
        this.textContact = textContact;
    }

    public boolean getVolunteer() {
        return volunteer;
    }

    public void setVolunteer(boolean volunteer) {
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
}