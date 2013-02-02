/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package san.jmat.controler;

import java.io.File;
import java.util.HashSet;
import san.jmat.model.modelAudio;
import san.jmat.view.render.panel.pack.Audio;

/**
 *
 * @author wannabe
 */
public class ControllerAudio {
    private modelAudio modAudio;
    private HashSet<String> hashSet=new HashSet<>();

    public ControllerAudio(Audio audio) {
        cekDirectory(audio);
    }

    public modelAudio getModAudio() {
        return modAudio;
    }

    public void setModAudio(modelAudio modAudio) {
        this.modAudio = modAudio;
    }
    
    private void cekDirectory(Audio audio){
        File file;
        file = new File("C:\\Program Files");
        File[] listFiles = file.listFiles();
        for(File fl:listFiles){
            if(fl.toString().endsWith("Winamp")){
                audio.getBtnWinamp().setVisible(true);
                audio.getMenuWinamp().setVisible(true);
                hashSet.add(fl.toString());
                continue;
            }
            if(fl.toString().endsWith("AIMP2")){
               audio.getBtnAimp().setVisible(true);
               audio.getMenuAimp().setVisible(true);
               hashSet.add(fl.toString());
               continue;
            }
            if(fl.toString().endsWith("JetAudio")){
                audio.getBtnJetaudio().setVisible(true);
                audio.getMenuJetaudio().setVisible(true);
                hashSet.add(fl.toString());
                continue;
                
            }
        }
    }
    
    public void run(String apl){
        File file;
        File[] listFiles;
        for(String st:hashSet){
            file=new File(st);
            listFiles=file.listFiles();
            for(File fl:listFiles){
                if(fl.toString().endsWith(apl)){
                    modAudio.setUrlDir(fl.toString());
                    break;
                }
            }
        }
    }
}
