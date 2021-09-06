package util;

import model.Member;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DocumentReader {

    public static List<Member> loadMembers() throws IOException {
        String path = "src/resources/members.txt";
        List<Member> members = new ArrayList<>();

        Stream<String> stream = Files.lines(Paths.get(path));
        stream.forEach(line -> {
            if (!line.contains("#"))
                members.add(new Member(line));
        });
        System.out.println(members.size() + " member loaded!");

        return members;
    }
}
