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
                    String key = String.valueOf(currentSeq.charAt(j))
                            + String.valueOf(currentSeq.charAt(j + 1))
                            + String.valueOf(currentSeq.charAt(j + 2));
                    newSeq += map.get(key);
                    newSeq += "|";
                }
            }

            //Add to new array
            proteinSeq.add(newSeq);
        }

//        //Check
//        for(int i = 0; i < proteinSeq.size(); i++){
//            System.out.println(proteinSeq.get(i));
//        }
    }

    public void initialize() {
        map.put("ttt", "Phenylanine");
        map.put("ttc", "Phenylanine");
        map.put("tta", "Leucine");
        map.put("ttg", "Leucine");
        map.put("ctt", "Leucine");
        map.put("ctc", "Leucine");
        map.put("cta", "Leucine");
        map.put("ctg", "Leucine");
        map.put("att", "Isoleucine");
        map.put("atc", "Isoleucine");
        map.put("ata", "Isoleucine");
        map.put("atg", "Methaionine");
        map.put("gtt", "Valine");
        map.put("gtc", "Valine");
        map.put("gta", "Valine");
        map.put("gtg", "Valine");
        map.put("tct", "Serine");
        map.put("tcc", "Serine");
        map.put("tca", "Serine");
        map.put("tcg", "Serine");
        map.put("cct", "Proline");
        map.put("ccc", "Proline");
        map.put("cca", "Proline");
        map.put("ccg", "Proline");
        map.put("act", "Threonine");
        map.put("acc", "Threonine");
        map.put("aca", "Threonine");
        map.put("acg", "Threonine");
        map.put("gct", "Alanine");
        map.put("gcc", "Alanine");
        map.put("gca", "Alanine");
        map.put("gcg", "Alanine");
        map.put("tat", "Tyrosine");
        map.put("tac", "Tyrosine");
        map.put("taa", "Stop (Ochre)");
        map.put("tag", "Stop (Amber)");
        map.put("cat", "Histidine");
        map.put("cac", "Histidine");
        map.put("caa", "Glutamine");
        map.put("cag", "Glutamine");
        map.put("aat", "Asparagine");
        map.put("aac", "Asparagine");
        map.put("aaa", "Lysine");
        map.put("aag", "Lysine");
        map.put("gat", "Aspartic Acid");
        map.put("gac", "Aspartic Acid");
        map.put("gaa", "Glutamic Acid");
        map.put("gag", "Glutamic Acid");
        map.put("tgt", "Cysteine");
        map.put("tgc", "Cysteine");
        map.put("tga", "Stop (Opal)");
        map.put("tgg", "Tryptophan");
        map.put("cgt", "Arginine");
        map.put("cgc", "Arginine");
        map.put("cga", "Arginine");
        map.put("cgg", "Arginine");
        map.put("agt", "Serine");
        map.put("agc", "Serine");
        map.put("aga", "Arginine");
        map.put("agg", "Arginine");
        map.put("ggt", "Glycine");
        map.put("ggc", "Glycine");
        map.put("gga", "Glycine");
        map.put("ggg", "Glycine");

    }

}
