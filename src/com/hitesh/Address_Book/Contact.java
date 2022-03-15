package com.hitesh.Address_Book;

public class Contact {
    private String firstname;
    private String lastname;
    private String address;
    private String city;
    private String state;
    private String zipno;
    private String mobileno;
    private String emailid;

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipno(String zipno) {
        this.zipno = zipno;
    }
    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }


    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getMobileno() {
        return mobileno;
    }

    public String getEmailid() {
        return emailid;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipno='" + zipno + '\'' +
                ", mobileno='" + mobileno + '\'' +
                ", emailid='" + emailid + '\'' +
                '}';
    }

    public String getZipno() {
        return zipno;
    }
}
