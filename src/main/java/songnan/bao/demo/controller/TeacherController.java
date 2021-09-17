package songnan.bao.demo.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import songnan.bao.demo.entity.Teacher;
import songnan.bao.demo.service.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @ApiOperation("Find all Teachers")
    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllTeachers() {
        return ResponseEntity.ok().body(teacherService.getAll());
    }

    @ApiOperation("Find one Teacher by ID")
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getTeacherById(@PathVariable int id) {
        return ResponseEntity.ok().body(teacherService.getById(id));
    }

    @ApiOperation("Save or update one Teacher by JSON input")
    @PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> save(@RequestBody Teacher teacher) {
        return ResponseEntity.ok().body(teacherService.save(teacher));
    }
}
 