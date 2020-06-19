package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    // responds to requests at the root
    @GetMapping
    @ResponseBody
    public String root() {
        return
                "<html>" +
                    "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>These are the skills we will be looking at</h2>" +
                        "<ol>" +
                            "<li>JavaScript</li>" +
                            "<li>HTML</li>" +
                            "<li>CSS</li>" +
                            "<li>Java</li>" +
                        "</ol>" +
                    "</body>" +
                "</html>";
    }

    @PostMapping(value = "hello")
    @ResponseBody
    public String hello(@RequestParam String coder, String lang1, String lang2, String lang3) {
        return    "<html>" +
                        "<body>" +
                            "<h1>" + coder + "</h1>" +
                            "<ol>" +
                                "<li>" + lang1 + "</li>" +
                                "<li>" + lang2 + "</li>" +
                                "<li>" + lang3 + "</li>" +
                            "</ol>" +
                        "</body>" +
                    "</html>";
    }

    // responds to requests at /form
    @GetMapping("form")
    @ResponseBody
    public String form() {
        return "<html>" +
                    "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>What are YOUR favorite computer languages?</h2>" +
                        "<form method = 'post' action = '/hello'>" +
                            "<label for = 'coder'>Name: </label><br/>" +
                            "<input type = 'text' name = 'coder' id = 'coder' /><br/>" +
                            "<label for = 'lang1'>Choose your favorite language: </label><br/>" +
                            "<select name = 'lang1' id = 'lang1'>" +
                                "<option value=''>--Please choose an option--</option>" +
                                "<option value='javaScript'>JavaScript</option>" +
                                "<option value='html'>HTML</option>" +
                                "<option value='css'>CSS</option>" +
                                "<option value='java'>Java</option>" +
                            "</select><br/>" +
                            "<label for = 'lang2'>Choose your second favorite language: </label><br/>" +
                            "<select name = 'lang2' id = 'lang2'>" +
                                "<option value=''>--Please choose an option--</option>" +
                                "<option value='javaScript'>JavaScript</option>" +
                                "<option value='html'>HTML</option>" +
                                "<option value='css'>CSS</option>" +
                                "<option value='java'>Java</option>" +
                            "</select><br/>" +
                            "<label for = 'lang3'>Choose your third favorite language: </label><br/>" +
                            "<select name = 'lang3' id = 'lang3'>" +
                                "<option value=''>--Please choose an option--</option>" +
                                "<option value='javaScript'>JavaScript</option>" +
                                "<option value='html'>HTML</option>" +
                                "<option value='css'>CSS</option>" +
                                "<option value='java'>Java</option>" +
                            "</select><br/>" +
                            "<input type = 'submit' value = 'Submit Choices' />" +
                        "</form>" +
                    "</body>" +
                "</html>";
    }
    
}
