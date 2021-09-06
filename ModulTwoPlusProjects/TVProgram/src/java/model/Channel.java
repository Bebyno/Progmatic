package model;

import com.sun.net.httpserver.Filter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Channel {

        private String name;
        private boolean isFree;
        private List<Program> programList;

        public Channel(String[] data, Map<String, Program> map) {
                this.name = data[0];
                this.isFree = data[1].equals("TRUE");

                programList = new ArrayList<>();

                        String[] codeList = data[2].split(",");
                for (int i = 0; i < codeList.length; i++) {
                        programList.add(map.get(codeList[i]));
                        map.get(codeList[i]).increaseOccurrences();

                }
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public boolean isFree() {
                return isFree;
        }

        public void setFree(boolean free) {
                isFree = free;
        }

        public List<Program> getProgramList() {
                return programList;
        }

        public void setProgramList(List<Program> programList) {
                this.programList = programList;
        }

        public boolean isContainProgram(String code) {
                for(Program program : programList) {
                        if(program.getCode().equals(code)) {
                                return true;
                        }
                }

                return false;
        }
}
