package lt.viko.eif.bstonkute.rest.controller;

import lt.viko.eif.bstonkute.rest.dao.ProjectDao;
import lt.viko.eif.bstonkute.rest.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProjectControllerTest {

    ProjectController controller = new ProjectController();
    Project project1, project2;

    @BeforeEach
    void setUp() {
        List<Project> projectList = ProjectDao.daoFetchProjects();
        while (projectList.size() > 0) {
            ProjectDao.daoDeleteProject(projectList.get(0).getCharacter());
        }
        this.project1 = new Project();
        project1.setCharacter("TestCharacter");
        project1.setSource("TestSource");
        project1.setDueDate("2021-01-01");
        project1.setStartDate("2020-02-02");
        project1.setFinishDate("2021-03-03");
        project1.setBudget(300f);
        List<Convention> conventionList1 = new ArrayList<>();
        Convention convention11 = new Convention();
        convention11.setName("UniCon");
        convention11.setDate("2021-06-06");
        conventionList1.add(convention11);
        Convention convention12 = new Convention();
        convention12.setName("GameOn");
        convention12.setDate("2022-07-07");
        conventionList1.add(convention12);
        Competition competition11 = new Competition();
        competition11.setAward("2nd");
        competition11.setCategory("Duo");
        competition11.setPrize("merchandise");
        List<Competition> competitionList1 = new ArrayList<>();
        competitionList1.add(competition11);
        convention12.setCompetitionList(competitionList1);
        project1.setConventionList(conventionList1);
        Component component11 = new Component();
        component11.setName("Head");
        component11.setCost(40f);
        Task task111 = new Task();
        task111.setName("Blueprint");
        task111.setProgress(100);
        task111.setTimeElapsedHours(6);
        task111.setTimeElapsedMinutes(30);
        Task task112 = new Task();
        task112.setName("Frame");
        task112.setProgress(90);
        task112.setTimeElapsedHours(13);
        task112.setTimeElapsedMinutes(45);
        List<Task> taskList11 = new ArrayList<>();
        taskList11.add(task111);
        taskList11.add(task112);
        component11.setTaskList(taskList11);
        Component component12 = new Component();
        component12.setName("Neck");
        component12.setCost(30f);
        Task task121 = new Task();
        task121.setName("Blueprint");
        task121.setProgress(100);
        task121.setTimeElapsedHours(6);
        task121.setTimeElapsedMinutes(30);
        Task task122 = new Task();
        task122.setName("Frame");
        task122.setProgress(100);
        task122.setTimeElapsedHours(13);
        task122.setTimeElapsedMinutes(45);
        List<Task> taskList12 = new ArrayList<>();
        taskList12.add(task121);
        taskList12.add(task122);
        component12.setTaskList(taskList12);
        Component component13 = new Component();
        component13.setName("Torso");
        component13.setCost(50f);
        component12.setName("Neck");
        component12.setCost(30f);
        Task task131 = new Task();
        task131.setName("Blueprint");
        task131.setProgress(100);
        task131.setTimeElapsedHours(6);
        task131.setTimeElapsedMinutes(30);
        Task task132 = new Task();
        task132.setName("Frame");
        task132.setProgress(100);
        task132.setTimeElapsedHours(13);
        task132.setTimeElapsedMinutes(45);
        List<Task> taskList13 = new ArrayList<>();
        taskList13.add(task131);
        taskList13.add(task132);
        component13.setTaskList(taskList13);
        List<Component> componentList1 = new ArrayList<>();
        componentList1.add(component11);
        componentList1.add(component12);
        componentList1.add(component13);
        project1.setComponentList(componentList1);
        ProjectDao.daoAddProject(project1);

        this.project2 = new Project();
        project2.setCharacter("AnotherChar");
        project2.setSource("AnotherSource");
        project2.setDueDate("2022-01-01");
        project2.setStartDate("2020-02-02");
        project2.setBudget(200f);
        ProjectDao.daoAddProject(project2);
    }

    @Test
    void fetchProjects() {
        List<Project> projects = controller.fetchProjects();
        assertNotNull(projects);
        assertEquals(2, projects.size());
        assertEquals(project1, projects.get(0));
        assertEquals(project2, projects.get(1));
    }

    @Test
    void fetchProjectByName() {
        ResponseEntity<Project> response = controller.fetchProjectByName(project1.getCharacter());
        assertNotNull(response);
        Project projectObj = response.getBody();
        assertNotNull(projectObj);
        assertEquals(project1, projectObj);
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    @Test
    void newProject() {
        Project project = new Project();
        project.setCharacter("Add Test Char");
        project.setSource("Add Test Source");
        project.setDueDate("2022-01-01");
        project.setStartDate("2020-02-02");
        project.setBudget(200f);
        ResponseEntity<Project> response = controller.newProject(project);
        assertNotNull(response);
        Project projectObj = response.getBody();
        assertNotNull(projectObj);
        assertEquals(project, projectObj);
        assertEquals(HttpStatus.CREATED, response.getStatusCode());
    }

    @Test
    void updateProject() {
        String charName = project1.getCharacter();
        project1.setCharacter("UpdateTestChar");
        project1.setSource("UpdateTestSource");
        ResponseEntity<Project> response = controller.updateProject(charName, project1);
        assertNotNull(response);
        Project projectObj = response.getBody();
        assertNotNull(projectObj);
        assertEquals(project1, projectObj);
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    @Test
    void deleteProject() {
        ResponseEntity<String> response = controller.deleteProject(project1.getCharacter());
        var projects = controller.fetchProjects();
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(1, projects.size());
        response = controller.deleteProject(project1.getCharacter());
        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
    }
}