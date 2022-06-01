package lt.viko.eif.bstonkute.rest.controller;

import lt.viko.eif.bstonkute.rest.dao.ProjectDao;
import lt.viko.eif.bstonkute.rest.model.Project;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * REST controller.
 *
 * @author Brigita Stonkutė
 */
@RestController
@RequestMapping("/projects")
public class ProjectController {

    /**
     * GET operation, returns all projects.
     *
     * @return all projects
     */
    @GetMapping
    public List<Project> fetchProjects() {
        return ProjectDao.daoFetchProjects();
    }

    /**
     * GET operation, returns a single project fetched by character name.
     *
     * @param name name of character
     * @return project of the specified character
     */
    @GetMapping("/{name}")
    public ResponseEntity<Project> fetchProjectByName(@PathVariable String name) {
        Project project = ProjectDao.daoFetchProjectByName(name);
        if (project == null) {
            return new ResponseEntity<Project>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Project>(project, HttpStatus.OK);
    }

    /**
     * POST operation, adds a new project to the repository.
     *
     * @param project project to be added
     * @return added project
     */
    @PostMapping
    public ResponseEntity<Project> newProject(@RequestBody Project project) {
        return new ResponseEntity<Project>(ProjectDao.daoAddProject(project), HttpStatus.CREATED);
    }

    /**
     * PUT operation, updates an existing project.
     *
     * @param name    character name of the target project
     * @param project project with the new data
     * @return updated project
     */
    @PutMapping("/{name}")
    public ResponseEntity<Project> updateProject(@PathVariable String name, @RequestBody Project project) {
        return new ResponseEntity<Project>(ProjectDao.daoUpdateProject(name, project), HttpStatus.OK);
    }

    /**
     * DELETE operation, deletes an existing project.
     *
     * @param name character name of the target project
     * @return string describing the success of the operation
     */
    @DeleteMapping("/{name}")
    public ResponseEntity<String> deleteProject(@PathVariable String name) {
        if (ProjectDao.daoDeleteProject(name))
            return new ResponseEntity<String>("Project deleted successfully.", HttpStatus.OK);
        else
            return new ResponseEntity<String>("Project not found.", HttpStatus.NOT_FOUND);
    }
}
