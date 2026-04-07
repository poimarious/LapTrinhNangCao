import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {

    private static void checkConfig(Map<String, String > map) throws InvalidConfigException {
        if(!map.containsKey("username")) throw new InvalidConfigException("Missing username");
        if(!map.containsKey("timeout")) throw new InvalidConfigException("Missing timeout");
        if(Integer.parseInt(map.get("timeout")) < 0) throw new InvalidConfigException("timeout must be > 0");

        if(map.containsKey("maxConnections")) {
            int maxConn = Integer.parseInt(map.get("maxConnections"));
            if(maxConn < 1) throw new InvalidConfigException("maxConnections must be >= 1");
        }
    }

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Config file path:");
        String filePath = sc.nextLine();
	
        Map<String, String> configMap = new HashMap<>();
        BufferedReader reader = null;

        try  {
            reader = new BufferedReader(new FileReader(filePath));
            String line;

            while((line = reader.readLine()) != null) {
                line=  line.trim();

                if(line.isEmpty() || !line.contains("=")) continue;

                String[] parts = line.split("=", 2);

                if(parts.length == 2) {
                    configMap.put(parts[0].trim(), parts[1].trim());
                }
            }
            
            checkConfig(configMap);
            
            System.out.println("Reader:");
            configMap.forEach((k, v ) -> System.out.println(k + " = " + v));
            System.out.println("loaded successfully.");

        } catch (FileNotFoundException e) {
            System.err.println("Config file not found.");
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format.");
        } catch (InvalidConfigException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println("I/O error.");
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException e) {
                System.err.println("Error closing file.");
            }
            System.out.println("Program finished.");
        }
    }
 }
