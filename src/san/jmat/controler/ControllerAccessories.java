/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package san.jmat.controler;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import san.jmat.model.modelAccessories;

/**
 *
 * @author wannabe
 */
public class ControllerAccessories {

    private modelAccessories mAccessories;
    private List<String> list = new ArrayList<>();

    public ControllerAccessories() {
    }

    public modelAccessories getAccessories() {
        return mAccessories;
    }

    public void setAccessories(modelAccessories mAccessories) {
        this.mAccessories = mAccessories;
    }

    public boolean getCekCalc() {
        boolean cek = false;
        File file;
        file = new File("C:\\Windows\\system32");
        File[] lisFiles;
        lisFiles = file.listFiles();
        for (File fl : lisFiles) {
            if (fl.toString().endsWith("calc.exe")) {
                cek = true;
                break;
            }
        }
        return cek;

    }

    public boolean getCekNotepad() {
        boolean cek = false;
        File file;
        file = new File("C:\\Windows\\system32");
        File[] lisFiles;
        lisFiles = file.listFiles();
        for (File fl : lisFiles) {
            if (fl.toString().endsWith("notepad.exe")) {
                cek = true;
                break;
            }
        }
        return cek;

    }

    public boolean getCekPaint() {
        boolean cek = false;
        File file;
        file = new File("C:\\Windows\\system32");
        File[] lisFiles;
        lisFiles = file.listFiles();
        for (File fl : lisFiles) {
            if (fl.toString().endsWith("mspaint.exe")) {
                cek = true;
                break;
            }
        }
        return cek;

    }

    public boolean getCekMath() {
        boolean cek = false;
        File file;
        file = new File("C:\\Program Files\\Common Files\\Microsoft Shared\\Ink");
        File[] lisFiles;
        lisFiles = file.listFiles();
        for (File fl : lisFiles) {
            if (fl.toString().endsWith("mip.exe")) {
                cek = true;
                list.add(fl.toString());
                break;
            }
        }
        return cek;

    }

    public boolean getCekWordPad() {
        boolean cek = false;
        File file;
        file = new File("C:\\Program Files\\Windows NT\\Accessories");
        File[] lisFiles;
        lisFiles = file.listFiles();
        for (File fl : lisFiles) {
            if (fl.toString().endsWith("wordpad.exe")) {
                cek = true;
                list.add(fl.toString());
                break;
            }
        }
        return cek;

    }

    public boolean getCekNotes() {
        boolean cek = false;
        File file;
        file = new File("C:\\Windows\\system32");
        File[] lisFiles;
        lisFiles = file.listFiles();
        for (File fl : lisFiles) {
            if (fl.toString().endsWith("StikyNot.exe")) {
                cek = true;
                break;
            }
        }
        return cek;

    }

    public boolean getCekRecorder() {
        boolean cek = false;
        File file;
        file = new File("C:\\Windows\\system32");
        File[] lisFiles;
        lisFiles = file.listFiles();
        for (File fl : lisFiles) {
            if (fl.toString().endsWith("SoundRecorder.exe")) {
                cek = true;
                break;
            }
        }
        return cek;

    }

    public void runAplSystem32(String apl) {
        File file;
        file = new File("C:\\Windows\\system32");
        File[] lisFiles;
        lisFiles = file.listFiles();
        for (File fl : lisFiles) {
            if (fl.toString().endsWith(apl)) {
                mAccessories.setUrlDir(fl.toString());
                break;
            }
        }
    }

    public void runApl(String apl) {
        for(String st:list){
            if(st.toString().endsWith(apl)){
                mAccessories.setUrlDir(st);
                break;
            }
        }
    }
}
