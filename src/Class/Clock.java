/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Admin
 */
public class Clock implements Runnable{
    JLabel time;

    public Clock(JLabel time) {
        this.time = time;
    }

    @Override
    public void run() {
      while(true){
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss aa");
        time.setText(sdf.format(now));
          try {
              Thread.sleep(1000);
          } catch (InterruptedException ex) {
             
          }
      }
    }
    
}
