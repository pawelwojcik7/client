package com.is.client;

import com.is.client.laptopservice.LaptopService;
import com.is.client.laptopservice.LaptopServiceImplService;
import com.is.client.laptopservice.StringArray;
import com.is.client.laptopservice.XmlInputFormatArray;

import javax.swing.*;
import javax.xml.namespace.QName;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class MyFrame extends JFrame {

    private JTextField textField1;
    private JTextField textField2;
    private JTextArea resultArea;
    private JComboBox<String> comboBox1;
    private JComboBox<String> comboBox2;

    private LaptopService port;
    private static final QName SERVICE_NAME = new QName("http://web.is.com/", "LaptopServiceImplService");
    public MyFrame() {
        super("Klient");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new FlowLayout());



        URL wsdlURL = LaptopServiceImplService.WSDL_LOCATION;
        LaptopServiceImplService ss = new LaptopServiceImplService(wsdlURL, SERVICE_NAME);
        port = ss.getLaptopServiceImplPort();



        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        textField1 = new JTextField(10);
        textField2 = new JTextField(10);



        comboBox1 = new JComboBox<>();
        comboBox2 = new JComboBox<>();

        fetchProducers();
        fetchScreenTypes();


        button2.addActionListener(e -> {
            String selectedScreenType = (String) comboBox2.getSelectedItem();
            XmlInputFormatArray records = port.getRecordsByScreenType(selectedScreenType);
            // Zaktualizuj obszar wyników za pomocą uzyskanych rekordów
            // Zakładając, że XmlInputFormatArray ma metodę toString()
            resultArea.setText(records.getItem().toString());
        });

        // Dodaj implementację dla button3, który wykorzystuje metodę getNumberOfRecordsByProducer
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedProducer = (String) comboBox1.getSelectedItem();
                int numOfRecords = port.getNumberOfRecordsByProducer(selectedProducer);
                // Zaktualizuj obszar wyników za pomocą uzyskanej liczby rekordów
                resultArea.setText("Number of records: " + numOfRecords);
            }
        });

        resultArea = new JTextArea(5, 20);
        resultArea.setEditable(false);


        getContentPane().add(button1);
        getContentPane().add(button2);
        getContentPane().add(button3);
        getContentPane().add(textField1);
        getContentPane().add(textField2);
        getContentPane().add(comboBox1);
        getContentPane().add(comboBox2);
        getContentPane().add(resultArea);
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

}
