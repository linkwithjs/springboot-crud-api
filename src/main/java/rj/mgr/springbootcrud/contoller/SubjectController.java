package rj.mgr.springbootcrud.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rj.mgr.springbootcrud.bean.Subject;
import rj.mgr.springbootcrud.service.SubjectService;

import java.util.List;

@RestController
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    @RequestMapping("/subjects")
    public List<Subject> getAllSubjects()
    {
        return subjectService.getAllSubjects();
    }

    @RequestMapping(method= RequestMethod.POST, value="/subjects")
    public void addSubject(@RequestBody Subject subject){
        subjectService.addSubject(subject);

    }

    @RequestMapping(method= RequestMethod.PUT, value="/subjects/{id}")
    public void updateSubject(@PathVariable String id, @RequestBody Subject subject){
        subjectService.updateSubject(id, subject);
    }

    @RequestMapping(method= RequestMethod.DELETE, value="subjects/{id}")
    public void deleteSubject(@PathVariable String id){
        subjectService.deleteSubject(id);
    }

    @RequestMapping(method= RequestMethod.GET, value=".subject/{id}")
    public void getSingleSubject(@PathVariable String id, @RequestBody Subject subject){
        subjectService.getSingleSubject(id);
    }

}


