package com.dio;

import java.util.Random;

import com.dio.interfaces.Telefone;
/**
 * Iphone
 */
public class Iphone implements Telefone {

    public boolean isBateryFull() {

        
        
        if(getBateryStatus()>=5 | getBateryStatus()<=100){
            return true;
        }else{

            return false;
        }
        
    }

  
    public int getBateryStatus() {

        Random random = new Random();
 
        return random.ints(0,100).findFirst().getAsInt();
        
    }

    
    public void turnOn() {

        
    }

    
    public void turnOff() {
        
    }
}