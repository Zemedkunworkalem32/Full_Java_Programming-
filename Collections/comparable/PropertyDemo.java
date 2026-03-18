import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyDemo {
    public static void main(String[] args) {
        Properties laptopProps = new Properties();

        // --- 1️⃣ Set properties ---
        laptopProps.setProperty("Brand", "Hp");
        laptopProps.setProperty("Processor", "i5");
        laptopProps.setProperty("OS", "Windows");
        laptopProps.setProperty("Model", "Latitude");

        System.out.println("Initial properties: " + laptopProps);

        // --- 2️⃣ Save to XML ---
        try (FileOutputStream fos = new FileOutputStream("laptop.xml")) {
            laptopProps.storeToXML(fos, "Laptop Properties");
            System.out.println("Properties saved as XML successfully!");
        } catch (IOException e) {
            System.out.println("IO Exception while saving XML: " + e.getMessage());
        }

        // --- 3️⃣ Load from XML ---
        Properties loadedProps = new Properties();
        try (FileInputStream fis = new FileInputStream("laptop.xml")) {
            loadedProps.loadFromXML(fis);
            System.out.println("Properties loaded from XML: " + loadedProps);
            System.out.println("Brand: " + loadedProps.getProperty("Brand"));
            System.out.println("Processor: " + loadedProps.getProperty("Processor"));
            System.out.println("OS: " + loadedProps.getProperty("OS"));
            System.out.println("Model: " + loadedProps.getProperty("Model"));
        } catch (IOException e) {
            System.out.println("IO Exception while reading XML: " + e.getMessage());
        }
    }
}