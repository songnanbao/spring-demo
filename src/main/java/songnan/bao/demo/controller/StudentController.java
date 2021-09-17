package songnan.bao.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import songnan.bao.demo.entity.Student;
import songnan.bao.demo.service.StudentService;

@RestController
@RequestMapping("/student")
@Api(tags = "Student APIs")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @ApiOperation("Find all Students")
    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllStudents() {
        return ResponseEntity.ok().body(studentService.getAll());
    }

    @ApiOperation("Find one Student by ID")
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getStudentById(@PathVariable int id) {
        return ResponseEntity.ok().body(studentService.getById(id));
    }

    @ApiOperation("Find one Student by Firstname")
    @GetMapping(value = "/byFirstname/{firstname}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getStudentByFirstname(@PathVariable String firstname) {
        return ResponseEntity.ok().body(studentService.findByFirstname(firstname));
    }

    @ApiOperation(value = "Save or update one Student", notes = "Save or update one Student by JSON input")
    @PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> save(@RequestBody Student student) {
        return ResponseEntity.ok().body(studentService.save(student));
    }
}
