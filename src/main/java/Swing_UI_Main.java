import jdepend.xmlui.JDepend;

import java.io.IOException;

public class Swing_UI_Main {
    public static void main(String[] args) throws IOException {
        JDepend depend = new JDepend();
        depend.addDirectory("C:\\Project\\KienTrucPhanMem\\Library-Assistant");
        depend.analyze();
        System.out.println("DONE");
    }
}
