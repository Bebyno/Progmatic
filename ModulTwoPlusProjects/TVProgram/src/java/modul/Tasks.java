package modul;

import model.Channel;
import model.Genre;
import model.Program;

import java.util.*;

public class Tasks {

    /**
     * 1.	Melyik csatorna (vagy csatornák) adja (vagy adják) a legtöbb műsort?
     * 2.	És melyik (vagy melyek) a legkevesebbet?
     */

    public static void bubbleSort(List<Channel> channelList) {
        for (int maxIndex = channelList.size() - 1; maxIndex >= 0; maxIndex--) {
            for (int i = 0; i < maxIndex; i++) {
                if (channelList.get(i).getProgramList().size() > channelList.get(i + 1).getProgramList().size()) {
                    Channel temp = channelList.get(i);
                    channelList.set(i, channelList.get(i + 1));
                    channelList.set(i + 1, temp);
                }
            }

        }
    }

    public static List<Channel> maxFinder(List<Channel> sortedList) {
        List<Channel> result = new ArrayList<>();
        int i = sortedList.size() - 1;
        while (i >= 0 && sortedList.get(i).getProgramList().size() == sortedList.get(sortedList.size() - 1).getProgramList().size()) {
            result.add(sortedList.get(i));
            i--;
        }
        return result;
    }

    public static List<Channel> minFinder(List<Channel> sortedList) {
        List<Channel> minResult = new ArrayList<>();
        int i = 0;
        while (i < sortedList.size() && sortedList.get(i).getProgramList().size() == sortedList.get(0).getProgramList().size()) {
            minResult.add(sortedList.get(i));
            i++;
        }
        return minResult;
    }

    public static void bubbleSortProgram(List<Program> programList) {
        for (int maxIndex = programList.size() - 1; maxIndex >= 0; maxIndex--) {
            for (int i = 0; i < maxIndex; i++) {
                if (programList.get(i).getOccurrences() > programList.get(i + 1).getOccurrences()) {
                    Program temp = programList.get(i);
                    programList.set(i, programList.get(i + 1));
                    programList.set(i + 1, temp);
                }
            }

        }
    }

    public static List<Program> maxFinderProgram(List<Program> sortedList) {
        List<Program> result = new ArrayList<>();
        int i = sortedList.size() - 1;
        while (i >= 0 && sortedList.get(i).getOccurrences() == sortedList.get(sortedList.size() - 1).getOccurrences()) {
            result.add(sortedList.get(i));
            i--;
        }
        return result;
    }

    public static List<Program> minFinderProgram(List<Program> sortedList) {
        List<Program> minResult = new ArrayList<>();
        int i = 0;
        while (i < sortedList.size() && sortedList.get(i).getOccurrences() == sortedList.get(0).getOccurrences()) {
            minResult.add(sortedList.get(i));
            i++;
        }
        return minResult;
    }

    public static List<Program> otosFeladat(List<Program> simaList, int occurrences) {
        List<Program> oneResult = new ArrayList<>();
        for (Program simaElem : simaList) {
            if (simaElem.getOccurrences() == occurrences) {
                oneResult.add(simaElem);
            }
        }
        return oneResult;
    }

    public static double hatosFeladat(List<Channel> channels) {
        double result = 0;
        for(Channel channel : channels) {
            result += channel.getProgramList().size();
        }
        return result / channels.size();
    }

    public static int hetesFeladat(Channel channel) {
        Set<Genre> genreSet = new HashSet<>();
        for(Program program : channel.getProgramList()) {
            genreSet.add(program.getGenre());
        }
        System.out.print(channel.getName() + ": ");
            return genreSet.size();
    }

    public static Set<Program> nyolcasFeladat(Channel channel) {
        Set<Program> programSet = new HashSet<>();
        for(Program program : channel.getProgramList()) {
            programSet.add(program);
        }
        return programSet;
    }

    public static List<Channel> kilencesFeladat(Program program, List<Channel> channelList) {
        List<Channel> whichChannel = new ArrayList<>();
        for(Channel channel : channelList) {
            if(channel.isContainProgram(program.getCode())) {
                whichChannel.add(channel);
            }
        }
        return whichChannel;
    }

    public static Set<Program> tizesFeladat(List<Program> temporary) {
        Set<Program> programSet = new HashSet<>();
        for(Program program : temporary) {
            if(program.getAgeLimit() == 18) {
              programSet.add(program);
            }
        }
        return programSet;
    }

}


