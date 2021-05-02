package ru.samsung.itschool.mdev;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        InputStream b_in = new ByteArrayInputStream(resultArray);
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(
                    "C:\\filename.bin"));
            dos.write(resultArray);
            AudioFormat format = new AudioFormat(8000f, 16, 1, true, false);
            AudioInputStream stream = new AudioInputStream(b_in, format,
                    resultArray.length);
            File file = new File("C:\\file.wav");
            AudioSystem.write(stream, AudioFileFormat.Type.WAVE, file);
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd_hh:mm:ss");
            new Date();

        } catch (Exception e) {

        }
    }
}
