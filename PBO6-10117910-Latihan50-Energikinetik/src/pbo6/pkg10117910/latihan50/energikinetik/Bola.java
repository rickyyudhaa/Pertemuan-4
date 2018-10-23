/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117910.latihan50.energikinetik;

/**
 *
 * @author User
 */
public class Bola {

    private double mass;
    private double speed;
    private double kineticE;
    private double force;

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getMass() {
        return mass;
    }

    public double getSpeed() {
        return speed;
    }

    public double kineticE() {
        return 0.5 * mass * (speed * speed);
    }

    public double force() {
        return mass * speed;
    }
}
