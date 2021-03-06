/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;


import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author Entrar
 */
public class HistogramDisplay extends ApplicationFrame{
    
    public HistogramDisplay() {
        super("Kata3: HISTOGRAMA");
        setContentPane(createPanel());
        pack();
    }
    
    public void execute(){
        setVisible(true);
    }

    private JPanel createPanel() {
        ChartPanel chartpanel = new ChartPanel(createChart(createDataset()));
        setPreferredSize(new Dimension(500,400));
        return chartpanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = 
                ChartFactory.createBarChart(
                "Histograma JFreeChart",
                "Dominios Email",
                "Nº Email",
                dataSet,
                PlotOrientation.VERTICAL,
                false,
                rootPaneCheckingEnabled,
                rootPaneCheckingEnabled );
        
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(15, "", "ulpgc.es");
        dataSet.addValue(8, "", "ull.es");
        dataSet.addValue(2, "", "hotmail.com");
        dataSet.addValue(6, "", "gmail.com");
        return dataSet;
    }
}
