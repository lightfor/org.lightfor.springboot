package org.lightfor.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * 控制器
 * Created by Light on 2017/5/13.
 */
@Controller
@RequestMapping("/")
public class ReadingListController {
    private ReadingListRepository readingListRepository;

    private AmazonProperties amazonProperties;

    @Autowired
    public ReadingListController(ReadingListRepository readingListRepository, AmazonProperties amazonProperties) {
        this.readingListRepository = readingListRepository;
        this.amazonProperties = amazonProperties;
    }


    @RequestMapping(value = "/{reader}", method = RequestMethod.GET)
    public String reader(@PathVariable String reader, Model model){
        List<Book> readingList = readingListRepository.findByReader(reader);
        if (readingList != null) {
            model.addAttribute("books", readingList);
            model.addAttribute("reader", reader);
            model.addAttribute("amazonID", amazonProperties.getAssociateId());
        }
        return "readingList";
    }

    @RequestMapping( value = "/{reader}", method = RequestMethod.POST)
    public String addToReadingList(@PathVariable("reader") String reader, Book book){
        book.setReader(reader);
        readingListRepository.save(book);
        return "redirect:/{reader}";
    }
}
