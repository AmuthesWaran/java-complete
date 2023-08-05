package simpleprograms;

import java.io.*;
import java.util.ArrayList;

public class TextToCSV {

    public static void main(String[] args) throws IOException {

//        src/main/resources/inputemailid.txt
        FileReader readfile = new FileReader("src/main/resources/inputemailid.txt");
        BufferedReader readbuffer = new BufferedReader(readfile);

        String[] uncleanEmailIds = readbuffer.readLine().split(";");
        readfile.close();
        ArrayList<String> emailIdClean = new ArrayList<>();
        ArrayList<String> fullName = new ArrayList<>();
        ArrayList<String> firstName = new ArrayList<>();
        ArrayList<String> secondName = new ArrayList<>();



        for (String uncleanEmailId : uncleanEmailIds) {
            emailIdClean.add(uncleanEmailId.trim());
            fullName.add(uncleanEmailId.trim().split("@")[0]);
            firstName.add(uncleanEmailId.trim().split("@")[0].split("\\.")[0]);
            secondName.add(uncleanEmailId.trim().split("@")[0].split("\\.")[0]);
        }

        System.out.println(emailIdClean.size());

        FileWriter fw = new FileWriter("src/main/resources/output.csv");
        fw.write("FirstName"+","+"SecondName"+","+"EmailId"+"\n");
        for (int i = 0; i < emailIdClean.size(); i++) {
            fw.write(firstName.get(i)+","+secondName.get(i)+","+emailIdClean.get(i));
            if (i <= emailIdClean.size()-2) {
                fw.write("\n");
            }
        }

        fw.close();

    }

}
