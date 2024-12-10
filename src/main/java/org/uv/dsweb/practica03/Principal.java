package org.uv.dsweb.practica03;

/**
 *
 * @author 15-dy2xxLapDeLuis
 */

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;


@Named(value = "principal")
@SessionScoped
public class Principal implements Serializable {

    private int a;
    private int b;
    private int c;
    
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    public void suma(){
        c = a+b;
    }
    public Principal() {
    }
    
}
