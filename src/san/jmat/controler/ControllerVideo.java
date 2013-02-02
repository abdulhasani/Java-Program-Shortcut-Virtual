/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package san.jmat.controler;

import java.io.File;
import java.util.HashSet;
import san.jmat.model.modelVideo;
import san.jmat.view.render.panel.pack.Video;

/**
 *
 * @author wannabe
 */
public class ControllerVideo {

    private modelVideo mVideo;
    private HashSet<String> hashSet = new HashSet<>();

    public ControllerVideo() {
    }

    public ControllerVideo(Video video) {
        cekDirectory(video);
    }

    public modelVideo getmVideo() {
        return mVideo;
    }

    public void setmVideo(modelVideo mVideo) {
        this.mVideo = mVideo;
    }

    private void cekDirectory(Video video) {
        File file;
        file = new File("C:\\Program Files");
        File[] listFiles = file.listFiles();
        for (File fl : listFiles) {
            if (fl.toString().endsWith("Windows Media Player")) {
                video.getButtonMDP().setVisible(true);
                video.getMenuWindowsMediaPlayer().setVisible(true);
                hashSet.add(fl.toString());
                continue;
            }
            if (fl.toString().endsWith("GRETECH")) {
                video.getButtonGOM().setVisible(true);
                video.getMenuGOM().setVisible(true);
                hashSet.add(fl.toString());
                continue;
            }
            if (fl.toString().endsWith("K-Lite Codec Pack")) {
                video.getButtonMPC().setVisible(true);
                video.getMenuMPC().setVisible(true);
                hashSet.add(fl.toString());
                continue;
            }
        }
    }

    public void Run(String apl) {
        File file;
        File[] listFiles;
        for (String st : hashSet) {
            file = new File(st);
            listFiles = file.listFiles();
            for (File fl : listFiles) {
                if (fl.toString().endsWith(apl)) {
                    mVideo.setUrlDir(fl.toString());
                    break;
                } 
                else if (apl.equalsIgnoreCase("C:\\Program Files\\GRETECH\\GomPlayer\\GOM.exe")) {
                    mVideo.setUrlDir(apl);
                    break;
                }
                else if(apl.equalsIgnoreCase("C:\\Program Files\\K-Lite Codec Pack\\Media Player Classic\\mplayerc.exe")){
                    mVideo.setUrlDir(apl);
                    break;
                }
               
            }
        }
    }
}
