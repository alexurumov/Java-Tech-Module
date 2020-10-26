package softuni.bandregister.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import softuni.bandregister.bindingModels.BandBindingModel;
import softuni.bandregister.entities.Band;
import softuni.bandregister.repositories.BandRepository;

import java.util.List;

@Controller
public class BandController {
    private final BandRepository bandRepository;

    @Autowired
    public BandController(BandRepository bandRepository) {
        this.bandRepository = bandRepository;
    }


    @GetMapping("/")
    public ModelAndView index(ModelAndView modelAndView) {

        List<Band> bands = this.bandRepository.findAll();
        modelAndView.addObject("bands", bands);
        modelAndView.addObject("view", "band/index");
        modelAndView.setViewName("base-layout");

        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView create(ModelAndView modelAndView) {

        modelAndView.addObject("view", "band/create");
        modelAndView.setViewName("base-layout");

        return modelAndView;
    }

    @PostMapping("/create")
    public String create(Band band) {

        this.bandRepository.saveAndFlush(band);

        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(ModelAndView modelAndView,
                             @PathVariable(value = "id") Integer id) {

        Band bandToEdit = this.bandRepository.getOne(id);

        modelAndView.addObject("band", bandToEdit);
        modelAndView.addObject("view", "band/edit");
        modelAndView.setViewName("base-layout");

        return modelAndView;
    }

    @PostMapping("/edit/{id}")
    public String edit(@PathVariable(value = "id") Integer id, BandBindingModel bandBindingModel) {

        Band bandFromDb = this.bandRepository.getOne(id);
        bandFromDb.setName(bandBindingModel.getName());
        bandFromDb.setMembers(bandBindingModel.getMembers());
        bandFromDb.setHonorarium(bandBindingModel.getHonorarium());
        bandFromDb.setGenre(bandBindingModel.getGenre());

        bandRepository.saveAndFlush(bandFromDb);

        return "redirect:/";
    }
    @GetMapping("/delete/{id}")
    public ModelAndView delete(ModelAndView modelAndView,
                             @PathVariable(value = "id") Integer id) {

        Band bandToDelete = this.bandRepository.getOne(id);

        modelAndView.addObject("band", bandToDelete);
        modelAndView.addObject("view", "band/delete");
        modelAndView.setViewName("base-layout");

        return modelAndView;
    }

    @PostMapping("/delete/{id}")
    public String delete(Band band) {

        bandRepository.delete(band);

        return "redirect:/";
    }
}
