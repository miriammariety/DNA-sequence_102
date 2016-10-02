/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anslab1_201340385;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static org.knowm.xchart.BitmapEncoder.getBufferedImage;
import org.knowm.xchart.XChartPanel;
import org.knowm.xchart.XYChart;

/**
 *
 * @author ty
 */
public class ChartFrame {
    private XYChart chart;
    private JFrame frame;
    private JPanel panel;
    private JButton saveAsPng;
    private JButton backButton;
    
    public ChartFrame(XYChart chart) {
        this.chart = chart;
        initComponents();
        frame.setVisible(true);
    }
    
    private void initComponents() {
        saveAsPng = new JButton();
        saveAsPng.setText("Save as JPEG/PNG");
        
        backButton = new JButton();
        backButton.setText("Back");

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                backButtonActionPerformed(e);
            }
        });
        
        saveAsPng.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    saveAsPngActionPerformed(e);
                } catch (IOException ex) {
                    Logger.getLogger(ChartFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        frame = new JFrame("Chart");
        frame.setSize(800, 600);
        
        
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        panel = new JPanel();
        
        frame.add(panel);
        
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(new XChartPanel(chart));
        panel.add(saveAsPng);
        panel.add(backButton);
    }

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.frame.dispose();
    }       
    
    private void saveAsPngActionPerformed(java.awt.event.ActionEvent evt) throws IOException {                                           
        JFileChooser chooser = new JFileChooser();
        int retrival = chooser.showSaveDialog(null);
        if (retrival == JFileChooser.APPROVE_OPTION) {
            try {
                BufferedImage bi = getBufferedImage(chart);
                File outputfile = new File(chooser.getSelectedFile() + ".png");
                ImageIO.write(bi, "png", outputfile);
            } catch (IOException e) {
            }
        }

    }       
    
}

