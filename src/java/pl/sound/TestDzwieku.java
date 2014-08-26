

package pl.sound;

import java.io.*;
import sun.audio.*;

public class TestDzwieku {

public static void dzwiek() throws FileNotFoundException, IOException{
  {
    // open the sound file as a Java input stream
    String gongFile = "C:\\PROGRAMS\\javasounddemo-150249\\JavaSoundDemo\\audio\\1-welcome.wav";
    InputStream in = new FileInputStream(gongFile);
 
    // create an audiostream from the inputstream
    AudioStream audioStream = new AudioStream(in);
 
    // play the audio clip with the audioplayer class
    AudioPlayer.player.start(audioStream);
  }
}
}