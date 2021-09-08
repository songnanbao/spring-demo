package songnan.bao.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import songnan.bao.demo.entity.Course;
import songnan.bao.demo.service.CourseService;

@Api(tags="Course Management")
@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @ApiOperation("Get all Courses")
    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<?> getAllCourses() {
        return ResponseEntity.ok().body(courseService.getAll());
    }

    @ApiOperation("Get one Course by ID")
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<?> getCourseById(@PathVariable int id) {
        return ResponseEntity.ok().body(courseService.getById(id));
    }

    @ApiOperation("Save or update one Course by JSON input")
    @PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<?> save(@RequestBody Course course) {
        return ResponseEntity.ok().body(courseService.save(course));
    }
}
