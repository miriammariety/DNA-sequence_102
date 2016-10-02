/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anslab1_201340385;

import java.util.ArrayList;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;

/**
 *
 * @author ty
 */
public class Graph{
    ArrayList<String> sequences;
    int maxLength;
    double [] a, c, t, g, xData;
    XYChart chart;
    
    public Graph(ArrayList<String> sequence){
        sequences = sequence;
        setMax();
        a = new double[maxLength];
        c = new double[maxLength];
        t = new double[maxLength];
        g = new double[maxLength];
        xData = new double[maxLength];
        chart = new XYChartBuilder().width(400).height(300).
                title("NucleoTide Trend").xAxisTitle("Position").
                yAxisTitle("Count").build();
        
        count();
        
        chart.addSeries("Adenine", xData, a);
        chart.addSeries("Cytosine", xData, c);
        chart.addSeries("Thymine", xData, t);
        chart.addSeries("Guanine", xData, g);
    }
    
    //Max length for sequences
    void setMax(){
        maxLength = sequences.get(0).length();
        for(int i=1; i<sequences.size(); i++){
            if (sequences.get(i).length() > maxLength){
                maxLength = sequences.get(i).length();
            }
        }
    }
    
    void count(){
        //Count instances of character c in a position i
        for (int i = 0; i < maxLength; i++) {
            xData[i] = i + 1;
        }
        
        for(int pos=0; pos < maxLength; pos++){
            for(int seq=0; seq < sequences.size(); seq++){
                String ch = String.valueOf(
                        sequences.get(seq).charAt(pos)).toLowerCase();
                switch(ch){
                    case "a":
                        a[pos]++;
                        break;
                    case "c":
                        c[pos]++;
                        break;
                    case "t":
                        t[pos]++;
                        break;
                    case "g":
                        g[pos]++;
                        break;
                }
                      
            }
        }
    }
    
}
