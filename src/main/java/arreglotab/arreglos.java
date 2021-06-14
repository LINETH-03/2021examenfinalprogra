/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglotab;
import java.util.ArrayList;
import clase.tab;

/**
 *
 * @author herna
 */
public class arreglos {
    public static ArrayList<tab>arreglogua;
    public static ArrayList<tab>arreglojal;
    public static ArrayList<tab>arreglopro;

    public arreglos() {
        arreglogua = new ArrayList<tab>();
        arreglojal = new ArrayList<tab>();
        arreglopro= new ArrayList<tab>();
    }
    public void adicionar (tab a){
        arreglogua.add(a);

    }
    public void addjal (tab b){
        arreglojal.add(b);
    }
     public void addpro (tab c){
       
        arreglopro.add(c);
    }
    
    public tab obtener(int posisiciongua){
        return arreglogua.get(posisiciongua);
    }
    public tab obtenerjal(int posisicionjal){
        return arreglojal.get(posisicionjal);
    }
    public tab obtenerpro(int posisicionpro){
        return arreglopro.get(posisicionpro);
    }
    public int tamaño(){
        return arreglogua.size();
    }
    public int tamañojal(){
        return arreglojal.size();
    }
    public int tamañopro(){
        return arreglopro.size();
    }
}
