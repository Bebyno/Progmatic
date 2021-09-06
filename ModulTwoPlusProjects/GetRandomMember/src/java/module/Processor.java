package module;

import model.Member;
import util.DocumentReader;

import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Processor {

    public static void run() {
        try {
            List<Member> members = DocumentReader.loadMembers();
            Scanner sc = new Scanner(System.in);
            int res = 1;
            boolean hasMorePresenter = true;
            while (res == 1 && hasMorePresenter) {
                System.out.println("Get new random presenter (1) or exit (0)");
                res = sc.nextInt();
                hasMorePresenter = getRandomMember(members);
            }
            System.out.println("");
        } catch (IOException e) {
            System.out.println("Error occured during loading member list, exiting");
        }
    }

    private static boolean getRandomMember(List<Member> members) {
        int rnd = getRandom(members.size());
        if (!members.get(rnd).isPresented()) {
            System.out.println(members.get(rnd).getName());
            members.get(rnd).setPresented(true);
        } else {
            if (hasPresenter(members)) {
                getRandomMember(members);
            } else {
                System.out.println("Everyone presented today!");
                return false;
            }
        }
        return true;
    }

    private static boolean hasPresenter(List<Member> members) {
        for (Member member : members) {
            if (!member.isPresented())
                return true;
        }
        return false;
    }

    private static int getRandom(int size) {
        Random rnd = new Random();
        return rnd.nextInt(size);
    }
}
