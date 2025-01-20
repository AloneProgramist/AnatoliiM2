package module2;

import java.io.IOException;
import java.util.Properties;

public class Runner {
    public Runner() {
        Properties prop = new Properties();
        General general = new General();
        try {
            prop.load(Main.class.getClassLoader().getResourceAsStream("config.properties"));
            if (prop.getProperty("weight") != null && prop.getProperty("height") != null) {
                general.heightMAP = Integer.parseInt(prop.getProperty("height"));
                general.weightMAP = Integer.parseInt(prop.getProperty("weight"));
            } else {
                throw new WantedParamsNotFounded("Please write wanted params");
            }
        }
        catch (NullPointerException ex) {
            throw new ConfigFileDoesntNotExists("Config file not founded please create this file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
