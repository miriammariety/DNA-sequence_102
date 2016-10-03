/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anslab1_201340385;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 *
 * @author ty
 */
public class Translate {
    
    File file;

    ArrayList<String> dnaSeq;
    Map<String, String> map;
    ArrayList<String> proteinSeq;

    Translate(String input) {
        map = new HashMap<>();
        proteinSeq = new ArrayList<>();
        dnaSeq = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(input, "\n");
        while (tokenizer.hasMoreTokens()) {
            dnaSeq.add(tokenizer.nextToken());
        }
    }
    
    
    Translate(File file){
        this.file = file;
        map = new HashMap<>();
        proteinSeq = new ArrayList<>();
    }
    
    public File getFile() { return this.file; }

    public void translater(ArrayList<String> sequence) {
        
        initialize();
        //Iterate though the sequence list
        for (int i = 0; i < sequence.size(); i++) {
            String currentSeq = sequence.get(i);
            String newSeq = "";
            int tempSize = currentSeq.length();
            if (tempSize % 3 != 0) {
                newSeq += "Invalid length of sequence. Must be divisible by 3";
            } else {
                //Iterate through the individual sequence from the list
                for (int j = 0; j < tempSize; j += 3) {
                    //Get every three chars and assign as key
                    String key = (String.valueOf(currentSeq.charAt(j))
                            + String.valueOf(currentSeq.charAt(j + 1))
                            + String.valueOf(currentSeq.charAt(j + 2))).toLowerCase();
                    newSeq += map.get(key);
                }
            }

            //Add to new array
            proteinSeq.add(newSeq);
        }

    }

    public void initialize() {
        map.put("ttt", "F");
        map.put("ttc", "F");
        map.put("tta", "L");
        map.put("ttg", "L");
        map.put("ctt", "L");
        map.put("ctc", "L");
        map.put("cta", "L");
        map.put("ctg", "L");
        map.put("att", "I");
        map.put("atc", "I");
        map.put("ata", "I");
        map.put("atg", "M");
        map.put("gtt", "V");
        map.put("gtc", "V");
        map.put("gta", "V");
        map.put("gtg", "V");
        map.put("tct", "S");
        map.put("tcc", "S");
        map.put("tca", "S");
        map.put("tcg", "S");
        map.put("cct", "P");
        map.put("ccc", "P");
        map.put("cca", "P");
        map.put("ccg", "P");
        map.put("act", "T");
        map.put("acc", "T");
        map.put("aca", "T");
        map.put("acg", "T");
        map.put("gct", "A");
        map.put("gcc", "A");
        map.put("gca", "A");
        map.put("gcg", "A");
        map.put("tat", "Y");
        map.put("tac", "Y");
        map.put("taa", "Stop (Ochre)");
        map.put("tag", "Stop (Amber)");
        map.put("cat", "H");
        map.put("cac", "H");
        map.put("caa", "Q");
        map.put("cag", "Q");
        map.put("aat", "N");
        map.put("aac", "N");
        map.put("aaa", "K");
        map.put("aag", "K");
        map.put("gat", "D");
        map.put("gac", "D");
        map.put("gaa", "E");
        map.put("gag", "E");
        map.put("tgt", "C");
        map.put("tgc", "C");
        map.put("tga", "Stop (Opal)");
        map.put("tgg", "W");
        map.put("cgt", "R");
        map.put("cgc", "R");
        map.put("cga", "R");
        map.put("cgg", "R");
        map.put("agt", "S");
        map.put("agc", "S");
        map.put("aga", "R");
        map.put("agg", "R");
        map.put("ggt", "G");
        map.put("ggc", "G");
        map.put("gga", "G");
        map.put("ggg", "G");

    }

}
