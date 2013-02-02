/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package san.jmat.controler;

import java.io.File;
import san.jmat.model.ModelIDE;
import san.jmat.view.render.panel.pack.IDE;

/**
 *
 * @author wannabe
 */
public class ControllerIDE {
    private ModelIDE modelIDE;

    public ControllerIDE() {
    }

    public ControllerIDE(IDE ide) {
        cekDirectory(ide);
    }

    public ModelIDE getModelIDE() {
        return modelIDE;
    }

    public void setModelIDE(ModelIDE modelIDE) {
        this.modelIDE = modelIDE;
    }
    
    private void cekDirectory(IDE ide){
        File file;
        file=new File("C:\\Program Files");
        File[] listFiles = file.listFiles();
        for(File fl:listFiles){
            if(fl.toString().endsWith("NetBeans 7.2")){
                ide.getButtonNetbeans().setVisible(true);
                ide.getMenuNetbeans().setVisible(true);
            }
        }
    }
    
    public void Run (String apl){
        if(apl.equalsIgnoreCase("C:\\Program Files\\NetBeans 7.2\\bin\\netbeans.exe")){
            modelIDE.setUrlDir(apl);
        }
    }
}
