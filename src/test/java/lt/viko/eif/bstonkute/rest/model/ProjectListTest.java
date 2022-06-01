package lt.viko.eif.bstonkute.rest.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProjectListTest {

    private ProjectList projectList;

    @BeforeEach
    void setUp() {
        projectList = new ProjectList();
    }

    @Test
    void getProjectList() {
        List<Task> taskList1 = new ArrayList<>();
        List<Task> taskList2 = new ArrayList<>();
        Task task1 = new Task("taskName1", 111, 112, 22);
        Task task2 = new Task("taskName2", 113, 114, 33);
        taskList1.add(task1);
        taskList2.add(task2);
        List<Component> componentList1 = new ArrayList<>();
        List<Component> componentList2 = new ArrayList<>();
        Component component1 = new Component("compName1", 30f, taskList1);
        Component component2 = new Component("compName2", 40f, taskList2);
        componentList1.add(component1);
        componentList2.add(component2);
        List<Competition> competitionList1 = new ArrayList<>();
        List<Competition> competitionList2 = new ArrayList<>();
        Competition competition1 = new Competition("testCategory1", "testAward1", "testPrize1");
        Competition competition2 = new Competition("testCategory2", "testAward2", "testPrize2");
        competitionList1.add(competition1);
        competitionList2.add(competition2);
        List<Convention> conventionList1 = new ArrayList<>();
        List<Convention> conventionList2 = new ArrayList<>();
        Convention convention1 = new Convention("testName1", "testDate1", competitionList1);
        Convention convention2 = new Convention("testName2", "testDate2", competitionList2);
        conventionList1.add(convention1);
        conventionList2.add(convention2);
        Project project1 = new Project("testChar1", "testSource1", "testDueDate1",
                "testStartDate1", "testFinishDate1",  100f, componentList1, conventionList1);
        Project project2 = new Project("testChar2", "testSource2", "testDueDate2",
                "testStartDate2", "testFinishDate2", 200f, componentList2, conventionList2);
        List<Project> projectList = new ArrayList<>();
        projectList.add(project1);
        projectList.add(project2);
        this.projectList.setProjectList(projectList);
        assertNotNull(this.projectList);
        assertNotNull(this.projectList.getProjectList());
        assertEquals(2, this.projectList.getProjectList().size());
        assertEquals(project1, this.projectList.getProjectList().get(0));
        Project project = this.projectList.getProjectList().get(0);
        assertEquals(componentList1, project.getComponentList());
        Component component = project.getComponentList().get(0);
        assertEquals(taskList1, component.getTaskList());
        assertEquals(conventionList1, project.getConventionList());
        Convention convention = project.getConventionList().get(0);
        assertEquals(competitionList1, convention.getCompetitionList());
        assertEquals(project2, this.projectList.getProjectList().get(1));
        project = this.projectList.getProjectList().get(1);
        assertEquals(componentList2, project.getComponentList());
        component = project.getComponentList().get(0);
        assertEquals(taskList2, component.getTaskList());
        assertEquals(conventionList2, project.getConventionList());
        convention = project.getConventionList().get(0);
        assertEquals(competitionList2, convention.getCompetitionList());
        assertEquals(project2, this.projectList.getProjectList().get(1));
    }

    @Test
    void setProjectList() {
        List<Task> taskList1 = new ArrayList<>();
        List<Task> taskList2 = new ArrayList<>();
        Task task1 = new Task("taskName1", 111, 112, 22);
        Task task2 = new Task("taskName2", 113, 114, 33);
        taskList1.add(task1);
        taskList2.add(task2);
        List<Component> componentList1 = new ArrayList<>();
        List<Component> componentList2 = new ArrayList<>();
        Component component1 = new Component("compName1", 30f, taskList1);
        Component component2 = new Component("compName2", 40f, taskList2);
        componentList1.add(component1);
        componentList2.add(component2);
        List<Competition> competitionList1 = new ArrayList<>();
        List<Competition> competitionList2 = new ArrayList<>();
        Competition competition1 = new Competition("testCategory1", "testAward1", "testPrize1");
        Competition competition2 = new Competition("testCategory2", "testAward2", "testPrize2");
        competitionList1.add(competition1);
        competitionList2.add(competition2);
        List<Convention> conventionList1 = new ArrayList<>();
        List<Convention> conventionList2 = new ArrayList<>();
        Convention convention1 = new Convention("testName1", "testDate1", competitionList1);
        Convention convention2 = new Convention("testName2", "testDate2", competitionList2);
        conventionList1.add(convention1);
        conventionList2.add(convention2);
        Project project1 = new Project("testChar1", "testSource1", "testDueDate1",
                "testStartDate1", "testFinishDate1",  100f, componentList1, conventionList1);
        Project project2 = new Project("testChar2", "testSource2", "testDueDate2",
                "testStartDate2", "testFinishDate2", 200f, componentList2, conventionList2);
        List<Project> projectList = new ArrayList<>();
        projectList.add(project1);
        projectList.add(project2);
        this.projectList.setProjectList(projectList);
        assertNotNull(this.projectList);
        assertNotNull(this.projectList.getProjectList());
        assertEquals(2, this.projectList.getProjectList().size());
        assertEquals(project1, this.projectList.getProjectList().get(0));
        Project project = this.projectList.getProjectList().get(0);
        assertEquals(componentList1, project.getComponentList());
        Component component = project.getComponentList().get(0);
        assertEquals(taskList1, component.getTaskList());
        assertEquals(conventionList1, project.getConventionList());
        Convention convention = project.getConventionList().get(0);
        assertEquals(competitionList1, convention.getCompetitionList());
        assertEquals(project2, this.projectList.getProjectList().get(1));
        project = this.projectList.getProjectList().get(1);
        assertEquals(componentList2, project.getComponentList());
        component = project.getComponentList().get(0);
        assertEquals(taskList2, component.getTaskList());
        assertEquals(conventionList2, project.getConventionList());
        convention = project.getConventionList().get(0);
        assertEquals(competitionList2, convention.getCompetitionList());
        assertEquals(project2, this.projectList.getProjectList().get(1));
    }
}