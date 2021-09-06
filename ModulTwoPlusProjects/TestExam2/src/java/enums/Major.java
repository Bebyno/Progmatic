package enums;

import FileReader.MajorHelper;

import java.util.HashMap;
import java.util.Map;

public enum Major {
    anglisztika("anglisztika"),
    germanisztika("germanisztika"),
    informatikuskonyvtaros("informatikus könyvtáros"),
    japan("japán"),
    klasszikafilologia("klasszika filológia"),
    magyar("magyar"),
    skandinavisztika("skandinavisztika"),
    history("történelem");


    public final String NAME;

    Major(String name){
        this.NAME = name;


    }
}
