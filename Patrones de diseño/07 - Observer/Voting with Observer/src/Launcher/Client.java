package Launcher;
/**
 * @author Victor Lavalle
 */
import Pattern.*;
import View.*;

public class Client {

 public static void main(String[] args) {
 String[] part = {"Discord", "Teams", "Zoom"};
 CaptureVotes demo = new CaptureVotes(part);
 BarsFRM b = new BarsFRM();
 CircleFRM p = new CircleFRM();
 ExcelGenerator e = new ExcelGenerator();
 demo.addObserver(b);
 demo.addObserver(p);
 demo.addObserver(e);
    }
}
