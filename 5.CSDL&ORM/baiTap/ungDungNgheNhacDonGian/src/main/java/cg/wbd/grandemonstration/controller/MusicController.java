package cg.wbd.grandemonstration.controller;


import cg.wbd.grandemonstration.Music;
import cg.wbd.grandemonstration.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("music")
public class MusicController {

    @Autowired
    private IMusicService musicService;

    @GetMapping
    public ModelAndView showListMusic() {
        ModelAndView modelAndView = new ModelAndView("music/list");
        List<Music> musicList = musicService.findAll();
        modelAndView.addObject("music", musicList);
        return modelAndView;

    }
}
