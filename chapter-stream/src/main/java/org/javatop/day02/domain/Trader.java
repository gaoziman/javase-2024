package org.javatop.day02.domain;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-22 15:44
 * @description :
 */
public class Trader {

    /**
     * 姓名
     */
    private String name;
    /**
     * 居住城市
     */
    private String city;

    public Trader(String n, String c) {
        this.name = n;
        this.city = c;
    }

    public String getName() {
        return this.name;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String newCity) {
        this.city = newCity;
    }

    public String toString() {
        return "Trader:" + this.name + " in " + this.city;
    }
}
