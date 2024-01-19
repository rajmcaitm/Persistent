package program4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFileJavaProgram {

    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\dharm_chaudhary\\Desktop\\abc.txt";

        zipSingleFile(filePath);
    }

    private static void zipSingleFile(String filePath) throws IOException {
        //Step 1 : Create a File fileToBeZipped with given filePath
        //and wrap it into FileInputStream fis

        File fileToBeZipped = new File(filePath);
        FileInputStream fis = new FileInputStream(fileToBeZipped);

        FileOutputStream fos = new FileOutputStream("C:\\Users\\dharm_chaudhary\\Desktop\\ZippedFile.zip");
        ZipOutputStream zos = new ZipOutputStream(fos);


        ZipEntry zipEntry = new ZipEntry(fileToBeZipped.getName());
        zos.putNextEntry(zipEntry);

        byte[] bytes = new byte[1024];

        while (fis.read(bytes) >= 0) {
            zos.write(bytes, 0, bytes.length);
        }

        zos.closeEntry();

        fis.close();
        zos.close();
        fos.close();
    }
}
