package com.example.task05;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Task05Main {
    public static void main(String[] args) {
        String randomFrom = "Спасибо составителям курса!";
        String randomTo = "Это было здорово:)";
        int randomSalary = 196;
        Message firstMessage = new Message("Robert Howard", "H.P. Lovecraft",
                "This \"The Shadow over Innsmouth\" story is real masterpiece, Howard!");
        assert firstMessage.getFrom().equals("Robert Howard") : "Wrong firstMessage from address";
        assert firstMessage.getTo().equals("H.P. Lovecraft") : "Wrong firstMessage to address";
        assert firstMessage.getContent().endsWith("Howard!") : "Wrong firstMessage content ending";
        Message secondMessage = new Message("Jonathan Nolan", "Christopher Nolan",
        "Брат, почему все так хвалят только тебя, когда практически все сценарии написал я. Так не честно!");
        Message thirdMessage = new Message("Stephen Hawking", "Christopher Nolan",
                "Я так и не понял Интерстеллар.");
        List<Message> messages = Arrays.asList(firstMessage, secondMessage, thirdMessage);
        Service<String> mailService = new Service<>();
        messages.forEach(mailService);
        Map<String, List<String>> mailBox = mailService.getMailBox();
        assert mailBox.get("H.P. Lovecraft").equals(Arrays.asList(
                "This \"The Shadow over Innsmouth\" story is real masterpiece, Howard!")) :
                "wrong mailService mailbox content (1)";
        assert mailBox.get("Christopher Nolan").equals(Arrays.asList(
                "Брат, почему все так хвалят только тебя, когда практически все сценарии написал я. Так не честно!",
                "Я так и не понял Интерстеллар.")) : "wrong mailService mailbox content (2)";
        assert mailBox.get(randomTo).equals(Collections.<String>emptyList()) : "wrong mailService mailbox content (3)";
        Solver salary1 = new Solver("Facebook", "Mark Zuckerberg", 1);
        Solver salary2 = new Solver("FC Barcelona", "Lionel Messi", Integer.MAX_VALUE);
        Solver salary3 = new Solver(randomFrom, randomTo, randomSalary);
        Service<Integer> salaryService = new Service<>();
        Arrays.asList(salary1, salary2, salary3).forEach(salaryService);
        Map<String, List<Integer>> salaries = salaryService.getMailBox();
        assert salaries.get(salary1.getTo()).equals(Arrays.asList(1)) : "wrong salaries mailbox content (1)";
        assert salaries.get(salary2.getTo()).equals(Arrays.asList(Integer.MAX_VALUE)) : "wrong salaries mailbox content (2)";
        assert salaries.get(randomTo).equals(Arrays.asList(randomSalary)) : "wrong salaries mailbox content (3)";
    }
}
