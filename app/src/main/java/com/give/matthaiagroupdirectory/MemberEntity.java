package com.give.matthaiagroupdirectory;

public class MemberEntity {

    public String name;
    public String phone;
    public String details;

    public MemberEntity() {
    }

    public MemberEntity(String name, String phone, String details) {
        this.name = name;
        this.phone = phone;
        this.details = details;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
