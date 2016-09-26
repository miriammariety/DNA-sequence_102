/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anslab1_201340385;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 *
 * @author ty
 */
public class Translate {
    ArrayList <String> dnaSeq = new ArrayList<>();
    Map<String, String> map = new HashMap<>();
    
    
    Translate(String input){
        StringTokenizer tokenizer = new StringTokenizer(input, "\n");
        while (tokenizer.hasMoreTokens()){
            dnaSeq.add(tokenizer.nextToken());
        }
    }
    
    public ArrayList translater(ArrayList<String> sequence){
        ArrayList <String> proteinSeq = new ArrayList<>();
        
        for (int i = 0; i < sequence.size(); i++){
            String currentSeq = sequence.get(i);
            
        }
        
        return proteinSeq;
    }
    
    public void initialize(){
        map.put(key, value);
    }
    
}
