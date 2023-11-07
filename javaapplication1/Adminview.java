package javaapplication1;
import com.formdev.flatlaf.intellijthemes.FlatVuesionIJTheme;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.statistics.HistogramDataset;
public class Adminview extends javax.swing.JFrame {

    public Adminview() {
        initComponents();
        showPieChart();
        showLineChart(); 
        showHistogram();
        showBarChart();
    }
    public void showPieChart(){
        
        //create dataset
      DefaultPieDataset barDataset = new DefaultPieDataset( );
      barDataset.setValue( "IPhone 5s" , new Double( 20 ) );  
      barDataset.setValue( "SamSung Grand" , new Double( 20 ) );   
      barDataset.setValue( "MotoG" , new Double( 40 ) );    
      barDataset.setValue( "Nokia Lumia" , new Double( 10 ) );  
      
      //create chart
       JFreeChart piechart = ChartFactory.createPieChart("mobile sales",barDataset, false,true,false);//explain
      
        PiePlot piePlot =(PiePlot) piechart.getPlot();
      
       //changing pie chart blocks colors
//       piePlot.setSectionPaint("IPhone 5s", new Color(255,255,102));
//        piePlot.setSectionPaint("SamSung Grand", new Color(102,255,102));
//        piePlot.setSectionPaint("MotoG", new Color(255,102,153));
//        piePlot.setSectionPaint("Nokia Lumia", new Color(0,204,204));
//      
       
        piePlot.setBackgroundPaint(Color.white);
        
        //create chartPanel to display chart(graph)
        ChartPanel barChartPanel = new ChartPanel(piechart);
        panelBarChart.removeAll();
        panelBarChart.add(barChartPanel, BorderLayout.CENTER);
        panelBarChart.validate();
         panelBarChart.setVisible(true);
        
    }
    
      public void showLineChart(){
        //create dataset for the graph
         DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(200, "Amount", "january");
        dataset.setValue(150, "Amount", "february");
        dataset.setValue(18, "Amount", "march");
        dataset.setValue(100, "Amount", "april");
        dataset.setValue(80, "Amount", "may");
        dataset.setValue(250, "Amount", "june");
        
        //create chart
        JFreeChart linechart = ChartFactory.createLineChart("contribution","monthly","amount", 
                dataset, PlotOrientation.VERTICAL, false,true,false);
        
        //create plot object
         CategoryPlot lineCategoryPlot = linechart.getCategoryPlot();
       // lineCategoryPlot.setRangeGridlinePaint(Color.BLUE);
        lineCategoryPlot.setBackgroundPaint(Color.white);
        
        //create render object to change the moficy the line properties like color
        LineAndShapeRenderer lineRenderer = (LineAndShapeRenderer) lineCategoryPlot.getRenderer();
        Color lineChartColor = new Color(204,0,51);
        lineRenderer.setSeriesPaint(0, lineChartColor);
        
         //create chartPanel to display chart(graph)
        ChartPanel lineChartPanel = new ChartPanel(linechart);
        panelLineChart.removeAll();
        panelLineChart.add(lineChartPanel, BorderLayout.CENTER);
        panelLineChart.validate();
    }
      public void showHistogram(){
        
         double[] values = { 95, 49, 14, 59, 50, 66, 47, 40, 1, 67,
                            12, 58, 28, 63, 14, 9, 31, 17, 94, 71,
                            49, 64, 73, 97, 15, 63, 10, 12, 31, 62,
                            93, 49, 74, 90, 59, 14, 15, 88, 26, 57,
                            77, 44, 58, 91, 10, 67, 57, 19, 88, 84                                
                          };
 
 
        HistogramDataset dataset = new HistogramDataset();
        dataset.addSeries("key", values, 20);
        
         JFreeChart chart = ChartFactory.createHistogram("JFreeChart Histogram","Data", "Frequency", dataset,PlotOrientation.VERTICAL, false,true,false);
            XYPlot plot= chart.getXYPlot();
        plot.setBackgroundPaint(Color.WHITE);

        
        
        ChartPanel barpChartPanel2 = new ChartPanel(chart);
        panel1.removeAll();
        panel1.add(barpChartPanel2, BorderLayout.CENTER);
        panel1.validate();
    }
      public void showBarChart(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(200, "Amount", "january");
        dataset.setValue(150, "Amount", "february");
        dataset.setValue(18, "Amount", "march");
        dataset.setValue(100, "Amount", "april");
        dataset.setValue(80, "Amount", "may");
        dataset.setValue(250, "Amount", "june");
        
        JFreeChart chart = ChartFactory.createBarChart("contribution","monthly","amount", 
                dataset, PlotOrientation.VERTICAL, false,true,false);
        
        CategoryPlot categoryPlot = chart.getCategoryPlot();
        //categoryPlot.setRangeGridlinePaint(Color.BLUE);
        categoryPlot.setBackgroundPaint(Color.WHITE);
        BarRenderer renderer = (BarRenderer) categoryPlot.getRenderer();
        Color clr3 = new Color(204,0,51);
        renderer.setSeriesPaint(0, clr3);
        
        ChartPanel barpChartPanel = new ChartPanel(chart);
        panel2.removeAll();
        panel2.add(barpChartPanel, BorderLayout.CENTER);
        panel2.validate();
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        buttonsP = new javax.swing.JPanel();
        adminiconL = new javax.swing.JLabel();
        studentListB = new javax.swing.JLabel();
        departmentB = new javax.swing.JLabel();
        eventsB = new javax.swing.JLabel();
        dashboardB1 = new javax.swing.JLabel();
        weladminL = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Dashboard = new javax.swing.JPanel();
        panel1 = new javax.swing.JPanel();
        panelLineChart = new javax.swing.JPanel();
        panelBarChart = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        StudentList = new javax.swing.JPanel();
        searchArea1P = new javax.swing.JPanel();
        searchhereT = new javax.swing.JTextField();
        searchIcon1B = new javax.swing.JLabel();
        settingsIcon1B = new javax.swing.JLabel();
        studentListP = new javax.swing.JPanel();
        slP = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addB1 = new javax.swing.JLabel();
        editB1 = new javax.swing.JLabel();
        removeB1 = new javax.swing.JLabel();
        resetB1 = new javax.swing.JLabel();
        applyB1 = new javax.swing.JLabel();
        saveB1 = new javax.swing.JLabel();
        Department = new javax.swing.JPanel();
        dfP = new javax.swing.JLabel();
        searchAreaP = new javax.swing.JPanel();
        searchhere1T = new javax.swing.JTextField();
        searchIconB = new javax.swing.JLabel();
        settingIconB = new javax.swing.JLabel();
        departmentsP = new javax.swing.JPanel();
        ccsB = new javax.swing.JLabel();
        cbaaB = new javax.swing.JLabel();
        claB = new javax.swing.JLabel();
        ccjeB = new javax.swing.JLabel();
        cnmB = new javax.swing.JLabel();
        tetdB = new javax.swing.JLabel();
        cedB = new javax.swing.JLabel();
        hsB = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        ccsP = new javax.swing.JPanel();
        deparmentsList = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        changeFilterB = new javax.swing.JLabel();
        save2 = new javax.swing.JLabel();
        apply1 = new javax.swing.JLabel();
        cbaaP = new javax.swing.JPanel();
        deparmentsList1 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        changeFilter1B = new javax.swing.JLabel();
        save3B = new javax.swing.JLabel();
        apply2B = new javax.swing.JLabel();
        claP = new javax.swing.JPanel();
        deparmentsList2 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        changeFilter2B = new javax.swing.JLabel();
        save4B = new javax.swing.JLabel();
        apply3B = new javax.swing.JLabel();
        ccjeP = new javax.swing.JPanel();
        deparmentsList3 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        changeFilter3B = new javax.swing.JLabel();
        save5B = new javax.swing.JLabel();
        apply4B = new javax.swing.JLabel();
        cnmP = new javax.swing.JPanel();
        deparmentsList4 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        changeFilter4B = new javax.swing.JLabel();
        save6B = new javax.swing.JLabel();
        apply5B = new javax.swing.JLabel();
        tetdP = new javax.swing.JPanel();
        deparmentsList5 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        changeFilter5B = new javax.swing.JLabel();
        save7B = new javax.swing.JLabel();
        apply6B = new javax.swing.JLabel();
        cedP = new javax.swing.JPanel();
        deparmentsList6 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        changeFilter6B = new javax.swing.JLabel();
        save8B = new javax.swing.JLabel();
        apply7B = new javax.swing.JLabel();
        hsP = new javax.swing.JPanel();
        deparmentsList7 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        changeFilter7B = new javax.swing.JLabel();
        save9B = new javax.swing.JLabel();
        apply8B = new javax.swing.JLabel();
        Events = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        Eventsinfo = new javax.swing.JPanel();
        eventsInfoL = new javax.swing.JLabel();
        eventsInfoP = new javax.swing.JPanel();
        capacityL = new javax.swing.JLabel();
        timeL = new javax.swing.JLabel();
        locationsL = new javax.swing.JLabel();
        bookingL = new javax.swing.JLabel();
        date_timeL = new javax.swing.JLabel();
        informationsL = new javax.swing.JLabel();
        eventsNameL = new javax.swing.JLabel();
        dd_mm_yyL = new javax.swing.JLabel();
        locationsT = new javax.swing.JTextField();
        capacityT = new javax.swing.JTextField();
        timeT = new javax.swing.JTextField();
        infoT = new javax.swing.JTextField();
        eventsNameT = new javax.swing.JTextField();
        dd_mm_yyT = new javax.swing.JTextField();
        monC = new javax.swing.JCheckBox();
        wedsC = new javax.swing.JCheckBox();
        tuesC = new javax.swing.JCheckBox();
        thursC = new javax.swing.JCheckBox();
        friC = new javax.swing.JCheckBox();
        satC = new javax.swing.JCheckBox();
        sunC = new javax.swing.JCheckBox();
        option = new javax.swing.JComboBox<>();
        STFilterP = new javax.swing.JPanel();
        STFilterL = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        ChangeFilterB = new javax.swing.JLabel();
        save_B = new javax.swing.JLabel();
        next_B = new javax.swing.JLabel();
        Event = new javax.swing.JPanel();
        addB = new javax.swing.JLabel();
        editB = new javax.swing.JLabel();
        removeB = new javax.swing.JLabel();
        resetB = new javax.swing.JLabel();
        EventsL = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        previousB = new javax.swing.JLabel();
        saveB = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1350, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonsP.setBackground(new java.awt.Color(0, 0, 0, 99));
        buttonsP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminiconL.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        adminiconL.setForeground(new java.awt.Color(153, 153, 153));
        adminiconL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminiconL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icon/ADMIN (3).png"))); // NOI18N
        adminiconL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminiconLMouseClicked(evt);
            }
        });
        buttonsP.add(adminiconL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 260, 80));

        studentListB.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        studentListB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        studentListB.setText("STUDENT LIST");
        studentListB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        studentListB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studentListB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentListBMouseClicked(evt);
            }
        });
        buttonsP.add(studentListB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 223, 60));

        departmentB.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        departmentB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        departmentB.setText("DEPARTMENT");
        departmentB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        departmentB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        departmentB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                departmentBMouseClicked(evt);
            }
        });
        buttonsP.add(departmentB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 223, 60));

        eventsB.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        eventsB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eventsB.setText("EVENTS");
        eventsB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        eventsB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eventsB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eventsBMouseClicked(evt);
            }
        });
        buttonsP.add(eventsB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 223, 60));

        dashboardB1.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        dashboardB1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboardB1.setText("DASHBOARD");
        dashboardB1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        dashboardB1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboardB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardB1MouseClicked(evt);
            }
        });
        buttonsP.add(dashboardB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 223, 60));

        weladminL.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        weladminL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        weladminL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icon/ADMIN (2).png"))); // NOI18N
        weladminL.setText("Welcome Admin");
        buttonsP.add(weladminL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 260, 30));

        getContentPane().add(buttonsP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 660));

        Dashboard.setBackground(new java.awt.Color(47, 52, 58));
        Dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setBackground(new java.awt.Color(102, 102, 102));
        panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 255)));
        panel1.setLayout(new java.awt.BorderLayout());
        Dashboard.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 290, 220));

        panelLineChart.setBackground(new java.awt.Color(102, 102, 102));
        panelLineChart.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 255)));
        panelLineChart.setLayout(new java.awt.BorderLayout());
        Dashboard.add(panelLineChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 290, 220));

        panelBarChart.setBackground(new java.awt.Color(102, 102, 102));
        panelBarChart.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 255)));
        panelBarChart.setLayout(new java.awt.BorderLayout());
        Dashboard.add(panelBarChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 290, 220));

        panel2.setBackground(new java.awt.Color(102, 102, 102));
        panel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 255)));
        panel2.setLayout(new java.awt.BorderLayout());
        Dashboard.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 288, 218));

        jTabbedPane1.addTab("Dashboard", Dashboard);

        StudentList.setBackground(new java.awt.Color(51, 51, 51, 99));
        StudentList.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchArea1P.setBackground(new java.awt.Color(51, 51, 51));

        searchhereT.setText("Search here ...");
        searchhereT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchhereTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchhereTFocusLost(evt);
            }
        });

        searchIcon1B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icon/SEArch (2).png"))); // NOI18N
        searchIcon1B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        settingsIcon1B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settingsIcon1B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icon/menu.png"))); // NOI18N
        settingsIcon1B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout searchArea1PLayout = new javax.swing.GroupLayout(searchArea1P);
        searchArea1P.setLayout(searchArea1PLayout);
        searchArea1PLayout.setHorizontalGroup(
            searchArea1PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchArea1PLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchIcon1B, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchhereT, javax.swing.GroupLayout.PREFERRED_SIZE, 992, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(settingsIcon1B)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        searchArea1PLayout.setVerticalGroup(
            searchArea1PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchArea1PLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(searchhereT, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(searchArea1PLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchArea1PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(settingsIcon1B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchIcon1B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        StudentList.add(searchArea1P, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1070, 60));

        studentListP.setBackground(new java.awt.Color(47, 52, 58));
        studentListP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        slP.setBackground(new java.awt.Color(65, 65, 65));
        slP.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        slP.setForeground(new java.awt.Color(255, 255, 255));
        slP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        slP.setText("STUDENT LIST");
        slP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        studentListP.add(slP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1060, 43));

        jTable1.setBackground(new java.awt.Color(153, 153, 153, 99));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "I.D", "Name", "Course", "Year Lv", "Time-In", "Time-Out", "Events"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        studentListP.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 1060, 470));

        addB1.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        addB1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addB1.setText("ADD");
        addB1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        addB1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studentListP.add(addB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 73, 27));

        editB1.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        editB1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editB1.setText("EDIT");
        editB1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        editB1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studentListP.add(editB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 600, 73, 27));

        removeB1.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        removeB1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        removeB1.setText("REMOVE");
        removeB1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        removeB1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studentListP.add(removeB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 600, 73, 27));

        resetB1.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        resetB1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resetB1.setText("RESET");
        resetB1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        resetB1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studentListP.add(resetB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 600, 73, 27));

        applyB1.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        applyB1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        applyB1.setText("APPLY");
        applyB1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        applyB1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studentListP.add(applyB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 600, 79, 30));

        saveB1.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        saveB1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saveB1.setText("SAVE");
        saveB1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        saveB1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studentListP.add(saveB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 600, 73, 30));

        StudentList.add(studentListP, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 10, 1090, 650));

        jTabbedPane1.addTab("StudentList", StudentList);

        Department.setBackground(new java.awt.Color(51, 51, 51));
        Department.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dfP.setBackground(new java.awt.Color(65, 65, 65));
        dfP.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        dfP.setForeground(new java.awt.Color(255, 255, 255));
        dfP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dfP.setText("DEPARTMENT FILTER");
        dfP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        Department.add(dfP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1050, 43));

        searchAreaP.setBackground(new java.awt.Color(51, 51, 51));

        searchhere1T.setText("Search here ...");
        searchhere1T.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchhere1TFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchhere1TFocusLost(evt);
            }
        });

        searchIconB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icon/SEArch (2).png"))); // NOI18N
        searchIconB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        settingIconB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settingIconB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icon/menu.png"))); // NOI18N
        settingIconB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout searchAreaPLayout = new javax.swing.GroupLayout(searchAreaP);
        searchAreaP.setLayout(searchAreaPLayout);
        searchAreaPLayout.setHorizontalGroup(
            searchAreaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchAreaPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchIconB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchhere1T, javax.swing.GroupLayout.PREFERRED_SIZE, 992, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(settingIconB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        searchAreaPLayout.setVerticalGroup(
            searchAreaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchAreaPLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(searchhere1T, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(searchAreaPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchAreaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(settingIconB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchIconB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Department.add(searchAreaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1090, 60));

        departmentsP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        departmentsP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ccsB.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        ccsB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ccsB.setText("CCS");
        ccsB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        ccsB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ccsB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ccsBMouseClicked(evt);
            }
        });
        departmentsP.add(ccsB, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 90, 30));

        cbaaB.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        cbaaB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cbaaB.setText("CBAA");
        cbaaB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        cbaaB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbaaB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbaaBMouseClicked(evt);
            }
        });
        departmentsP.add(cbaaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 90, 30));

        claB.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        claB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        claB.setText("CLA");
        claB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        claB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        claB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                claBMouseClicked(evt);
            }
        });
        departmentsP.add(claB, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 90, 30));

        ccjeB.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        ccjeB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ccjeB.setText("CCJE");
        ccjeB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        ccjeB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ccjeB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ccjeBMouseClicked(evt);
            }
        });
        departmentsP.add(ccjeB, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 90, 30));

        cnmB.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        cnmB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cnmB.setText("CNM");
        cnmB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        cnmB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cnmB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cnmBMouseClicked(evt);
            }
        });
        departmentsP.add(cnmB, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 90, 30));

        tetdB.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        tetdB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tetdB.setText("TETD");
        tetdB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        tetdB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tetdB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tetdBMouseClicked(evt);
            }
        });
        departmentsP.add(tetdB, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 90, 30));

        cedB.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        cedB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cedB.setText("CED");
        cedB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        cedB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cedB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cedBMouseClicked(evt);
            }
        });
        departmentsP.add(cedB, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 90, 30));

        hsB.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        hsB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hsB.setText("HS");
        hsB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        hsB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hsB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hsBMouseClicked(evt);
            }
        });
        departmentsP.add(hsB, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, 90, 30));

        Department.add(departmentsP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 1050, 70));

        ccsP.setBackground(new java.awt.Color(47, 52, 58));
        ccsP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setBackground(new java.awt.Color(153, 153, 153, 99));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "I.D", "Name", "Course", "Year Lv", "Time-In", "Time-Out", "Events"
            }
        ));
        deparmentsList.setViewportView(jTable3);

        ccsP.add(deparmentsList, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 1050, 330));

        changeFilterB.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        changeFilterB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        changeFilterB.setText("CHANGE FILTER");
        changeFilterB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        changeFilterB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ccsP.add(changeFilterB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 122, 27));

        save2.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        save2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        save2.setText("SAVE");
        save2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        save2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ccsP.add(save2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 550, 73, 27));

        apply1.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        apply1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        apply1.setText("APPLY");
        apply1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        apply1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ccsP.add(apply1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 550, 73, 27));

        jTabbedPane3.addTab("tab1", ccsP);

        cbaaP.setBackground(new java.awt.Color(47, 52, 58));
        cbaaP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable4.setBackground(new java.awt.Color(153, 153, 153, 99));
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "I.D", "Name", "Course", "Year Lv", "Time-In", "Time-Out", "Events"
            }
        ));
        deparmentsList1.setViewportView(jTable4);

        cbaaP.add(deparmentsList1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 1050, 330));

        changeFilter1B.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        changeFilter1B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        changeFilter1B.setText("CHANGE FILTER");
        changeFilter1B.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        changeFilter1B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbaaP.add(changeFilter1B, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 122, 27));

        save3B.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        save3B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        save3B.setText("SAVE");
        save3B.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        save3B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbaaP.add(save3B, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 550, 73, 27));

        apply2B.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        apply2B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        apply2B.setText("APPLY");
        apply2B.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        apply2B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbaaP.add(apply2B, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 550, 73, 27));

        jTabbedPane3.addTab("tab1", cbaaP);

        claP.setBackground(new java.awt.Color(47, 52, 58));
        claP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable5.setBackground(new java.awt.Color(153, 153, 153, 99));
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "I.D", "Name", "Course", "Year Lv", "Time-In", "Time-Out", "Events"
            }
        ));
        deparmentsList2.setViewportView(jTable5);

        claP.add(deparmentsList2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 1050, 330));

        changeFilter2B.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        changeFilter2B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        changeFilter2B.setText("CHANGE FILTER");
        changeFilter2B.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        changeFilter2B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        claP.add(changeFilter2B, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 122, 27));

        save4B.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        save4B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        save4B.setText("SAVE");
        save4B.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        save4B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        claP.add(save4B, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 550, 73, 27));

        apply3B.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        apply3B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        apply3B.setText("APPLY");
        apply3B.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        apply3B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        claP.add(apply3B, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 550, 73, 27));

        jTabbedPane3.addTab("tab1", claP);

        ccjeP.setBackground(new java.awt.Color(47, 52, 58));
        ccjeP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable6.setBackground(new java.awt.Color(153, 153, 153, 99));
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "I.D", "Name", "Course", "Year Lv", "Time-In", "Time-Out", "Events"
            }
        ));
        deparmentsList3.setViewportView(jTable6);

        ccjeP.add(deparmentsList3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 1050, 330));

        changeFilter3B.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        changeFilter3B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        changeFilter3B.setText("CHANGE FILTER");
        changeFilter3B.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        changeFilter3B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ccjeP.add(changeFilter3B, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 122, 27));

        save5B.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        save5B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        save5B.setText("SAVE");
        save5B.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        save5B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ccjeP.add(save5B, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 550, 73, 27));

        apply4B.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        apply4B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        apply4B.setText("APPLY");
        apply4B.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        apply4B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ccjeP.add(apply4B, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 550, 73, 27));

        jTabbedPane3.addTab("tab1", ccjeP);

        cnmP.setBackground(new java.awt.Color(47, 52, 58));
        cnmP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable7.setBackground(new java.awt.Color(153, 153, 153, 99));
        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "I.D", "Name", "Course", "Year Lv", "Time-In", "Time-Out", "Events"
            }
        ));
        deparmentsList4.setViewportView(jTable7);

        cnmP.add(deparmentsList4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 1050, 330));

        changeFilter4B.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        changeFilter4B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        changeFilter4B.setText("CHANGE FILTER");
        changeFilter4B.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        changeFilter4B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cnmP.add(changeFilter4B, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 122, 27));

        save6B.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        save6B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        save6B.setText("SAVE");
        save6B.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        save6B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cnmP.add(save6B, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 550, 73, 27));

        apply5B.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        apply5B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        apply5B.setText("APPLY");
        apply5B.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        apply5B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cnmP.add(apply5B, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 550, 73, 27));

        jTabbedPane3.addTab("tab1", cnmP);

        tetdP.setBackground(new java.awt.Color(47, 52, 58));
        tetdP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable8.setBackground(new java.awt.Color(153, 153, 153, 99));
        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "I.D", "Name", "Course", "Year Lv", "Time-In", "Time-Out", "Events"
            }
        ));
        deparmentsList5.setViewportView(jTable8);

        tetdP.add(deparmentsList5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 1050, 330));

        changeFilter5B.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        changeFilter5B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        changeFilter5B.setText("CHANGE FILTER");
        changeFilter5B.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        changeFilter5B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tetdP.add(changeFilter5B, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 122, 27));

        save7B.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        save7B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        save7B.setText("SAVE");
        save7B.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        save7B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tetdP.add(save7B, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 550, 73, 27));

        apply6B.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        apply6B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        apply6B.setText("APPLY");
        apply6B.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        apply6B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tetdP.add(apply6B, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 550, 73, 27));

        jTabbedPane3.addTab("tab1", tetdP);

        cedP.setBackground(new java.awt.Color(47, 52, 58));
        cedP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable9.setBackground(new java.awt.Color(153, 153, 153, 99));
        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "I.D", "Name", "Course", "Year Lv", "Time-In", "Time-Out", "Events"
            }
        ));
        deparmentsList6.setViewportView(jTable9);

        cedP.add(deparmentsList6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 1050, 330));

        changeFilter6B.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        changeFilter6B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        changeFilter6B.setText("CHANGE FILTER");
        changeFilter6B.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        changeFilter6B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cedP.add(changeFilter6B, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 122, 27));

        save8B.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        save8B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        save8B.setText("SAVE");
        save8B.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        save8B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cedP.add(save8B, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 550, 73, 27));

        apply7B.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        apply7B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        apply7B.setText("APPLY");
        apply7B.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        apply7B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cedP.add(apply7B, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 550, 73, 27));

        jTabbedPane3.addTab("tab1", cedP);

        hsP.setBackground(new java.awt.Color(47, 52, 58));
        hsP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable10.setBackground(new java.awt.Color(153, 153, 153, 99));
        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "I.D", "Name", "Course", "Year Lv", "Time-In", "Time-Out", "Events"
            }
        ));
        deparmentsList7.setViewportView(jTable10);

        hsP.add(deparmentsList7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 1050, 330));

        changeFilter7B.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        changeFilter7B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        changeFilter7B.setText("CHANGE FILTER");
        changeFilter7B.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        changeFilter7B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hsP.add(changeFilter7B, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 122, 27));

        save9B.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        save9B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        save9B.setText("SAVE");
        save9B.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        save9B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hsP.add(save9B, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 550, 73, 27));

        apply8B.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        apply8B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        apply8B.setText("APPLY");
        apply8B.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        apply8B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hsP.add(apply8B, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 550, 73, 27));

        jTabbedPane3.addTab("tab1", hsP);

        Department.add(jTabbedPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1090, 690));

        jTabbedPane1.addTab("Department", Department);

        Events.setBackground(new java.awt.Color(51, 51, 51, 99));
        Events.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Eventsinfo.setBackground(new java.awt.Color(47, 52, 58));
        Eventsinfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eventsInfoL.setBackground(new java.awt.Color(0, 0, 0, 99));
        eventsInfoL.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        eventsInfoL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eventsInfoL.setText("EVENTS INFORMATIONS");
        eventsInfoL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        Eventsinfo.add(eventsInfoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 18, 1040, 50));

        eventsInfoP.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout eventsInfoPLayout = new javax.swing.GroupLayout(eventsInfoP);
        eventsInfoP.setLayout(eventsInfoPLayout);
        eventsInfoPLayout.setHorizontalGroup(
            eventsInfoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
        );
        eventsInfoPLayout.setVerticalGroup(
            eventsInfoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        Eventsinfo.add(eventsInfoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1090, 70));

        capacityL.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        capacityL.setText("Capacity :");
        Eventsinfo.add(capacityL, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 80, -1, 30));

        timeL.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        timeL.setText("TIME:");
        Eventsinfo.add(timeL, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, 104, 20));

        locationsL.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        locationsL.setText("Locations :");
        Eventsinfo.add(locationsL, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 109, 30));

        bookingL.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        bookingL.setText("Booking :");
        Eventsinfo.add(bookingL, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, -1, 30));

        date_timeL.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        date_timeL.setText("DATE&TIME");
        Eventsinfo.add(date_timeL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 104, 25));

        informationsL.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        informationsL.setText("Information :");
        Eventsinfo.add(informationsL, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 104, -1));

        eventsNameL.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        eventsNameL.setText("Events Name:");
        Eventsinfo.add(eventsNameL, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 104, 30));

        dd_mm_yyL.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        dd_mm_yyL.setText("DD/MM/YY:");
        Eventsinfo.add(dd_mm_yyL, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 104, 20));

        locationsT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        locationsT.setText("Locations...");
        locationsT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        locationsT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                locationsTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                locationsTFocusLost(evt);
            }
        });
        Eventsinfo.add(locationsT, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 172, 34));

        capacityT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        capacityT.setText("Capacity...");
        capacityT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        capacityT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                capacityTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                capacityTFocusLost(evt);
            }
        });
        Eventsinfo.add(capacityT, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 110, 172, 34));

        timeT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        timeT.setText("HH/MM");
        timeT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        Eventsinfo.add(timeT, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, 110, 34));

        infoT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        infoT.setText("Info...");
        infoT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        infoT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                infoTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                infoTFocusLost(evt);
            }
        });
        Eventsinfo.add(infoT, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 560, 75));

        eventsNameT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        eventsNameT.setText("Events Name...");
        eventsNameT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        eventsNameT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                eventsNameTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                eventsNameTFocusLost(evt);
            }
        });
        Eventsinfo.add(eventsNameT, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 172, 34));

        dd_mm_yyT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dd_mm_yyT.setText("DD/MM/YY");
        dd_mm_yyT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        Eventsinfo.add(dd_mm_yyT, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 110, 34));

        monC.setText("MON");
        monC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        monC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Eventsinfo.add(monC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        wedsC.setText("WEDS");
        wedsC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        wedsC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Eventsinfo.add(wedsC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, 20));

        tuesC.setText("TUES");
        tuesC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        tuesC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Eventsinfo.add(tuesC, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        thursC.setText("THURS");
        thursC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        thursC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Eventsinfo.add(thursC, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));

        friC.setText("FRI");
        friC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        friC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Eventsinfo.add(friC, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        satC.setText("SAT");
        satC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        satC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Eventsinfo.add(satC, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, -1));

        sunC.setText("SUN");
        sunC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        sunC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Eventsinfo.add(sunC, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, -1, -1));

        option.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Options", "1Hr", "2Hrs", "2Hrs", "3Hrs", "4Hrs", "5Hrs", "etc..."}));
        option.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Eventsinfo.add(option, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 340, 90, 30));

        STFilterP.setBackground(new java.awt.Color(52, 52, 52));
        STFilterP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        STFilterP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        STFilterL.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        STFilterL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        STFilterL.setText("STUDENT FILTER");
        STFilterL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        STFilterP.add(STFilterL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1030, 48));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Group Type ", "Name", "Total of Students"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        STFilterP.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1030, 122));

        ChangeFilterB.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        ChangeFilterB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ChangeFilterB.setText("CHANGE FILTER");
        ChangeFilterB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        ChangeFilterB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ChangeFilterB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangeFilterBMouseClicked(evt);
            }
        });
        STFilterP.add(ChangeFilterB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 120, 30));

        save_B.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        save_B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        save_B.setText("SAVE");
        save_B.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        save_B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        STFilterP.add(save_B, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 210, 68, 28));

        next_B.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        next_B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        next_B.setText("NEXT");
        next_B.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        next_B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        next_B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                next_BMouseClicked(evt);
            }
        });
        STFilterP.add(next_B, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 210, 68, 28));

        Eventsinfo.add(STFilterP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 1050, 250));

        jTabbedPane2.addTab("Events Info.", Eventsinfo);

        Event.setBackground(new java.awt.Color(47, 52, 58));
        Event.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addB.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        addB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addB.setText("ADD");
        addB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        addB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Event.add(addB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 73, 27));

        editB.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        editB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editB.setText("EDIT");
        editB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        editB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Event.add(editB, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 600, 73, 27));

        removeB.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        removeB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        removeB.setText("REMOVE");
        removeB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        removeB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Event.add(removeB, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 600, 73, 27));

        resetB.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        resetB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resetB.setText("RESET");
        resetB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        resetB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Event.add(resetB, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 600, 73, 27));

        EventsL.setBackground(new java.awt.Color(0, 0, 0, 99));
        EventsL.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        EventsL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EventsL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icon/EVENTS.png"))); // NOI18N
        EventsL.setText("EVENTS ");
        EventsL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        Event.add(EventsL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 18, 1040, 50));

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        Event.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1080, 70));

        jPanel8.setBackground(new java.awt.Color(52, 52, 52));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        previousB.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        previousB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        previousB.setText("PREVIOUS");
        previousB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        previousB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        previousB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previousBMouseClicked(evt);
            }
        });
        jPanel8.add(previousB, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 500, 79, 27));

        saveB.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        saveB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saveB.setText("SAVE");
        saveB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        saveB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.add(saveB, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 500, 73, 27));

        jPanel9.setBackground(new java.awt.Color(0, 0, 0, 99));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 255)));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 230, 200));

        jPanel10.setBackground(new java.awt.Color(0, 0, 0, 99));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 255)));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel8.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, 230, 200));

        jPanel11.setBackground(new java.awt.Color(0, 0, 0, 99));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 255)));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel8.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 230, 200));

        Event.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 1060, 540));

        jTabbedPane2.addTab("Events", Event);

        Events.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -34, 1090, 700));

        jTabbedPane1.addTab("Events", Events);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, -43, 1090, 710));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adminiconLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminiconLMouseClicked
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_adminiconLMouseClicked

    private void studentListBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentListBMouseClicked
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_studentListBMouseClicked

    private void departmentBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_departmentBMouseClicked
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_departmentBMouseClicked

    private void eventsBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventsBMouseClicked
         jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_eventsBMouseClicked

    private void previousBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousBMouseClicked

        jTabbedPane2.setSelectedIndex(0);
    }//GEN-LAST:event_previousBMouseClicked

    private void next_BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next_BMouseClicked
        jTabbedPane2.setSelectedIndex(1);
    }//GEN-LAST:event_next_BMouseClicked

    private void ChangeFilterBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangeFilterBMouseClicked
        jTabbedPane2.setSelectedIndex(1);
    }//GEN-LAST:event_ChangeFilterBMouseClicked

    private void ccsBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ccsBMouseClicked
         jTabbedPane3.setSelectedIndex(0);
    }//GEN-LAST:event_ccsBMouseClicked

    private void cbaaBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbaaBMouseClicked
         jTabbedPane3.setSelectedIndex(1);
    }//GEN-LAST:event_cbaaBMouseClicked

    private void claBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_claBMouseClicked
         jTabbedPane3.setSelectedIndex(2);
    }//GEN-LAST:event_claBMouseClicked

    private void ccjeBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ccjeBMouseClicked
         jTabbedPane3.setSelectedIndex(3);
    }//GEN-LAST:event_ccjeBMouseClicked

    private void cnmBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cnmBMouseClicked
         jTabbedPane3.setSelectedIndex(4);
    }//GEN-LAST:event_cnmBMouseClicked

    private void tetdBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tetdBMouseClicked
         jTabbedPane3.setSelectedIndex(5);
    }//GEN-LAST:event_tetdBMouseClicked

    private void cedBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cedBMouseClicked
         jTabbedPane3.setSelectedIndex(6);
    }//GEN-LAST:event_cedBMouseClicked

    private void hsBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hsBMouseClicked
         jTabbedPane3.setSelectedIndex(7);
    }//GEN-LAST:event_hsBMouseClicked

    private void searchhereTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchhereTFocusGained
        searchhereT.setText(" ");
    }//GEN-LAST:event_searchhereTFocusGained

    private void searchhere1TFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchhere1TFocusGained
        searchhere1T.setText(" ");
        
    }//GEN-LAST:event_searchhere1TFocusGained

    private void searchhere1TFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchhere1TFocusLost
        if(searchhere1T.getText().isBlank()){
            searchhere1T.setText("Search here...");
        }
       
    }//GEN-LAST:event_searchhere1TFocusLost

    private void searchhereTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchhereTFocusLost
         if(searchhereT.getText().isBlank()){
            searchhereT.setText("Search here...");
        }
    }//GEN-LAST:event_searchhereTFocusLost

    private void eventsNameTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eventsNameTFocusGained
        eventsNameT.setText(" ");
    }//GEN-LAST:event_eventsNameTFocusGained

    private void eventsNameTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eventsNameTFocusLost
        if(eventsNameT.getText().isBlank()){
            eventsNameT.setText("Events Name...");
        }
    }//GEN-LAST:event_eventsNameTFocusLost

    private void locationsTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_locationsTFocusGained
        locationsT.setText(" ");
    }//GEN-LAST:event_locationsTFocusGained

    private void locationsTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_locationsTFocusLost
        if(locationsT.getText().isBlank()){
            locationsT.setText("Locations...");
        }
    }//GEN-LAST:event_locationsTFocusLost

    private void capacityTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_capacityTFocusGained
        capacityT.setText(" ");
    }//GEN-LAST:event_capacityTFocusGained

    private void capacityTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_capacityTFocusLost
        if(capacityT.getText().isBlank()){
            capacityT.setText("Capacity...");
        }
    }//GEN-LAST:event_capacityTFocusLost

    private void infoTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_infoTFocusGained
        infoT.setText(" ");
    }//GEN-LAST:event_infoTFocusGained

    private void infoTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_infoTFocusLost
        if(infoT.getText().isBlank()){
            infoT.setText("Info...");
        }
    }//GEN-LAST:event_infoTFocusLost

    private void dashboardB1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardB1MouseClicked
       jTabbedPane1.setSelectedIndex(0);
        
    }//GEN-LAST:event_dashboardB1MouseClicked

    public static void main(String args[]) {
    try {
            UIManager.setLookAndFeel(new FlatVuesionIJTheme());
        } catch (UnsupportedLookAndFeelException ex) {
            System.err.println("Failed to initialize LaF");
        }
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adminview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ChangeFilterB;
    private javax.swing.JPanel Dashboard;
    private javax.swing.JPanel Department;
    private javax.swing.JPanel Event;
    private javax.swing.JPanel Events;
    private javax.swing.JLabel EventsL;
    private javax.swing.JPanel Eventsinfo;
    private javax.swing.JLabel STFilterL;
    private javax.swing.JPanel STFilterP;
    private javax.swing.JPanel StudentList;
    private javax.swing.JLabel addB;
    private javax.swing.JLabel addB1;
    private javax.swing.JLabel adminiconL;
    private javax.swing.JLabel apply1;
    private javax.swing.JLabel apply2B;
    private javax.swing.JLabel apply3B;
    private javax.swing.JLabel apply4B;
    private javax.swing.JLabel apply5B;
    private javax.swing.JLabel apply6B;
    private javax.swing.JLabel apply7B;
    private javax.swing.JLabel apply8B;
    private javax.swing.JLabel applyB1;
    private javax.swing.JLabel bookingL;
    private javax.swing.JPanel buttonsP;
    private javax.swing.JLabel capacityL;
    private javax.swing.JTextField capacityT;
    private javax.swing.JLabel cbaaB;
    private javax.swing.JPanel cbaaP;
    private javax.swing.JLabel ccjeB;
    private javax.swing.JPanel ccjeP;
    private javax.swing.JLabel ccsB;
    private javax.swing.JPanel ccsP;
    private javax.swing.JLabel cedB;
    private javax.swing.JPanel cedP;
    private javax.swing.JLabel changeFilter1B;
    private javax.swing.JLabel changeFilter2B;
    private javax.swing.JLabel changeFilter3B;
    private javax.swing.JLabel changeFilter4B;
    private javax.swing.JLabel changeFilter5B;
    private javax.swing.JLabel changeFilter6B;
    private javax.swing.JLabel changeFilter7B;
    private javax.swing.JLabel changeFilterB;
    private javax.swing.JLabel claB;
    private javax.swing.JPanel claP;
    private javax.swing.JLabel cnmB;
    private javax.swing.JPanel cnmP;
    private javax.swing.JLabel dashboardB1;
    private javax.swing.JLabel date_timeL;
    private javax.swing.JLabel dd_mm_yyL;
    private javax.swing.JTextField dd_mm_yyT;
    private javax.swing.JScrollPane deparmentsList;
    private javax.swing.JScrollPane deparmentsList1;
    private javax.swing.JScrollPane deparmentsList2;
    private javax.swing.JScrollPane deparmentsList3;
    private javax.swing.JScrollPane deparmentsList4;
    private javax.swing.JScrollPane deparmentsList5;
    private javax.swing.JScrollPane deparmentsList6;
    private javax.swing.JScrollPane deparmentsList7;
    private javax.swing.JLabel departmentB;
    private javax.swing.JPanel departmentsP;
    private javax.swing.JLabel dfP;
    private javax.swing.JLabel editB;
    private javax.swing.JLabel editB1;
    private javax.swing.JLabel eventsB;
    private javax.swing.JLabel eventsInfoL;
    private javax.swing.JPanel eventsInfoP;
    private javax.swing.JLabel eventsNameL;
    private javax.swing.JTextField eventsNameT;
    private javax.swing.JCheckBox friC;
    private javax.swing.JLabel hsB;
    private javax.swing.JPanel hsP;
    private javax.swing.JTextField infoT;
    private javax.swing.JLabel informationsL;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JLabel locationsL;
    private javax.swing.JTextField locationsT;
    private javax.swing.JCheckBox monC;
    private javax.swing.JLabel next_B;
    private javax.swing.JComboBox<String> option;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panelBarChart;
    private javax.swing.JPanel panelLineChart;
    private javax.swing.JLabel previousB;
    private javax.swing.JLabel removeB;
    private javax.swing.JLabel removeB1;
    private javax.swing.JLabel resetB;
    private javax.swing.JLabel resetB1;
    private javax.swing.JCheckBox satC;
    private javax.swing.JLabel save2;
    private javax.swing.JLabel save3B;
    private javax.swing.JLabel save4B;
    private javax.swing.JLabel save5B;
    private javax.swing.JLabel save6B;
    private javax.swing.JLabel save7B;
    private javax.swing.JLabel save8B;
    private javax.swing.JLabel save9B;
    private javax.swing.JLabel saveB;
    private javax.swing.JLabel saveB1;
    private javax.swing.JLabel save_B;
    private javax.swing.JPanel searchArea1P;
    private javax.swing.JPanel searchAreaP;
    private javax.swing.JLabel searchIcon1B;
    private javax.swing.JLabel searchIconB;
    private javax.swing.JTextField searchhere1T;
    private javax.swing.JTextField searchhereT;
    private javax.swing.JLabel settingIconB;
    private javax.swing.JLabel settingsIcon1B;
    private javax.swing.JLabel slP;
    private javax.swing.JLabel studentListB;
    private javax.swing.JPanel studentListP;
    private javax.swing.JCheckBox sunC;
    private javax.swing.JLabel tetdB;
    private javax.swing.JPanel tetdP;
    private javax.swing.JCheckBox thursC;
    private javax.swing.JLabel timeL;
    private javax.swing.JTextField timeT;
    private javax.swing.JCheckBox tuesC;
    private javax.swing.JCheckBox wedsC;
    private javax.swing.JLabel weladminL;
    // End of variables declaration//GEN-END:variables
}
