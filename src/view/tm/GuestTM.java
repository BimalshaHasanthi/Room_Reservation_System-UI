package view.tm;

import javafx.scene.control.Button;

public class GuestTM {
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
    private Button btn;

    public GuestTM() {
    }

    public GuestTM(String FName, String LName, String nic, String address, String country, String gender, String tp, String mail, String checkIn, String checkOut,String adults, String child, String room, String bed, String meal, Button btn) {
        this.setfName(FName);
        this.setlName(LName);
        this.setNic(nic);
        this.setAddress(address);
        this.setCountry(country);
        this.setGender(gender);
        this.setTp(tp);
        this.setMail(mail);
        this.setCheckIn(checkIn);
        this.setCheckOut(checkOut);
        this.setChild(child);
        this.setAdults(adults);
        this.setRoom(room);
        this.setBed(bed);
        this.setMeal(meal);
        this.setBtn(btn);
    }


    public String getFName() {
        return fName;
    }

    public void setfName(String FName) {
        this.fName = FName;
    }

    public String getLName() {
        return lName;
    }

    public void setlName(String LName) {
        this.lName = LName;
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

    public String getChild() {
        return child;
    }

    public void setChild(String child) {
        this.child = child;
    }

    public String getAdults() {
        return adults;
    }

    public void setAdults(String adults) {
        this.adults = adults;
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

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }
}
