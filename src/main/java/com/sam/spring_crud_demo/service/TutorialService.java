//package com.sam.spring_crud_demo.service;
//
//
//import com.sam.spring_crud_demo.TutorialRepository;
//import com.sam.spring_crud_demo.model.Tutorials;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class TutorialService {
//
//    @Autowired
//    private TutorialRepository tutorialRepository;
//
//    public List<Tutorials> getAllTutorials() {
//        List<Tutorials> tutorials = new ArrayList<Tutorials>();
//        tutorialRepository.findAll().forEach(tutorials::add);
//        return tutorials;
//    }
//
//    public Optional<Tutorials> getTutorialById(Long id) {
//        return  tutorialRepository.findById(id);
//    }
//
//    public void addTutorial(Tutorials tutorial) {
//        tutorialRepository.save(tutorial);
//    }
//
//    public void updateTutorial(long id, Tutorials tutorial) {
//        Optional<Tutorials> tutorialData = tutorialRepository.findById(id);
//
//        if (tutorialData.isPresent()) {
//            Tutorials _tutorial = tutorialData.get();
//            _tutorial.setTitle(tutorial.getTitle());
//            _tutorial.setDescription(tutorial.getDescription());
//            _tutorial.setPublished(tutorial.isPublished());
//            tutorialRepository.save(_tutorial);
//        }
//    }
//
//    public void deleteTutorial(long id) {
//        tutorialRepository.deleteById(id);
//    }
//
//    public void deleteAllTutorials() {
//        tutorialRepository.deleteAll();
//    }
//
//    public ResponseEntity<List<Tutorials>> findByPublished() {
//        try {
//            List<Tutorials> tutorials = tutorialRepository.findByPublished(true);
//            if (tutorials.isEmpty()) {
//                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//            }
//            return new ResponseEntity<>(tutorials, HttpStatus.OK);
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//}
//
