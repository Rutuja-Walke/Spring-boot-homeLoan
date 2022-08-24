package com.project.HomeLoan.LoginDomain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users {

    @Id
    private int sequence_id;
    private long acc_no;
    private String email;
    private String fname;
    private String mname;
    private String lname;
    private String passwrd;
    private int currBal;


    public Users( int sequence_id
        ,long acc_no
        ,String email
        ,String fname
        ,String mname
        ,String lname
        ,String passwrd
        ,int currBal) {

        this.sequence_id = sequence_id;
        this.acc_no = acc_no;
        this.email = email;
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.passwrd = passwrd;
        this.currBal = currBal;
    }

    public Users() {

    }


    public int getSequence_id() {
        return sequence_id;
    }

    public void setSequence_id(int sequence_id) {
        this.sequence_id = sequence_id;
    }

    public long getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPasswrd() {
        return passwrd;
    }

    public void setPasswrd(String passwrd) {
        this.passwrd = passwrd;
    }

    public int getCurrBal() {
        return currBal;
    }

    public void setCurrBal(int currBal) {
        this.currBal = currBal;
    }




}
