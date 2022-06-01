package lt.viko.eif.bstonkute.rest.dao;

import lt.viko.eif.bstonkute.rest.model.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Project Data Access Object. Contains and manages the project data repository.
 *
 * @author Brigita Stonkutė
 */
public class ProjectDao {
    public static List<Project> projectsList = new ArrayList<>();

    static {
        Project project1 = new Project();
        project1.setCharacter("Watcher");
        project1.setSource("Horizon");
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
        projectsList.add(project1);

        Project project2 = new Project();
        project2.setCharacter("Scaramouche");
        project2.setSource("Genshin Impact");
        project2.setDueDate("2022-01-01");
        project2.setStartDate("2020-02-02");
        project2.setBudget(200f);
        projectsList.add(project2);
    }

    /**
     * Gets all of the projects' data.
     *
     * @return all projects
     */
    public static List<Project> daoFetchProjects() {
        return projectsList;
    }

    /**
     * Gets a single project by character name, ignores lower- and uppercase character distinction.
     *
     * @param name name of the character
     * @return project of the specified character or NULL if not found
     */
    public static Project daoFetchProjectByName(String name) {
        for (Project project : projectsList) {
            if (name.equalsIgnoreCase(project.getCharacter().toLowerCase()))
                return project;
        }
        return null;
    }

    /**
     * Adds a project to the repository.
     *
     * @param project project to be added
     * @return added project
     */
    public static Project daoAddProject(Project project) {
        projectsList.add(project);
        return project;
    }

    /**
     * Updates an existing project.
     *
     * @param name    character name of the target project
     * @param project project with the new data
     * @return updated project
     */
    public static Project daoUpdateProject(String name, Project project) {
        for (Project proj : projectsList) {
            if (name.equalsIgnoreCase(proj.getCharacter().toLowerCase())) {
                projectsList.remove(proj);
                projectsList.add(project);
                return project;
            }
        }
        return project;
    }

    /**
     * Deletes an existing project.
     *
     * @param name character name of the target project
     * @return true if deletion successful, false if failed
     */
    public static boolean daoDeleteProject(String name) {
        for (Project project : projectsList) {
            if (name.equalsIgnoreCase(project.getCharacter().toLowerCase())) {
                projectsList.remove(project);
                return true;
            }
        }
        return false;
    }
}
