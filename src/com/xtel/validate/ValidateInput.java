package com.xtel.validate;

import java.io.File;
import java.util.Scanner;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class ValidateInput{

    Scanner scanner;

    public static Logger logger;

    public ValidateInput() {
        scanner = new Scanner(System.in);
        File fileXML = new File("./config/log4j.xml");
        DOMConfigurator.configureAndWatch(fileXML.getPath());
        logger = LogManager.getLogger(ValidateInput.class);
    }

    public int validatedInt() {
        int inputNumber = 0;
        while (true) {
            try {
                inputNumber = Integer.parseInt(scanner.nextLine());
                return inputNumber;
            } catch (Exception e) {
                logger.error(e);
            }
            
        }
    }

}
