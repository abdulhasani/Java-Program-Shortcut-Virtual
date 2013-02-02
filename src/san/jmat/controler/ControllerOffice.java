/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package san.jmat.controler;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;
import san.jmat.model.Office;
import san.jmat.view.render.panel.pack.MenuDesktop;
import san.jmat.view.render.panel.pack.officePack;

/**
 *
 * @author wannabe
 */
public class ControllerOffice {

    private Office office;
    private List<String> list = new ArrayList<>();

    public ControllerOffice() {
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    public void deteksiOfficeMenu(MenuDesktop menuDesktop) {
        boolean DirprogramFile = DirprogramFile();
        if (DirprogramFile) {
            menuDesktop.getBtnOffice1().setVisible(true);
        } else {
            menuDesktop.getBtnOffice1().setVisible(true);
        }
    }

    public void cekekkingPackOffice(officePack pack) {
        if (DirprogramFile()) {
            File file = new File("C:\\Program Files\\Microsoft Office\\Office12");
            File[] listFiles = file.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File file, String string) {
                    if (string.toLowerCase().endsWith(".exe")) {
                        return true;
                    }
                    return false;
                }
            });
            for (File fl : listFiles) {
                if (fl.toString().toLowerCase().endsWith("winword.exe")) {
                    pack.getBtnWord().setVisible(true);
                    pack.getMenuWord().setVisible(true);
                    list.add(fl.toString());
                    continue;
                }
                if (fl.toString().toLowerCase().endsWith("excel.exe")) {
                    pack.getBtnExcel().setVisible(true);
                    pack.getMenuExcel().setVisible(true);
                    list.add(fl.toString());
                    continue;
                }
                if (fl.toString().toLowerCase().endsWith("powerpnt.exe")) {
                    pack.getBtnPowerPnt().setVisible(true);
                    pack.getMenuPowerPnt().setVisible(true);
                    list.add(fl.toString());
                    continue;
                }
                if (fl.toString().toLowerCase().endsWith("msaccess.exe")) {
                    pack.getBtnAccsess().setVisible(true);
                    pack.getMenuAccess().setVisible(true);
                    list.add(fl.toString());
                    continue;
                }
                if (fl.toString().toLowerCase().endsWith("mspub.exe")) {
                    pack.getBtnPublisher().setVisible(true);
                    pack.getMenuPublisher().setVisible(true);
                    list.add(fl.toString());
                    continue;
                }
                if (fl.toString().toLowerCase().endsWith("outlook.exe")) {
                    pack.getBtnOutlook().setVisible(true);
                    pack.getMenuOutLook().setVisible(true);
                    list.add(fl.toString());
                    continue;
                }
                if (fl.toString().toLowerCase().endsWith("infopath.exe")) {
                    pack.getBtnInfoPath().setVisible(true);
                    pack.getMenuInfoPath().setVisible(true);
                    list.add(fl.toString());
                    continue;
                }
                if (fl.toString().toLowerCase().endsWith("onenote.exe")) {
                    pack.getBtnNote().setVisible(true);
                    pack.getMenuNote().setVisible(true);
                    list.add(fl.toString());
                    continue;
                }
                if (fl.toString().toLowerCase().endsWith("groove.exe")) {
                    pack.getBtnGroove().setVisible(true);
                    pack.getMenuGroove().setVisible(true);
                    list.add(fl.toString());
                    continue;
                }
            }
        }
    }

    public void runOffice(officePack pack) {
        for (String path : list) {
            if (path.toLowerCase().endsWith(pack.getOpenOffice())) {
                office.setUrlDir(path);
                break;
            } else {
                continue;
            }
        }
    }

    private boolean DirprogramFile() {
        boolean deteksiDir = false;
        File file;
        file = new File("C:\\Program Files");
        File[] listFiles;
        listFiles = file.listFiles();
        for (File fl : listFiles) {
            if (fl.toString().endsWith("Microsoft Office")) {
                File cekdirOffice12 = new File(fl.toString());
                File[] hasilcek;
                hasilcek = cekdirOffice12.listFiles();
                for (File loop1 : hasilcek) {
                    if (loop1.toString().endsWith("Office12")) {
                        deteksiDir = true;
                        break;
                    }
                }
                break;
            }
        }
        return deteksiDir;
    }
}
