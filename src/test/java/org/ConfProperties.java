package org;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfProperties {
    protected static FileInputStream fileInputStream;
    protected static Properties PROPERTIES = new Properties();

    static {
        try {
            Properties conf = new Properties();
            fileInputStream = new FileInputStream("./src/test/resources/conf.properties");
            conf.load(fileInputStream);

            Properties dev = new Properties();
            fileInputStream = new FileInputStream("./src/test/resources/dev.properties");
            dev.load(fileInputStream);

            PROPERTIES.putAll(conf);
            PROPERTIES.putAll(dev);
        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            if (fileInputStream != null)
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    public static String getFileProperty(String key) {
        return PROPERTIES.getProperty(key);
    }
}