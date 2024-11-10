package com.example.internet;

public class Contracts {

    public Contracts(String surname, String name,
                     String address, String speed, String traffic,
                     String duration) {

        this.surname = surname;
        this.name = name;
        this.address = address;
        this.speed = speed;
        this.traffic = traffic;
        this.duration = duration;
    }


    private String name;
    private String surname;
    private String address;
    private String speed;
    private String traffic;
    private String duration;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getTraffic() {
        return traffic;
    }

    public void setTraffic(String traffic) {
        this.traffic = traffic;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String  duration) {
        this.duration = duration;
    }
}

