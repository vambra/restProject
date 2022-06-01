package lt.viko.eif.bstonkute.rest.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProjectTest {

    private Project project;

    @BeforeEach
    void setUp() {
        project = new Project();
    }

    @Test
    void getCharacter() {
        project.setCharacter("testChar");
        assertNotNull(project);
        assertEquals("testChar", project.getCharacter());
    }

    @Test
    void setCharacter() {
        project.setCharacter("testChar");
        assertNotNull(project);
        assertEquals("testChar", project.getCharacter());
    }

    @Test
    void getSource() {
        project.setSource("testSource");
        assertNotNull(project);
        assertEquals("testSource", project.getSource());
    }

    @Test
    void setSource() {
        project.setSource("testSource");
        assertNotNull(project);
        assertEquals("testSource", project.getSource());
    }

    @Test
    void getDueDate() {
        project.setDueDate("testDueDate");
        assertNotNull(project);
        assertEquals("testDueDate", project.getDueDate());
    }

    @Test
    void setDueDate() {
        project.setDueDate("testDueDate");
        assertNotNull(project);
        assertEquals("testDueDate", project.getDueDate());
    }

    @Test
    void getStartDate() {
        project.setStartDate("testStartDate");
        assertNotNull(project);
        assertEquals("testStartDate", project.getStartDate());
    }

    @Test
    void setStartDate() {
        project.setStartDate("testStartDate");
        assertNotNull(project);
        assertEquals("testStartDate", project.getStartDate());
    }

    @Test
    void getFinishDate() {
        project.setFinishDate("testFinishDate");
        assertNotNull(project);
        assertEquals("testFinishDate", project.getFinishDate());
    }

    @Test
    void setFinishDate() {
        project.setFinishDate("testFinishDate");
        assertNotNull(project);
        assertEquals("testFinishDate", project.getFinishDate());
    }

    @Test
    void getBudget() {
        project.setBudget(100.00f);
        assertNotNull(project);
        assertEquals(100.00f, project.getBudget());
    }

    @Test
    void setBudget() {
        project.setBudget(100.00f);
        assertNotNull(project);
        assertEquals(100.00f, project.getBudget());
    }

    @Test
    void getComponentList() {
        List<Task> taskList = new ArrayList<>();
        Task task = new Task("taskName", 10, 2, 30);
        taskList.add(task);
        List<Component> componentList = new ArrayList<>();
        Component component = new Component("compName", 40f, taskList);
        componentList.add(component);
        project.setComponentList(componentList);
        assertNotNull(project.getComponentList());
        assertEquals(componentList, project.getComponentList());
    }

    @Test
    void setComponentList() {
        List<Task> taskList = new ArrayList<>();
        Task task = new Task("taskName", 10, 2, 30);
        taskList.add(task);
        List<Component> componentList = new ArrayList<>();
        Component component = new Component("compName", 40f, taskList);
        componentList.add(component);
        project.setComponentList(componentList);
        assertNotNull(project.getComponentList());
        assertEquals(componentList, project.getComponentList());
    }

    @Test
    void getConventionList() {
        List<Competition> competitionList = new ArrayList<>();
        Competition competition = new Competition("testCategory", "testAward", "testPrize");
        competitionList.add(competition);
        List<Convention> conventionList = new ArrayList<>();
        Convention convention = new Convention("testName", "testDate", competitionList);
        conventionList.add(convention);
        project.setConventionList(conventionList);
        assertNotNull(project.getConventionList());
        assertEquals(conventionList, project.getConventionList());
    }

    @Test
    void setConventionList() {
        List<Competition> competitionList = new ArrayList<>();
        Competition competition = new Competition("testCategory", "testAward", "testPrize");
        competitionList.add(competition);
        List<Convention> conventionList = new ArrayList<>();
        Convention convention = new Convention("testName", "testDate", competitionList);
        conventionList.add(convention);
        project.setConventionList(conventionList);
        assertNotNull(project.getConventionList());
        assertEquals(conventionList, project.getConventionList());
    }
}