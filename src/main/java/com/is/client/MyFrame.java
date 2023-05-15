package com.is.client;

import com.is.client.laptopservice.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.xml.namespace.QName;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MyFrame extends JFrame {

    private JTextField textField1;
    private JTextField textField2;
    private JTextArea resultArea;
    private JComboBox<String> comboBox1;
    private JComboBox<String> comboBox2;
    private JTable table;
    private List<XmlInputFormat> list;

    private LaptopService port;
    private static final QName SERVICE_NAME = new QName("http://web.is.com/", "LaptopServiceImplService");

    public MyFrame() {
        super("Klient");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout());

        list = new ArrayList<>();

        URL wsdlURL = LaptopServiceImplService.WSDL_LOCATION;
        LaptopServiceImplService ss = new LaptopServiceImplService(wsdlURL, SERVICE_NAME);
        port = ss.getLaptopServiceImplPort();

        JPanel topPanel = new JPanel(new FlowLayout());
        getContentPane().add(topPanel, BorderLayout.NORTH);

        JButton button1 = new JButton("Liczba laptopow o rozdzielczosci");
        JButton button2 = new JButton("Laptopy z matryca");
        JButton button3 = new JButton("Liczba laptopow producenta");

        textField1 = new JTextField(10);
        textField2 = new JTextField(10);

        comboBox1 = new JComboBox<>();
        comboBox2 = new JComboBox<>();

        fetchProducers();
        fetchScreenTypes();

        resultArea = new JTextArea(5, 20);
        resultArea.setEditable(false);

        topPanel.add(button1);
        topPanel.add(textField1);
        topPanel.add(textField2);
        topPanel.add(button2);
        topPanel.add(comboBox2);
        topPanel.add(button3);
        topPanel.add(comboBox1);
        topPanel.add(resultArea);

        table = new JTable();
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(380, 150));
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        button1.addActionListener(e -> {
            String selectedProducer = (String) comboBox1.getSelectedItem();
            String arg0 = textField1.getText();
            String arg1 = textField2.getText();

            try {
                int arg0Value = Integer.parseInt(arg0);
                int arg1Value = Integer.parseInt(arg1);


                int numOfRecords = port.customMethod(arg0Value, arg1Value);


                resultArea.setText("Number of records: " + numOfRecords);
            } catch (NumberFormatException ex) {

                resultArea.setText("Arguments must be integers.");
            }
        });

        button2.addActionListener(e -> {
            list = new ArrayList<>();
            String selectedScreenType = (String) comboBox2.getSelectedItem();
            XmlInputFormatArray records = port.getRecordsByScreenType(selectedScreenType);
            list = records.getItem();
            updateTable(list);
        });

        button3.addActionListener(e -> {
            String selectedProducer = (String) comboBox1.getSelectedItem();
            int numOfRecords = port.getNumberOfRecordsByProducer(selectedProducer);

            resultArea.setText("Number of records: " + numOfRecords);
        });

        pack();
        setVisible(true);
    }

    private void fetchProducers() {
        List<String> producers = port.getAllDistinctProducers().getItem();
        for (String producer : producers) {
            comboBox1.addItem(producer);
        }
    }

    private void fetchScreenTypes() {
        StringArray screenTypes = port.getAllDistinctScreenTypes();
        for (String screenType : screenTypes.getItem()) {
            comboBox2.addItem(screenType);
        }
    }

    private void updateTable(List<XmlInputFormat> data) {

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Manufacturer");
        model.addColumn("Screen Size");
        model.addColumn("Resolution");
        model.addColumn("Screen type");
        model.addColumn("Is Touchable");
        model.addColumn("Processor Name");
        model.addColumn("Core number");
        model.addColumn("Frequency");
        model.addColumn("RAM");
        model.addColumn("Disc Storage");
        model.addColumn("Disc type");
        model.addColumn("Graphic Card Name");
        model.addColumn("Graphics Card Memory");
        model.addColumn("Operating System");
        model.addColumn("Optical Drive");

        for (XmlInputFormat inputFormat : data) {
            String manufacturer = inputFormat.getManufacturer();
            String screenSize = inputFormat.getScreen().getSize();
            String resolution = inputFormat.getScreen().getResolution();
            String screenType = inputFormat.getScreen().getType();
            String isTouchable = inputFormat.getScreen().getTouch();
            String processorName = inputFormat.getProcessor().getName();
            String coreNumber = inputFormat.getProcessor().getPhysicalCores();
            String freq = inputFormat.getProcessor().getClockSpeed();
            String ram = inputFormat.getRam();
            String discStorage = inputFormat.getDisc().getStorage();
            String diskType = inputFormat.getDisc().getType();
            String graphicCardName = inputFormat.getGraphicCard().getName();
            String graphicsCardMemory = inputFormat.getGraphicCard().getMemory();
            String operatingSystem = inputFormat.getOs();
            String opticalDrive = inputFormat.getDiscReader();

            model.addRow(new Object[]{manufacturer, screenSize, resolution, screenType, isTouchable,
                    processorName, coreNumber, freq, ram, discStorage, diskType, graphicCardName, graphicsCardMemory, operatingSystem, opticalDrive});
        }

        table.setModel(model);
    }

}
