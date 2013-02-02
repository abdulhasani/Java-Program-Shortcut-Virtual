/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package san.jmat.controler;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import san.jmat.model.WebBrowser;
import san.jmat.view.render.panel.pack.Browser;

/**
 *
 * @author wannabe
 */
public class ControllerWebBrowser {

    private WebBrowser webBrowser;
    private List<String> list = new ArrayList<>();

    public WebBrowser getWebBrowser() {
        return webBrowser;
    }

    public void setWebBrowser(WebBrowser webBrowser) {
        this.webBrowser = webBrowser;
    }

    private boolean cekkingDirektoriIE() {
        boolean hasilDeteksi = false;
        File file;
        file = new File("C:\\Program Files");
        File[] listFiles;
        listFiles = file.listFiles();
        for (File fl : listFiles) {
            if (fl.toString().endsWith("Internet Explorer")) {
                hasilDeteksi = true;
                break;
            }
        }
        return hasilDeteksi;
    }

    private boolean cekkingDirektoriFirefox() {
        boolean hasilDeteksi = false;
        File file;
        file = new File("C:\\Program Files");
        File[] listFiles;
        listFiles = file.listFiles();
        for (File fl : listFiles) {
            if (fl.toString().endsWith("Mozilla Firefox")) {
                hasilDeteksi = true;
                break;
            }
        }
        return hasilDeteksi;
    }

    private boolean cekkingDirektoriSafari() {
        boolean hasilDeteksi = false;
        File file;
        file = new File("C:\\Program Files");
        File[] listFiles;
        listFiles = file.listFiles();
        for (File fl : listFiles) {
            if (fl.toString().endsWith("Safari")) {
                hasilDeteksi = true;
                break;
            }
        }
        return hasilDeteksi;
    }

    public void cekkingFileExe(Browser browser) {

        File file;
        boolean cekkingDirektoriIE;
        boolean cekkingDirektoriFirefox;
        boolean cekkingDirektoriSafari;
        cekkingDirektoriIE = cekkingDirektoriIE();
        cekkingDirektoriFirefox = cekkingDirektoriFirefox();
        cekkingDirektoriSafari = cekkingDirektoriSafari();
        if (cekkingDirektoriIE) {
            file = new File("C:\\Program Files\\Internet Explorer");
            File[] listFiles;
            listFiles = file.listFiles();
            for (File fl : listFiles) {
                if (fl.toString().toLowerCase().endsWith("iexplore.exe")) {
                    browser.getBtnInternetEplorer().setVisible(true);
                    list.add(fl.toString());
                    continue;
                }
            }
        }
        if (cekkingDirektoriFirefox) {
            file = new File("C:\\Program Files\\Mozilla Firefox");
            File[] listFiles;
            listFiles = file.listFiles();
            for (File fl : listFiles) {
                if (fl.toString().toLowerCase().endsWith("firefox.exe")) {
                    browser.getBtnFirefox().setVisible(true);
                    list.add(fl.toString());
                    continue;
                }
            }
        }
        if (cekkingDirektoriSafari) {
            file = new File("C:\\Program Files\\Safari");
            File[] listFiles;
            listFiles = file.listFiles();
            for (File fl : listFiles) {
                if(fl.toString().toLowerCase().endsWith("safari.exe")){
                    browser.getBtnSafari().setVisible(true);
                    list.add(fl.toString());
                    continue;
                }
            }
        }

    }

    public void runBrowser(Browser browser) {
        for (String run : list) {

            if (run.toLowerCase().endsWith(browser.getRun())) {
                webBrowser.setUrlDir(run);
                break;
            } else {
                continue;
            }


        }
    }
}
