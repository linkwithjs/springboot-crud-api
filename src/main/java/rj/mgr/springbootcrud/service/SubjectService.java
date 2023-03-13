package rj.mgr.springbootcrud.service;

import org.springframework.stereotype.Service;
import rj.mgr.springbootcrud.bean.Subject;
import rj.mgr.springbootcrud.repository.SubjectRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectService {

    public SubjectRepository SubjectRepo;
    public List<Subject> getAllSubjects(){

        List<Subject> subjects = new ArrayList<>();
        SubjectRepo.findAll().forEach(subjects::add);
        return subjects;
    }

    public void addSubject(Subject subject) {
        SubjectRepo.save(subject);
    }

    public void updateSubject(String id, Subject subject) {
        SubjectRepo.save(subject);
    }

   public void deleteSubject(String id){
        SubjectRepo.deleteById(id);
   }

   public void getSingleSubject(String id){
    SubjectRepo.findById(id);
   }


}
