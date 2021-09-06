import model.Channel;
import model.Program;
import modul.Tasks;
import utils.FileHandler;

import java.io.IOException;
import java.util.*;

public class Tv {

    public static void main(String[] args) {

        Map<String, Program> programMap = new HashMap<>();

        List<Channel> channelList = new ArrayList<>();

        try {
            for (String[] data : FileHandler.getDataFromFile("programmes.txt")) {
                Program program = new Program(data);
                programMap.put(program.getCode(), program);
            }

            for (String[] data : FileHandler.getDataFromFile("channels.txt")) {
                Channel channel = new Channel(data, programMap);
                channelList.add(channel);
            }

            Tasks.bubbleSort(channelList);

            printList(Tasks.maxFinder(channelList));
            System.out.println("--------------------------------------");
            printList(Tasks.minFinder(channelList));

            System.out.println("-----------------------------------------");

            List<Program> programList = new ArrayList<>();
            for(Program program : programMap.values()) {
                programList.add(program);
            }

            Tasks.bubbleSortProgram(programList);

            printListProgram(Tasks.maxFinderProgram(programList));
            System.out.println("----------------------------------");
            printListProgram(Tasks.minFinderProgram(programList));
            System.out.println("----------------------------------");
            printListProgram(Tasks.otosFeladat(programList, 1));
            System.out.println("-------------------------------------");
            System.out.println(Tasks.hatosFeladat(channelList));
            System.out.println("--------------------------------------");
            System.out.println(Tasks.hetesFeladat(channelList.get(5) ));
            System.out.println(".......................................");
            setPrint(Tasks.nyolcasFeladat(channelList.get(10)));
            System.out.println("-----------------------------------------");
            printList(Tasks.kilencesFeladat(programList.get(8), channelList));
            System.out.println("------------------------------------------");
            System.out.println("18 limits films are: "+Tasks.tizesFeladat(programList).size());


        } catch (IOException e) {
            System.out.println("Nincs ilyen file");
        }

    }

    public static void printList(List<Channel> list) {
        for (Channel element : list){
            System.out.println(element.getName() + " has " + element.getProgramList().size() + " program.");
        }
    }
    public static void printListProgram(List<Program> list) {
        for (Program element : list){
            System.out.println(element.getTitle() + " is contained on " + element.getOccurrences() + " channel(s).");
        }
    }
    public static void setPrint(Set<Program> programs) {
        for(Program program : programs) {
            System.out.println(program.getTitle() + " " + program.getGenre() + " " + program.getAgeLimit());
        }
    }


}
