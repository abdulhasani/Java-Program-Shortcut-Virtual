/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package san.jmat.controler;

import san.jmat.model.Office;
import san.jmat.model.windowsDefaultAplikasi;
import san.jmat.view.render.panel.pack.MenuDesktop;

/**
 *
 * @author wannabe
 */
public class ControllerExplorer {
    private windowsDefaultAplikasi wDefaultAplikasi;

    public windowsDefaultAplikasi getwDefaultAplikasi() {
        return wDefaultAplikasi;
    }

    public void setwDefaultAplikasi(windowsDefaultAplikasi wDefaultAplikasi) {
        this.wDefaultAplikasi = wDefaultAplikasi;
    }
    
    
    public void runExplorer(MenuDesktop menuDesktop){
        wDefaultAplikasi.setUrlDir("explorer");
    }
}
