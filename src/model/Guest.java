package model;

public class Guest {
    private String fName;
    private String lName;
    private String nic;
    private String address;
    private String country;
    private String gender;
    private String tp;
    private String mail;
    private String checkIn;
    private String checkOut;
    private String adults;
    private String child;
    private String room;
    private String bed;
    private String meal;

    public Guest() {
    }

    public Guest(String fName, String lName, String nic, String address, String country, String gender, String tp, String mail, String checkIn, String checkOut, String adults, String child, String room, String bed, String meal) {
        this.fName = fName;
        this.lName = lName;
        this.nic = nic;
        this.address = address;
        this.country = country;
        this.gender = gender;
        this.tp = tp;
        this.mail = mail;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.adults = adults;
        this.child = child;
        this.room = room;
        this.bed = bed;
        this.meal = meal;
    }

    public String getFName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public String getAdults() {
        return adults;
    }

    public void setAdults(String adults) {
        this.adults = adults;
    }

    public String getChild() {
        return child;
    }

    public void setChild(String child) {
        this.child = child;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }
}
