/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anslab1_201340385;

import java.util.ArrayList;

/**
 *
 * @author ty
 */
public class FreqTable {
    String input;
    ArrayList<String> a, c, t, g;
    
    FreqTable(String input){
        this.input = input;
        a = new ArrayList<>();
        c = new ArrayList<>();
        t = new ArrayList<>();
        g = new ArrayList<>();
        
        //Remove all \n
        input = input.replace("\n", "");
    }
    
    void count(){
        for(int i=0; i<this.input.length(); i++){
            String ch = String.valueOf(this.input.charAt(i));
            switch(ch){
                case "a":
                    a.add(ch);
                    break;
                case "c":
                    c.add(ch);
                    break;
                case "t":
                    t.add(ch);
                    break;
                case "g":
                    g.add(ch);
                    break;
            }
        }
        
    }
    
//    void printElements(ArrayList<String> letter){
//        for(int i=0; i<letter.size();i++){
//            System.out.println(letter.get(i));
//        }
//    }
    
    float getPercentage(ArrayList<String> letter){      
        float percent = 100 * (Float.valueOf(letter.size()) / this.input.length());        
        return percent;
    }
    
    
}
