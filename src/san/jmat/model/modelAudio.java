/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package san.jmat.model;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wannabe
 */
public class modelAudio {

    private Runtime run = Runtime.getRuntime();
    private String urlDir;

    public void setUrlDir(String urlDir) {
        this.urlDir = urlDir;
        runAc(this.urlDir);
    }

    private void runAc(String dirUrl) {
        try {
            Process process = run.exec(dirUrl);
        } catch (IOException ex) {
            Logger.getLogger(Office.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
