//package com.sam.spring_crud_demo.controller;
//
//
//import com.sam.spring_crud_demo.model.Tutorials;
//import com.sam.spring_crud_demo.service.TutorialService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//@RestController
//@RequestMapping("/api")
//public class TutorialController {
//
//    @Autowired
//    private TutorialService tutorialServices;
//
//    @GetMapping("/tutorials")
//    public List<Tutorials> getAllTutorials(@RequestParam(required = false) String title)          {
//        return tutorialServices.getAllTutorials();
//
//    }
//
//    @GetMapping("/tutorials/{id}")
//    public Optional<Tutorials> getTutorialById(@PathVariable("id") long id) {
//        /* The TutorialRepository provides a method findById(). This method takes the id of the  Tutorial to find. This method used to be findOne(). But since Spring data jpa 2.0 it's changed to findById().
//         */
//        return  tutorialServices.getTutorialById(id);
//    }
//    /*  To add new Tutorials is really easy. You do this by using the TutorialRepository save() method.
//     */
//    @PostMapping("/tutorials")
//    public void createTutorial(@RequestBody Tutorials tutorial) {
//        tutorialServices.addTutorial(tutorial);
//    }
//
//    // To update a tutorial record, we used the same save() and findById()
//    @PutMapping("/tutorials/{id}")
//    public void updateTutorial(@PathVariable("id") long id, @RequestBody Tutorials tutorial) {
//        Optional<Tutorials> tutorialData = tutorialServices.getTutorialById(id);
//
//        if (tutorialData.isPresent()) {
//            Tutorials _tutorial = tutorialData.get();
//            _tutorial.setTitle(tutorial.getTitle());
//            _tutorial.setDescription(tutorial.getDescription());
//            _tutorial.setPublished(tutorial.isPublished());
//            tutorialServices.addTutorial(_tutorial);
//        }
//    }
//
//    @DeleteMapping("/tutorials/{id}")
//    public void deleteTutorial(@PathVariable("id") long id) {
//        tutorialServices.deleteTutorial(id);
//    }
//    /* To delete a tutorials record, you simply use the deleteById() method provided by the tutorialRepository.
//     Then you pass in the id of the record you want to delete.
//     */
//    @DeleteMapping("/tutorials")
//    public void deleteAllTutorials() {
//
//        tutorialServices.deleteAllTutorials();
//    }
//
//    @GetMapping("/tutorials/published")
//    public ResponseEntity<List<Tutorials>> findByPublished() {
//        return tutorialServices.findByPublished();   }  }
//
