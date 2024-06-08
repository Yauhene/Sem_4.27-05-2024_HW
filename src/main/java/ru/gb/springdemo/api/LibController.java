package ru.gb.springdemo.api;


import lombok.extern.slf4j.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;
import ru.gb.springdemo.model.*;
import ru.gb.springdemo.repository.*;

import java.util.*;

@Slf4j
@Controller
public class LibController {

    @RequestMapping("/ui/library")
        public String library() {
        return "library";
    }

    @GetMapping("/ui/books")
        public String books(Model model) {
            List<Book> bList = BookRepository.getAll();
            model.addAttribute("books", bList);
        return "books";
        }

    @GetMapping("/ui/readers")
    public String readers(Model model) {
        List<Reader> rList = ReaderRepository.getReaders();
        model.addAttribute("readers", rList);
        return "readers";
    }

    @GetMapping("/ui/issues")
    public String issues(Model model) {
        List<Issue> iList = IssueRepository.getAll();
        model.addAttribute("issues", iList);
        return "issues";
    }
}
